package cartas;

public record Carta(Numero numero, Palo palo) {

    /**
     * Funcion para mostrar la carta con un formato predeterminado.
     *
     * @return nombre de la carta.
     */
    public String showCarta() {
        return this.numero + " de " + this.palo;
    }

    /**
     * Funcion que compara dos cartas.
     *
     * @param carta2: Carta seleccionada para comparar con la instanciada.
     * @return Resultado de la comparacion.
     */
    public Boolean equals(Carta carta2) {
        return (this.numero == carta2.numero) && (this.palo == carta2.palo);
    }
}
