public class VariablesTheme {

    public static void main(String[] args){
        System.out.println("1. Вывод характеристик компьютера");
        byte numberRam = 16;
        short numberWattsPowerSupply = 600;
        int bitnessOs = 64;
        long amountOfMemory = 1_000_000_000L;
        float cpuClockSpeed = 2.90F;
        double clockSpeedRam = 2.666;
        char cpuIndex = 'f';
        boolean isGamingComputer = false;
        System.out.println("Количество ОЗУ: " + numberRam + "Гб."
                + "\nКоличество Ватт блока питания: " + numberWattsPowerSupply
                + "\nРазрядность ОС: " + bitnessOs
                + "\nКолличество памяти на жестком диске: " + amountOfMemory + "Мб."
                + "\nТактовая частота процессора: " + cpuClockSpeed + "ГГц"
                + "\nТактовая частота ОЗУ: " + clockSpeedRam + "ГГц"
                + "\nИндекс процессора: " + cpuIndex
                + "\nИгровой компьютер: " + isGamingComputer);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int amountWithoutDiscount = penPrice + bookPrice;
        int discountSum = amountWithoutDiscount / 100 * discount;
        int discountPrice = amountWithoutDiscount - discountSum;
        System.out.println("Общая стоимость товаров без скидки: " + amountWithoutDiscount
                + "\nСумма скидки: " + discountSum
                + "\nОбщая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n"
                + "   J   a a  v   v  a a\n"
                + "J  J  aaaaa  V V  aaaaa\n"
                + " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767 ;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;

        System.out.println("maxByte: " + maxByte + "\nmaxByte после инермента: " + ++maxByte
                + "\nmaxByte после декремента: " + --maxByte);
        System.out.println("maxShort: " + maxShort + "\nmaxShort после инермента: " + ++maxShort
                + "\nmaxShort после декремента: " + --maxShort);
        System.out.println("maxInt: " + maxInt + "\nmaxInt после инермента: " + ++maxInt
                + "\nmaxInt после декремента: " + --maxInt);
        System.out.println("maxLong: " + maxLong + "\nmaxLong после инермента: " + ++maxLong
                + "\nmaxLong после декремента: " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("Перестановка с помощью третьей переменной\n"
                + "Исходные данные: a = " + a + " b = " + b);
        a = b;
        b = c;
        System.out.println("Данные после перестановик с использованием "
                + "третьей переменной: а = " + a + " b = " + b);
        System.out.println("\nПерестановка с помощью арифметических операций\n"
                + "Исходные данные: a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Данные после перестановик с помощью "
                + "арифметических операций: а = " + a + " b = " + b);
        System.out.println("\nПерестановка с помощью побитовой операции ^\n"
                + "Исходные данные: a = " + a + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Данные после перестановик с помощью "
                + "побитовой операции ^: а = " + a + " b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) hash + "\t" + hash + "\n"
                + (int) ampersand + "\t" + ampersand + "\n"
                + (int) at + "\t" + at + "\n"
                + (int) caret + "\t" + caret + "\n"
                + (int) underscore + "\t" + underscore + "\n");

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openingParenthesis = '(';
        char closingParenthesis = ')';
        System.out.println("    " + slash + backSlash + "\n"
                + "   " + slash + "  " + backSlash + "\n"
                + "  " + slash + underscore + openingParenthesis + " " + closingParenthesis + backSlash + "\n"
                + " " + slash + "      " + backSlash + "\n"
                + slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;
        int sumDigits = hundreds + tens + ones ;
        int productDigits = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит: \n\t"
                + hundreds + " сотен\n\t"
                + tens + " десятков\n\t"
                + ones  + " единиц\n"
                + "Сумма его цифр = " + sumDigits
                + "\nПроизведение = " + productDigits);

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int seconds1 = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds1);
    }
}