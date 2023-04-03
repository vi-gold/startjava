public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 20;
        boolean male = true;
        double height = 1.9;
        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        } else {
            System.out.println("Вам " + age + " лет");
        }
        if (!male) {
            System.out.println("Вы женщина");
        } else {
            System.out.println("Вы мужчина");
        }
        if (height < 1.80) {
            System.out.println("Ваш рост ниже 1.80");
        } else {
            System.out.println("Ваш рост 1.80 или выше");
        }
        char firsLetterName = "Oleg".charAt(0);
        if (firsLetterName == 'M') {
            System.out.println("Первая буква вышего имени M");
        } else if (firsLetterName == 'I') {
            System.out.println("Первая буква вышего имени I");
        } else {
            System.out.println("Первая буква вышего имени не I или M а " + firsLetterName);
        }

        System.out.println("\n2. Поиск max и min числа");
        int a = 35;
        int b = 46;
        if (a == b) {
            System.out.println("Число " + a + " равно числу " + b);
        } else if (a > b) {
            System.out.println("Число max" + a + " | Число min " + b);
        } else {
            System.out.println("Число max" + b + " | Число min " + a);
        }

        System.out.println("\n3. Проверка числа");
        int num = 50;
        System.out.println("Исходное число " + num);
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " четное");
            } else {
                System.out.println("Число " + num + " нечетное");
            }
            if (num > 0) {
                System.out.println("Число " + num + " положительное");
            } else {
                System.out.println("Число " + num + " отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        a = 123;
        b = 321;
        int hundredsA = a / 100;
        int tensA = a / 10 % 10;
        int onesA = a % 10;
        int hundredsB = b / 100;
        int tensB = b / 10 % 10;
        int onesB = b % 10;
        System.out.println("Исходные числа: a = " + a + " b = " + b);
        boolean isNotEquals = true;
        if (hundredsA == hundredsB) {
            System.out.println("Одинаковые числа " + hundredsA + " в разряде сотен");
            isNotEquals = false;
        }
        if (tensA == tensB) {
            System.out.println("Одинаковые числа " + tensA + " в разряде десяток");
            isNotEquals = false;
        }
        if (onesA == onesB) {
            System.out.println("Одинаковые числа " + onesA + " в разряде единиц");
            isNotEquals = false;
        }
        if (isNotEquals) {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ '" + symbol + "' это маленькая буква");
        } else if (symbol > 'A' && symbol < 'Z') {
            System.out.println("Символ '" + symbol + "' это большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ '" + symbol + "' это число буква");
        } else {
            System.out.println("Символ '" + symbol + "' это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int contribution = 300_000;
        int percent = contribution / 100 * 10;
        System.out.println("Сумма вклада: " + contribution);
        if (contribution < 100_000) {
            percent = contribution / 100 * 5;
        } else if (contribution >= 100_000 && contribution <= 300_000) {
            percent = contribution / 100 * 7;
        }
        System.out.println("Начисленный процент: " + percent + "\nИтоговая сумма: "
                + (contribution + percent));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int gradeHistory = 5;
        if (historyPercent <= 60) {
            gradeHistory = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            gradeHistory = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            gradeHistory = 4;
        }
        int programmingPercent = 91;
        int gradeProgramming = 5;
        if (programmingPercent <= 60) {
            gradeProgramming = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            gradeProgramming = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            gradeProgramming = 4;
        }
        int avgPercent = (historyPercent + programmingPercent) / 2;
        int avgGrade = (gradeProgramming + gradeHistory) / 2;
        System.out.println("История " + gradeHistory + "\nПрограммирование " + gradeProgramming
                + "\nСредний балл оценок: " + avgGrade
                + "\nСредний % по предметам: " + avgPercent);

        System.out.println("\n8. Расчет прибыли за год");
        int rentForYear = 5000;
        int salesForYear = 13_000;
        int costPriceForYear = 9000;
        int profit = (salesForYear - rentForYear - costPriceForYear) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 567;
        int countHundredsInBank = 10;
        int countTensInBank = 5;
        int countOnesInBank = 50;
        if (sum > countHundredsInBank * 100 + countTensInBank * 10 + countOnesInBank) {
            System.out.println("Банкнот не хватает для выдачи нужно суммы");
        } else {
            int hundredsWithdrawn = sum / 100;
            if (hundredsWithdrawn > countHundredsInBank) {
                hundredsWithdrawn = countHundredsInBank;
            }
            sum -= hundredsWithdrawn * 100;
            int tensWithdrawn = sum / 10;
            if (tensWithdrawn > countTensInBank) {
                tensWithdrawn = countTensInBank;
            }
            sum -= tensWithdrawn * 10;
            int onesWithdrawn = sum;
            System.out.println("Выдача " + hundredsWithdrawn + " банкнот номиналом 100\n"
                    + "Выдача " + tensWithdrawn + " банкнот номиналом 10\n"
                    + "Выдача " + onesWithdrawn + " банкнот номиналом 1\n"
                    + "Общая сумма выдачи: " + (hundredsWithdrawn * 100 + tensWithdrawn * 10
                    + onesWithdrawn));
        }
    }
}