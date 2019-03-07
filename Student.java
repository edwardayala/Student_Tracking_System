public class Student extends Person{
    //properties
    static double GPA;
    // Methods
    public Student(){
        super();
    }
    public Student(double GPA) {
        super(name, age);
        this.GPA = GPA;
    }
    public static String deansList(){
        if (GPA >= 3.5)
            return "Made Dean's honor list.\n";
        else
            return "";
    }
}
