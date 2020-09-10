public class Test {
    public static void main(String[] args) {
        try {
            Array arr = new Array();
        } catch(InvalidDataException e) {
            System.out.println(e.getMessage());

        }
    }
}
