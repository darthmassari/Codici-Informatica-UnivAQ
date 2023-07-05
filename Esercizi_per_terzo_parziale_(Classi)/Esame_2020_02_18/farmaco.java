package Febbraio182020;

/*Un farmaco pu`o essere caratterizzato tramite nome, principio attivo, casa
farmaceutica, obbligo della ricetta medica o meno, mese ed anno di scadenza. Scrivere una
classe Farmaco con un opportuno costruttore ed i metodi che restituiscono i valori delle
variabili istanza. Definire inoltre i seguenti metodi:
- un metodo che modifica l’obbligo della ricetta;
- un metodo che, data una stringa s ed un intero m, verifica se un farmaco `e prodotto dalla
casa farmaceutica s e scade dopo l’anno m;
- un metodo che, dati due farmaci, verifica se hanno lo stesso principio attivo e hanno
entrambi l’obbligo della ricetta;
- un metodo che, dati due farmaci, restituisce quello con l’anno di scadenza maggiore;
- un metodo che restituisce una stringa che descrive un oggetto della classe Farmaco*/

public class farmaco {
    private String nome;
    private String principioA;
    private String casaF;
    private boolean obbligoR;
    private int meseS;
    private int annoS;

    public farmaco(String n, String pA, String cF, boolean oR, int mS, int aS) {
        nome = n;
        principioA = pA;
        casaF = cF;
        obbligoR = oR;
        meseS = mS;
        annoS = aS;
    }

    public String getNome() {
        return nome;
    }

    public String getPrincipioAttivo() {
        return principioA;
    }

    public String getCasaFarmaceutica() {
        return casaF;
    }

    public boolean getObbligoRicetta() {
        return obbligoR;
    }

    public int getMeseScadenza() {
        return meseS;
    }

    public int getAnnoScadenza() {
        return annoS;
    }

    public void setObbligoRicetta() {
        obbligoR = !obbligoR;
    }

    public boolean verificaFarmaco(String s, int m) {
        return (this.casaF.equals(s) && this.annoS > m);
    }

    public boolean ugualiFarmaci(farmaco a) {
        return (this.principioA.equals(a.principioA) &&
                this.obbligoR && a.obbligoR);
    }

    public farmaco maggiorFarmaco(farmaco b) {
        if (this.annoS > b.annoS) {
            return this;
        } else {
            return b;
        }
    }

    public String toString() {
        return ("Farmaco " + nome + " " + principioA + " prodotto da " + casaF
                + " obbligo ricetta " + obbligoR + " scadenza " + meseS + "/" + annoS);
    }

}
