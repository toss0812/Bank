package com.dingenouts.bank;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class SQLConnection {
    Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:8306/mybank?useLegacyDatetimeCode=false&serverTimezone=Europe/Amsterdam", "bank", "hunter2");

    public void open(){
        try (Connection connection = sql2o.open()){

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public SQLConnection(){

    }
}
