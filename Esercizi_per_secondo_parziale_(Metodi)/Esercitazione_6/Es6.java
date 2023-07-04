/*
* Esercizio 6. Scrivere un metodo che, dati un array bidimensionale di caratteri a, un
carattere c ed un array monodimensionale di interi b, restituisce true se per ogni riga
a[i] di a si ha che in a[i] esistono almeno b[i] elementi uguali al carattere c, altrimenti
il metodo restituisce false. Ad esempio, dati a = {{'a','b','a','d'},{'c','a','a'},
{'a','a','g','a','w'}}, c = 'a' e b = {2,1,3}, il metodo restituisce true.
Si assuma che gli array a e b abbiano la stessa lunghezza.
*/
class Es6{
    public static void main(String[] args) {
        char[][] a = { { 'a', 'b', 'a', 'd' }, { 'c', 'a', 'a' }, { 'a', 'a', 'g', 'a', 'w' } };
        int[] b = { 2, 1, 3 };
        char c = 'a';
        System.out.println(metodo6(a, b, c));
    }

    public static boolean metodo6(char[][] a, int[] b, char c) {
        for (int i = 0; i < a.length; i++) {
            int k = 0;
            for (int j = 0; j < a[i].length && b[i] != k; j++) {
                if (a[i][j] == c)
                    k++;
            }
            if (k < b[i])
                return false;
        }
        return true;
    }
}