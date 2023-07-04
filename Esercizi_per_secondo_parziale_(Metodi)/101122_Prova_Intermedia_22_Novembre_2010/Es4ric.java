public class Es4ric {
    public static void main(String[] args) {
        int[] a = {3,-8,1,7,-10,12};
        int[] d = metodo4ric(a);
        for(int i=0; i<d.length; i++)
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
    public static int[] metodo4ric(int[] a){
        int[] b = new int[a.length]; 
        return metodo4ric(a, b, 0, 0);
    }

    public static int[] metodo4ric(int[] a, int[] b, int i, int sum) {
        if(i>=a.length)
            return b;

        sum += a[i];
        b[i] = sum;   
        return metodo4ric(a, b, i+1, sum);
    }
}
