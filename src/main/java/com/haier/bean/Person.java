package com.haier.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Created by Admin on 2017/12/26.
 */
@Data
@Log4j
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
}
