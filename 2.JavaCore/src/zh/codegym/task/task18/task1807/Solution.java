package zh.codegym.task.task18.task1807;

/* 
计算逗号的数量
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int commaCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == 44) commaCount++;
            }

        }
        System.out.println(commaCount);
    }
}
