package com.project.fundamentals;

import javax.xml.stream.events.DTD;
import java.sql.SQLOutput;
import java.util.List;

public class App {

    public static void main(String[] args) {

//        DatabaseService mongo = new MongoDB();
//        DatabaseService postgres = new PostgresDB();
//
//        System.out.println(mongo.getById(20L));
//        System.out.println(mongo.getAllRecords());
//
//        System.out.println("------------------");
//
//        System.out.println(postgres.getById(35L));
//        System.out.println(postgres.getAllRecords());

//        ProductDB pdb = new ProductDB();
//        EmployeeDB edb = new EmployeeDB();
//
//        System.out.println(pdb.getById(2L));
//        System.out.println(edb.getById(5L));

        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());


        //Implementar clase anonima(instanciar interface o clas abstracta)
        DatabaseService<String> dbAnonima = new DatabaseService<String>() {
            @Override
            public String getById(Long id) {
                return null;
            }

            @Override
            public List<String> getAllRecords() {
                return null;
            }
        };

        System.out.println(dbAnonima.getClass().getName());


    }
}
