package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        char bar = 35;
    // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println(" Общий вес боксеров " + weightAllBoxers);
        System.out.println(" Разница в весе босеров " + weightDifference);

    // Задание 3
        short banana = 80;
        short milk = 105;
        short iceCream = 100;
        short egg = 70;
        int weightBanana = banana * 5;
        int weightMilk = milk * 2;
        int weightIceCream = iceCream * 2;
        int weightEggs = egg * 4;
        int weightBreakFast = weightBanana + weightMilk + weightIceCream + weightEggs;
        System.out.println(" Общий вес завтрака " + weightBreakFast + " гр ");
        float breakFast = 1090;
        float weightBreakFastKg = breakFast / 1000;
        System.out.println(" Общий вес завтрака " + weightBreakFastKg + " кг ");

    // Задание 4
        int weight1 = 250;
        int weight2 = 500;
        int weightExcess = 7;
        int weightExcessGr = weightExcess * 1000;
        int weightDay1 = weightExcessGr / weight1;
        int weightDay2 = weightExcessGr / weight2;
        System.out.println(" При потере веса на 250 грамм спортсмену потрубется " + weightDay1 + " дней для похудения на 7 килограмм" );
        System.out.println(" При потере веса на 250 грамм спортсмену потрубется " + weightDay2 + " дней для похудения на 7 килограмм" );
        int weightAverageDays = (weightDay1 + weightDay2 )/2;
        System.out.println(" Среднее количество дней для похудения = " + weightAverageDays );

    // Задание 5

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        float mashaLevelUp = masha * 1.1f;
        float denisLevelUp = denis * 1.1f;
        float kristinaLevelUp = kristina * 1.1f;
        float mashaLevelUpYear = mashaLevelUp * 12;
        float denisLevelUpYear = denisLevelUp * 12;
        float kristinaLevelUpYear = kristinaLevelUp * 12;
        float mashaDifferences = mashaLevelUpYear - mashaYear;
        float denisDifferences = denisLevelUpYear - denisYear;
        float kristinaDifferences = kristinaLevelUpYear - kristinaYear;
        System.out.println(" Маша теперь получает " + mashaLevelUpYear + " рублей. Годовой доход вырос на " + mashaDifferences + " рублей");
        System.out.println(" Денис теперь получает " + denisLevelUpYear + " рублей. Годовой доход вырос на " + denisDifferences + " рублей");
        System.out.println(" Кристина теперь получает " + kristinaLevelUpYear + " рублей. Годовой доход вырос на " + kristinaDifferences + " рублей");
        











    }
}
