import java.util.Scanner;

public class TaskNineteenth {
    public static void main(String[] args){
        int count = 0;
        int number = new TaskNineteenth().inputUser();
        int res = new TaskNineteenth().ruleOneTwo(number, count);
        System.out.println(res);
    }

    private int inputUser(){
        System.out.println("Введите четное число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private int ruleOneTwo (int number, int count){

        if(number == 0 || number == 1) {
            ++count;
            return count;
        }
        else return ruleThreeFour(number, count);
    }

    private int ruleThreeFour(int number, int count){
        if (number % 2 != 0 ) return ruleOneTwo(((number / 2) + 1), count);
        else {++ count;
            return ruleOneTwo(number/2, count);
        }
    }
}