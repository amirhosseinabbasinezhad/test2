package com.company;

import javafx.scene.transform.Scale;

import java.util.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee e1=new Employee();
        Scanner input = new Scanner(System.in);
        System.out.println("برای استخدام عدد < 1 >\nخرید محصول < 2 >      \nفروش محضول < 3 >      ");
        String x=input.nextLine();
        switch (x){
            case "1":
                System.out.println("لطفا نام کارمند را وارد کنید");
                try {
                    e1.setName(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا نام خانوادگی کارمند را وارد کنید");
                try {
                    e1.setFamly(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا نام پدر کارمند را وارد کنید");
                try {
                    e1.setFatherName(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا رشته تحصیلی کارمند را وارد کنید");
                try {
                    e1.setMajor(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا مدرک تحصیلی کارمند را وارد کنید");
                try {
                    e1.setDiploma(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا حقوق پیشنهادی کارمند را وارد کنید");
                try {
                    e1.setSalary(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                e1.Saveinformation();

                break;
            case "2":

                break;

            case "3":

                break;

        }
    }
}
