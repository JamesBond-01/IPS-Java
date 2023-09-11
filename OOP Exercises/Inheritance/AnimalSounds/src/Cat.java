public class Cat extends Animal{
    private static final String SOUND = "MIAUUU";
    public Cat() {}
    @Override
    public void makeSound() {
        System.out.println("The cat makes " + SOUND);
    }
}