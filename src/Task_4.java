public class Task_4 {
    /*
    Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
    - за 20 минут
    - в сутки
    - за 3 дня
    - за 1 месяц
    Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
    Результаты подсчетов выведите в консоль в формате “За … машины произвела бутылок … штук “
    Для объявления переменных не используйте тип var.
     */

    private static int bottle = 16;
    private static int minutes = 2;

    public static void play() {
        int perMinute = bottle / minutes;
        int perDay = 24 * 60 * perMinute;
        System.out.println("За 20 минут машина произвела " + 20 * perMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + 3 * perDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + 30 * perDay + " штук бутылок");
    }

    public static void play( int minutes) {
        float perMinute = (float) bottle/ minutes;
        float perDay = 24 * 60 * perMinute;
        System.out.println("За 20 минут машина произвела " + 20 * perMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + 3 * perDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + 30 * perDay + " штук бутылок");
    }
}
