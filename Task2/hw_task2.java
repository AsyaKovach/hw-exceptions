package Task2;

public class hw_task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[] {1,2,3,4,5,6,7,8,9}; //Нет массива с которым работаем
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}