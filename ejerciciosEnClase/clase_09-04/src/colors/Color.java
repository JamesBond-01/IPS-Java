package colors;
public class Color {
    public static final Color NEGRO = new Color("Negro", 0);
    public static final Color BLANCO = new Color("Blanco", 255);
    public static final Color GRIS = new Color("Gris", 127);

    private String nombre;
    private int codigo;

    private Color(String nombre, int codigo) {
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
