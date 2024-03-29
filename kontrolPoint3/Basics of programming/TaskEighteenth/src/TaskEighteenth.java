import java.util.Arrays;
import java.util.Scanner;

public class TaskEighteenth {
    public static void main(String[] args){
        int[] array = new TaskEighteenth().scnArray();
        Result result = resultWork(array);
        System.out.println("слева от максимального значения " + Arrays.toString(result.leftArray) + "\n справа от максимального значения " + Arrays.toString(result.rightArray));
    }
    private int[] scnArray(){
        System.out.println("Введите количество строк массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] scnArray = new int[size];
        System.out.println("Введите строки массива: ");
        for (int i = 0; i < size; ++i){
            Scanner scanner = new Scanner(System.in);
            scnArray[i] = scanner.nextInt();
        }
        return scnArray;
    }
    private static Result resultWork(int[] array){
        int max = 0, index = 0, sizeArray = array.length-1;

        for (int i = 0; i < sizeArray; ++i){
                if(max < array[i]) {
                index = i;
                max = array[i];
            }
        }

        int[] leftArray = new int[index], rightArray = new int[array.length-index-1];

        for (int i = 0; i < index; ++i) leftArray[i] = array[i];

        for (int i = 0; i < array.length-index-1; ++i) {
            rightArray[i] = array[sizeArray];
            sizeArray -= 1;
        }

        return new Result(leftArray, rightArray);
    }
}