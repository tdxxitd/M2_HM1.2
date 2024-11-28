public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];

        objects[0] = createObject("firstChild");
        objects[1] = createObject("secondChild");
        objects[2] = createObject("thirdChild");

        for (Printable obj : objects) {
            obj.print();
        }
    }
    public static Printable createObject(String className) {
        switch (className) {
            case "firstChild":
                return new firstChild("Nika", 16);
            case "secondChild":
                return new secondChild("John", "drawing");
            case "thirdChild":
                return new thirdChild("Mike", 1.72);
            default:
                System.out.println("Unknown class name: " + className);
        }
        return null;
    }
}