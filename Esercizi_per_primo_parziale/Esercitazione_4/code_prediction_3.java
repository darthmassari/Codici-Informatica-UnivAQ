class code_prediction_3 {
    public static void main(String[] args) {
        int[][] a = { { 18, -9, 4 }, { -15, 5, 8, 4, 11 }, { 17, 10, 5, 1 } };
        int i = 0, j = 0, c1 = 0, c2 = 0;
        while (i < a.length && c1 >= c2) {
            c1 = 0;
            c2 = 0;
            for (j = 0; j < a[i].length - 1; j++) {
                if (a[i][j] % a[i][j + 1] != 0) {
                    c1++;
                } else {
                    c2++;
                }
            }
            i++;
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(c1);
        System.out.println(c2);
    }
}