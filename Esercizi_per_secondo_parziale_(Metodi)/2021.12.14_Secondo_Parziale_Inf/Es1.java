public class Es1 {
    public static void main(String[] args) {
        String[][] a = { { "aabb", "cb" }, { "tq2w", "lpr", "alfa" }, { "fgsqr", "gg" } };
        int[] b = { 3, 2, 4 };
        System.out.println(metodo1(a, b));
    }

    public static boolean metodo1(String[][] a, int[] b) {
        boolean toReturn = false;
        for (int i = 0; i < a.length && toReturn == false; i++) {
            boolean nonTrovato = false;
            for (int j = 0; j < a[i].length && nonTrovato == false; j++) {
                if (a[i][j].length() <= b[i])
                    nonTrovato = true;
            }
            if (nonTrovato == false)
                toReturn = true;
        }
        return toReturn;
    }

}
