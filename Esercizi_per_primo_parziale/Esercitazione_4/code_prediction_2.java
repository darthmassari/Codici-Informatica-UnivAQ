class code_prediction_2 {
    public static void main(String[] args) {
        String[][] a = { { "aba", "ac", "pqr", "afga", "akk" }, { "oops", "opla", "oh" } };
        int i = 0, j = 0, n = 0;
        boolean p = true;
        for (i = 0; i < a.length; i++) {
            j = 0;
            p = true;
            while (j < a[i].length - 1 && p) {
                if (a[i][j].charAt(0) == a[i][j + 1].charAt(0)) {
                    n++;
                    j++;
                } else
                    p = false;
            }
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(n);
        System.out.println(p);
    }
}