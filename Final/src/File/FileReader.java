package File;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> ava = new ArrayList<String>();
    ArrayList<String> ragout = new ArrayList<String>();

    public void reader(String fileName) {
        File file = new File(fileName);
        try (Scanner scanf = new Scanner(file);) {
            while(scanf.hasNextLine()) {
                list.add(scanf.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("ไม่มีไฟล์");
        }
    }
    public void split() {
        for(int i =0;i<list.size();i++) {
            String aaa[] = list.get(i).split(";");
            int count;
            if(aaa.length!=2) {
                System.out.println("Invalid data: "+list.get(i));
                continue;
            }
            try {
                count = Integer.valueOf(aaa[1].trim());
            } catch (Exception e) {
                System.out.println("Invalid data: "+list.get(i));
                continue;
            }
            if(count>0) {
                ava.add(list.get(i));
            } else {
                ragout.add(list.get(i));
            }
        }
    }
    public void write() {
        try (FileWriter fwrite = new FileWriter("available.txt");
             PrintWriter pWrite = new PrintWriter(fwrite);
                ) {
            for(String a : ava) {
                pWrite.println(a);
            }
        }catch (IOException e) {
            System.out.println("Can't create file");
        }

        try (FileWriter fwrite = new FileWriter("runout.txt");
             PrintWriter pWrite = new PrintWriter(fwrite);
        ) {
            for(String a : ragout) {
                pWrite.println(a);
            }
        }catch (IOException e) {
            System.out.println("Can't create file");
        }
    }


}
