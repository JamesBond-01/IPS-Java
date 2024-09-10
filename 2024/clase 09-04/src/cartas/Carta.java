package cartas;

public class Carta {
    private Numero numero;
    private Palo palo;


    /**
     * Constructor con dos argumentos.
     * @param numero: numero de la carta (del 1 al 12).
     * @param palo: palo de la carta (Copa, Basto, Espada, Oro).
     */
    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Boolean equals(Carta carta2) {
        return (this.numero == carta2.numero) && (this.palo == carta2.palo);
    }
}
