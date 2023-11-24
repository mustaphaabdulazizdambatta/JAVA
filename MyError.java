public class MyError {
    public static void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Access denied- you must be atleast 18 years old");
        }
        else {
            System.out.println("Access Granted- you are old enough");
        }
    }
    public static void main(String[] args) {
        checkAge(15); //set age to 15 (which is below 18....)
    }
}
