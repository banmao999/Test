package No02;
import java.util.Arrays;

public class MessUp {
    static int num;

    public static void main(String[] args) {
        generate();
    }

    public static void sortAndPut(char[] symbol) {
        // 将随机生成的10个字符从小到大排序（当然你也可以用其他排序方法）
        //Arrays.sort(symbol);
        // 打印输出排序后的随机生成的字符
        for (int i = 0; i < symbol.length; i++) {
            System.out.print(symbol[i]);
        }
    }

    public static void generate() {
        // 定义一个数组连续存放随机生成的字符
        char[] symbol = new char[26];
        // 随机生成10个a~z的字符
        for (int i = 0; i < symbol.length; i++) {
            num = i;
            // 写法1：symbol[i]=(char)(int)(Math.random()*26+97);
            symbol[i] = (char) (((int) (Math.random() * 1000)) % 26 + 97);
            // 使用方法判断是否生成的字符是各不相同的
            boolean p = true;
            while (p) {
                p = judge(symbol);
            }
        }sortAndPut(symbol);
    }

    public static boolean judge(char[] symbol) {
        for (int j = 0; j < num; j++) {
            // 判断新生成的字符是否与之前生成的字符有重复，如果有，则重新生成
            if (symbol[num] == symbol[j]) {
                symbol[num] = (char) (((int) (Math.random() * 1000)) % 26 + 97);
                return true;
            }
        }
        return false;

    }
}