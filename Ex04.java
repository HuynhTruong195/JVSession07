import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentArray = new Student[5];

        studentArray[0] = new Student("Truong", 21, "A1", 7.5);
        studentArray[1] = new Student("Nam", 19, "A2", 8.2);
        studentArray[2] = new Student("Hoa", 22, "A1", 8.5);
        studentArray[3] = new Student("Mai", 24, "A2", 6.5);
        studentArray[4] = new Student("Hung", 23, "A3", 8.3);

        //nhập min max
        System.out.printf("Nhập điểm min: ");
        double min = sc.nextDouble();
        System.out.printf("Nhập điểm max: ");
        double max = sc.nextDouble();

        //in ra
        System.out.printf("Danh sách sinh viên có điểm trung bình từ %.1f đến %.1f: %n", min, max);

        //duyệt mảng lấy ra điểm trng bình

        for (Student student : studentArray) {
            if (student.getAvgScore() >= min && student.getAvgScore() <= max) {
                System.out.println(student);
            }
        }

    }
}
