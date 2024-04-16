public class User {
    private String _name;
    private String _membership;
    int age;

    //setter
    void set_name(String name){
        System.out.println("Print something");
        _name = name;
    }

    // getter
    String get_name(){
        return _name;
    }

    void set_membership(String membership){
        _membership = membership;
    }

    void set_membership(Membership membership){
        // converting enum value
        _membership = membership.name();
    }
    String get_membership(){
        return _membership;
    }

    // Create enum
    public enum Membership {
        Bronze, Silver, Gold;
    }
    /*
     * Enums in Java are special data types that allow you to define a set of named constants. They provide a way to represent a fixed set of predefined values, making your code more readable, maintainable, and less error-prone.
     * Enums are special data types used to define collections of constants.
        They are typically used to represent fixed sets of related values, such as days of the week, months of the year, error codes, etc.
        Enums cannot be instantiated using the new keyword because they are implicitly final and static.
        Enums can have fields, constructors, and methods like a regular class.
        Enums are implicitly final and immutable, meaning their values cannot be modified after they are created.

     * Classes:

        Classes are the fundamental building blocks of object-oriented programming in Java.
        They represent blueprints for creating objects, encapsulating data (fields) and behaviors (methods).
        Classes can be instantiated using the new keyword to create objects.
        Classes can have fields, constructors, methods, and other members.
        Classes can be extended to create subclasses (inheritance) and can implement interfaces.

     * In summary, enums are used for defining fixed sets of constants, while classes are used for creating objects with state and behavior. Enums are more restrictive and specialized, while classes are more flexible and versatile.






     */
   

}
