package com.project.fundamentals;

import javax.xml.stream.events.DTD;
import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {

        DatabaseService mongo = new MongoDB();
        DatabaseService postgres = new PostgresDB();

        System.out.println(mongo.getById(20L));
        System.out.println(mongo.getAllRecords());

        System.out.println("------------------");

        System.out.println(postgres.getById(35L));
        System.out.println(postgres.getAllRecords());


    }
}
