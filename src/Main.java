public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println ("Решение задачи 1");
        byte wholeByte = 100;
        System.out.println("Значение переменной byte с типом (Целочисленные) равно " + wholeByte);
        short wholeShort = 1000;
        System.out.println("Значение переменной short с типом (Целочисленные) равно " + wholeShort);
        int wholeInt = 10000;
        System.out.println("Значение переменной Int с типом (Целочисленные) равно " + wholeInt);
        long wholeLong = 100000;
        System.out.println("Значение переменной long с типом (Целочисленные) равно " + wholeLong);

        float fractionFloat = 4.55f;
        System.out.println("Значение переменной float с типом (С плавающей точкой) равно " + fractionFloat);
        double fractionDouble = 15.68;
        System.out.println("Значение переменной double с типом (С плавающей точкой) равно " + fractionDouble);

        char symbolsChar = '$';
        System.out.println("Значение переменной char с типом (Символьный) равно " + symbolsChar);
        boolean boolOn = true;
        System.out.println("Значение переменной boolean с типом (Логический) равно " + boolOn);
        boolean boolOff = false;
        System.out.println("Значение переменной boolean с типом (Логический) равно " + boolOff);

        //Задача 2
        System.out.println ("Решение задачи 2");
        float a = 27.12f;
        System.out.println (a);
        long b = 987_678_965_549L;
        System.out.println (b);
        String c = "2,786";
        System.out.println (c);
        short d = 569;
        System.out.println (d);
        short e = -159;
        System.out.println (e);
        short f = 27897;
        System.out.println (f);
        byte g = 67;
        System.out.println (g);

        //Задача 3
        System.out.println ("Решение задачи 3");
        byte classA = 23;
        System.out.println ("У Людмилы Павловны " + classA + " ученика.");
        byte classB = 27;
        System.out.println ("У Анны Сергеевны " + classB + " учеников.");
        byte classC = 30;
        System.out.println ("У Екатерины Андреевны " + classC + " учеников.");
        short paper = 480;
        System.out.println ("Три учительницы закупили все вместе " + paper + " листов бумаги на все три класса.");
        int classPaper = paper / (classA + classB + classC);
        System.out.println ("На каждого ученика рассчитано " + classPaper + " листов бумаги.");

        //Задача 4
        System.out.println ("Решение задачи 4");
        System.out.println ("Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.");
        byte oneMin = 8;
        int twentyMin = oneMin * 20;
        System.out.println ("За 20 минут машина произвела " + twentyMin + " штук бутылок.");
        int oneHour = oneMin * 60;
        int oneDay = oneHour * 24;
        System.out.println ("За сутки машина произвела " + oneDay + " штук бутылок.");
        int threeDay = oneDay * 3;
        System.out.println ("За 3 дня машина произвела " + threeDay + " штук бутылок.");
        byte november = 30;
        int oneMount = oneDay * november;
        System.out.println ("За месяц машина произвела " + oneMount + " штук бутылок.");

        //Задача 5
        System.out.println ("Решение задачи 5");
        byte generalPaint = 120;
        System.out.println ("На ремонт школы нужно " + generalPaint + " банок краски двух цветов: белой и коричневой.");
        byte whitePaint = 2;
        byte brownPaint = 4;
        System.out.println ("На один класс уходит " + whitePaint + " банки белой и " + brownPaint + " банки коричневой краски.");
        int schoolClass = generalPaint / (whitePaint + brownPaint);
        int buyWhite = schoolClass * whitePaint;
        int buyBrown = schoolClass * brownPaint;
        System.out.println ("В школе, где " + schoolClass + " классов, нужно " + buyWhite + " банок белой краски и " + buyBrown + " банок коричневой краски.");

        //Задача 6
        System.out.println ("Решение задачи 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int smoothiesGr = banana + milk + iceCream + eggs;
        float smoothiesKg = smoothiesGr / 1000f;
        System.out.println ("Вес завтрака " + smoothiesGr + " грамм или " + smoothiesKg + " килограмм.");

        //Задача 7
        System.out.println ("Решение задачи 7");
        short goal = 7000;
        short z = 250;
        short y = 500;
        int longer = goal / z;
        System.out.println ("Сбрасывая по " + z + " грамм в день, спортсмен похудеет за " + longer + " дней.");
        int faster = goal / y;
        System.out.println ("Сбрасывая по " + y + " грамм в день, спортсмен похудеет за " + faster + " дней.");

        //Задача 8
        System.out.println ("Решение задачи 8");
        int Masha = 67_760;
        System.out.println ("Маша получает "+ Masha + " рублей в месяц.");
        int Denis = 83_690;
        System.out.println ("Денис получает "+ Denis + " рублей в месяц.");
        int Kristina = 76_230;
        System.out.println ("Кристина получает "+ Kristina + " рублей в месяц.");
        System.out.println ("Повышение зарплаты на 10%.");
        float plusMasha = Masha * 0.1f + Masha;
        System.out.println ("Маша теперь получает "+ plusMasha + " рублей в месяц.");
        float plusDenis = Denis * 0.1f + Denis;
        System.out.println ("Денис теперь получает "+ plusDenis + " рублей в месяц.");
        float plusKristina = Kristina * 0.1f + Kristina;
        System.out.println ("Кристина теперь получает "+ plusKristina + " рублей в месяц.");
    }
}