public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        // Задача 1
        byte pencil = 3;
        short dog = 18 ;
        int dollar = 84572 ;
        long human = 18327543;
        float buckwheat = 4.5f;
        double sugar = 2.3;
        char cat = 12;
        boolean isAdult = cat > 12;


        // Задача 2

        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float generalWeightBoxer = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров равен " + generalWeightBoxer +"кг");
        float differenceWeightBoxer = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров равна " + differenceWeightBoxer+"кг");

        // Задача 3

        int WeightBananas = 80;
        int totalWeightBananas = WeightBananas*5;
        int WeightMilk = 105;
        int totalWeightMilk = WeightMilk*2;
        int WeightIceCream = 100;
        int totalWeightIceCream = WeightIceCream*2;
        int WeightEgg = 70;
        int totalWeightEgg = WeightEgg*4;
        int totalBreakfastWeight = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEgg ;
       System.out.println("Общий вес завтрака " + totalBreakfastWeight + " грамм");
        float totalBreakfastWeightKg = totalBreakfastWeight/1000f;
        System.out.println("Общий вес завтрака " + totalBreakfastWeightKg + " кг");

        // Задача 4

        short needToLoseWeight = 7000;
        short option1 = 250;
        short option2 = 500;
        int daysForTheFirstOption1 = needToLoseWeight/option1;
        System.out.println("Потребуется " + daysForTheFirstOption1 + " дней при сбросе 250 гр в сутки " );
        int daysForTheFirstOption2 = needToLoseWeight/option2;
        System.out.println("Потребуется " + daysForTheFirstOption2 + " дней при сбросе 500 гр в сутки " );
        int generalAverageDailyWeight =  option1 + option2 ;
        int averageNumberWeight= generalAverageDailyWeight/2;
        double averageNumberOfDays = needToLoseWeight/averageNumberWeight;
        System.out.println("Потребуется " + averageNumberOfDays + " дней в среднем " );
        float amountOfDays = 7000/ (option1/2+option2/2f) ;
        System.out.println("Потребуется " + amountOfDays + " дней в среднем " );

        //Задача 5

        int salaryMasha = 67760;
        int salaryMashaInAYear = salaryMasha*12;
        float salaryMashaAfterPromotion = salaryMasha*1.1f;
        float salaryMashaAfterPromotionInAYear = salaryMashaAfterPromotion*12f;
        float wageDifference = salaryMashaAfterPromotionInAYear-salaryMashaInAYear;
        System.out.println("Маша теперь получает "+ salaryMashaAfterPromotion +" рублей." + "Годовой доход вырос на  "+wageDifference + " рублей." );

        int salaryDenis = 83690;
        int salaryDenisInAYear = salaryDenis*12;
        float salaryDenisAfterPromotion = salaryDenis*1.1f;
        float salaryDenisAfterPromotionInAYear = salaryDenisAfterPromotion*12f;
        float wageDifferenceDenis = salaryDenisAfterPromotionInAYear-salaryDenisInAYear;
        System.out.println("Денис теперь получает "+ salaryDenisAfterPromotion +" рублей." + "Годовой доход вырос на  "+wageDifferenceDenis + " рублей." );

        int salaryKristina = 76230;
        int salaryKristinaInAYear = salaryKristina*12;
        float salaryKristinaAfterPromotion = salaryKristina*1.1f;
        float salaryKristinaAfterPromotionInAYear = salaryKristinaAfterPromotion*12f;
        float wageDifferenceKristina = salaryKristinaAfterPromotionInAYear-salaryKristinaInAYear;
        System.out.println("Кристина теперь получает "+ salaryKristinaAfterPromotion +" рублей." + "Годовой доход вырос на  "+wageDifferenceKristina + " рублей." );



    }

}