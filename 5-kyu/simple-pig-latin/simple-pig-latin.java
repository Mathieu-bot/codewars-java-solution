public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(
                    word.matches("[a-zA-Z]+")
                            ? word.substring(1) + word.charAt(0) + "ay"
                            : word
            ).append(" ");
        }
        return result.toString().trim();
    }
}
​