class Main
{
  public static void main(String[] args)
  {
    Digits d1 = new Digits(7);
    System.out.println(d1.isStrictlyIncreasing());
    Digits d2 = new Digits(1356);
    System.out.println(d2.isStrictlyIncreasing());
    Digits d3 = new Digits(1336);
    System.out.println(d3.isStrictlyIncreasing());
    Digits d4 = new Digits(1536);
    System.out.println(d4.isStrictlyIncreasing());
    Digits d5 = new Digits(65310);
    System.out.println(d5.isStrictlyIncreasing());
  }
}