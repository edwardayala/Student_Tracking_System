public class CollegeStudent extends Student{
    // Properties
    static String major;
    static University attendingUni;
    Person p;
    Student s;
    // Methods
    public CollegeStudent(){
        super();
    }
    public CollegeStudent(String nm, int age, double gpa, String m, University uni) {
        super(GPA);
        Person.name = nm;
        Person.age = age;
        Student.GPA = gpa;
        CollegeStudent.major = m;
        major = m;
        attendingUni = uni;
    }
    public void changeMajor(String m){
        major = m;
    }
//    public void print(){}
}
