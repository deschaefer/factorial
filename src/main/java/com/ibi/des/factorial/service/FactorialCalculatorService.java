package com.ibi.des.factorial.service;

import com.ibi.des.factorial.FactorialCalculator;
import com.ibi.des.factorial.impl.FactorialCalculatorImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialCalculatorService implements FactorialCalculator {

    @Override
    @RequestMapping(value = "/calc", method = RequestMethod.GET)
    public Long calc(@RequestParam Integer value) {
        return new FactorialCalculatorImpl().calc(value);
    }
}
