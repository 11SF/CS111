public class url {
    public static void main(String[] args) {
        String string ="http://example.com/files/public_files/test.zip";
        String[] data= string.split("/");
        //data[data.length-1];
        String temp = data[data.length-1];
        if(temp.startsWith("*")) {

        }
    }
}
