import java.util.Arrays;
import java.util.Scanner;

public class TaskTwentyEight {
    public static void main(String[] args){
        String line = new TaskTwentyEight().userPutString();
        String direction = new TaskTwentyEight().userPutString();
        int shift = new TaskTwentyEight().userPutInt();
        char[] matrixWords = new  TaskTwentyEight().matrixWords();

        System.out.println("Результат работы: " + сaesarsСipher(line, direction, shift, matrixWords));
    }

    private String userPutString(){
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private int userPutInt(){
        System.out.println("Введите сдвиг: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    private char[] matrixWords(){
        int j = 0;
        char[] matrixWords = new char[32];
        for (char i = 'а'; i <= 'я'; ++i){
            matrixWords[j] = i;
            ++j;
        }System.out.println(Arrays.toString(matrixWords));
        return matrixWords;
    }

    private static StringBuilder сaesarsСipher(String line, String direction, int shift, char[] matrixWords){
        StringBuilder result = new StringBuilder(" ");
        if (direction.equalsIgnoreCase("справа")){
            for (int j = 0; j < line.length(); ++j) {
                for (int i = 0; i < matrixWords.length; ++i) {
                    if (matrixWords[i] == line.charAt(j) && i + shift <= matrixWords.length) result.append(matrixWords[i + shift]);
                    if (i + shift > matrixWords.length && matrixWords[i] == line.charAt(j)) result.append(matrixWords[shift + i - matrixWords.length]);
                }
                if (line.charAt(j) == ' ') result.append(line.charAt(j));
            }
        } else if (direction.equalsIgnoreCase("слева")){
            for (int j = 0; j < line.length(); ++j) {
                for (int i = matrixWords.length - 1; i >= 0; --i) {
                    if (i - shift < 0 && matrixWords[i] == line.charAt(j)) result.append(matrixWords[matrixWords.length - shift + i]);
                    if (matrixWords[i] == line.charAt(j) && i - shift >= 0) result.append(matrixWords[i - shift]);
                }
                if (line.charAt(j) == ' ') result.append(line.charAt(j));
            }
        }
        return result;
    }
}