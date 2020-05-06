package com.company;

public class Sale {
    private String ProductName;
    private double ProductPrice;
    private double ProductWeight;

    public String getProductName(){
        return ProductName;
    }
    public void setProductName(String productName) throws SaleExeption{
        if (productName.isEmpty()) {
            throw new SaleExeption("Didn't enter your ProductName");
        }
        else
            ProductName=productName;
    }

    public double getProductPrice(){
        return ProductPrice;
    }
    public void setProductPrice(double productPrice) throws SaleExeption{
        if (productPrice==0)
            throw new SaleExeption("Didn't enter your ProductPrice");
        else
            ProductPrice=productPrice;
    }
    public double getProductWeight(){
        return ProductWeight;
    }
    public void setProductWeight(double productWeight) throws SaleExeption{
        if (productWeight==0)
            throw new SaleExeption("Didn't enter your Productweight");
        else
            ProductWeight=productWeight;
    }
    public void Accepted(){
        System.out.println("The buying was successful");
        System.out.println("Good Luck");
    }
}
