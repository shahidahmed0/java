//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class dontgamble {
    static Random rand=new Random();
    public static void main(String[] args) {
        //declare variables
        String[] slots = {"🍉", "🍐", "🥭", "🍌", "🍋"};
        int balance = 0;
        int bet;
        int payout;
        boolean isactive = true;

        System.out.println("SLOT MACHINE");
        System.out.println("|🍉🍐🥭🍌🍋|");

        System.out.print("Enter your balance:");
        Scanner input = new Scanner(System.in);
        balance = input.nextInt();

        while (isactive) {

            if (balance <= 0) {
                System.out.println("ur broke");
                break;
            } else {
                System.out.print("Enter your bet:");
                bet = input.nextInt();
            }
            if (bet <= 0) {
                System.out.println("invalid input");
                break;

            }
            else {
                balance -= bet;
            }
            String[] slot=roll(slots);


            printslot(slot);
            balance+=pay(bet,slot);
            System.out.println("current balance:$" + balance);



        }

    }

    static String[] roll(String[] slots){
        String[] slot=new String[3];
        for (int i=0;i<slot.length;i++) {


            slot[i] = slots[rand.nextInt(slots.length)];
        }
            return slot;
}
static void printslot(String[] slot) {
    System.out.println("spinning...");
    for (String img : slot) {

        System.out.print("|");
        System.out.print(img + " | ");
              }
    System.out.println();
}
static int pay(int bet, String[] slot){
        if (slot[0].equals(slot[1]) && slot[1].equals(slot[2])){
            return switch (slot[1]){
                case "🍉"->bet *3;
                case "🍐"->bet *5;
                case "🥭"->bet *10;
                case "🍌"->bet *25;
                case "🍋"->bet *50;
                default->0;
            };}
            else if (slot[0].equals(slot[1])){
                   return switch (slot[1]){
                    case "🍉"->bet *2;
                    case "🍐"->bet *3;
                    case "🥭"->bet *5;
                    case "🍌"->bet *10;
                    case "🍋"->bet *15;
                    default->0;

                };}
        else if (slot[1].equals(slot[2])){
            return switch (slot[1]) {
                case "🍉" -> bet * 2;
                case "🍐" -> bet * 3;
                case "🥭" -> bet * 5;
                case "🍌" -> bet * 10;
                case "🍋" -> bet * 15;
                default -> 0;
            };}


            else if (slot[0].equals(slot[2]) ) {
            return switch (slot[2]) {
                case "🍉" -> bet * 2;
                case "🍐" -> bet * 3;
                case "🥭" -> bet * 5;
                case "🍌" -> bet * 10;
                case "🍋" -> bet * 15;
                default->0;


            };
         }
        else {
            return 0;
        }

    }
}

