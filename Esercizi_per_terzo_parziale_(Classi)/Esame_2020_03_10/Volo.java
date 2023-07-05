package Dicembre102003;

/*Un volo puµo essere caratterizzato tramite la sigla (Es. AZ124), l'aereoporto di
partenza, l'aereoporto di destinazione, l'aereomobile (Es. Airbus300) e l'elenco dei passeg-
geri. Scrivere una classe Volo, il cui costruttore imposta il numero massimo di passeggeri
(con le opportune eccezioni in caso di parametri numerici non corretti). Oltre ai metodi che
restituiscono i valori delle variabili istanza, de¯nire i seguenti metodi:
- un metodo che aggiunge un passeggero ad un volo;
- un metodo che restituisce una stringa che descrive un volo tramite sigla del volo, cittµa e
nome dell'aereoporto di partenza e cittµa e nome dell'aereoporto di destinazione, ad esempio
"Volo AZ108 Roma Fiumicino - Londra Heathrow";
- un metodo che restituisce l'elenco dei nomi dei passeggeri di un volo;
- un metodo che restituisce l'elenco dei posti dei passeggeri che hanno richiesto un pasto
vegetariano.*/

class ParamNumException extends Exception {
}

public class Volo {
    private String sigla;
    private String aerPar;
    private String aerDes;
    private String aero;
    private Passeggero[] elencoP;
    private int cont;

    public Volo(String sigla, String aerPar, String aerDes, String aero, Passeggero[] elencoP, int max)
            throws ParamNumException {
        if (max < 0) {
            throw new ParamNumException();
        } else {
            this.sigla = sigla;
            this.aerPar = aerPar;
            this.aerDes = aerDes;
            this.aero = aero;
            this.elencoP = new Passeggero[max];
        }
    }

    public String getSigla() {
        return sigla;
    }

    public String getAerPar() {
        return aerPar;
    }

    public String getAerDes() {
        return aerDes;
    }

    public String getAero() {
        return aero;
    }

    public void addPass(Passeggero p) {
        this.elencoP[cont] = p;
        this.cont++;
    }

    public String toString() {
        return "Volo " + this.sigla + " " + " " + this.aerPar + " - " + this.aerDes;
    }

    public String[] getElencoP() {
        String[] elencoN = new String[cont];
        for (int i = 0; i < cont; i++) {
            elencoN[i] = this.elencoP[i].getNome();
        }
        return elencoN;
    }

    public String[] getPostiVeg() {
        int j = 0;
        for (int i = 0; i < cont; i++) {
            if (this.elencoP[i].getPasto().equals("Vegetariano")) {
                j++;
            }
        }

        String[] elencoVeg = new String[j];
        j = 0;
        for (int i = 0; i < cont; i++) {
            if (this.elencoP[i].getPasto().equals("Vegetariano")) {
                elencoVeg[j] = elencoP[i].getPosto();
                j++;
            }
        }
        return elencoVeg;
    }

}
