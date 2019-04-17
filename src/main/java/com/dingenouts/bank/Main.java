package com.dingenouts.bank;

import org.sql2o.Sql2o;

public class Main {
    public static void main(String[] args) {
        SQLConnection s = new SQLConnection();
        s.open();
    }
}