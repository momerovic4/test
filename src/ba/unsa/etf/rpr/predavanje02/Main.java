package ba.unsa.etf.rpr.predavanje02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            var ime = "muhamed";
             System.out.println("vrijednost je "+x + ime);
        }catch(InputMismatchException e) {
            System.out.println("niste unijeli broj");
        }

        System.out.print("2 na 3 = ");
        System.out.println(Math.pow(2,3));
    }
}
