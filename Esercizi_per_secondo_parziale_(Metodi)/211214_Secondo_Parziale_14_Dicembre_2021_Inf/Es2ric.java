public class Es2ric {
    public static void main(String[] args) {
        String[] a = { "aabcda", "fhhgf", "mkmt", "xxy" };
        char[] c = { 'a', 'h', 'm', 'z' };
        char[] d = { 'g', 'r', 'v', 'w' };
        String[] b = metodo3(a, c, d);
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }

    public static String[] metodo3(String[] a, char[] c, char[] d) {
        String[] b = new String[a.length];
        return metodo3(a, c, d, b, 0, 0);
    }

    public static String[] metodo3(String[] a, char[] c, char[] d, String[] b, int i, int j) {
        if (i >= a.length)
            return b;

        if (j >= a[i].length())
            return metodo3(a, c, d, b, i + 1, 0);

        if (j == 0)
            b[i] = "";

        if (a[i].charAt(j) == c[i])
            b[i] += a[i].charAt(j);
        else
            b[i] += a[i].charAt(j);

        return metodo3(a, c, d, b, i, j + 1);
    }
}
