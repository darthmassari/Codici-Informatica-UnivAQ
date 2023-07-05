package Febbraio182020;

/*Un farmaco pediatrico `e un farmaco caratterizzato anche dall’et`a minima
e dall’et`a massima dei bambini a cui pu`o essere somministrato, e dal numero di giorni di
validit`a dopo la sua apertura. Scrivere una classe FarmacoP con un opportuno costruttore ed
i metodi che restituiscono i valori delle variabili istanza. Definire inoltre i seguenti metodi:
- un metodo che modifica l’et`a minima e l’et`a massima;
- un metodo che, dati due farmaci pediatrici, verifica se hanno lo stesso principio attivo e lo
stesso numero di giorni di validit`a;
- un metodo che, dati due farmaci pediatrici, restituisce quello con il numero di giorni di
validit`a maggiore, a patto che il principio attivo dei due farmaci sia lo stesso (il metodo deve
sollevare un’opportuna eccezione se ci`o non `e vero);
- un metodo che restituisce una stringa che descrive un oggetto della classe FarmacoP*/

class PriAttDiv extends Exception {
}

public class farmacoP extends farmaco {
    private int etaMin;
    private int etaMax;
    private int nGiorni;

    public farmacoP(String n, String pA, String cF, boolean oR, int mS, int aS, int etaMin, int etaMax, int nGiorni) {
        super(n, pA, cF, oR, mS, aS);
        this.etaMin = etaMin;
        this.etaMax = etaMax;
        this.nGiorni = nGiorni;
    }

    public int getEtaMin() {
        return this.etaMin;
    }

    public int getEtaMax() {
        return this.etaMax;
    }

    public int getnGiorni() {
        return this.nGiorni;
    }

    public void setEta(int c, int d) {
        this.etaMin = c;
        this.etaMax = d;
    }

    public boolean ugualiFarmaciP(farmacoP a) {
        return (this.getPrincipioAttivo().equals(a.getPrincipioAttivo()) &&
                this.nGiorni == a.nGiorni);
    }

    public farmacoP maggiorFarmacoP(farmacoP b) throws PriAttDiv {
        if (this.getPrincipioAttivo().equals(b.getPrincipioAttivo())) {
            if (this.nGiorni >= b.nGiorni) {
                return this;
            } else {
                return b;
            }

        } else {
            throw new PriAttDiv();
        }
    }

    public String toString() {
        return (super.toString() + " eta minima " + this.etaMin +
                " eta max " + this.etaMax + " giorni di validita " + this.nGiorni);
    }
}
