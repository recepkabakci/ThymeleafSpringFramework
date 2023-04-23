package com.recepkabakci.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long beanId;
    private String beanName;
    private String beanData;

    //starts
    public void initialBeanMethod(){
        log.info("I work before Bean starts");
        System.out.println("The method works before bean starts");
    }

    //finish
    public void destroyBeanMethod(){
        log.info("I work after Bean finishes");
        System.err.println("The method works after bean finishes");
    }
}
