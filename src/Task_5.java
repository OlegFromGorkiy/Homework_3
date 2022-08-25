public class Task_5 {
    /*
    На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
    На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
    Выведите результат задачи в консоль в формате “В школе, где … классов, нужно … банок белой краски и … банок коричневой краски”.
     */

    private int jars = 120;
    private int whiteJars = 2;
    private int brownJars = 4;
    private String template = "В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски";

    public void play() {
        int classrooms = jars / (whiteJars + brownJars);
        System.out.printf(template + "%n", classrooms, classrooms * whiteJars, classrooms * brownJars);
    }

    public void play(int classrooms) {
        System.out.printf(template + "%n", classrooms, classrooms * whiteJars, classrooms * brownJars);
    }
}