import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    
// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";

    student1.print();

// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
    Student student2 = new Student();
    student2.name = "ZiYan Cui";
    student2.gpa = 4.3;
    student2.major = "Business Analytics and Information Systems";

    ArrayList<Double> gpas = new ArrayList<Double> ();
    gpas.add(student1.getGPA());
    gpas.add(student2.getGPA());
    System.out.println(gpas);

    double sum = 0.0;
    for (int i = 0; i < gpas.size(); i++){
      sum = sum + gpas.get(i);
    }
    double avg = sum / gpas.size();
    System.out.println("The average GPA is " + avg);

  }
}