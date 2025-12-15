class Kata {
    static String alphabetPosition(String text) {
        StringBuilder r = new StringBuilder();
        for (char c : text.toLowerCase().toCharArray())
            if (c >= 'a' && c <= 'z')
                r.append(c - 'a' + 1).append(" ");
        return r.toString().trim();
    }
}
​