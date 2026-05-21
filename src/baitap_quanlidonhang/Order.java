package baitap_quanlidonhang;

public class Order {
    private int orderId;
    private String customerName;
    public Order() {
    }
    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public String toString() {
        return "Mã đơn hàng: " + orderId + ", Tên khách hàng: " + customerName;
    }
}
