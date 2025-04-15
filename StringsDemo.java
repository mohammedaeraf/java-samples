public class StringsDemo {
    public static void main(String[] args) {
        String a = "10";
        String b = "20";
        String c = a + b; // concat
        // System.out.println(c);

        String firstName = "Mohammed "; // camel casing
        String lastName = "Aeraf";
        String fullName = firstName.concat(lastName);

        System.out.println(firstName.contains("Moh"));
        System.out.println(firstName.startsWith("M"));
        System.out.println(firstName.endsWith("mmed"));
        System.out.println(firstName.substring(1));
        System.out.println(firstName.substring(0, 3));

        System.out.println(fullName);
        System.out.println(firstName.length());
        System.out.println(fullName.charAt(0));
        greet("Ali");
    }
    public static void greet(String name) {
        if (name == "") {
            System.out.println("As salam alaykum brother");
        } else {
            System.out.println("As salam alaykum ".concat(name));
        }
    }

}