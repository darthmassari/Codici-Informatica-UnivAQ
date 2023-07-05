public class Studente extends Lettore {

    private String matricola;

    public Studente(String s, String r, String c, String m) {
        super (s, r, c);
        matricola = m;
    }

    public String get_matricola() {
        return matricola;
    }

    public void set_matricola(String s) {
        matricola = s;
    }

    public String get_codice() {
        return ("Matricola: " + matricola);
    }

    public String info() {
        return("Studente: " + super.get_nome() + " " + get_codice() + super.get_residenza());
    }


    
}
