import java.util.Scanner;

class Customer{
    Customer(){
        System.out.println("***ORDER MENU***\n" +
                "Enter Option:\n" +
                "1.Tea \n" +
                "2.Coffee \n" +
                "3.Snacks \n" +
                "0.Exit");
        Scanner sd = new Scanner(System.in);
        int totalPrice = 0;
        boolean flagTwo = true;
        while (flagTwo){
            System.out.println("Select option:");
            int optionTwo = sd.nextInt();
            switch (optionTwo){
                case 1:
                    System.out.println("Enter quantity for Tea:");
                    int teaQuantity = sd.nextInt();
                    totalPrice += 10*teaQuantity;
                    break;
                case 2:
                    System.out.println("Enter quantity for Coffee:");
                    int coffeeQuantity = sd.nextInt();
                    totalPrice += 15*coffeeQuantity;
                    break;
                case 3:
                    System.out.println("Enter quantity for Snacks:");
                    int snacksQuantity = sd.nextInt();
                    totalPrice += 25*snacksQuantity;
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


                case 2:
                case 3:
                case 4:
                case 0:
            }
        }
    }
}
