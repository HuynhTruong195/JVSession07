public class Student {
    private String name;
    private int age;
    private String className;
    private double avgScore;

    //contructor co tham so

    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }

    //get avgScore
    public double getAvgScore() {
        return avgScore;
    }

    //hien thi
    @Override  //ghi đè các phương thức cha vào phương thức con
    public String toString() {
        return "Tên: " + name + "," + " Tuổi: " + age + "," + " Lớp: " + className + "," + " Điểm trung bình: " + avgScore;
    }


}
