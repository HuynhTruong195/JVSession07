import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {
    static ArrayList<Students> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên theo ID");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> showStudents();
                case 2 -> addStudent();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    public static void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (Students s : students) {
                s.displayData();
            }
        }
    }

    public static void addStudent() {
        Students s = new Students();
        s.inputData(scanner);
        students.add(s);
        System.out.println("Đã thêm sinh viên.");
    }

    public static void updateStudent() {
        System.out.print("Nhập ID sinh viên cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Students found = findById(id);
        if (found != null) {
            System.out.println("Nhập thông tin mới:");
            found.inputData(scanner);
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }

    public static void deleteStudent() {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Students found = findById(id);
        if (found != null) {
            students.remove(found);
            System.out.println("Đã xóa sinh viên.");
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }

    private static Students findById(int id) {
        for (Students s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
