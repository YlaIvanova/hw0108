public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte pencil = 3;
        short dog = 18;
        int dollar = 84572;
        long human = 18327543L;
        float buckwheat = 4.5f;
        double sugar = 2.3;
        char c = 'c';
        boolean isAdult = dog > 12;
        boolean egg = true;
    }

    //Задача 2

    // В боксе, перед каждым боем, спортсменов взвешивают – это делают для того,
    // чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
    //Вес одного боксера – 78,2 кг
    // Вес второго боксера – 82,7 кг
    // Подсчитайте и выведите в консоль общий вес двух бойцов.
    //Подсчитайте и выведите в консоль разницу между весами бойцов.


    public static void task2() {
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float generalWeightBoxer = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров равен " + generalWeightBoxer + "кг");
        float differenceWeightBoxer = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров равна " + differenceWeightBoxer + "кг");
        float differenceWeightBoxer2 = Math.abs(boxerWeight1 - boxerWeight2);
       System.out.println("Разница в весе боксеров равна " + differenceWeightBoxer2 + "кг");
    }


    // Задача 3
    // За весом спортсмена следит не только сам спортсмен, но и его тренер.
    // Он достигается и поддерживается упорными тренировками и сбалансированным питанием
    // Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
    //– Бананы – 5 штук (1 банан - 80 грамм);
    //– Молоко – 200 мл (100 мл = 105 грамм);
    //– Мороженое пломбир – 2 брикета по 100 грамм;
    //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
    //    Смешать всё в блендере и готов
    //  Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы
    // Результат напечатайте в консоль.

    public static void task3() {
        int WeightBananas = 80;
        int totalWeightBananas = WeightBananas * 5;
        int WeightMilk = 105;
        int totalWeightMilk = WeightMilk * 2;
        int WeightIceCream = 100;
        int totalWeightIceCream = WeightIceCream * 2;
        int WeightEgg = 70;
        int totalWeightEgg = WeightEgg * 4;
        int gransInKg = 1000;
        int totalBreakfastWeight = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEgg;
        System.out.println("Общий вес завтрака " + totalBreakfastWeight + " грамм");
        float totalBreakfastWeightKg = totalBreakfastWeight / 1000f;
        System.out.println("Общий вес завтрака " + totalBreakfastWeightKg + " кг");
        double totalBreakfastWeightKg2 = totalBreakfastWeight / (gransInKg * 1.0);
        System.out.println("Общий вес завтрака " + totalBreakfastWeightKg2 + " кг");

    }

    // Задача 4
    // Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
    // чтобы оставаться в своей весовой категории.
    // Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
    // Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм
    // и сколько, если каждый день будет худеть на 500 грамм
    // Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения
    // Результаты подсчетов выведите в консоль.

    public static void task4() {
        short needToLoseWeight = 7000;
        short option1 = 250;
        short option2 = 500;
        int daysForTheFirstOption1 = needToLoseWeight / option1;
        System.out.println("Потребуется " + daysForTheFirstOption1 + " дней при сбросе 250 гр в сутки ");
        int daysForTheFirstOption2 = needToLoseWeight / option2;
        System.out.println("Потребуется " + daysForTheFirstOption2 + " дней при сбросе 500 гр в сутки ");
        int generalAverageDailyWeight = option1 + option2;
        int averageNumberWeight = generalAverageDailyWeight / 2;
        double averageNumberOfDays = (daysForTheFirstOption1 + daysForTheFirstOption2) / (2 * 1.0);
        System.out.println("Потребуется " + averageNumberOfDays + " дней в среднем ");
    }


    //Задача 5
    //  Отойдем от спорта и представим, что мы работаем в большой компании,
    //  штат которой состоит из нескольких сотен сотрудников.
    //  В компании есть правило, что чем дольше сотрудник работает в компании,
    //  тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет,
    //  получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты
    // К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
    // а также провести расчет для следующих сотрудников
    // Маша получает 67 760 рублей в месяц
    //Денис получает 83 690 рублей в месяц
    //Кристина получает 76 230 рублей в месяц
    //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
    // Выведите в консоль информацию по каждому сотруднику.
    // Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.

    public static void task5() {
        int salaryMasha = 67760;
        int salaryMashaInAYear = salaryMasha * 12;
        float salaryMashaAfterPromotion = salaryMasha * 1.1f;
        float salaryMashaAfterPromotionInAYear = salaryMashaAfterPromotion * 12f;
        float wageDifference = salaryMashaAfterPromotionInAYear - salaryMashaInAYear;
        System.out.println("Маша теперь получает " + salaryMashaAfterPromotion + " рублей." + "Годовой доход вырос на  " + wageDifference + " рублей.");

        int salaryDenis = 83690;
        int salaryDenisInAYear = salaryDenis * 12;
        float salaryDenisAfterPromotion = salaryDenis * 1.1f;
        float salaryDenisAfterPromotionInAYear = salaryDenisAfterPromotion * 12f;
        float wageDifferenceDenis = salaryDenisAfterPromotionInAYear - salaryDenisInAYear;
        System.out.println("Денис теперь получает " + salaryDenisAfterPromotion + " рублей." + "Годовой доход вырос на  " + wageDifferenceDenis + " рублей.");

        int salaryKristina = 76230;
        int salaryKristinaInAYear = salaryKristina * 12;
        float salaryKristinaAfterPromotion = salaryKristina * 1.1f;
        float salaryKristinaAfterPromotionInAYear = salaryKristinaAfterPromotion * 12f;
        float wageDifferenceKristina = salaryKristinaAfterPromotionInAYear - salaryKristinaInAYear;
        System.out.println("Кристина теперь получает " + salaryKristinaAfterPromotion + " рублей." + "Годовой доход вырос на  " + wageDifferenceKristina + " рублей.");
    }
}

