class Esercitazione {
    public static void main(String[] args) {
        String[][] a = { { "krjR", "ht" }, { "gif", "Z", "" }, { "hd" }, { "xr", "dif", "jd", "rq" }, { "a", "ww" } };
        int i = 0, j = 0, k = 0;
        boolean p = false;
        String s = "*";
        while (i < a.length && !p) {
            for (j = 0; j < a[i].length - 1; j++) {
                if (a[i][j].length() <= a[i][j + 1].length()) {
                    p = true;
                    s = a[i][j] + s;
                }
            }
            if (p)
                k = i;
            i++;
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(p);
    }
}