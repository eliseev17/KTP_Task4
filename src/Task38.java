public class Task38 {
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
    }

    public static boolean doesRhyme(String str1, String str2) {
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");

        return takeVowels(words1[words1.length - 1]).equals(takeVowels(words2[words2.length - 1]));
    }

    public static String takeVowels(String str) {
        String vowels = "AEIOUaeiou";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(Character.toString(str.charAt(i))))
                result += str.charAt(i);
        }
        return result;
    }
}
