public class Task33 {
    public static void main(String[] args) {
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
    }

    public static String toCamelCase(String str) {
        String[] parts = str.split("_");
        return parts[0] + parts[1].substring(0, 1).toUpperCase() + parts[1].substring(1);
    }

    public static String toSnakeCase(String str) {
        String first = "", second = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                first = str.substring(0, i);
                second = str.substring(i);
                break;
            }
        }
        return first + "_" + second.toLowerCase();
    }
}
