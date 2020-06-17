import java.util.LinkedList;
import java.util.List;

public class Task32 {
    public static void main(String[] args) {
        System.out.println(Split("((()))(())()()(()())"));
    }

    public static List<String> Split(String brackets) {
        List<String> result = new LinkedList<String>();
        int count = 0;
        String buffer = "";
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(')
                count++;
            else if (brackets.charAt(i) == ')')
                count--;

            buffer += brackets.charAt(i);
            if (count == 0) {
                result.add(buffer);
                buffer = "";
            }
        }
        return result;
    }
}
