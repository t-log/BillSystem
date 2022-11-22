import java.util.ArrayList;
import java.util.Scanner;

class Customer{

    static int teaPrice =10;
    static int coffeePrice = 15;
    static int snackPrice = 10;
    int totalPrice = 0;
    int teaQuantity = 0;
    int coffeeQuantity = 0;
    int snacksQuantity = 0;
    String name ="";
    long phoneNo = 0;


    Customer(){
        System.out.println("***ORDER MENU***\n" +
                "Enter Option:\n" +
                "1.Tea \n" +
                "2.Coffee \n" +
                "3.Snacks \n" +
                "0.Exit");
        Scanner sd = new Scanner(System.in);
        boolean flagTwo = true;
        while (flagTwo){
            System.out.println("Select option:");
            int optionTwo = sd.nextInt();
            switch (optionTwo){
                case 1:
                    System.out.println("Enter quantity for Tea:");
                    teaQuantity = sd.nextInt();
                    totalPrice += teaPrice*teaQuantity;
                    break;
                case 2:
                    System.out.println("Enter quantity for Coffee:");
                    coffeeQuantity = sd.nextInt();
                    totalPrice += coffeePrice*coffeeQuantity;
                    break;
                case 3:
                    System.out.println("Enter quantity for Snacks:");
                    snacksQuantity = sd.nextInt();
                    totalPrice += snackPrice*snacksQuantity;
                    break;
                case 0:
                    System.out.println("Total price ="+totalPrice);
                    flagTwo = false;
                    break;

            }
        }
    }
}
public class BillSystem {



    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<Customer> customArray = new ArrayList<Customer>();
        int counter = -1;
        while (flag) {
            System.out.println("***MENU***\n" +
                    "Enter Option:\n" +
                    "1.Order Menu \n" +
                    "2.Generate Bill \n" +
                    "3.View All Transactions \n" +
                    "4. \n" +
                    "0.Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    Customer c = new Customer();
                    counter++;
                    customArray.add(c);
                    break;
                case 2:
                    System.out.println("Enter Name:");
                    customArray.get(counter).name = sc.next();
                    System.out.println("Enter Phone no:");
                    customArray.get(counter).phoneNo = sc.nextLong();
                    System.out.println("************BILL************");
                    System.out.println("------------Your Order------------");
                    System.out.println("Name:"+customArray.get(counter).name);
                    System.out.println("Phone no:"+customArray.get(counter).phoneNo);
                    System.out.println("Tea *"+customArray.get(counter).teaQuantity+"="+customArray.get(0).teaQuantity*Customer.teaPrice);
                    System.out.println("Coffee *"+customArray.get(counter).coffeeQuantity+"="+customArray.get(0).coffeeQuantity*Customer.coffeePrice);
                    System.out.println("Snacks *"+customArray.get(counter).snacksQuantity+"="+customArray.get(0).snacksQuantity*Customer.snackPrice);
                    System.out.println("Total price:"+customArray.get(counter).totalPrice);
                    break;
                case 3:
                    for (:) {

                    }
                        System.out.println(customArray.get(0).name);
                        System.out.println(customArray.get(0).totalPrice);
                case 4:
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}
