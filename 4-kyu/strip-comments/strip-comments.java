import java.util.*;
​
public class StripComments {
    public static String stripComments(String text, String... commentSymbols) {
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();
​
        for (String line : lines) {
            String trimmedLine = line;
            for (String symbol : commentSymbols) {
                int index = trimmedLine.indexOf(symbol);
                if (index != -1) {
                    trimmedLine = trimmedLine.substring(0, index);
                }
            }
            result.append(trimmedLine.stripTrailing()).append("\n");
        }
​
        if (result.length() > 0 && result.charAt(result.length() - 1) == '\n') {
            result.deleteCharAt(result.length() - 1);
        }
​
        return result.toString();
    }
}
​