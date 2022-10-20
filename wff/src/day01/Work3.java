package day01;

import java.util.Scanner;

public class Work3 {
    //杨辉三角
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要打印的行数");
        int n = sc.nextInt();
        int[][] x=new int[n][n];
        for(int i=1;i<n;i++) {//打印前两行及其他首尾位置的1
            x[i][0] = 1;
            x[i][i] = 1;
        }
        for(int i=2;i<x.length;i++){
            for(int j=1;j<x[i].length-1;j++){
                x[i][j]=x[i-1][j-1]+x[i-1][j];
            }
        }
        printArray(x);//调用方法输出二维数组x
    }
    //定义一个方法用来输出二维数组x：
    public static void printArray(int[][] arr){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
