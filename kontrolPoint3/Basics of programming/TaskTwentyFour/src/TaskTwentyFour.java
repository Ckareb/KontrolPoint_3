import java.util.Scanner;

public class TaskTwentyFour {
    public static void main(String[] args){
        int n = new TaskTwentyFour().userPut();
        int divider1 = new TaskTwentyFour().userPut();
        int divider2 = new TaskTwentyFour().userPut();

        System.out.println("Результаты работы: " + numberSum(n, divider1, divider2));
    }

    private int userPut(){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static int numberSum(int n, int divider1, int divider2){
        int sum = 0;
        for (int i = 0; i <= n; ++i){
            if (i % divider1 == 0 || i % divider2 == 0) sum += i;
        }
        return sum;
    }
}
