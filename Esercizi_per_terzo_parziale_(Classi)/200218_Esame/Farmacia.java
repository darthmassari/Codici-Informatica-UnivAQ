package Febbraio182020;

/*Una farmacia pu`o essere caratterizzata tramite nome, nome del proprietario,
indirizzo e l’elenco dei farmaci in vendita. Scrivere una classe Farmacia, il cui costruttore
imposta il numero massimo di farmaci trattati da una farmacia. Oltre ai metodi che resti-
tuiscono i valori delle variabili istanza, definire i seguenti metodi:
- un metodo che modifica il nome del proprietario;
- un metodo che, dato un farmaco f, aggiunge f nell’elenco dei farmaci di una farmacia (il
metodo deve sollevare un’opportuna eccezione nel caso di elenco pieno);
- un metodo che, dati una stringa s ed un intero n, restituisce l’elenco dei farmaci prodotti
dalla casa farmaceutica s che scadono nell’anno n;
- un metodo che, dati due interi m ed n, restituisce l’elenco dei farmaci pediatrici per bambini
di et`a compresa tra m ed n (estremi inclusi). Si assuma m<n.*/

class ExcElFull extends Exception {
}

public class Farmacia {
    private String nome, nomeP, indirizzo;
    private farmaco[] elencoF;
    private int cont;

    public Farmacia(String n, String nP, String i, int max) {
        this.nome = n;
        this.nome = nP;
        this.indirizzo = i;
        this.elencoF = new farmaco[max];
    }

    public String getNome() {
        return this.nome;
    }

    public String getNomeP() {
        return this.nomeP;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setNomeP(String j) {
        this.nomeP = j;
    }

    public void aggFarmaco(farmaco a) throws ExcElFull {
        if (this.cont < this.elencoF.length) {
            this.elencoF[cont] = a;
            this.cont++;
        } else {
            throw new ExcElFull();
        }
    }

    public farmaco[] elencoFarmaci(String s, int n) {
        int j = 0;

        for (int i = 0; i < cont; i++) {
            if (elencoF[i].getCasaFarmaceutica().equals(s) && elencoF[i].getAnnoScadenza() == n) {
                j++;
            }
        }

        farmaco[] elencoTemp = new farmaco[j];
        j = 0;
        for (int i = 0; i < cont; i++) {
            if (elencoF[i].getCasaFarmaceutica().equals(s) && elencoF[i].getAnnoScadenza() == n) {
                elencoTemp[j] = elencoF[i];
                j++;
            }
        }
        return elencoTemp;
    }

    public String toString() {
        String s = "Farmacia " + this.nome + " di " + this.nomeP + " Indirizzo " + this.indirizzo;
        for (int i = 0; i < cont; i++) {
            s = s + elencoF[i].toString() + " ";
        }
        return s;
    }

}
