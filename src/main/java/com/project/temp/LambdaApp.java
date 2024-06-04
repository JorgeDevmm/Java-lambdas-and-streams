package com.project.temp;

public class LambdaApp {

    public static void main(String[] args) {

        //Creación de clase anonima
        Math substrac = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        System.out.println("El resultado de la substración es: " + substrac.execute(10.0,7.0));

        //Expresión lambda
        Math multiply = ( a, b)-> a*b;

        System.out.println("El resultado de la multiplicación es" +  multiply);


    }
}
