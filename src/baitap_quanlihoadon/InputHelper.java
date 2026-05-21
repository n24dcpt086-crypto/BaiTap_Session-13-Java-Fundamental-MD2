package baitap_quanlihoadon;

import java.util.Scanner;

public class InputHelper {

    private static Scanner sc =
            new Scanner(System.in);

    public static int inputInt(String message) {

        System.out.print(message);

        return Integer.parseInt(sc.nextLine());
    }

    public static String inputString(String message) {

        System.out.print(message);

        return sc.nextLine();
    }

    public static double inputDouble(String message) {

        double number = 0;

        do {

            System.out.print(message);

            number =
                    Double.parseDouble(sc.nextLine());

            if (number < 0) {

                System.out.println(
                        "Vui lòng nhập số >= 0!"
                );
            }

        } while (number < 0);

        return number;
    }
}