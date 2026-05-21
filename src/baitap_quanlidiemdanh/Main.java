package baitap_quanlidiemdanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();
        int choice;
        do {
            System.out.println("\n*************** MENU QUẢN LÝ ĐIỂM DANH ***************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");

            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập id sinh viên: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();
                    Student student = new Student(id, name);
                    manager.add(student);
                    break;
                case 2:
                    manager.display();
                    System.out.print("Nhập id sinh viên cần sửa: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên mới sinh viên: ");
                    String newName = sc.nextLine();
                    Student updateStudent =
                            new Student(updateId, newName);
                    manager.update(updateId, updateStudent);
                    break;
                case 3:
                    manager.display();
                    System.out.print("Nhập id sinh viên cần xóa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    manager.delete(deleteId);
                    break;
                case 4:
                    manager.display();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
        sc.close();
    }
}
