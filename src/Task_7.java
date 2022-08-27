public class Task_7 {

    /*
        Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.

        Результаты подсчетов выведите в консоль.

        при данных условиях задачи допустимо использовать int, но я решил сделать более универсальное решение с float
        Ниже мой првый вариант решения:
        int overWeight = 7000; //в общем случае должен быть float double
        int minDays = overWeight / 500; //в общем случае должен быть float double
        int maxDays = overWeight / 250; //в общем случае должен быть float или double
        float medDays = (float) (minDays + maxDays) / 2; //при данных условиях задачи допустим int
        System.out.printf("Для сброса лишнего веса спортсмену потребуется от %d до %d дней.\nВ среднем %.1f дня.\n",
                                            minDays, maxDays, medDays);
        */
    private static float overWeight = 7f; //лишний вес в кг
    private static float minWeightLossPerDay = 0.25f; //минимальный сброс веса в день
    private static float maxWeightLossPerDay = 0.5f; //максимальный сброс веса в день

    public static void solution() {
        float minDays = overWeight / maxWeightLossPerDay;
        float maxDays = overWeight / minWeightLossPerDay;
        float medDays = (minDays + maxDays);
        System.out.printf("Для сброса лишних %.1f килограмм спортсмену потребуется от %.0f до %.0f дней."
                + "%n" + "В среднем %.1f дня." + "%n", overWeight, minDays, maxDays, medDays);
    }
}
