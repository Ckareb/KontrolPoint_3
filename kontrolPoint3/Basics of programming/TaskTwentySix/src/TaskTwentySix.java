import java.util.Scanner;

public class TaskTwentySix {
    public static void main(String[] args){
        int m = new TaskTwentySix().userPut();
        int n = new TaskTwentySix().userPut();
        int divider1 = new TaskTwentySix().userPut();
        int divider2 = new TaskTwentySix().userPut();

        System.out.println("Результаты работы: " + numberSum(m, n, divider1, divider2));
    }

    private int userPut(){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static int numberSum(int m, int n, int divider1, int divider2){
        int sum = 0;
        for (int i = m; i <= n; ++i){
            if (i % divider1 == 0 && i % divider2 == 0) sum += i;
        }
        return sum;
    }
}
