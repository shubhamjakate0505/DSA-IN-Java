import java.util.*;

public class RemoveDublicate {

    public static void remove(String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        // Process current character
        char currchar = Character.toLowerCase(str.charAt(idx));
        if (map[currchar - 'a']) {
            // Duplicate character
            remove(str, idx + 1, newstr, map);
        } else {
            // Unique character
            map[currchar - 'a'] = true;
            remove(str, idx + 1, new StringBuilder(newstr).append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "Apnnacollege";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
