public class Oop {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    // static - you don't have to create an instance of a class
    // Creating an instance of a class/object
        User user_one = new User();
        // new User() is a constructor
        user_one.name = "Caleb";
        user_one.membership = "Gold";

        User user_two = new User();
        user_two.name = "Sally";
        user_two.membership = "Silver";

        // Accessing the values
        System.out.println(user_one.name);
        System.out.println(user_two.membership);

    }
}