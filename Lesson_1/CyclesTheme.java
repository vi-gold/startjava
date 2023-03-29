 public class CyclesTheme {

    public static void main(String[] args){
        
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10, even = 0, odd = 0;
        do {
            if (i % 2 == 0){
                even += i;
            } else {
                odd += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + even
                + ", а нечетных = " + odd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 2, b = -1, c = 100;
        int min = a, max = a, num;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        for (i = 0; i < 3; i++){
            if (i == 0){
                num = min;
            } else if (i == 1){
                if (a != max && a != min){
                    num = a;
                } else if (b != max && b != min){
                    num = b;
                } else {
                    num = c;
                }
            } else {
                num = max;
            }
            System.out.print(num + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        num = 1234;
        int digit = num % 10;
        int sum = 0;
        System.out.print("Цифры наоборот: ");
        while (digit > 0) {
            System.out.print(digit);
            sum += digit;
            num = num / 10;
            digit = num % 10;
        }
        System.out.println("\nСумма: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countCycles = 0;
        for (i = 1; i < 24; i += 2){
            countCycles++;
            System.out.printf("%4d", i);
            if (countCycles % 5 == 0){
                System.out.println();
            }
        }
        if (countCycles % 5 != 0){
            for (i = countCycles; i % 5 != 0; i++){
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        digit = num % 10;
        int count = 0;
        while (digit > 0) {
            if (digit == 2){
                count++;
            }
            num = num / 10;
            digit = num % 10;
        }
        if (count % 2 == 0) {
            System.out.println("Число 3242592 содержит " + count + " (четное) колличество двоек");
        } else {
            System.out.println("Число 3242592 содержит " + count + " (нечетное) колличество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (i = 1; i < 51; i++){
            System.out.print("* ");
            if (i % 10 == 0){
                System.out.println();
            }
        }
        countCycles = 5;
        int countCyclesInner;
        while (countCycles > 0) {
            countCyclesInner = countCycles;
            while (countCyclesInner > 0) {
                System.out.print("#");
                countCyclesInner--;
            }
            System.out.println();
            countCycles--;
        }
        int countLine = 5;
        countCycles = 0;
        do {
            int lim;
            if (countCycles < 3) {
                lim = countCycles + 1;
            } else {
                lim = countLine - countCycles;
            }
            countCyclesInner = 0;
            do {
                System.out.print("$");
                countCyclesInner++;
            } while (countCyclesInner < lim);
            System.out.println();
            countCycles++;
        } while (countCycles < countLine);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%5s %5s%n", "Dec", "Char");
        for (i = 0; i <= 255; i++) {
            char character = (char) i;
            if ((i < 48 && i % 2 != 0) || (i > 96 && i < 123 && i % 2 == 0)) {
                System.out.printf("%5d %4c%n", i, character);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 167824;
        int revers = 0;
        int temp = num;
        while (temp != 0) {
            digit = temp % 10;
            revers = revers * 10 + digit;
            temp /= 10;
        }
        if (num == revers) {
            System.out.println("Число " + num + " это палиндром");
        } else {
            System.out.println("Число " + num + " это не палиндром");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 167824;
        int sum1 = 0, sum2 = 0;
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            if (temp >= 1000){
                sum2 += digit;
            } else {
                sum1 += digit;
            }
            temp /= 10;
        }
        System.out.println("Сумма цифр " + num / 1000 + " = " + sum1);
        System.out.println("Сумма цифр " + num % 1000 + " = " + sum2);
        if (sum1 == sum2){
            System.out.println("Число " + num + " счастливое");
        } else {
            System.out.println("Число " + num + " не счастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.print("   ");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n  +");
        for (i = 2; i <= 9; i++) {
            System.out.print("---");
        }
        System.out.println();
        for (i = 2; i <= 9; i++) {
            System.out.printf("%2d|", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

    }
}