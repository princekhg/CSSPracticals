package com.css.practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stores {
    ArrayList<Product> product = new ArrayList<>();

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    public static Comparator<Product> ProductNameComparator = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            String prodName = o1.getProductName().toLowerCase();
            String prodName2 = o2.getProductName().toLowerCase();
            return (prodName.compareTo(prodName2));
        }
    };

    public static Comparator<Product> ProductIDComparator=new Comparator<Product>() {

        @Override
        public int compare(Product o1, Product o2) {
           String prodID1=o1.getProductID().toLowerCase();
           String prodID2=o1.getProductID().toLowerCase();
           return (prodID1.compareTo(prodID2));
        }
    };


    public static void main(String[] args) {
        Stores st=new Stores();
        ArrayList<Product> prod=new ArrayList<>();
        prod.add(new Product("Vasaline","101D",2035));
        prod.add(new Product("Uniliver","102E",1290));
        prod.add(new Product("Pepsico","121F",3874));
        prod.add(new Product("Puma","103P",8756));
        Collections.sort(prod,new PriceComparator());
        for(Product pd:prod)
            System.out.println(pd.productID+" "+pd.getProductName()+" "+pd.getPrice());

    }
}
