package cartas;

public enum Palo {
    COPA("Copa"),
    ESPADA("Basto"),
    BASTO("Basto"),
    ORO("Oro");

    public final String nombre;

    Palo(String nombre) {
        this.nombre = nombre;
    }
}
