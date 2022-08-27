public class Main {
    public static void main(String[] args) {
        Task_1.solution();
        System.out.println("***");

        Task_2.solution();
        System.out.println("***");

        Task_3.solution();// 480 sheets and sheet can be cut
        Task_3.solution(500); // 500 sheets and sheet can't be cut
        System.out.println("***");

        Task_4.solution(); //если переменные и метод сделать статик, можно не создавать объект
        System.out.println("Со временем производительность машины сильно снизилась...");
        Task_4.solution(7); //16 bottles per 7 minutes
        System.out.println("***");

        Task_5.solution();
        Task_5.solution(33);
        System.out.println("***");

        Task_6.solution();
        System.out.println("***");

        Task_7.solution();
        System.out.println("***");
        Task_8.solution();
        System.out.println("\nА теперь, что может получится если индексация будет на 13%");
        Task_8.solution(13); //индексация на 13%
        System.out.println("***");
    }
}