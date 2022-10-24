package day02;

public class Work3 {
        public static void main(String[] args) {
        double[] stock = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int earnMoney = 0;
        int loseMoney = 0;
        for (int i = 0; i < stock.length; i++) {
            stock[i] *= 0.01;
            if (stock[i] >= 0) {
                earnMoney++;
            } else if (stock[i] < 0) {
                loseMoney++;
            }
        }
        System.out.println("  赚钱的股票一共有:" + earnMoney + "只");
        System.out.println("  赔钱的股票一共有:" + loseMoney + "只");

    }
}


