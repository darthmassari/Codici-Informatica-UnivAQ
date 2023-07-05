package Dicembre102003;

/*Un volo non diretto µe un volo con scali intermedi, ovvero gli aereoporti
in cui il volo sosta prima di raggiungere l'aereoporto di destinazione. Scrivere una classe
VoloNonDiretto, il cui numero massimo di scali intermedi viene impostato dal costruttore
della classe (con le opportune eccezioni in caso di parametri numerici non corretti). Oltre ai
metodi che restituiscono i valori delle variabili istanza, de¯nire i seguenti metodi:
- un metodo che aggiunge uno scalo intermedio;
- un metodo che restituisce una stringa che descrive un volo non diretto tramite sigla del
volo, cittµa e nome dell'aereoporto di partenza, cittµa e nome dell'aereoporto di destinazione
e cittµa e nome degli scali intermedi, ad esempio "Volo BA202 Londra Heathrow - Pisa
Galilei via Parigi C. De Gaulle - Milano Malpensa".*/

class ParamNumException extends Exception {
}

public class VoloNonDiretto extends Volo {
    private Aeroporto[] scali;
    private int cont;

    public VoloNonDiretto(String sigla, String aerPar, String aerDes, String aero, Passeggero[] elencoP, int max,
            Aeroporto[] scali, int maxS) throws ParamNumException {
        super(sigla, aerPar, aerDes, aero, elencoP, max);
        if (maxS < 0) {
            throw new ParamNumException();
        } else {
            this.scali = new Aeroporto[maxS];
        }
    }

    public void addScali(Aeroporto a) {
        this.scali[cont] = a;
        this.cont++;
    }

    public String toString() {
        String s = "Volo " + super.getSigla() + super.getAerPar() + " - " + super.getAerDes();
        for (int i = 0; i < cont; i++) {
            s = s + " - " + scali[i].getCitta() + scali[i].getNome();
        }
        return s;
    }

}
