package day01;

import java.util.Scanner;

public class Work4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("税前工资:");
        int gz=in.nextInt();
        double sxyj=gz*0.1;
        double sq=gz-sxyj-5000;
        double shui=0;
        if(sq>0&&sq<=3000)
            shui=sq*0.03;
        else if(sq>3000&&sq<=12000)
            shui=3000*0.03+(sq-3000)*0.1;
        else if(sq>12000&&sq<=25000)
            shui=3000*0.03+9000*0.1+(sq-12000)*0.2;
        else if(sq>25000&&sq<=35000)
            shui=3000*0.03+9000*0.1+13000*0.2+(sq-25000)*0.25;
        else if(sq>35000&&sq<=55000)
            shui=3000*0.03+9000*0.1+13000*0.2+10000*0.25+(sq-35000)*0.3;
        else if(sq>55000&&sq<=80000)
            shui=3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+(sq-55000)*0.35;
        else if(sq>80000)
            shui=3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+25000*0.35+(sq-80000)*0.45;
        double sh=gz-sxyj-shui;
        System.out.println(sq);
        System.out.println("个人所得税:"+shui);
        System.out.println("税后工资:"+sh);
    }
}
