public class Dog extends Animal{
    private static final String SOUND= "GUAU GUAU";
    public Dog() {}
    @Override
    public void makeSound() {
        System.out.println("The dog makes " + SOUND);
    }
}