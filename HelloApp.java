public class HelloApp {
    public static void main(String[] args) {
        // Check if a name was passed
        String name = (args.length > 0) ? args[0] : "World";
        
        // Display greeting
        System.out.println("Hello " + name);
    }
}