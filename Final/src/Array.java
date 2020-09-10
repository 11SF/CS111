public class Array {
    private int []arr = new int[3];
    public Array() throws InvalidDataException {
        try {
            for(int i=0; i<=4; i++) {
                arr[i] = 0;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new InvalidDataException("Array Full");
        }
    }
}
