package com.essaid.examples.springboot.app1.config_override.component;

import org.springframework.stereotype.Component;

@Component
public class CompOne {

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private String comment;

    public CompOne(){
        System.out.println("CompOne constructor");
    }

    @Override
    public String toString() {
        return "CompOne{" +
                "comment='" + comment + '\'' +
                '}';
    }
}
