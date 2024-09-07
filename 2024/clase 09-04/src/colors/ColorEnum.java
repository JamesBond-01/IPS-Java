package colors;
public enum ColorEnum {
    NEGRO("Negro", 0),
    GRIS("Gris", 127),
    BLANCO("Blanco", 255);

    private String nombre;
    private int codigo;

    private ColorEnum(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
}
