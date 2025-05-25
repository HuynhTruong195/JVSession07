public class Book {
    private String title;
    private String author;
    private double price;

    //getter Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        if (newTitle == null || newTitle.isEmpty()) { //kiểm tra đầu vào null hoặc rỗng
            System.err.println("Title không đc để trống");
            return;
        }
        this.title = newTitle;
    }


    //setter Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            System.err.println("Giá không hợp lệ");
            return;
        }
        this.price = newPrice;

    }

    //setter author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        if (newAuthor == null || newAuthor.isEmpty()) {
            System.out.printf("Author không được để trống");
            return;
        }
        this.author = newAuthor;


    }
}
