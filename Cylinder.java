
public class Cylinder extends Circle {
    private double height;

    // Constructor mặc định
    public Cylinder() {
        super(); // gọi constructor của Circle
        this.height = 1.0;
    }

    // Constructor có tham số
    public Cylinder(double radius, String color, double height) {
        super(radius, color); // gọi constructor Circle
        this.height = height;
    }

    // Getter & Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình trụ
    public double getVolume() {
        return getArea() * height;
    }

    // Ghi đè toString
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
