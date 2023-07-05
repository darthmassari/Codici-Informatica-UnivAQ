package Dicembre132002;

/*Scrivere una classe Elettrodomestico, i cui oggetti sono caratterizzati dal
tipo (Es. Lavatrice), la marca (Es. Ariston), la sigla del modello (Es. AB66X) ed il voltaggio
(Es. 220). De¯nire un costruttore per gli oggetti della classe (con le opportune eccezioni in
caso di parametri numerici non corretti) ed i seguenti metodi:
- i metodi che restituiscono i valori delle variabili istanza;
- un metodo etichetta che restituisce le informazioni relative ad un elettrodomestico, per
esempio una stringa della forma Lavatrice Ariston, modello AB66X, 220V.*/

class ParamNumExc extends Exception {
}

public class Elettrodomestico {
    private String tipo;
    private String marca;
    private String sigla;
    private int volt;

    public Elettrodomestico(String tipo, String marca, String sigla, int volt) throws ParamNumExc {
        if (volt < 0) {
            throw new ParamNumExc();
        } else {
            this.tipo = tipo;
            this.marca = marca;
            this.sigla = sigla;
            this.volt = volt;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getSigla() {
        return sigla;
    }

    public int getVolt() {
        return volt;
    }

    public String etichetta() {
        return this.tipo + " " + this.marca + ", modello " + this.sigla + ", " + this.volt;
    }
}
