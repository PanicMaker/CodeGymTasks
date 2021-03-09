package zh.codegym.task.task12.task1229;

/* 
CTO 类的父级
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Employee implements Businessman{

        @Override
        public void workHard() {

        }
    }

    public static class CTO extends Employee implements Businessman {
    }
}
