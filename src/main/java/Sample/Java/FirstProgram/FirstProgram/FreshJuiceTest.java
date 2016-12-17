package Sample.Java.FirstProgram.FirstProgram;

class FreshJuice {

  enum FreshJuiceSize{ SMALL, MEDIUM1, LARGE }      // enum
  FreshJuiceSize size123;
}

public class FreshJuiceTest {

  public static void main(String args[]) {

    FreshJuice juice = new FreshJuice();
    juice.size123 = FreshJuice.FreshJuiceSize.MEDIUM1 ;
    System.out.println("Size: " + juice.size123);
  }
}