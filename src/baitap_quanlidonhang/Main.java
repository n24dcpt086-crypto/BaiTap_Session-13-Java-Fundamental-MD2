package baitap_quanlidonhang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    System.out.print("Nhập mã đơn hàng: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên khách hàng: ");
                    String name = sc.nextLine();
                    Order order = new Order(id, name);
                    manager.add(order);
                    break;
                case 2:
                    System.out.print("Nhập vị trí cần sửa: ");
                    int updateIndex = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập mã đơn hàng mới: ");
                    int newId = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên khách hàng mới: ");
                    String newName = sc.nextLine();
                    Order newOrder = new Order(newId, newName);
                    manager.update(updateIndex - 1, newOrder);
                    break;
                case 3:
                    System.out.print("Nhập vị trí cần xóa: ");
                    int deleteIndex = Integer.parseInt(sc.nextLine());
                    manager.delete(deleteIndex - 1);
                    break;
                case 4:
                    manager.display();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while(choice != 0);
    }
}
