import java.util.Scanner;

public class Students {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Students() {}

    public Students(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã HS: ");
        id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên HS: ");
        name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giới tính (1. Nam, 2. Nữ, 3. Khác): ");
        int genderChoice = Integer.parseInt(scanner.nextLine());
        switch (genderChoice) {
            case 1 -> gender = Gender.MALE;
            case 2 -> gender = Gender.FEMALE;
            default -> gender = Gender.OTHER;
        }

        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã HS: " + id);
        System.out.println("Tên HS: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("SĐT: " + phoneNumber);
        System.out.println("-----------------------------");
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // ... tiếp tục cho name, age, gender, address, phoneNumber

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
