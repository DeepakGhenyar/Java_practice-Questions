package wrapper;

public class wrapper {
    public static void main(String[] args) {

        // ✅ Primitive type
        int a = 10;

        // ✅ Autoboxing (primitive → wrapper object)
        Integer obj = a; 
        System.out.println("Autoboxing: int a = " + a + " → Integer obj = " + obj);

        // ✅ Unboxing (wrapper object → primitive)
        int b = obj; 
        System.out.println("Unboxing: Integer obj = " + obj + " → int b = " + b);

        // ✅ Wrapper class methods
        String numStr = "25";
        int num = Integer.parseInt(numStr); 
        System.out.println("Parsed int from String: " + num);

        // ✅ Double example
        Double dObj = 12.34;  // Autoboxing
        double d2 = dObj;     // Unboxing
        System.out.println("Double Wrapper: " + dObj + " | primitive: " + d2);

        // ✅ Boolean example
        Boolean boolObj = true; // Autoboxing
        boolean flag = boolObj; // Unboxing
        System.out.println("Boolean Wrapper: " + boolObj + " | primitive: " + flag);

        // ✅ Using .equals() and .compareTo()
        Integer x = 100;
        Integer y = 100;
        Integer z = 200;

        // equals() → checks content (value)
        System.out.println("\nEquals Method:");
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("x.equals(z): " + x.equals(z)); // false

        // compareTo() → returns:
        // 0 if equal, +ve if greater, -ve if smaller
        System.out.println("\nCompareTo Method:");
        System.out.println("x.compareTo(y): " + x.compareTo(y)); // 0
        System.out.println("x.compareTo(z): " + x.compareTo(z)); // -1 (x < z)
        System.out.println("z.compareTo(x): " + z.compareTo(x)); // 1 (z > x)
    }
}
