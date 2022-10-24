package day01;

public class Work1 {
    public static void main(String[] args) {
        //1.计算不使用以旧换新的花费
        int money1 = 7988-1500;
        //2.计算以旧换新的花费
        double money2 = 7988 * 0.8;
        //3.判断两种方式
        if(money1 > money2){
            System.out.println("使用以旧换新更省钱");
        }else{
            System.out.println("不使用以旧换新更省钱");
        }
    }
}
