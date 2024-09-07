package initializations;

public class Init4 {
    // Static + Final equivale a una constante, ya que, que sea static, al ser un valor de la clase, es único.
    // Final es un valor que no se modificar.
    public static final int MAX;
    static {
        MAX = 4;
    }

    private final int i;

    public Init4(int i) {
        this.i = i;
    }
}
