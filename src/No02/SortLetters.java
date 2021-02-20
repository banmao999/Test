package No02;

import java.io.*;
import java.util.Arrays;

public class SortLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\No02\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\No02\\a.txt",true));
        String text = br.readLine();
        char[] chars = text.toCharArray();
        Arrays.sort(chars);
        bw.newLine();
        bw.write(chars);
        System.out.println("打印完成");
        br.close();
        bw.close();
    }
}
