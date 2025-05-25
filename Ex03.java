import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên người thứ nhất: ");
        person1.setName(sc.nextLine());
        System.out.print("Nhập tuổi người thứ nhất: ");
        person1.setAge(Integer.parseInt(sc.nextLine()));

        Person person2 = new Person();
        System.out.print("Nhập tên người thứ hai: ");
        person2.setName(sc.nextLine());
        System.out.print("Nhập tuổi người thứ hai: ");
        person2.setAge(sc.nextInt());
        int age1 = person1.getAge();
        int age2 = person2.getAge();
        if (age1 > age2) {
            System.out.println(person1.getName() + " lớn hơn " + person2.getName());
        } else if (age1 < age2) {
            System.out.println(person2.getName() + " lớn hơn " + person1.getName());

        } else {
            System.out.printf("Hai người bằng tuổi");
        }
        sc.close();
    }
}
