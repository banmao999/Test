package No01;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class CountLetters {
    public static void main(String[] args) throws IOException {
        int[] countLetters = new int[4];
        FileInputStream fis = new FileInputStream("src\\No01\\a.txt");
        byte[] bytes = new byte[1024];
        int readCount;
        while((readCount = fis.read(bytes)) != -1) {
            count(countLetters, bytes, readCount);
        }
        String charset = Charset.defaultCharset().toString();
        System.out.println("系统默认字符集为："+charset);
        System.out.println(countLetters[3]);
        if(charset.equals("UTF-8")) {
            countLetters[3] /= 3;
        } else {
            countLetters[3] /= 2;
        }
        System.out.println("空格字符个数为："+countLetters[0]);
        System.out.println("数字字符个数为："+countLetters[1]);
        System.out.println("英文字符个数为："+countLetters[2]);
        System.out.println("中文字符个数为："+countLetters[3]);
    }

    private static void count(int[] countLetters, byte[] bytes, int readCount) {
        for (int i = 0; i < readCount; i++) {
            if(bytes[i] == 32) {
                // 空格字符
                countLetters[0]++;
            } else if(bytes[i]>=48 && bytes[i] <= 57) {
                // 数字字符
                countLetters[1]++;
            } else if((bytes[i]>=65 && bytes[i]<=90) || (bytes[i]>=97 && bytes[i]<=122)) {
                // 英文字符
                countLetters[2]++;
            } else if(bytes[i]<0){
                // 中文字符
                countLetters[3]++;
            }
        }
    }

}
