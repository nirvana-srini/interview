package com.test.interview;

import lombok.Data;

//Code to interface not to an implementation
public class F16 {
    //Tightly coupled with F16 class Code to interface not to implementation
    Product product = ProductFactory.createProduct();
}

