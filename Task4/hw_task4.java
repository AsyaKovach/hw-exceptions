package Task4;
import java.util.Objects;
import java.util.Scanner;

public class hw_task4 {
    public static void main(String[] args) {
        String userString = null;
        boolean check = true;
        do{
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Введите строку: ");
                userString =  in.nextLine();
                if(Objects.equals(userString, "")){
                    throw new RuntimeException();
                }
                check = false;
            } catch (RuntimeException e){
                System.out.println("Ошибка: вы ввели пустую строку, попробуйте что то написать");
            }
        }
        while(check);
        System.out.println("Вы ввели: " + userString);
    }
}


