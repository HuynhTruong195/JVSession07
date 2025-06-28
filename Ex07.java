public class Ex07 {
    public static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(2, 3);
            Fraction f2 = new Fraction(4, 5);

            System.out.println("Phân số 1: " + f1);
            System.out.println("Phân số 2: " + f2);

            Fraction sum = f1.add(f2);
            System.out.println("Cộng: " + f1 + " + " + f2 + " = " + sum);

            Fraction diff = f1.subtract(f2);
            System.out.println("Trừ: " + f1 + " - " + f2 + " = " + diff);

            Fraction product = f1.multiply(f2);
            System.out.println("Nhân: " + f1 + " * " + f2 + " = " + product);

            Fraction quotient = f1.divide(f2);
            System.out.println("Chia: " + f1 + " / " + f2 + " = " + quotient);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi khởi tạo phân số: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia phân số: " + e.getMessage());
        }
    }
}
