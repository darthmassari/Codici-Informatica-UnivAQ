class code_prediction_4 {
    public static void main(String[] args) {
        boolean[][] a = { { true, true, false, false, false }, { false, true, true } };
        int i = 0, j = 0, k = 0, c = 0;
        while (i < a.length && k == c) {
            k = 0;
            c = 0;
            for (j = 0; j < a[i].length - 1; j++) {
                if (a[i][j] && a[i][j + 1])
                    k++;
                else
                    c++;
            }
            i++;
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(c);
    }
}