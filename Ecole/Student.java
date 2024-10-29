class Student extends Person {
    String course;
    double grade;
    /*
     * other member of person class
     * can be accessed her 
     */
}
public static  void main (String[] agrs) {
    Student junior = new student ()
    
    // access current class member 
    junior course = "computer Science";
    junior.grade = 1.5;

    // access superclass members
    junior.setName("Andrew");
    junior.setAge(21);
    junior.setSex('M');

}