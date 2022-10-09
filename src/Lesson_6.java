import javax.swing.*;
import java.util.Scanner;

public class Lesson_6 {
    public static void main(String[] args) {
        CreditCart creditCart = new CreditCart(0);
        creditCart.outDataAccNumb();


        System.out.println("*************");
        System.out.println("Операция с картой: \nПоложить деньги нажмите - 1;\nСнять деньги нажмите - 2;\nПроверить баланс нажмите - 3;");

        Scanner scan = new Scanner(System.in);
        int whatDoCard = scan.nextInt();

        creditCart.calc(whatDoCard);
        switch (whatDoCard) {
            case 1:


        }
    }

}
