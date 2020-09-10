package File;

public class FileTest {
    public static void main(String[] args) {
        FileReader file = new FileReader();
        file.reader("data.txt");
        file.split();
        file.write();
    }
}
