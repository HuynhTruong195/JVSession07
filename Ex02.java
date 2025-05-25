public class Ex02 {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("Java Programming");
        myBook.setAuthor("John Doe");

        //giá hợp lệ
        myBook.setPrice(29.99);

        //hieẻn thị thông tin sách
        System.out.printf("Tiêu đề: %s%n",myBook.getTitle());
        System.out.printf("Tác giả: %s%n",myBook.getAuthor());
        System.out.printf("Giá: %.2f%n",myBook.getPrice());

        //thay đổi giá hợp lệ
        myBook.setPrice(35.50);
        System.out.printf("Giá mới: %.2f%n",myBook.getPrice());

        //giá không hợp lệ

        myBook.setPrice(-5.00);

    }
}
