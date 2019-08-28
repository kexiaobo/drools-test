package com.example.droolstest.config;

import org.drools.core.spi.KnowledgeHelper;

/**
 * 用于调试，但引用不成功
 */
public class Utility {
    public static void help(final KnowledgeHelper drools, final String message){
        System.out.println(message);
        System.out.println("\nrule triggered: " + drools.getRule().getName());
    }

    public static void helper(final KnowledgeHelper drools){
        System.out.println("\nrule triggered: " + drools.getRule().getName());
    }

    public static void hh(String s){
        System.out.println("\nrule triggered: " );
    }
}

