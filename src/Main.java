public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 111;
        System.out.println("Значение переменной a с типом int равно " + a );
        byte b = 1;
        System.out.println("Значение переменной b с типом byte равно " + b );
        short c = 11;
        System.out.println("Значение переменной c с типом short равно " + c );
        long d = 1111111L;
        System.out.println("Значение переменной d с типом long равно " + d );
        double aa = 1.1;
        System.out.println("Значение переменной aa с типом double равно " + aa );
        float bb = 1f;
        System.out.println("Значение переменной bb с типом float равно " + 1f );


        System.out.println("Задание 2");
        int one = 27897 ;
        long two = 987678965549L;
        short three = 569;
        byte four = 67;
        double five = 2.786;
        float six = 27.12f;
        boolean seven = two < 1;
        char eight = 569;
        System.out.println(seven);

        System.out.println("Задание 3");
        short class1 = 23;
        short class2 = 27;
        short class3 = 30;
        int totalStudients = class1+class2+class3;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/totalStudients + " листов бумаги");

        System.out.println("Задание 4");
        int quantityForMun = 16 / 2;
        int quantityFor20 = quantityForMun * 20;
        System.out.println("За 20 минут машина произвела бутылок " + quantityFor20 + " штук");
        int quantityForDay = quantityForMun * 60 * 24;
        System.out.println("За сутки машина произвела бутылок " + quantityForDay + " штук");
        int quantityFor3Days = quantityForDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + quantityFor3Days + " штук");
        int quantityForMonth = quantityForDay * 30;
        System.out.println("За месяц машина произвела бутылок " + quantityForMonth + " штук");

        System.out.println("Задание 5");
        short whiteBanks = 2;
        short brownBanks = 4;
        int quantityForClass = whiteBanks + brownBanks;
        int quantityClasses = 120 / quantityForClass;
        int totalWhite = quantityClasses * whiteBanks;
        int totalBrown = quantityClasses * brownBanks;
        System.out.println("В школе, где " + quantityClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

        System.out.println("Задание 6");
        double bananWeight = 80;
        double milk100MlWeight = 105;
        double iceCreamWeight = 100;
        double eggWeight = 70;
        double recipe = bananWeight * 5 + milk100MlWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        double recipeKg = recipe / 1000;
        System.out.println(recipeKg + " кг");

        System.out.println("Задание 7");
        double gainWeight = 7;
        double firstDiet = 0.25;
        double secondDiet = 0.5;
        double resultFromFirst = gainWeight / firstDiet;
        double resultFromSecond = gainWeight / secondDiet;
        double avarageResult = (resultFromSecond + resultFromFirst) / 2;
        System.out.println(avarageResult);

        System.out.println("Задание 8");
        double maSalary = 67760;
        double deSalary = 83690;
        double kriSalary = 76230;
        double futureMaSalary = maSalary * 1.1;
        double futureDeSalary = deSalary * 1.1;
        double futureKriSalary = kriSalary * 1.1;
        double annualMaSalary = maSalary * 12;
        double annualDeSalary = deSalary * 12;
        double annualKriSalary = kriSalary * 12;
        double annualMaFuSalary = futureMaSalary * 12;
        double annualDeFuSalary = futureDeSalary * 12;
        double annualKriFuSalary = futureKriSalary * 12;
        double difMaSalary = annualMaFuSalary - annualMaSalary;
        double difDeSalary = annualDeFuSalary - annualDeSalary;
        double difKriSalary = annualKriFuSalary - annualKriSalary;
        System.out.println("Маша теперь получает " + futureMaSalary + "рублей. Годовой доход вырос на " + difMaSalary + " рублей");
        System.out.println("Денис теперь получает " + futureDeSalary + "рублей. Годовой доход вырос на " + difDeSalary + " рублей");
        System.out.println("Кристина теперь получает " + futureKriSalary + "рублей. Годовой доход вырос на " + difKriSalary + " рублей");





    }
}