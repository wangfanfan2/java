package day01;

public class Work5 {
    public static void main(String[] args) {
        //1.定义桶中已有的水量开始是0L;
        int water = 0;
        //2.定义变量代表分钟数
        int minute = 0;
        //3.循环判断
        while(water < 10){
            //3.1每次循环给分钟数加1
            minute++;
            //3.2每分钟计算桶里的水量
            water += minute - 3;
            //3.3桶里的水不可能是负数
            if(water < 0){
                water = 0;
            }
        }
        //4.打印所用分钟数
        System.out.println("桶里的灌满水需要"+ minute + "分钟");
    }
}
