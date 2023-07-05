public class Professore extends Lettore {

    private String codice_fiscale;

    public Professore(String s, String r, String c, String c1) {
        super(s, r, c);

        codice_fiscale = c1;
    }

    public String get_codice_fiscale() {
        return codice_fiscale;
    }

    public void set_codice_fiscale(String c1) {
        codice_fiscale = c1;
    }

    public String get_codice() {
        return "Codice fiscale: " + codice_fiscale;
    }

    public String info() {
        return "Professore: " + get_nome() + " " + get_codice() + " " + get_residenza();

    }
}
