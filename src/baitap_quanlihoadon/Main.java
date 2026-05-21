package baitap_quanlihoadon;

public class Main {

    public static void main(String[] args) {

        InvoiceManager manager = new InvoiceManager();
        int choice;
        do {
            Menu.showMenu();
            choice = InputHelper.inputInt("Nhập lựa chọn: ");
            switch (choice) {
                case 1:
                    int id = InputHelper.inputInt("Nhập ID: ");
                    String code = InputHelper.inputString("Nhập mã hóa đơn: ");
                    double amount = InputHelper.inputDouble("Nhập số tiền: ");
                    Invoice invoice = new Invoice(id, code, amount);
                    manager.add(invoice);
                    break;
                case 2:
                    manager.display();
                    int updateId = InputHelper.inputInt("Nhập ID cần sửa: ");
                    String newCode = InputHelper.inputString("Nhập mã mới: ");
                    double newAmount = InputHelper.inputDouble("Nhập số tiền mới: ");
                    Invoice updateInvoice = new Invoice(updateId, newCode, newAmount);
                    manager.update(updateId, updateInvoice);
                    break;
                case 3:
                    manager.display();
                    int deleteId = InputHelper.inputInt("Nhập ID cần xóa: ");
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
    }
}