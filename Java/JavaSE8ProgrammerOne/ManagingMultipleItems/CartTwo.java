package Java.JavaSE8ProgrammerOne.ManagingMultipleItems;

public class CartTwo {

    public static void main(String[] args) {
        String custName = "Mary Anne";
        String message = custName + " wants to purchase several items";
        
        String[] items = {"shirt","boots","scarf","sweater","gloves"};

        message = custName + " wants to purchase " + items.length + " items.";

        System.out.println(message);
        System.out.println(custName + " wants a " + items[3]);

        System.out.println("items purchased: ");

        for (String item : items) {
            System.out.print(item + ", ");
        }
    }
    
}
