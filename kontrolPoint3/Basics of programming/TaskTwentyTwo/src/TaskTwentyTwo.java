import java.util.Scanner;

public class TaskTwentyTwo {
    public static void main(String[] args){
        String number = new TaskTwentyTwo().userPut();
        reversNum(number);
    }

    private String userPut(){
        System.out.println("Введите числа с num-pud: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    private static void reversNum(String number){
        StringBuilder result = new StringBuilder();
        number = number.replaceAll("[^0-9]", "");
        for (int i = 0; i< number.length(); ++i)
        {
            if (number.charAt(i) == '1') result.append("7");
            if (number.charAt(i) == '2') result.append("8");
            if (number.charAt(i) == '3') result.append("9");
            if (number.charAt(i) == '7') result.append("1");
            if (number.charAt(i) == '8') result.append("2");
            if (number.charAt(i) == '9') result.append("3");
            if (number.charAt(i) == '4' || number.charAt(i) == '5' || number.charAt(i) == '6') result.append(number.charAt(i));
        }
        System.out.println(result);
    }
}