import java.util.Scanner;

public class TaskSeventeenth {
    public static void main(String[] args){
        String line = new TaskSeventeenth().userPut();
        System.out.println(countBracket(line));
    }
    private String userPut(){
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    private static boolean countBracket(String line) {
        char bracketRight = ')';
        int bracketRightCount = 0, bracketLeftCount = 0;
        for (int i = 0; i<line.length(); ++i){
            if (bracketRight == line.charAt(i)) bracketRightCount += 1;
            else bracketLeftCount +=1;
        }
        return bracketRightCount == bracketLeftCount;
    }
}
