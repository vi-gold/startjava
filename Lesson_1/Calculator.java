 public class Calculator {

    public static void main(String[] args){
        System.out.println("Калькулятор");
        double a = 5;
        double b = 2;
        char sign = '^';
        double result = 1;
        if (sign == '/' && b == 0) {
            System.out.println("На 0 делить нельзя");
        } else {
           if (sign == '+') {
               result = a + b;
           } else if (sign == '-') {
               result = a - b;
           } else if (sign == '/') {
               result = a / b;
           } else if (sign == '^') {
               for (int i = 0; i < b; i++) {
                   result *= a;
               }
           } else if (sign == '%') {
               result = a % b;
           } else {
               System.out.println("Такой операции не предусмотренно");
           }
           System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}
