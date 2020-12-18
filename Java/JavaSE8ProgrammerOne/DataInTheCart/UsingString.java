package Java.JavaSE8ProgrammerOne.DataInTheCart;

public class UsingString {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "shirt";

        int quantity = 3;
        double price = 29.99;
        double tax = 1.10;
        double total;
        boolean stockStatus;

        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        total = quantity * price * tax;

        if (quantity > 1) {
            message = message + "s";
        }

        stockStatus = false;

        if (stockStatus) {
            System.out.println("in stock");
        } else {
            System.out.println("Out of stock");
        }
        System.out.println(message);
        System.out.println("Mary's total is: " + total);

    }
}
