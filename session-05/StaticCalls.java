public class StaticCalls {
    public static void main(String[] args) {

        StaticCalls object = new StaticCalls();
        int square = object.squareNumber(5);
        System.out.println(square);
    }

    public int squareNumber(int number) {
        return number * number;
    }
}
