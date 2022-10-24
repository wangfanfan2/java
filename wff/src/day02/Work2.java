package day02;
import java.util.Scanner;//引用Scanner类
public class Work2 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr2 = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int num = sc.nextInt();
        int index = 0;
        //遍历原数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                arr2[i] = arr[i];
                index = i + 1;
            } else {
                arr2[i + 1] = arr[i];
            }
            arr2[index] = num;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
