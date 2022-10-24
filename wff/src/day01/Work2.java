package day01;

import java.util.Scanner;

/**
 * 代码记得格式化   快捷键  ctrl+alt+l
 */
public class Work2 {

    public static void main(String[] args) {
        //1.提示并接受用户输入的存款金额
        System.out.println("请您输入你要存款的金额（元）：");
        double money=new Scanner(System.in).nextDouble();
        //2.提示并接受用户输入的存款年限
        System.out.println("请您输入存款期限（年）：");
        int year = new Scanner(System.in).nextInt();
        //3.定义变量保存本息总额
        double outMoney=0;
        //4.使用if语句判断并根据利率和年限分别计算本息总额
        if (year==1&&money>=1000) {
            //一年期本息总额

            outMoney=money+money*2.25/100*year;

//6.打印输出本息总额

            System.out.println("【存款"+money+"元，"+"存"+year+"年后的本息总额是"+outMoney+"元。】");

        }else if (year==2&&money>=1000) {

//二年期本息总额

            outMoney=money+money*2.7/100*year;

//6.打印输出本息总额

            System.out.println("【存款"+money+"元，"+"存"+year+"年后的本息总额是"+outMoney+"元。】");

        }else if (year==3&&money>=1000) {

//三年期本息总额

            outMoney=money+money*3.25/100*year;

//6.打印输出本息总额

            System.out.println("【存款"+money+"元，"+"存"+year+"年后的本息总额是"+outMoney+"元。】");

        }else if (year==5&&money>=1000) {

//五年期本息总额

            outMoney=money+money*3.6/100*year;

//6.打印输出本息总额

            System.out.println("【存款"+money+"元，"+"存"+year+"年后的本息总额是"+outMoney+"元。】");

        }else {

//5.提示输入的存款期限有误或是存款金额小于1000元

            System.out.println("您输入的存款期限有误或存款金额小于1000元。");

        }

    }
}