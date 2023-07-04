public class Class6 {

	public static void main(String[] args) {

		String[][] a = { { "abcd", "ab", "kzz" }, { "cde", "", "hkkhh", "a" }, { "pprs", "lp" } };
		int[][] b = metodo1ric(a);

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}

		String s = "arrivederci";
		String t = metodo5ric(s);
		System.out.println(t);

		
		char[][] c = {{'a','b','a','d'},{'c','a','a'},{'a','a','g','a','w'}}; 
		char d = 'a';
		int[] e= {2,1,3};
		
		System.out.println(metodo6ric(c, d, e));
		
		
		int[] f = {3,5,5,-1,7,7,7,4};
		int g = 3;
		
		System.out.println(metric(f, g));
		
	}

	/*
	 * Scrivere un metodo che, dato un array bidimensionale di stringhe a,
	 * restituisce un array bidimensionale di interi b contenente le lunghezze degli
	 * elementi di a nelle posizioni corrispondenti. Ad esempio, se a =
	 * {{"abcd","ab","kzz"},{"cde","","hkkhh","a"}, {"pprs","lp"}}, il metodo
	 * restituisce l'array b = {{4,2,3},{3,0,5,1},{4,2}}.
	 */

	public static int[][] metodo1(String[][] a) {

		int[][] b = new int[a.length][];

		for (int i = 0; i < a.length; i++) {
			b[i] = new int[a[i].length];
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[i][j].length();
			}
		}

		return b;
	}

	public static int[][] metodo1ric(String[][] a) {

		int[][] b = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			b[i] = new int[a[i].length];
		}

		b = metodo1ric(a, b, 0, 0);
		return b;
	}

	public static int[][] metodo1ric(String[][] a, int[][] b, int i, int j) {

		if (i >= a.length)
			return b;

		if (j >= a[i].length)
			return metodo1ric(a, b, i + 1, 0);

		b[i][j] = a[i][j].length();

		return metodo1ric(a, b, i, j + 1);

	}

	/*
	 * Esercizio 5. Scrivere un metodo che, data una stringa s, restituisce una
	 * nuova stringa t ottenuta da s scambiando i caratteri adiacenti di s, ovvero
	 * il primo carattere con il secondo, il terzo con il quarto, etc. Ad esempio,
	 * data s = "arrivederci", il metodo restituisce la stringa t = "rairevedcri".
	 * Nel caso in cui l'ultimo carattere di s non venga scambiato con il carattere
	 * precedente, l'ultimo carattere di t �e uguale all'ultimo carattere di s.
	 */

	public static String metodo5(String s) {

		String t = "";

		for (int i = 0; i < s.length() - 1; i += 2) {
			t += s.charAt(i + 1);
			t += s.charAt(i);
		}

		if (s.length() % 2 != 0)
			t += s.charAt(s.length() - 1);

		return t;
	}

	
	// Soluzione ricorsiva
	public static String metodo5ric(String s) {
		String t = "";
		return metodo5ric(s, t, 0);
	}

	public static String metodo5ric(String s, String t, int i) {
		if (i == s.length() - 1 && s.length() % 2 != 0) {
			t = t + s.charAt(s.length() - 1);
			return t;
		} else if (i < s.length() - 1) {
			t = t + s.charAt(i + 1);
			t = t + s.charAt(i);
			return metodo5ric(s, t, i + 2);
		}
		return t;
	}
	
	
	
	/*
	 * Esercizio 6. Scrivere un metodo che, dati un array bidimensionale di caratteri a, un
		carattere c ed un array monodimensionale di interi b, restituisce true se per ogni riga
		a[i] di a si ha che in a[i] esistono almeno b[i] elementi uguali al carattere c, altrimenti
		il metodo restituisce false. Ad esempio, dati a = {{'a','b','a','d'},{'c','a','a'},
		{'a','a','g','a','w'}}, c = 'a' e b = {2,1,3}, il metodo restituisce true.
		Si assuma che gli array a e b abbiano la stessa lunghezza.
	 */
	
	
	public static boolean metodo6(char[][] a, char c, int[] b) {
		
		for(int i=0; i<a.length; i++) {
			int cont = 0;
			
			for(int j = 0; j<a[i].length && b[i] != cont; j++) {
				if(a[i][j] == c)
					cont++;
			}
	
			if(cont < b[i])
				return false;
			
		}
		return true;
		
	}
	
	public static boolean metodo6ric(char[][] a, char c, int[] b) {
		
		return metodo6ric(a, c, b, 0, 0, 0);
		
	}
	
	public static boolean metodo6ric(char[][] a, char c, int[] b, int i, int j, int cont) {
		
		if(i >= a.length)
			return true;
		
		if(j >= a[i].length) {
			if(cont < b[i])
				return false;
			else
				return metodo6ric(a, c, b, i+1, 0, 0);
		}
		
		if(a[i][j] == c)
			cont++;
		
		if(cont == b[i])
			return metodo6ric(a, c, b, i+1, 0, 0);
		
		return metodo6ric(a, c, b, i, j+1, cont);
		
		
	}
	

	/*
	 * Scrivere un metodo che, dato un array monodimensionale di interi a ed un
	intero k (k >0), restituisce true se in a compaiono almeno k coppie di elementi adiacenti
	uguali, altrimenti il metodo restituisce false. Ad esempio, se a = {3,5,5,-1,7,7,7,4} e
	k = 3, il metodo restituisce true.
	 */
	
	
	public static boolean metric(int[] a, int k) {
		
		return metric(a, k, 0, 1);
		
		
	}
	
	public static boolean metric(int[] a, int k, int i, int cont) {
		
		if(cont >= k)
			return true;
		
		
		if(i >= a.length-1)
			return false;

		
		if(a[i] == a[i+1])
			cont++;
		else
			cont = 1;
		
		return metric(a, k, i+1, cont);
		
		
		
		
	}
	
	
	
	
	

}
