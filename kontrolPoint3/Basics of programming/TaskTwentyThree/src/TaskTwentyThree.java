import java.util.Scanner;

public class TaskTwentyThree {
    public static void main(String[] args){
        int side1 = new TaskTwentyThree().userPut();
        int side2 = new TaskTwentyThree().userPut();
        int side3 = new TaskTwentyThree().userPut();
        System.out.println("Площадь треугольника " + areaTriangle(side1, side2, side3));
    }

    private int userPut(){
        System.out.println("Введите сторону трегольника: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    private static double areaTriangle(int side1, int side2, int side3){
        int perimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

}
