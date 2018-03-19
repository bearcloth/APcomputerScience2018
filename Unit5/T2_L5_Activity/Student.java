public class Student
{
  private String firstName;
  private String lastName;
  private int gradeLevel;
  private double gpaNum;
  private static int studentID = 0;
  
  public Student()
  {
    this("None", "None", 0, 0.0);
  }
  
  public Student(String fn, String ln, int grade, double gpa)
  {
    
    firstName = fn;
    lastName  = ln;
    
    if(grade < 0 || grade > 12)
      gradeLevel = 0;
    else
      gradeLevel = grade;
    
    if(gpa < 0.0 || gpa > 4.5)
      gpaNum = 0;
    else
      gpaNum = gpa;
    
    studentID++;
  }
  
  public String toString()
  {
    String names_str = lastName + ", " + firstName + "\n";
    String gpa_str = "GPA: " + gpaNum + "\n";
    String grade_str = "Grade Level: " + gradeLevel + " id # " + studentID;
    return names_str + gpa_str + grade_str;
  }
}