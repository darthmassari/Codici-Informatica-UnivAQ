package Dicembre102003;

/*Un aereoporto puµo essere caratterizzato tramite il nome, la cittµa e la sigla
(Es. Galilei, Pisa, PSA). Un passeggero di un volo puµo essere caratterizzato tramite il nome,
la nazionalitµa, la sigla del volo (Es. AZ124), il posto assegnato (Es. 16F), il tipo di pasto
richiesto (Es. vegetariano). Scrivere due classi Aereoporto e Passeggero con gli opportuni
costruttori ed i metodi che restituiscono i valori delle variabili istanza. Inoltre, nella classe
Passeggero de¯nire un metodo che cambia il posto assegnato ad un dato passeggero.*/

public class Passeggero {
    private String nome;
    private String naz;
    private String sigla;
    private String posto;
    private String pasto;

    public Passeggero(String nome, String naz, String sigla, String posto, String pasto) {
        this.nome = nome;
        this.naz = naz;
        this.sigla = sigla;
        this.posto = posto;
        this.pasto = pasto;
    }

    public String getNome() {
        return nome;
    }

    public String getNaz() {
        return naz;
    }

    public String getSigla() {
        return sigla;
    }

    public String getPosto() {
        return posto;
    }

    public String getPasto() {
        return pasto;
    }

    public void setPosto(String a) {
        this.posto = a;
    }
}
