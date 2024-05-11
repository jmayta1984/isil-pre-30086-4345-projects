public class AccessNonStatic {
    int number = 28;

    public static void main(String[] args) {
        AccessNonStatic object = new AccessNonStatic();
        System.out.println(object.number);
    }
}
