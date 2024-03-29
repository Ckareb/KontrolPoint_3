import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class TaskTwentyOne {
    public static void main(String[] args){
        int[][] array = new TaskTwentyOne().scnArray();
        System.out.println(Arrays.deepToString(array));
        new TaskTwentyOne().cratedFile(array);
    }
    private int[][] scnArray(){
        System.out.println("Введите высоту массива: ");
        Scanner height = new Scanner(System.in);
        int sizeHeight = height.nextInt();
        System.out.println("Введите ширену массива: ");
        Scanner width = new Scanner(System.in);
        int sizeWidth = width.nextInt();
        int[][] scnArray = new int[sizeHeight][sizeWidth];
        System.out.println("Введите строки массива: ");
        int count = 2;
        for (int i = 0; i < sizeHeight; ++i){
            for (int j = 0; j < sizeWidth; ++j) {
                if (!(i == 0 || i == sizeHeight - 1 || j == 0 || j == sizeWidth - 1)){
                    scnArray[i][j] = count;
                    count +=1;
                }
                else scnArray[i][j] = 1;
            }
        }
        //String array = Arrays.deepToString(scnArray);
        return scnArray;
    }
    private void cratedFile(int[][] array){
        try(FileWriter file = new FileWriter("notes.txt"))
        {
            for (int i = 0; i < array.length; ++i){
                for (int j = 0; j < array[0].length; ++j) {
                    file.write(array[i][j]+ "  ");
                }
                file.write("\r\n");
            }
            System.out.println("Записан в файл");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
