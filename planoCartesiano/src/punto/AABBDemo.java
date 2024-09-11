package punto;

public class AABBDemo {
    public static void main(String[] args) {
        AABB object1 = new AABB();
        AABB object2 = new AABB();
        AABB object3 = new AABB();

        //Initializing objects 1 & 2.
        object1.setP0(new Punto(1,4));
        object1.setP1(new Punto(2,1));
        object2.setP0(new Punto(4,8));
        object2.setP1(new Punto(8,6));

        System.out.println("Collisions:");

        //Shows if objects 1 & 2 overlap.
        System.out.println("Objects 1 & 2: " + object1.isCollision(object2));

        //Initializing object 3.
        object3.setP0(new Punto(7,7));
        object3.setP1(new Punto(10,4));

        //Shows if objects 1 & 3 overlap.
        System.out.println("Objects 1 & 3: " + object1.isCollision(object3));
        //Shows if objects 2 & 3 overlap.
        System.out.println("Objects 2 & 3: " + object2.isCollision(object3));
    }
}
