public class MaxVowelsSubstring_LC1456 {
    public int maxVowels(String s, int k) {
        int c = 0;
        for (int r=0;r<k;r++) {
            if (isvowel(s.charAt(r))) c++;
        }
        int max = c;
        for (int r=k;r<s.length(); r++) {
            if (isvowel(s.charAt(r))) {
                c++;
            }
            if (isvowel(s.charAt(r-k))) {
                c--;
            }
            max = Math.max(max , c);
        }
        return max;
    }
    public static boolean isvowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
