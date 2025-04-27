public class NameCheck {
    public static void main(String[] args) {
        String name = "John%$";

        boolean isNameValid = name.matches("^[A-Za-z ]+$");

        if (isNameValid == true) {
            System.out.println(name + " is a valid name");
        } else {
            System.out.println(name + " is not a valid name");
        }
    }
}
