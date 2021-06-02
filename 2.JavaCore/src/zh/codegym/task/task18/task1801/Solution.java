package zh.codegym.task.task18.task1801;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
数量最大的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in    ));
        String fileName = bufferedReader.readLine();


        int maxByte = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                int currByte = fileInputStream.read();
                if (currByte > maxByte) maxByte = currByte;
            }
        }
        System.out.println(maxByte);
    }
}