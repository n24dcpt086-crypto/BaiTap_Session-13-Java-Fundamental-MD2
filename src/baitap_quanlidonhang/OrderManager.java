package baitap_quanlidonhang;

import java.util.ArrayList;

public class OrderManager implements Manage<Order> {
    private ArrayList<Order> orders = new ArrayList<>();
    @Override
    public void add(Order item) {
        orders.add(item);
        System.out.println("Thêm đơn hàng thành công!");
    }
    @Override
    public void update(int index, Order item) {
        if(index >= 0 && index < orders.size()) {
            orders.set(index, item);
            System.out.println("Sửa đơn hàng thành công!");
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
    }
    @Override
    public void delete(int index) {
        if(index >= 0 && index < orders.size()) {
            orders.remove(index);
            System.out.println("Xóa đơn hàng thành công!");
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
    }
    @Override
    public void display() {
        if(orders.isEmpty()) {
            System.out.println("Danh sách rỗng!");
        } else {
            for(int i = 0; i < orders.size(); i++) {
                System.out.println((i + 1) + ". " + orders.get(i));
            }
        }
    }
}
