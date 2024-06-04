package com.project.temp;

@FunctionalInterface
public interface Math {

    public Double execute(Double a, Double b);

    default Double sum(Double a, Double b){
        return a + b;
    }

}
