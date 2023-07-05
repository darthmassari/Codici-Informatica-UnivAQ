package Dicembre132002;
/*Scrivere una classe NegozioElettrodomestici, i cui oggetti sono caratterizzati
dal nome del negozio, l'indirizzo e l'insieme di elettrodomestici in vendita presso il negozio
(il cui numero massimo viene impostato dal costruttore della classe). Oltre ai metodi che
restituiscono i valori delle variabili istanza, de¯nire i seguenti metodi:
- un metodo che aggiunge un elettrodomestico;
- un metodo che restituisce l'elenco di tutti gli elettrodomestici di una data marca m.*/

public class NegozioElettrodomestici {
    private String nomeN;
    private String ind;
    private Elettrodomestico[] elencoE;
    private int cont;

    public NegozioElettrodomestici(String nomeN, String ind, Elettrodomestico[] elencoE, int max) {
        this.nomeN = nomeN;
        this.ind = ind;
        this.elencoE = new Elettrodomestico[cont];
    }

    public String getNomeN() {
        return nomeN;
    }

    public String getInd() {
        return ind;
    }

    public void addElettrodomestico(Elettrodomestico e) {
        this.elencoE[cont] = e;
        this.cont++;
    }

    public Elettrodomestico[] elencoMarca(String m) {
        int j = 0;
        for (int i = 0; i < cont; i++) {
            if (this.elencoE[i].getMarca().equals(m)) {
                j++;
            }
        }
        Elettrodomestico[] elencoM = new Elettrodomestico[j];
        j = 0;
        for (int i = 0; i < cont; i++) {
            if (this.elencoE[i].getMarca().equals(m)) {
                elencoM[j] = this.elencoE[i];
                j++;
            }
        }
        return elencoM;
    }
}
