public class VariablesTheme {

    public static void main(String[] args){
        System.out.println("1. Вывод характеристик компьютера");
        byte numberOfRAM = 16;
        short numberOfWattsOfPowerSupply = 600;
        int bitnessOfOS = 64;
        long amountOfMemory = 1_000_000_000L;
        float processorClockSpeed = 2.90F;
        double clockSpeedOfRAM = 2.666;
        char processorIndex = 'f';
        boolean isGamingComputer = false;
        System.out.println("Количество ОЗУ: " + numberOfRAM + "Гб."
                + "\nКоличество Ватт блока питания: " + numberOfWattsOfPowerSupply
                + "\nРазрядность ОС: " + bitnessOfOS
                + "\nКолличество памяти на жестком диске: " + amountOfMemory + "Мб."
                + "\nТактовая частота процессора: " + processorClockSpeed + "ГГц"
                + "\nТактовая частота ОЗУ: " + processorClockSpeed + "ГГц"
                + "\nИндекс процессора: " + processorIndex
                + "\nИгровой компьютер: " + isGamingComputer);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int amountWithoutDiscount = penPrice + bookPrice;
        int discountAmount = amountWithoutDiscount / 100 * discount;
        int totalAmount = amountWithoutDiscount - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + amountWithoutDiscount
                + "\nСумма скидки: " + discountAmount
                + "\nОбщая стоимость товаров со скидкой: " + totalAmount);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   \n"
                + "   J   a a  v   v  a a  \n"
                + "J  J  aaaaa  V V  aaaaa \n"
                + " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767 ;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;

        System.out.println("maxByte: " + maxByte + " ||| maxByte после инермента: " + maxByte++
                + " ||| maxByte после декремента: " + maxByte--);
        System.out.println("maxShort: " + maxShort + " ||| maxShort после инермент: " + maxShort++
                + " ||| maxShort после декремента: " + maxShort--);
        System.out.println("maxInt: " + maxInt + " ||| maxInt после инермент: " + maxInt++
                + " ||| maxInt после декремента: " + maxInt--);
        System.out.println("maxLong: " + maxLong + " ||| maxLong после инермент: " + maxLong++
                + " ||| maxLong после декремента: " + maxLong--);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2, b = 5, c;
        System.out.println("Перестановка с помощью третьей переменной\n"
                + "Исходные данные: a = " + a + " b = " + b);
        c = a;
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
        char ch1 = '#', ch2 = '&', ch3 = '@', ch4 = '^', ch5 = '_';
        int cod1 = 35, cod2 = 38, cod3 = 64, cod4 = 94, cod5 = 95;
        System.out.println(cod1 + "\t" + ch1 + "\n"
                + cod2 + "\t" + ch2 + "\n"
                + cod3 + "\t" + ch3 + "\n"
                + cod4 + "\t" + ch4 + "\n"
                + cod5 + "\t" + ch5 + "\n");

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openingParenthesis = '(';
        char closingParenthesis = ')';
        char underscore = '_';
        System.out.println("    " + slash + backSlash + "    \n"
                + "   " + slash + "  " + backSlash + "   \n"
                + "  " + slash + underscore + openingParenthesis + " " + closingParenthesis + backSlash + "  \n"
                + " " + slash + "      " + backSlash + " \n"
                + slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123, hundreds, dozens, units;
        hundreds = number / 100;
        dozens = number / 10 % 10;
        units = number % 10;
        int sumOfDigits = hundreds + dozens + units;
        System.out.println("Число " + number + " содержит: \n\t"
                + hundreds + " сотен\n\t"
                + dozens + " десятков\n\t"
                + units + " единиц\n"
                + "Сумма его цифр = " + sumOfDigits
                + "\nПроизведение = " + hundreds * dozens * units);


        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600 % 24;
        int minutes = seconds % 3600 / 60;
        int seconds1 = seconds % 3600 % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds1);
    }
}