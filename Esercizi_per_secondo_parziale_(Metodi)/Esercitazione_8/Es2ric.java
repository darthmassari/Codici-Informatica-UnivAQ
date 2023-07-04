public class Es2ric {
/* Scrivere un metodo statico iterativo che, dati un array bidimensionale di
stringhe a ed un array monodimensionale di stringhe c, restituisce un array monodimensionale di booleani b 
tale che b[i] vale true se la stringa c[i] `e prefisso di almeno una stringa in
a[i], altrimenti b[i] vale false. (N.B. utilizzare il metodo substring.)
Esempio: se a = {{"cappello","","bozza"},{"carota","carro"},{"su","pericolo",
"sopra","pero"}} e c = {"appello","caro","per"}, il metodo restituisce l’array {false,
true,true}.
*/



    public static void main(String[] args) {
        String[][] a = { { "cappello", "", "bozza" }, { "carota", "carro" }, { "su", "pericolo", "sopra", "pero" } };
        String[] c = { "appello", "caro", "per" };

        boolean[] d = metodo2ric(a, c);
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

    public static boolean[] metodo2ric(String[][] a, String[] c) {
        boolean[] toReturn = new boolean[a.length];
        return metodo2ric(a, c, toReturn, 0, 0);
    }

    public static boolean[] metodo2ric(String[][] a, String[] c, boolean[] toReturn, int i, int j) {
        if (i >= a.length)
            return toReturn;

        if (j >= a[i].length && toReturn[i] == true)
            return (metodo2ric(a, c, toReturn, i + 1, 0));

        if (c[i].length() <= a[i][j].length() && a[i][j].substring(0, c[i].length()).equals(c[i]))
            toReturn[i] = true;

        return metodo2ric(a, c, toReturn, i, j + 1);
    }
}