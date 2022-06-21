package Complains;

import Complains.model.Administrator;
import Complains.model.Complain;
import Complains.model.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Administrator p = new Administrator("Paulo", "999.99.9999", "123123");
        System.out.println(p.getPersonalData().getName());

        Customer e = new Customer("Erick", "111.11.1111", "111111");


    }

}
