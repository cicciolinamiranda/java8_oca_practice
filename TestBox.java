package test;

public class TestBox {
  public static void main (String [] args) {
    TestClass testClass = new TestClass();
    testClass.testText();
    System.out.println("---pre-increment---");
    for(int i=0;i<10;System.out.println("Count: "+ (++i))) {
    }

    System.out.println("---post-increment----");
    for(int i=0;i<10;System.out.println("Count: "+(i++))) {
    }
  }

}
