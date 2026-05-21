package baitap_kiemtrasodienthoai;

public class PhoneValidator {
    public static void validate(String phone)
        throws InvalidPhoneNumberException {
        phone = phone.trim();
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberException("Sai độ dài (phải đúng 10 chữ số)");
        }
        for(char c : phone.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidPhoneNumberException("Chưa kí tự không hợp lệ");
            }
        }
    }
}
