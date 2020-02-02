package com.ibi.des.factorial.impl;

import com.ibi.des.factorial.FactorialCalculator;

public class FactorialCalculatorImpl implements FactorialCalculator {
    @Override
    public Long calc(Integer value) {
        if (value > 1) return value * calc(value -1 );
        return 1L;
    }
}
