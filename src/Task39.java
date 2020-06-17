public class Task39 {
    public static void main(String[] args) {
        System.out.println(trouble(451999277, 411777899));
    }

    public static boolean trouble(long num1, long num2) {
        for (int i = 1; i < 10; i++) {
            if (Long.toString(num1).contains(Integer.toString(i) + Integer.toString(i) + Integer.toString(i))) {
                if (Long.toString(num2).contains(Integer.toString(i) + Integer.toString(i)))
                    return true;
            }

        }
        return false;
    }
}
