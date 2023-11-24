public class MyClass {
  public static void main(String[] args) {
    System.out.println("welcome to java class");
    String name = "John";
    System.out.println(name);

    int myNum = 15;
    System.out.println(myNum);

    System.out.print("Hello" + name);

    int x = 10;
    int y = 9;
    int z = 4;
    System.out.println("x +=2 is"+(x+=2));
    System.out.println("x -=2 is"+(x-=2));
    System.out.println("x *=2 is"+(x*=2));
    System.out.println("x /=2 is"+(x/=2));
    System.out.println("y %=2 is"+(y%=2));
    System.out.println("z &=2 is"+(z&=2));
    System.out.println("y |=2 is"+(y|=2));
    System.out.println("y ^=2 is"+(y^=2));
    System.out.println("y >>=2 is"+(y>>=2));
    System.out.println("y <<=2 is"+(y<<=2));

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());

    String n = "mustapha";
    System.out.println(n.length());

    String le = "come to house";
    System.out.print(le.indexOf("house"));;
    
  }
}