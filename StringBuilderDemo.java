public class StringBuilderDemo {
    public static void main(String[] args) {

        // String objects are immutable
        String s = "Hello";

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder(s);

        // Append text to the StringBuilder
        sb.append(" World!");
        System.out.println("After append: " + sb);

        // Insert text at a specific position
        // Hello World!
        sb.insert(6, "Exciting ");
        System.out.println("After insert: " + sb);

        // Replace a portion of the string
        sb.replace(6, 15, "Amazing ");
        System.out.println("After replace: " + sb);

        // // Delete a portion of the string
        sb.delete(6, 14);
        System.out.println("After delete: " + sb);

        // // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // // Get the length of the string
        System.out.println("Length: " + sb.length());

        // // Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}
