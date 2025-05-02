public class MainSolid {
    public static void main(String[] args) {
        Solid cuboid = new Cuboid(5, 3, 2);
        Solid sphere = new Sphere(4);

        System.out.printf("Cuboid Volume: %.2f\n", cuboid.calculateVolume());
        System.out.printf("Sphere Volume: %.2f\n", sphere.calculateVolume());
    }
}

