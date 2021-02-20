package No01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\No01\\index.html"));
        int ch;
        int countMath=0;
        int countEng = 0;
        int countSpace=0;
        int countChinese = 0;
        while((ch=br.read())!=-1){
            // System.out.println(ch);
            if(ch>=48&&ch<=57){
                countMath++;
            }else if (ch>=97&&ch<=124){
                countEng++;
            }else if(ch == 32){
                countSpace++;
            }
        }


       String s = "";
        while((s = br.readLine())!=null){

        }

       char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(isChineseChar(chars[i])){
                countChinese++;
            }
        }
        System.out.println(countMath);
        System.out.println(countEng);
        System.out.println(countSpace);
         System.out.println(countChinese);
    }


    public static boolean isChineseChar(char c) {
        try {
            return String.valueOf(c).getBytes(StandardCharsets.UTF_8).length > 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

