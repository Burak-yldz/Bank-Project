import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int add,subtract;
        while (right > 0) {
            System.out.print("Your username :");
            userName = input.nextLine();
            System.out.print("Your password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hi , welcome to our BANK !");
                do {
                    System.out.println("1-To deposit money\n" +
                            "2-Withdraw money\n" +
                            "3-Balance Situation\n" +
                            "4-Log out");
                    System.out.print("Please choose one of them , what will be do ? : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Please enter total amount to deposit money ");
                            add=input.nextInt();
                            balance += add;
                            System.out.println("Current Your balance situation : " + balance);
                            break;
                        case 2:
                            System.out.println("Please enter total amount to withdraw money ");
                            subtract=input.nextInt();
                            balance += subtract;
                            System.out.println("Current Your balance situation : " + balance);
                            if(subtract>balance) {
                                System.out.println("Insufficient Balance");
                            }else{
                                System.out.println(balance -= subtract);
                            }
                            break;
                        case 3:
                            System.out.println("Your balance situation : " + balance);
                    }
                } while (select != 4);
                System.out.println("See you later.");
                break;
            } else {
                right--;
                System.out.println("You entered incorect username or password.Please try again.");
                if (right == 0) {
                    System.out.println("You account locked . Please contact with BANK OFFICE");
                } else {
                    System.out.println("Remain right : " + right);
                }
            }
        }
    }
}