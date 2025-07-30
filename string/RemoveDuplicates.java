import java.util.Arrays;

public class RemoveDuplicates {
    public static void removeDuplicates(String str, int indx, StringBuilder newstr, boolean map[]) {
        if (indx == str.length()) {
            // char[] chars=newstr.toString().toCharArray();
            // Arrays.sort(chars);
            // newstr = new StringBuilder(new String(chars));
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(indx);
        if (map[currchar - 'a'] == true) {
            removeDuplicates(str, indx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDuplicates(str, indx + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean map[] = new boolean[26]; // Assuming lowercase letters a-z
        removeDuplicates(str, 0, new StringBuilder(""), map);
    }
}