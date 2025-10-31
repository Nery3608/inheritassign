public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ken", 34, "MATH");
        teacher.introduce();
        Student student = new Student("Matthew", 27, 11);
        student.introduce();
    }
}





// Create a subclass named Teacher that:
//        • Inherits from Person
// • Adds a field subject (String)
// • Overrides introduce() to include subject information



// ---------------Checked-------------------------------------

// Create a Main class that:
//        • Creates one Teacher and one Student object
// • Calls introduce() on both objects

// Create a superclass named Person with the following:
//       • Fields: name (String) and age (int)
//     • Method: introduce() that prints name and age
