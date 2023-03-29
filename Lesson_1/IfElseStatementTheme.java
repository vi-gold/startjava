public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
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
        int a = 35, b = 46;
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
        System.out.println("Исходные числа: a = " + a + " b = " + b);
        if (((a / 100) != (b / 100)) && ((a / 10 % 10) != (b / 10 % 10))
            && ((a % 10) != (b % 10))) {
                System.out.println("Равных цифр нет");
        } else {
            if ((a / 100) == (b / 100)) {
                System.out.println("Одинаковые числа " + (a / 100) + " в разряде сотен");
            }
            if ((a / 10 % 10) == (b / 10 % 10)) {
                System.out.println("Одинаковые числа " + (a / 10 % 10) + " в разряде десяток");
            } 
            if ((a % 10) == (b % 10)) {
                System.out.println("Одинаковые числа " + (a % 10) + " в разряде единиц");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol > 96 && symbol < 123) {
            System.out.println("Символ '" + symbol + "' это маленькая буква");
        } else if (symbol > 64 && symbol < 91) {
            System.out.println("Символ '" + symbol + "' это большая буква");
        } else if (symbol > 47 && symbol < 58) {
            System.out.println("Символ '" + symbol + "' это число буква");
        } else {
            System.out.println("Символ '" + symbol + "' это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int contribution = 300_000;
        int percent;
        System.out.println("Сумма вклада: " + contribution);
        if (contribution < 100_000) {
            percent = contribution / 100 * 5;
            System.out.println("Начисленный процент: " + percent + "\nИтоговая сумма: " 
                + (contribution + percent));
        } else if (contribution >= 100_000 && contribution <= 300_000) {
            percent = contribution / 100 * 7;
            System.out.println("Начисленный процент: " + percent + "\nИтоговая сумма: " 
                + (contribution + percent));
        } else if (contribution > 300_000) {
            percent = contribution / 100 * 10;
            System.out.println("Начисленный процент: " + percent + "\nИтоговая сумма: " 
                + (contribution + percent));
        }

        System.out.println("\n7. Определение оценки по предметам");
        int history = 59, programming = 91;
        int avgPercent = (history + programming) / 2;
        int gradeHistory = 0, gradeProgramming = 0;
        if (history <= 60) {
            gradeHistory = 2;
        } else if (history > 60 && history <= 73) {
            gradeHistory = 3;
        } else if (history > 73 && history <= 91) {
            gradeHistory = 4;
        } else if (history > 91) {
            gradeHistory = 5;
        }
        if (programming <= 60) {
            gradeProgramming = 2;
        } else if (programming > 60 && programming <= 73) {
            gradeProgramming = 3;
        } else if (programming > 73 && programming <= 91) {
            gradeProgramming = 4;
        } else if (programming > 91) {
            gradeProgramming = 5;
        }
        System.out.println("История\t" + gradeHistory + "\nПрограммирование\t" + gradeProgramming
            + "\nСредний балл оценок: " + ((gradeProgramming + gradeHistory) / 2)
            + "\nСредний % по предметам: " + avgPercent);

        System.out.println("\n8. Расчет прибыли за год");
        int rentForYear = 5000 * 12, salesForYear = 13_000 * 12, costPriceForYear = 9000 * 12;
        int profit = salesForYear - rentForYear - costPriceForYear;
        if (profit > 0){
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 567;
        int hundredsOfSum = sum / 100 * 100;
        int dozensOfSum = sum / 10 % 10 * 10;
        int unitsOfSum = sum % 10;
        int countHundredsInBank = 10, countDozensInBank = 5, countUnitsInBank = 50;
        int temp = 0;
        if (hundredsOfSum <= countHundredsInBank * 100) {
            System.out.println("Выдача " + hundredsOfSum / 100 
                + " банкнот номиналом 100 на сумму " + hundredsOfSum);
            if (dozensOfSum <= countDozensInBank) {
                System.out.println("Выдача " + dozensOfSum / 10 
                    + " банкнот номиналом 10 на сумму " + dozensOfSum);
                if (unitsOfSum <= countUnitsInBank) {
                    System.out.println("Выдача " + unitsOfSum 
                        + " банкнот номиналом 1 на сумму " + unitsOfSum
                        + "\nОбщая сумма выдачи: " + (hundredsOfSum + dozensOfSum + unitsOfSum));
                }
            } else if (dozensOfSum <= countDozensInBank * 10 + countUnitsInBank){
                temp = dozensOfSum + unitsOfSum - countDozensInBank * 10;
                if (temp <= countUnitsInBank) {
                    System.out.println("Выдача "+ countDozensInBank 
                        + " банкнот номиналом 10 на сумму " + countDozensInBank * 10 + " и "
                        + temp + " номиналом 1 на сумму " + temp
                        + "\nОбщая сумма выдачи: "+(hundredsOfSum + countDozensInBank * 10 + temp));
                } else {
                    System.out.println("Банкнот не хватает для выдачи нужной суммы");
                }
            } else {
                System.out.println("Банкнот не хватает для выдачи нужной суммы");
            }
        } else if (hundredsOfSum <= countHundredsInBank * 100 + countDozensInBank * 10){
            temp = hundredsOfSum + dozensOfSum - countHundredsInBank * 100;
            if (temp <= countDozensInBank * 10) {
                System.out.println("Выдача "+ countHundredsInBank 
                    + " банкнот номиналом 100 на сумму" + countHundredsInBank * 100 + " и "
                    + temp / 10 + " номиналом 10 на сумму" + temp + " и " + unitsOfSum 
                    + " номиналом 1 на сумму unitsOfSum"
                    + "\nОбщая сумма выдачи: " + (countHundredsInBank * 100 + temp + unitsOfSum));
            } else if (temp <= countDozensInBank * 10 + countUnitsInBank) {
                temp = hundredsOfSum + dozensOfSum + unitsOfSum - countHundredsInBank * 100
                    - countDozensInBank * 10;
                if (temp <= countUnitsInBank) {
                    System.out.println("Выдача "+ countHundredsInBank 
                        + " банкнот номиналом 100 на сумму " + countHundredsInBank * 100 + " и "
                        + countDozensInBank + " номиналом 10 на сумму " + countDozensInBank * 10 
                        + " и " + temp + " номиналом 1 на сумму " + temp
                        + "\nОбщая сумма выдачи: " + (countHundredsInBank * 100 
                        + countDozensInBank * 10 + temp));
                } else {
                    System.out.println("Банкнот не хватает для выдачи нужной суммы");
                }
            }  else {
                System.out.println("Банкнот не хватает для выдачи нужной суммы");
            }
        } else if (hundredsOfSum <= countHundredsInBank * 100 + countDozensInBank * 10 
            + countUnitsInBank) {
            temp = hundredsOfSum + dozensOfSum + unitsOfSum - countHundredsInBank * 100
                - countDozensInBank * 10;
            System.out.println("Выдача "+ countHundredsInBank + " банкнот номиналом 100 на сумму " 
                + countHundredsInBank * 100 + " и " + countDozensInBank 
                + " банкнот номиналом 10 на сумму" + countDozensInBank * 10 + " и " + temp 
                + " номиналом 1 на сумму " + temp
                +"\nОбщая сумма выдачи: " + (countHundredsInBank * 100 
                        + countDozensInBank * 10 + temp));
        } else {
            System.out.println("Банкнот не хватает для выдачи нужной суммы");
        }
    }
}