package baitap_quanlinguoidung;

import java.util.LinkedList;

public class UserManager {
    private LinkedList<Person> users = new LinkedList<>();
    public void addUser(Person p) {
        System.out.println("Người dùng đã được thêm thành công!");
    }
    public void removeUser(String email) {
        for (Person p : users) {
            if(p.getEmail().equalsIgnoreCase(email)) {
                users.remove(p);
                System.out.println("Người dungf được xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng!");
    }
    public void displayUsers() {
        if(users.isEmpty()) {
            System.out.println("Danh sách người dùng trống!");
            return;
        }
        System.out.println("\n=========DANH SÁCH NGƯỜI DÙNG==============");
        for(Person p : users) {
            p.displayInfo();
        }
    }
}
