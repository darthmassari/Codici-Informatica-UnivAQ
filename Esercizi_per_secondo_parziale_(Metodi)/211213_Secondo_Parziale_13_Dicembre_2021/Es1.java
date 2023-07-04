public class Es1 {
   public static void main(String[] args) {
      String[][] a = { { "abc", "eb", "d" }, { "rkr", "rc" }, { "mp", "aqsfg", "ats", "ar" } };
      char[] c = { 'b', 'r', 'a' };
      int k = 4;
      System.out.println(metodo1(a, c, k));
   }
   /*
    * Esercizio 1. Scrivere un metodo statico iterativo che, dati un array
    * bidimensionale di stringhe a, un array monodimensionale di caratteri c ed un intero k,
    * restituisce true se in ogni riga a[i] esiste almeno una stringa il cui primo carattere è uguale a
    * c(i] e la cui lunghezza è minore di k; altrimenti il metodo restituisce false.
    * Esempio: se a = {{"abc", "bb", "d"}, {"rkr", "rc"}, {"mp", "aqsfg", "ats","ar"}},
    * c = {'b','r','a'} e k = 4, il metodo restituisce true.
    * Si assuma che gli array a e c abbiano lunghezza uguale, che ogni stringa in a
    * sia non vuota e k>0.
    * Occorre passare alla riga successiva non appena si trova in a[i] la prima
    * stringa che soddisfa la condizione data.
    * Occorre restituire false non appena si trova la prima riga a[i] che non
    * soddisfa la condizione richiesta
    */

   public static boolean metodo1(String[][] a, char[] c, int k) {
      boolean toReturn = false;
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length && toReturn == false; j++) {
            if (a[i][j].charAt(0) == c[i] && a[i][j].length() < k) {
               toReturn = true;
            }
         }
         if (toReturn == false)
            return false;
      }
      return toReturn;
   }
}