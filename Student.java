class Student {
  String name;
  double gpa;
  String major;

  String getName() {
    return name;
  }

  double getGPA() {
    return gpa;
  }

  String getMajor() {
    return major;
  }

  void setName(String theName) {
    name = theName;
  }

  void setGPA(double theGPA) {
    gpa = theGPA;
  }

  void setMajor(String theMajor) {
    major = theMajor;
  }

  void print(){
    System.out.println("The student's name is " + getName());
    System.out.println("The student's GPA is " + getGPA());
    System.out.println("The student's major is " + getMajor());
  }



}