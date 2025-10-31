public class Teacher extends Person{


    private final String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Today's subject is: " + subject);
    }
}




// Create a subclass named Teacher that:
//        • Inherits from Person
// • Adds a field subject (String)
// • Overrides introduce() to include subject information
