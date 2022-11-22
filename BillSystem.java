import java.util.ArrayList;
import java.util.Scanner;

class Customer{

    static int teaPrice =10;
    static int coffeePrice = 15;
    static int snackPrice = 10;
    int totalPrice = 0;

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
                    int teaQuantity = sd.nextInt();
                    totalPrice += teaPrice*teaQuantity;
                    break;
                case 2:
                    System.out.println("Enter quantity for Coffee:");
                    int coffeeQuantity = sd.nextInt();
                    totalPrice += coffeePrice*coffeeQuantity;
                    break;
                case 3:
                    System.out.println("Enter quantity for Snacks:");
                    int snacksQuantity = sd.nextInt();
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
                    customArray.add(c);
                case 2:

                case 3:
                    for (Customer obj:customArray) {
                        System.out.println(obj.totalPrice);
                    }
                case 4:
                case 0:
            }
        }
    }
}
