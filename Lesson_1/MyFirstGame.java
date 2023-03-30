 public class MyFirstGame {

    public static void main(String[] args){
        int number = 70;
        int min = 1;
        int max = 100;
        boolean work = true;
        while (work) {
            int middle = (min + max) / 2;
            System.out.println("Может это число " + middle + " ?");
            if (middle == number) {
                work = false;
            } else if (middle < number) {
                System.out.println("Нет загаданное число больше чем " + middle);
                min = middle + 1;
            } else if (middle > number) {
                System.out.println("Нет загаданное число меньше чем " + middle);
                max = middle - 1;
            }
        }
        System.out.println("Вы угадали число");
    }
}