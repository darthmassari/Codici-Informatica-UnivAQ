public class Es6ric {
    public static void main(String[] args) {
        char[][] a = { { 'a', 'b', 'a', 'd' }, { 'c', 'a', 'a' }, { 'a', 'a', 'g', 'a', 'w' } };
        int[] b = { 2, 1, 3 };
        char c = 'a';
        System.out.println(metodo6ric(a, b, c));
    }


/*
Esercizio 6. Scrivere un metodo che, dati un array bidimensionale di caratteri a, un
carattere c ed un array monodimensionale di interi b, restituisce true se per ogni riga
a[i] di a si ha che in a[i] esistono almeno b[i] elementi uguali al carattere c, altrimenti
il metodo restituisce false. Ad esempio, dati a = {{'a','b','a','d'},{'c','a','a'},
{'a','a','g','a','w'}}, c = 'a' e b = {2,1,3}, il metodo restituisce true.
Si assuma che gli array a e b abbiano la stessa lunghezza.
*/
    public static boolean metodo6ric(char[][] a, int[] b, char c) {
        return metodo6ric(a, b, c, 0, 0, 0);
    }

    public static boolean metodo6ric(char[][] a, int[] b, char c, int i, int j, int k) {
        if(i >= a.length)
			return true;
		
		if(j >= a[i].length) {
			if(k < b[i])
				return false;
			else
				return metodo6ric(a, b, c, i+1, 0, 0);
		}
		
		if(a[i][j] == c)
			k++;
		
		if(k == b[i])
			return metodo6ric(a, b, c, i+1, 0, 0);
		
		return metodo6ric(a, b, c, i, j+1, k);
		
	}
}