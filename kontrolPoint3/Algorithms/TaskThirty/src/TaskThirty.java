import java.util.Scanner;

public class TaskThirty {
    public static void main(String[] args){
        int numbers = new TaskThirty().userPutInt();
        Result result = new TaskThirty().userPutStart();
        System.out.println("Результат работы: " + scriptMath(numbers, result.start, result.matrixStart));
    }

    private int userPutInt(){
        System.out.println("Введите длину ряда: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    private Result userPutStart(){
        System.out.println("Введите стартовое число: ");
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        String numberString = Integer.toString(start);
        int[] matrixStart = new int[numberString.length()];
        char[] charArray = numberString.toCharArray();

        for (int i = 0; i < matrixStart.length; ++i) {
            matrixStart[i] = Character.getNumericValue(charArray[i]);
        }
        return new Result(matrixStart, start);
    }

    private static String scriptMath(int numbers, int start, int[] matrixStart){
        int sum = 0;
        int number = numbers;
        for (int i = 0; i < matrixStart.length; ++i) {
            sum += Math.pow(matrixStart[i], number);
            ++number;
            System.out.println(sum);
        }
        if(sum == start * numbers) return sum + "=" + start + "*" + numbers;
        else return start + "*" + numbers;
    }
}
