package com.rucz.peopledb.annotation;

import com.rucz.peopledb.model.CrudOperation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(MultiSQL.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQL {
    String value();
    CrudOperation operationType();
}
