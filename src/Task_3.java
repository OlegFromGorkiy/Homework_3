public class Task_3 {
    /*
    Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
    У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
    Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
    Результат задачи выведите в консоль в формате “На каждого ученика рассчитано … листов бумаги”.
    Для объявления переменных не используйте тип var.
     */
    private int firstClass = 23;
    private int secondClass = 27;
    private int thirdClass = 30;
    private int paperNumber = 480;

    public void play(){
        String template = "На каждого ученика рассчитано %.1f листов бумаги";
        float result = paperNumber/(firstClass+secondClass+thirdClass);
        System.out.printf(template+"%n", result);
    }

    public void play( int i){
        String template = "На каждого ученика рассчитано %2$d листов бумаги, %1$d листов останется про запас";
        int forChild = i/(firstClass+secondClass+thirdClass);
        int inReserve = i%(firstClass+secondClass+thirdClass);
        System.out.printf(template+"%n", inReserve,forChild );
    }
}
