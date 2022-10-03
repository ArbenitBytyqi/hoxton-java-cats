public class App {
    public static void main(String[] args) {
        Cat catSnow = new Cat("Snow", 3, true);
        catSnow.displayInfo();

        Cat catGarfield = new Cat("Garfield", 1, false);
        catGarfield.displayInfo();

        Cat catDark = new Cat("Dark", 2, true);
        catDark.displayInfo();
    }
}
