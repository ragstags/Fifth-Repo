package com.Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by nadimchouglay on 28/12/2018.
 */
public class application {
    public static void main(String[] args) {
        Container<Integer,String> container = new Container<>(10,"hello");
        int val1 = container.getItem1();
        String val2 = container.getItem2();
//        System.out.println(val1  +"  "+ val2);

        Set<String> mySet1 = new HashSet<>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");
        mySet1.add("whatever");

        Set<String> mySet2 = new HashSet<>();
        mySet2.add("first");
        mySet2.add("second");
        mySet2.add("computer");
        mySet2.add("whatever");

        Set<String > resultSet = union(mySet1,mySet2);
        Iterator<String > itr = resultSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
    public static <E>Set<E> union(Set<E> set1,Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
