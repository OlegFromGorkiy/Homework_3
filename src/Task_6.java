public class Task_6 {

    /*
        За весом спортсмена следит не только сам спортсмен, но и его тренер.
        Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
        Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
        – Бананы – 5 штук (1 банан - 80 грамм);
        – Молоко – 200 мл (100 мл = 105 грамм);
        – Мороженое пломбир – 2 брикета по 100 грамм;
        – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).

        Смешать всё в блендере и готово.
        Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        Результат напечатайте в консоль.
         */

    static int bananaWeight = 800; //вес банан в граммах
    static int bananaNumber = 5; //кол-во бананов

    static int milkPartWeight = 105; // вес одной части молока (1 часть - 100 мл)
    static int milkPartsNumber = 2; //количество частей молока

    static int iceCreamWeight = 100; //вес пломбира в граммах
    static int iceCreamNumber = 2; //число пломбиров

    static int eggWeight = 70; //вес яйца в граммах
    static int eggNumber = 4; //число яиц

    private static int getGrams() {
        return bananaWeight * bananaNumber + milkPartWeight * milkPartsNumber
                + iceCreamWeight * iceCreamNumber + eggWeight * eggNumber;
    }

    private static float getKilos() {
        return (float) getGrams() / 1000;
    }

    public static void solution() {
        System.out.printf("Вес коктейля в граммах - %d, в килограммах - %.2f" + "%n",
                getGrams(), getKilos());
    }
}
