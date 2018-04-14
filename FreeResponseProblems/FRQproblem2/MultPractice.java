public class MultPractice implements StudyPractice
{
  private int firstNum;
  private int secondNum;
  
  public MultPractice(int numF, int numS)
  {
    firstNum = numF;
    secondNum = numS;
  }
  
  public String getProblem()
  {
    return firstNum + " TIMES " + secondNum;
  }
  
  public void nextProblem()
  {
    secondNum++;
  }
}