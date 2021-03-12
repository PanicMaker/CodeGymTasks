package zh.codegym.task.task14.task1409;

/* 
桥梁
*/

public class Solution {

    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    // 在此添加 println 方法
    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}

