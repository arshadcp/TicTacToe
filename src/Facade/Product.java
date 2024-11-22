package Facade;

public class Product {
    int Productid;
    int Quantity;
    public  Product(){

    }
//    public int getProduct(){
//        return this.product;
//    }

    public int getProductid() {
        return Productid;
    }

    public void setProductid(int productid) {
        Productid = productid;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
