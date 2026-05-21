package baitap_kiemtrasodienthoai;

public class InvalidPhone {
    private String phone;
    private String reason;
    public InvalidPhone(String phone, String reason) {
        this.phone = phone;
        this.reason = reason;
    }
    public String getPhone() {
        return phone;
    }
    public String getReason() {
        return reason;
    }
}