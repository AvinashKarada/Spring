/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCAPP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author 
 */
public class SpringCoreApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext obj = new AnnotationConfigApplicationContext();
        obj.register(SpringConfig.class);
        obj.register(SecondConfig.class);
        obj.refresh();
        SpringJava oSpringJava = obj.getBean(SpringJava.class);
        oSpringJava.setAuthorName("WELCOME SPRING!");
        System.out.println(oSpringJava.getAuthorName());
        
        SecondTime obj = obj.getBean(SecondTime.class);
        obj.setName("You!");
        System.out.println(obj.getName());
    }
    
}
