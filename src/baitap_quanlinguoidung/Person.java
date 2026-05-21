package baitap_quanlinguoidung;

public class Person {
    private String name;
    private String email;
    private String phone;
    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void displayInfo() {
        System.out.println("Nhập Tên: " + name);
        System.out.println("Nhập email: " + email);
        System.out.println("Nhập số điẹn thoại: " +phone);
    }
}
