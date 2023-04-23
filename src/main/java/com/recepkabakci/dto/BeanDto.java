package com.recepkabakci.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class BeanDto {
    private Long beanId;
    private String beanName;
    private String beanData;
}
