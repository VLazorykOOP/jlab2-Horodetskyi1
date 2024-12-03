public class Prism {
    private double side; // Довжина сторони трикутника
    private double height; // Висота призми

    // Конструктор
    public Prism(double side, double height) {
        this.side = side;
        this.height = height;
    }

    // Метод для обчислення площі бічної поверхні
    public double lateralArea() {
        // Периметр трикутника
        double perimeter = 3 * side;
        // Площа бічної поверхні = периметр * висота
        return perimeter * height;
    }

    // Метод для обчислення об'єму призми
    public double volume() {
        // Площа основи (правильний трикутник) = (sqrt(3) / 4) * side^2
        double baseArea = (Math.sqrt(3) / 4) * side * side;
        // Об'єм = площа основи * висота
        return baseArea * height;
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        Prism prism = new Prism(5, 10); // Сторона 5, висота 10

        System.out.printf("Площа бічної поверхні: %.2f\n", prism.lateralArea());
        System.out.printf("Об'єм призми: %.2f\n", prism.volume());
    }
}
