package day02;

import java.util.Random;

public class Work4 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10) + 5;//定义5-14的随机数
        System.out.println("随机赋值了:" + num1 + "个数数组的长度是:" + num1);
        int[] arr = new int[num1];
        int left = 0;
        int right = arr.length - 1;
        int[] brr = new int[num1];

        //循环遍历，每次都从0-9这几个数当中随机选一个数赋值给数组元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)//以此判定是奇数
            {
                brr[left] = arr[i];
                left++;
            } else
            {
                brr[right] = arr[i];
                right--;
            }
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + "\t");
        }

        System.out.println("\n");
        System.out.println("奇数的值是:" + left);
        System.out.println("偶数的值是:" + (brr.length - left));

    }
}

