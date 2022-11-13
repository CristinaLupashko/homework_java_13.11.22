import java.util.Scanner;

public class HomeWorkJava {
    public static void main(String[] args) {
        //First level: level1
        //С консоли считывается число. Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено",
        // если число не равно 0, тогда выведите три сообщения "ERROR"
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 0) {
            System.out.println("Ошибок не обнаружено");
        }
        else {
            System.out.println("ERROR ERROR ERROR");
            // level .2.
        Scanner scaner = new Scanner(System.in);
        int firstN = scaner.nextInt();
        int secondN= scaner.nextInt();


        if (firstN == 36  && secondN == 17) {
            System.out.println("Jackpot");
        }

        else if (firstN == 36 || secondN == 17 ) {
                System.out.println("Small gift");
            }

        else {
            System.out.println("You Lose");


        }





        }

}
