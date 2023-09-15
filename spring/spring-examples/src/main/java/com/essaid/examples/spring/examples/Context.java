package com.essaid.examples.spring.examples;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Context {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanA.class);
    DefaultListableBeanFactory defaultListableBeanFactory = ctx.getDefaultListableBeanFactory();
    BeanDefinitionRegistry registry = defaultListableBeanFactory;
    List<String> names = Arrays.stream(registry.getBeanDefinitionNames()).collect(Collectors.toList());
    Collections.sort(names);
    for (String name : names) {
      System.out.println(name);
    }
  }
}
