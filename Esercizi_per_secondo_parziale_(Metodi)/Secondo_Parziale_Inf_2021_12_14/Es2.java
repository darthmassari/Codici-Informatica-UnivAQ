public class Es2 {
    public static void main(String[] args) {
        String[] a = { "aabcda", "fhhgf", "mkmt", "xxy" };
        char[] c = { 'a', 'h', 'm', 'z' };
        char[] d = { 'g', 'r', 'v', 'w' };
        String[] b = metodo2(a, c, d);
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);

    }

    public static String[] metodo2(String[] a, char[] c, char[] d) {
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = "";
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) == c[i])
                    b[i] += d[i];
                else
                    b[i] += a[i].charAt(j);
            }
        }
        return b;
    }
}
