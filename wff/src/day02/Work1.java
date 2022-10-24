package day02;

import java.util.Random;//引用Random包

public class Work1 {
    public static void main(String[] ages) {
        Random r = new Random();//创建对象
        //创建sum获取和
        int sum = 0;
        //创建数组，长度为6
        int[] arr = new int[6];
        //用for循环遍历整个数组
        for (int i = 0; i < arr.length; i++) {
            int ran = r.nextInt(100);//将0-99随机赋值给ran
            arr[i] = ran;//将随机数赋值进入数组
            sum += arr[i];//将所有数组元素相加
            System.out.print(arr[i] + " ");
        }
        //换行输出和
        System.out.println("\n" + sum);
    }

}
