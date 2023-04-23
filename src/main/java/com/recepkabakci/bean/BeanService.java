package com.recepkabakci.bean;

import com.recepkabakci.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanService {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton")
    public BeanDto beanDto(){
        return BeanDto.builder()
                .beanId(0L).beanName("beanName1").beanData("beanData1")
                .build();
    }
}
