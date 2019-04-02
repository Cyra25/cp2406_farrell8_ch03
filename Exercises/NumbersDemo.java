public class NumbersDemo {

    public static void displayTwiceTheNumber(int a){
        System.out.println(2*a);
    }
    public static void displayTwicePlusFive(int a){
        System.out.println(a+5);
    }
    public static void displayTwiceNumberSquared(int a){
        System.out.println(a*a);
    }

    public static void main(String[] args){
        int a = 3;
        displayTwiceTheNumber(a);
        displayTwicePlusFive(a);
        displayTwiceNumberSquared(a);
    }
}
