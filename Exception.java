public class Exception {
public static void main(String[] args) {
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("the array has only three elements you can't print 11th element");
        }
    }
}
