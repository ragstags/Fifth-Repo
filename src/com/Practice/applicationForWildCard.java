package com.Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nadimchouglay on 04/01/2019.
 */
public class applicationForWildCard {

    public static void main(String[] args) {

        // upper bound
        ArrayList<? extends Employee> employees = new ArrayList<>();
        ArrayList<Accountant> accountants = new ArrayList<>();
        employees =accountants;

        //lower bound
        ArrayList<? super Employee> employees1 = new ArrayList<>();
        ArrayList<Employee> accountants1 = new ArrayList<>();
        employees1=accountants1;
        makeEmployeework(accountants);

    }
    public static void makeEmployeework(List<? extends Employee> employees){
        for (Employee emp :employees){
            System.out.println(emp);
        }
    }
}
