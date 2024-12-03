public class Angle {
    private int degrees; // Градуси
    private int minutes; // Хвилини

    // Конструктор
    public Angle(int degrees, int minutes) {
        this.degrees = degrees;
        this.minutes = minutes;
        normalize();
    }

    // Нормалізація кута
    private void normalize() {
        if (minutes < 0) {
            degrees -= (Math.abs(minutes) / 60) + 1;
            minutes = (60 + (minutes % 60)) % 60;
        } else {
            degrees += minutes / 60;
            minutes = minutes % 60;
        }

        degrees = (degrees % 360 + 360) % 360; // Приведення до діапазону 0-360
    }

    // Перевід в радіани
    public double toRadians() {
        return Math.toRadians(degrees + minutes / 60.0);
    }

    // Збільшення кута
    public void increase(int degrees, int minutes) {
        this.degrees += degrees;
        this.minutes += minutes;
        normalize();
    }

    // Зменшення кута
    public void decrease(int degrees, int minutes) {
        this.degrees -= degrees;
        this.minutes -= minutes;
        normalize();
    }

    // Отримання синусу кута
    public double sin() {
        return Math.sin(toRadians());
    }

    // Порівняння кутів
    public boolean equals(Angle other) {
        return this.degrees == other.degrees && this.minutes == other.minutes;
    }

    @Override
    public String toString() {
        return String.format("%d° %d'", degrees, minutes);
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        Angle angle1 = new Angle(30, 45);
        Angle angle2 = new Angle(60, 30);
