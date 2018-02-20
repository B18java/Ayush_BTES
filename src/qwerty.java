
public class qwerty {

    public static void main(String args[]) {
        int i, j = 0, count = 0;
        String s = "chandigarh is beautiful city";
        String a = "";
        String b = "";
        int l = s.length();
        for (i = 0; i < l; i++) {
            if ((s.charAt(i) == ' ') || (s.charAt(i) == l - 1)) {
                count++;
            
            {
                if ((s.charAt(i) == l - 1)) {
                    a = s.substring(j, i + 1);
                } else {
                    a = s.substring(j, i);
                    for (int k = count; k >=0; k--) {
                        b = b + a.charAt(i);
                    }
                }
            }
            i = j + 1;
        }

    }
}
}