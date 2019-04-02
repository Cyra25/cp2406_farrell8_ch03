public class Percentages {
    public static void main(String[] args){
        double firstNum = 7.7;
        double secondNum = 8.8;
        computerPercent(firstNum,secondNum);
    }

    public static void computerPercent(double firstNum, double secondNum){
        double percentage = 100*firstNum/secondNum;
        System.out.println(firstNum+ " is "+ percentage+ " percent of "+ secondNum);
    }
}
