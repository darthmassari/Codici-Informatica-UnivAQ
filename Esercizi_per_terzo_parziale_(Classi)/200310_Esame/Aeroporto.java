package Dicembre102003;

/*Un aereoporto puµo essere caratterizzato tramite il nome, la cittµa e la sigla
(Es. Galilei, Pisa, PSA). Un passeggero di un volo puµo essere caratterizzato tramite il nome,
la nazionalitµa, la sigla del volo (Es. AZ124), il posto assegnato (Es. 16F), il tipo di pasto
richiesto (Es. vegetariano). Scrivere due classi Aereoporto e Passeggero con gli opportuni
costruttori ed i metodi che restituiscono i valori delle variabili istanza. Inoltre, nella classe
Passeggero de¯nire un metodo che cambia il posto assegnato ad un dato passeggero.*/

public class Aeroporto {
    private String nome;
    private String citta;
    private String sigla;

    public Aeroporto(String nome, String citta, String sigla) {
        this.nome = nome;
        this.citta = citta;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getCitta() {
        return citta;
    }

    public String getSigla() {
        return sigla;
    }
}
