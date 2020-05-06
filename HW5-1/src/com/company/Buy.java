package com.company;

public class Buy {
    private String ProductName;
    private String ProductInformation;
    private double ProductPrice;
    private double ProductWeight;

    public String getProductName(){
        return ProductName;
    }
    public void setProductName(String productName) throws BuyExeption{
        if (productName.isEmpty()) {
            throw new BuyExeption("Didn't enter your ProductName");
        }
        else
           ProductName=productName;
    }
    public String getProductInformation(){
        return ProductInformation;
    }
    public void setProductInformation(String productInformation) throws BuyExeption{
        if (productInformation.isEmpty())
            throw new BuyExeption("Didn't enter your ProductInformation");
        else
            ProductInformation=productInformation;
    }
    public double getProductPrice(){
        return ProductPrice;
    }
    public void setProductPrice(double productPrice) throws BuyExeption{
        if (productPrice==0)
            throw new BuyExeption("Didn't enter your ProductPrice");
        else
            ProductPrice=productPrice;
    }
    public double getProductWeight(){
        return ProductWeight;
    }
    public void setProductWeight(double productWeight) throws BuyExeption{
        if (productWeight==0)
            throw new BuyExeption("Didn't enter your Productweight");
        else
           ProductWeight=productWeight;
    }
    public void Accepted(){
        System.out.println("The buying was successful");
        System.out.println("Good Luck");
    }

}
