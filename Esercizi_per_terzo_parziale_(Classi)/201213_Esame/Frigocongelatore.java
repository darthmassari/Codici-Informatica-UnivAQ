package Dicembre132002;

/*Un frigocongelatore µe un elettrodomestico caratterizzato dalla capacitµa del
reparto frigorifero (Es. 250 litri), la capacitµa del reparto congelatore (Es. 70 litri) ed il
consumo medio annuo (Es. 300kW). Scrivere una classe Frigocongelatore, il cui costrut-
tore segnali eventuali casi di parametri non corretti tramite eccezioni. Tra i metodi della
nuova classe, oltre a quelli che restituiscono i valori delle variabili istanza, de¯nire un
metodo etichetta che restituisce le informazioni relative ad un frigocongelatore, per esempio
Frigocongelatore Ariston, modello MTA296V, 220V, capacitµa frigorifero 250,
capacitµa congelatore 70, consumo 300.*/

class ParamNumExc extends Exception {
}

public class Frigocongelatore extends Elettrodomestico {
    private int capF;
    private int capC;
    private int consM;

    public Frigocongelatore(String tipo, String marca, String sigla, int volt, int capF, int capC, int consM)
            throws ParamNumExc {
        super(tipo, marca, sigla, volt);
        if (capF < 0 || capC < 0 || consM < 0) {
            throw new ParamNumExc();
        } else {
            this.capF = capF;
            this.capC = capC;
            this.consM = consM;
        }
    }

    public int getCapF() {
        return capF;
    }

    public int getCapC() {
        return capC;
    }

    public int getConsM() {
        return consM;
    }

    public String etichetta() {
        return super.etichetta() + ", capacità frigorifero " + this.capF + ", capacità congelatore " + this.capC
                + ", consumo" + this.consM;
    }
}
