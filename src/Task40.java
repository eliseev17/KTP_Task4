public class Task40 {
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", "$"));
    }

    public static int countUniqueBooks(String str, String separator) {
        String special = "[$&+,:;=?@#|'<>.-^*()%!]";
        if (special.contains(separator))
            separator = Character.toString('\\') + separator;
        String[] books = str.split(separator);
        int sum = 0;

        for (int i = 1; i < books.length; i += 2) {
            sum += countUniqueChars(books[i]);
        }
        return sum;
    }

    private static int countUniqueChars(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.lastIndexOf(str.charAt(i)))
                result++;
        }
        return result;
    }
}
