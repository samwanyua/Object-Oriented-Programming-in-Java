public class Oop {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    // static - you don't have to create an instance of a class
    // Creating an instance of a class/object
        User user_one = new User();
        // new User() is a constructor
        user_one.set_name("Caleb Peace"); //using a setter

        user_one.set_membership(User.Membership.Gold);

        // User user_two = new User();
        // user_two.name = "Sally";
        // user_two.membership = "Silver";
        // user_two.age = 23;



        // Accessing the values
        System.out.println(user_one.get_name()); // using a getter
        System.out.println(user_one.get_membership());

        // System.out.println(user_two.membership);
        // System.out.println(user_two.age);

    }
}
