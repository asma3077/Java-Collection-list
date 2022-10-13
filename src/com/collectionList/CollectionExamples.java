package com.collectionList;

import javax.lang.model.element.Element;
import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {

        // Collection-> List-> ArrayList, LInkedList, Vector-> stack

//
//        Collection a = new ArrayList<>();
//
//        List b = new ArrayList();
//        ArrayList c = new ArrayList();


   ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Asam");
        arrayList.add("Faiyaz");
        arrayList.add("Mhedi");
        arrayList.add("Helal");

    arrayList.add( 2,"Tanha");
        System.out.println(arrayList.get(2));
//-------------------------------------------------------------
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("Asam");
        linkedList.add("Faiyaz");
        linkedList.add("Mhedi");
        linkedList.add("Helal");

        System.out.println(linkedList.get(1));














    }


}
