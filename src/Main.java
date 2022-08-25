public class Main {
    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        task1.play();
        System.out.println("***");

        Task_3 task3 = new Task_3();
        task3.play(); // 480 sheets and sheet can be cut
        task3.play(500); // 500 sheets and sheet can't be cut
        System.out.println("***");

        Task_4.play(); //если переменные и метод сделать статик, можно не создавать объект
        System.out.println("Со временем производительность машины сильно снизилась...");
        Task_4.play(7); //16 bottles per 7 minutes
        System.out.println("***");

        Task_5 task5 = new Task_5();
        task5.play();
        task5.play(33);
        System.out.println("***");

        char c = 569;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(c);
    }
}