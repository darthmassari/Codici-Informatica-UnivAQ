public class Lettore {
    private String nome, residenza, codice;

    public Lettore(String s, String r, String c) {
        nome = s;
        residenza = r;
        codice = c;
    }

    public String get_nome() {
        return nome;
    }

    public String get_residenza() {
        return residenza;
    }

    public String get_codice() {
        return codice;
    }

    public String info() {
        return nome + " " + codice + " " + residenza;
    }
}