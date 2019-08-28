package com.example.droolstest.controller;

import com.example.droolstest.model.Label;
import org.drools.core.WorkingMemory;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private KieSession kieSession;

    @ResponseBody
    @RequestMapping(value = "/address/{postCode}", method = RequestMethod.GET)
    public String test(@PathVariable(value = "postCode") String postCode) {

        // 以下的数据可以从数据库来，这里写死了
        Label label = new Label();
        label.setSex(postCode);
        label.setAge(6);
        label.setSalary(11);
        List list = new ArrayList();
        Label label2 = new Label();
        label2.setSex("women");
        label2.setAge(6);
        label2.setSalary(11);
        list.add(label);
        list.add(label2);
        kieSession.setGlobal("myGlobalList", list);
        // 使用规则引擎
        kieSession.insert(label);
        int ruleFiredCount = kieSession.fireAllRules();
        list.forEach(l -> {
            System.out.println("label:" + l.toString());
        });
        return "触发了" + ruleFiredCount + "条规则";
    }

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello,i am";
    }
}
