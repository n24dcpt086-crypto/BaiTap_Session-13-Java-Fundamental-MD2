package baitap_quanlihoadon;

import java.util.ArrayList;

public class InvoiceManager implements Manager<Invoice> {
    private ArrayList<Invoice> invoices = new ArrayList<>();
    @Override
    public void add(Invoice item) {
        invoices.add(item);
        System.out.println("Thêm hóa đơn thành công!");
    }
    @Override
    public void update(int id, Invoice item) {
        for (Invoice i : invoices) {
            if (i.getId() == id) {
                i.setCode(item.getCode());
                i.setAmount(item.getAmount());
                System.out.println("Sửa hóa đơn thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy hóa đơn!");
    }
    @Override
    public void delete(int id) {
        for (Invoice i : invoices) {
            if (i.getId() == id) {
                invoices.remove(i);
                System.out.println("Xóa hóa đơn thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy hóa đơn!");
    }
    @Override
    public void display() {
        if (invoices.isEmpty()) {
            System.out.println("Danh sách hóa đơn trống!");
            return;
        }
        int index = 1;
        for (Invoice i : invoices) {
            System.out.print(index + ". ");
            i.displayInfo();
            index++;
        }
    }
}