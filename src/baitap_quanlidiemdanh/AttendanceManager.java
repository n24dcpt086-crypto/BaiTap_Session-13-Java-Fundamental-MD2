package baitap_quanlidiemdanh;

import java.util.ArrayList;

public class AttendanceManager implements Manager<Student> {
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void add(Student item) {
        students.add(item);
        System.out.println("Sinh viên đã được thêm thành công!");
    }
    @Override
    public void update(int id, Student item) {
        for(Student s : students) {
            if(s.getId() == id ) {
                s.setName(item.getName());
                System.out.println("Sinh viên đã được sửa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }
    @Override
    public void delete(int id) {
        for(Student s : students ) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Đã xóa thành công sinh viên!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    @Override
    public void display() {
        if(students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        int i = 1;
        for(Student s : students) {
            System.out.println(i + " .");
            s.displayInfo();
            i++;
        }
    }
}
