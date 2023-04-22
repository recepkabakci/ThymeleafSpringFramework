package com.recepkabakci.bean;

import jdk.jfr.Name;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.context.annotation.ApplicationScope;

@Getter
@Setter
@ApplicationScope
@Name(value = "cdiBean")
public class JsfBean {
    private String name;

    public JsfBean(){
        this.name="Hi,I am Recep";
    }
}
