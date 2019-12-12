/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCAPP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author 
 */
@Configuration
public class SecondConfig {
    @Bean
    public SecondTime helloSecondTime(){
        return new SecondTime();
    }
}
