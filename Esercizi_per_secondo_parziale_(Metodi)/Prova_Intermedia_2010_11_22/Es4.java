public class Es4 {
    public static void main(String[] args) {
        int[] a = { 3, -8, 1, 7, -10, 12 };
        int[] d = metodo4(a);
        for (int i = 0; i < a.length; i++)
            System.out.println(d[i]);
    }

    /*
     * Esercizio 4. Scrivere un metodo che, dato un array monodimensionale di interi
     * a, restituisce
     * un array di interi b tale che ogni elemento b[k] di b (con k = 0; . . . ;
     * b.length-1) è la somma
     * a[0] + a[1] + . . . + a[k] dei primi k elementi di a. Ad esempio, se a =
     * {3,-8,1,7,-10,12},
     * il metodo restituisce l'array b = {3,-5,-4,3,-7,5}.
     */

    public static int[] metodo4(int[] a) {
        int[] b = new int[a.length];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            b[i] = sum;
        }
        return b;
    }

}
