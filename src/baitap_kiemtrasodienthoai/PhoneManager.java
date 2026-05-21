package baitap_kiemtrasodienthoai;

import java.util.ArrayList;
import java.util.List;

public class PhoneManager {
    private List<String> validPhones = new ArrayList<>();
    private List<InvalidPhone> invalidPhones = new ArrayList<>();
    public void processPhones(String input) {
        String[] phones = input.split(",");
        for (String phone : phones) {
            phone = phone.trim();
            try {
                PhoneValidator.validate(phone);
                validPhones.add(phone);
            } catch (InvalidPhoneNumberException e) {
                invalidPhones.add(new InvalidPhone(phone, e.getMessage()));
            }
        }
    }
    public void showValidPhones() {
        System.out.println("\n===== DANH SÁCH HỢP LỆ =====");
        if (validPhones.isEmpty()) {
            System.out.println("Không có số hợp lệ");
        } else {
            for (String phone : validPhones) {
                System.out.println(phone);
            }
        }
    }
    public void showInvalidPhones() {
        System.out.println("\n===== DANH SÁCH KHÔNG HỢP LỆ =====");
        if (invalidPhones.isEmpty()) {
            System.out.println("Không có số không hợp lệ");
        } else {
            for (InvalidPhone p : invalidPhones) {
                System.out.println(p.getPhone() + " -> " + p.getReason());
            }
        }
    }
}

