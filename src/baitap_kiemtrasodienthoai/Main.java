package baitap_kiemtrasodienthoai;

public class Main {
    public static void main(String[] args) {
        PhoneManager manager = new PhoneManager();
        String input = InputHelper.inputString("Nhập các số điện thoại: ");
        manager.processPhones(input);
        manager.showValidPhones();
        manager.showInvalidPhones();
    }
}

