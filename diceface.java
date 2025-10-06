import java.util.Scanner;
import java.util.Random;
public class diceface {
    public static void main(String[] args) {
        int noofdice;
        int total = 0;
        int dice;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("enter the number of dice u want to roll");
        noofdice = input.nextInt();

        for (int i = 0; i < noofdice; i++) {
            dice = rand.nextInt(1, 7);
            diceface(dice);
            System.out.println("you rolled " + dice);
            total += dice;


        }
        System.out.println("total=" + total);

    }

    static void diceface(int dice) {

        String f1 =
                """
                        ----------
                        |        |
                        |    ●   |
                        |        |
                        ----------""";
        String f2 =
                """
                        ----------
                        |  ●     |
                        |        |
                        |     ●  |
                        ----------""";
        String f3 =
                """
                        ----------
                        |  ●     |
                        |    ●   |
                        |      ● |
                        ----------""";
        String f4 =
                """
                        ----------
                        |  ●   ● |
                        |        |
                        |  ●   ● |
                        ----------""";
        String f5 =
                """
                        ----------
                        | ●    ● |
                        |    ●   |
                        | ●    ● |
                        ----------""";
        String f6 =
                """
                        ----------
                        | ●  ●  ●|
                        |        |
                        | ●  ●  ●|
                        ----------""";
        switch (dice) {
            case 1 -> System.out.println(f1);
            case 2 -> System.out.println(f2);
            case 3 -> System.out.println(f3);
            case 4 -> System.out.println(f4);
            case 5 -> System.out.println(f5);
            case 6 -> System.out.println(f6);

       }
    }
}
