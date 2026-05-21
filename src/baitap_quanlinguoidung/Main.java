package baitap_quanlinguoidung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager manager = new UserManager();
        int choice;
        do{
            System.out.println("\n************MENU QUẢN LÍ NGƯỜI DÙNG**************");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Thoát");

            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch  ( choice) {
                case 1:
                    String name;
                    String email;
                    String phone;
                    do {
                        System.out.println("Nhập tên: ");
                        name = sc.nextLine();
                        if(name.isEmpty()) {
                            System.out.println("Vui lòng không để trống!");
                        }
                    } while(name.isEmpty());
                        do{
                            System.out.println("Nhập email: ");
                            email = sc.nextLine();
                            if(email.isEmpty()) {
                                System.out.println("Vui lòng không để trống!");
                            }
                        } while (email.isEmpty());
                            do {
                                System.out.println("Nhập số điẹn thoại: ");
                                phone = sc.nextLine();
                                if(phone.isEmpty()) {
                                    System.out.println("Vui lòng không để trống!");
                                }
                            } while (phone.isEmpty());
                                Person p = new Person(name, email, phone);
                                manager.addUser(p);
                                break;
                        case 2:
                            System.out.println("Nhập email cần xóa: ");
                            String deleteEmail = sc.nextLine();
                            manager.removeUser(deleteEmail);
                            break;
                        case 3:
                            manager.displayUsers();
                            break;
                        case 4:
                            System.out.println("Thoaats chương trình!");
                            break;
                default:
                                System.out.println("Lựa chọn không hợp lệ!");
                    }
                } while (choice != 4);
                    sc.close();
    }
}
