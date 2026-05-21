package baitap_kiemtrasodienthoai;

import java.util.Scanner;

public class InputHelper {
    static Scanner  sc = new Scanner(System.in);
    public static String inputString(String message) {
        System.out.println(message);
        return sc.nextLine();
    }
}
