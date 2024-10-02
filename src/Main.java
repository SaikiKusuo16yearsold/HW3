public class Main {

    public static void main(String[] args) {
        byte a = 3;
        short b = 300;
        int c = 40000;
        long d = 300000;
        float e = 1f;
        double f = 2000f;
        System.out.println("Тип переменной byte " + a);
        System.out.println("Тип переменной short " + b);
        System.out.println("Тип переменной int" + c);
        System.out.println("Тип переменной long " + d);
        System.out.println("Тип переменной float " + e);
        System.out.println("Тип переменной double " + f);


        float first = 27.12f;
        long second = 987678965549L;
        float third = 2.786f;
        short fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;

        float ludmilaPavlovna = 23f;
        byte annaSergeevna = 23;
        byte ekaterinaAndreevna = 30;
        float allStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        float forOneStudent = 480 / allStudents;
        System.out.println("На каждого ученика рассчитано " + forOneStudent + " листов бумаги");


        byte twentyMinutes = 20;
        int day = 60 * 24;
        int threeDays = 60 * 24 * 3;
        int oneMonth = 60 * 24 * 30;
        byte speed = 8;
        System.out.println("За 20 минут машина произвела " + twentyMinutes * speed + " штук бутылок");
        System.out.println("За сутки  машина произвела " + day * speed + " штук бутылок");
        System.out.println("За 3 дня минут машина произвела " + threeDays * speed + " штук бутылок");
        System.out.println("За 1 месяц минут машина произвела " + oneMonth * speed + " штук бутылок");


        byte white = 2;
        byte brown = 4;
        byte allBanks = 120;
        int allСlasses = allBanks / (white + brown);
        int allWhite = allBanks / (white + brown) * white;
        int allBrown = allBanks / (white + brown) * brown;
        System.out.println("В школе, где " + allСlasses + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int egs = 4 * 70;
        float totalWeight = (bananas + milk + iceCream + egs) / 1000f;
        System.out.println("Этот напиток весит " + totalWeight + " кг");

        short weight = 7000;
        short firstVariant = 250;
        short secondVariant = 500;
        int firstDays = weight / firstVariant;
        int secondDays = weight / secondVariant;
        int middleVariant = (secondDays + firstDays) / 2;
        System.out.println("Если сбрасывать по 500 грам в день, то понадобиться " + firstDays + " дней, если по 250 в день, то понадобиться " + secondDays + " дней  в среднем понадобиться " + middleVariant + " дней");


        int mariaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;
        float newMariaSalary = mariaSalary * 1.1f;
        float newDenisSalary = denisSalary * 1.1f;
        float newCristinaSalary = cristinaSalary * 1.1f;
        float salaryDifferenceMaria = newMariaSalary - mariaSalary;
        float salaryDifferenceDenis = newDenisSalary - denisSalary;
        float salaryDifferenceCristina = newCristinaSalary - cristinaSalary;
        System.out.println("Маша теперь получает " + newMariaSalary + " рублей.  Годовой доход вырос на " + salaryDifferenceMaria + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей.  Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newCristinaSalary + " рублей.  Годовой доход вырос на " + salaryDifferenceCristina + " рублей");
    }
}