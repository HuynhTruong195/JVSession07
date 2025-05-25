
public class Rectangle {
    private double length;
    private double width;

    //contructor mặc định
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    //contructor có tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Các phương thức
    public double getArea() {
        return length * width;
    }

    public double getPermimeter() {
        return 2 * (length + width);
    }

    //hiển thị display
    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diệnt tích: " + getArea());
        System.out.println("Chu vi: " + getPermimeter());
    }
}