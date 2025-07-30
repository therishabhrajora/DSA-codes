import java.util.*;
import java.util.Queue;

public class FirtstNonRepeatingCharacter {
    static void firtstNonRepeatingCharacter(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;
            q.add(str.charAt(i));

        }

        // Only first non-repeating char
        while (!q.isEmpty()) {
            char ch = q.poll();
            if (freq[ch - 'a'] == 1) {
                System.out.println(ch);
                return;
            }
        }
        //frwqiuecy of 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] == 1) {
                System.out.println(ch);
            }
        }
        System.out.println(-1); //No non-repeating character found

    }

    public static void main(String[] args) {
        String str = "aabbccdf";
        firtstNonRepeatingCharacter(str);
    }
}
