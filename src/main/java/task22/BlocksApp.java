package task22;

public class BlocksApp {

    public static void main(String[] args) {

        Cube cube = new Cube(3.0);
        Cube cube1 = new Cube(4.0);
        Cube cube2 = new Cube(3.0);

        cube.fill(30.0);
        cube1.fill(30.0);
        cube2.fill(27.0);

        System.out.println("******************");
        Cone cone = new Cone(2.0, 3.0, 3.0);
        cone.fill(Math.PI * 4.0);

        Cone cone1 = new Cone(2.0, 3.0, 4.0);
        cone1.fill(Math.PI * 4.0);
    }
}
