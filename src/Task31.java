import java.util.LinkedList;
import java.util.List;

public class Task31 {
    public static void main(String[] args) {
        System.out.println(BessieEssay("Test essay", 2, 6));
    }

    public static List<String> BessieEssay(String essay, int wordsNumber, int lineLength) {
        String[] words = essay.split(" ");
        List<String> result = new LinkedList<String>();
        int remaining = lineLength;
        String str = "";
        for (String word : words) {
            if (remaining >= word.length()) {
                str += word;
                remaining -= word.length();
            } else {
                result.add(str);
                str = word;
                remaining = lineLength - word.length();
            }
        }
        result.add(str);
        return result;
    }
}
