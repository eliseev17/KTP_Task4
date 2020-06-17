public class Task36 {
    public static void main(String[] args) {
        System.out.println(bugger(999));
    }

    public static int bugger(int num) {
        int count = 1;
        while (Integer.toString(multiplyDigits(num)).length() != 1) {
            num = multiplyDigits(num);
            count++;
        }
        return count;
    }

    public static int multiplyDigits(int num) {
        if (num == 0)
            return 0;
        int result = 1;
        while (num > 0) {
            result *= num % 10;
            num /= 10;
        }
        return result;
    }
}
