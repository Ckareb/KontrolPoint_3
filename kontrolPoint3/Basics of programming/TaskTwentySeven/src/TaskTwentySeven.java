import java.util.Scanner;

public class TaskTwentySeven {
    public static void main(String[] args){
        String line = new TaskTwentySeven().userPut();
        System.out.println("Результат работы: " + biggestPalindrome(line));
    }

    private String userPut(){
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static int biggestPalindrome(String line){
        StringBuilder enil = new StringBuilder(line);
        enil.reverse();
        int len = line.length(), count = 0, result = 0, max = 0;

        for (int i = 0; i < len; ++i){
            if (line.charAt(i) == enil.charAt(i)) {
                ++count;
                max = count;
            } else count = 0;
            if(result < max) result = max;
        }
        return result;
    }
}