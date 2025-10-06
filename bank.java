
import java.util.Scanner;

public class bank{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("BANKING PROGRAM");
        double balance=0;
        int choice;
        boolean isactive=true;
        while (isactive){
            System.out.println("             ");
            System.out.println("BANKING PROGRAM");
            System.out.println("------- -------");
            System.out.println("1.balance");
            System.out.println("2.deposit");
            System.out.println("3.withdraw");
            System.out.println("4.exit");
            System.out.print("enter the choice number");
            choice=input.nextInt();


            switch(choice){
                case 1-> System.out.printf("balance: %,.2f",balance);
                case 2-> balance+=deposit();
                case 3-> balance-=withdraw(balance);
                case 4-> isactive=false;
                default-> System.out.println("invalid choice ,try again");


            }
    }

    }
    static double deposit(){
        double dep;
        System.out.print("Enter the amount to deposit");
        dep=input.nextDouble();

        if (dep<0){
            System.out.println("amount cant be negative");
            return 0;
        }
        else{
            return dep;

        }

    }
    static double withdraw(double balance){

        double with;
        System.out.print("Enter the amount to withdraw");
        with=input.nextDouble();

        if (with<0){
        System.out.println("amount cant be negative");
        return 0;
    }
        if (with>balance){
            System.out.println("insuffcient funds");
            return 0;
        }
        else{
        return with;

    }

}

}
