package initializations;

public class Init3 {
    private Integer i;

    //Lazy initialization
    public Integer getI() {
        if (this.i == null) {
            this.i = 10;
        }
        return i;
    }
}