// public class Method {
//     static void method() {
//         System.out.println("Hello world");
//     }

//     public static void main(String[] args) {
//         method();
//     }
// }

public class Method {
    static void method(String name) {
        System.out.println("Hello world" + name);
    }

    public static void main(String[] args) {
        method("musty");
    }
}