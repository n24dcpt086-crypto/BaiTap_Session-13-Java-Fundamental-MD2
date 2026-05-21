package baitap_quanlihoadon;

public class Invoice {
    private int id;
    private String code;
    private double amount;
    public Invoice(int id, String code, double amount) {
        this.id = id;
        this.code = code;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void displayInfo() {
        System.out.println("ID: " +id);
        System.out.println("Mã hóa đơn: " +code);
        System.out.println("Số tiền: " +amount);
    }
}
