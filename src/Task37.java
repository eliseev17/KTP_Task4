public class Task37 {
    public static void main(String[] args) {
        System.out.println(toShortHand("abbccc"));
    }

    public static String toShortHand(String str) {
        int count = 1;
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                count++;
            else {
                if (count > 1) {
                    result += str.charAt(i) + "*" + Integer.toString(count);
                    count = 1;
                } else {
                    result += str.charAt(i);
                }
            }
        }
        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2))
            result += str.charAt(str.length() - 1) + "*" + Integer.toString(count);
        else result += str.charAt(str.length() - 1);
        return result;
    }
}
