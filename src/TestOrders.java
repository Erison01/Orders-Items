import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {



                // Menu items

        Item item1 = new Item("mocha",2.5);

        Item item2 = new Item("latte",3.4);

        Item item3 = new Item("drip coffe",3.8);

        Item item4 = new Item("cappuccino",4.5);

                // Order variables -- order1, order2 etc.

        Order order1  = new Order("Cindhuri");

        Order order2 = new Order("Jimmy");

        Order order3 = new Order("Noah");

        Order order4 = new Order("Sam");


                // Application Simulations

         order2.addItems(item1);
         order3.addItems(item4);
         order4.addItems(item2);
         order1.status(true);
         order4.addItems(item2);
         order4.addItems(item2);
         order2.status(true);

                // Use this example code to test various orders' updates

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

            }
        }



