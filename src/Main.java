public class Main{
    public static void main(String[] args){
        Product book = new Book("The Lord of the Rings", 29.99, 5);
        Product clothing = new Clothing("Nike Air Max 90", 119.99, 4);
        Product electronics = new Electronics("Samsung Galaxy S21", 999.99, 4);
        User user = new Customer("testuser", "password123");
        CustomerProduct customerProduct = new CustomerProduct("testuser", "password123", "The Lord of the Rings", 29.99, 5);
        customerProduct.buy();
}}