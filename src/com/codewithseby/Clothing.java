package com.codewithseby;

public class Clothing {


    private String description;
    private double price;
    private String size;

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }

    public static final double MIN_PRICE = 10.0;
    public static final double MIN_TAX = 0.2;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   // public double getPrice() {
     //   return price + (price+ MIN_TAX);
 //   }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//  public void setPrice(double price) {
    //    this.price = (price > MIN_PRICE) ?  price : MIN_PRICE;
  //  }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
