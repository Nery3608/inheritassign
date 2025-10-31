public class Student extends Person {

    private final int gradeLevel;

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old." + "and my grade level is ... " + gradeLevel);
    }
}


// Create a subclass named Student that:
//        • Inherits from Person
// • Adds a field gradeLevel (int)
// • Overrides introduce() to include grade level