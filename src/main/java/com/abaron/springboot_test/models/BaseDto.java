package com.abaron.springboot_test.models;

import lombok.Data;
import org.springframework.data.relational.core.sql.In;
@Data
public class BaseDto {
    private Integer id;
    private String value;

}
