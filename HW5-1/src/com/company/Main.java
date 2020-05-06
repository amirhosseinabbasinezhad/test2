package com.company;

import javafx.scene.transform.Scale;

import java.util.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee e1=new Employee();
        Buy e2=new Buy();
        Sale e3=new Sale();
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
                System.out.println("Please enter your ProductName");
                try {
                    e2.setProductName(input.nextLine());
                }catch (BuyExeption e){
                    e.printStackTrace();
                }
                System.out.println("Please enter your ProductInformation");
                try {
                    e2.setProductInformation(input.nextLine());
                }catch (BuyExeption e){
                    e.printStackTrace();
                }
                System.out.println("Please enter your ProductPrice");
                try {
                    e2.setProductPrice(input.nextDouble());
                }catch (BuyExeption e){
                    e.printStackTrace();
                }
                System.out.println("Please enter your ProductWeight");
                try {
                    e2.setProductWeight(input.nextDouble());
                }catch (BuyExeption e){
                    e.printStackTrace();
                }
                e2.Accepted();

                break;


            case "3":
                System.out.println("Please enter your ProductName");
                try {
                    e3.setProductName(input.nextLine());
                }catch (SaleExeption e){
                    e.printStackTrace();
                }
                System.out.println("Please enter your ProductPrice");
                try {
                    e3.setProductPrice(input.nextDouble());
                }catch (SaleExeption e){
                    e.printStackTrace();
                }
                System.out.println("Please enter your ProductWeight");
                try {
                    e3.setProductWeight(input.nextDouble());
                }catch (SaleExeption e){
                    e.printStackTrace();
                }
                e2.Accepted();

                break;

        }
    }
}
