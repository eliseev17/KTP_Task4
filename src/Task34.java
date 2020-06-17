public class Task34 {
    public static void main(String[] args) {
        System.out.println(overTime(16, 18, 30, 1.8));
    }

    public static double overTime(double start, double end, double rate, double modifier) {
        if (start <= 17.0) {
            if (end > 17.0) {
                return (17.0 - start) * rate + (end - 17.0) * rate * modifier;
            } else {
                return (end - start) * rate;
            }
        } else {
            return (end - start) * rate * modifier;
        }
    }
}
