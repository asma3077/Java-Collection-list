package com.collectionList;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {


        HashMap<String,Integer> salary = new HashMap<>();

        salary.put("Mahedi",2000);

        salary.put("Mahedi",2000);
        salary.put("Asma",1000);
        salary.put("Neshat",3000);
        salary.put("Tanha",5000);
        System.out.println(salary);
            // if we need to change name or number
        salary.put("mahedi",25000);
        System.out.println(salary);
        System.out.println(salary.get("Tanha"));
        System.out.println(salary.size());
        System.out.println(salary.containsKey("Ariana"));













    }













}
