import java.util.ArrayList;
import java.util.List;

public class Task_8 {
    /*
        Отойдем от спорта и представим, что мы работаем в большой компании,
        штат которой состоит из нескольких сотен сотрудников. В компании есть правило,
        что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        Каждый год повышение составляет 10% от текущей зарплаты.

        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        Маша получает 67 760 рублей в месяц
        Денис получает 83 690 рублей в месяц
        Кристина получает 76 230 рублей в месяц
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.

        Выведите в консоль информацию по каждому сотруднику.

        Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
         */
    private static final float INDEXATION = 0.1f;
    private static List<Person> persons = new ArrayList<>();

    private static void setList() {
        persons.add(new Person("Маша", 67_760, false));
        persons.add(new Person("Денис", 83_690, true));
        persons.add(new Person("Кристина", 76_230, false));
    }

    private static String getTrueWord(float f) {
        int a = (int) f % 100;
        if (a > 10 && a < 20) return "рублей";
        switch ((int) f % 10) {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }

    public static void solution() {
        if (persons.isEmpty()) setList();
        for (var p : persons) {
            System.out.print(p.toString());
            float delta = p.getSalary() * INDEXATION;
            mathAndPrint(p, delta);
        }
    }

    public static void solution(int i) {
        if (persons.isEmpty()) setList();
        for (var p : persons) {
            System.out.print(p.toString());
            float delta = p.getSalary() * i / 100;
            mathAndPrint(p, delta);
        }
    }

    private static void mathAndPrint(Person p, float delta) {
        float annualDelta = delta * 12;
        String annualWord = getTrueWord(annualDelta);
        p.setSalary((p.getSalary() + delta));
        String newSalaryWord = getTrueWord(p.getSalary());
        if (p.isMale) System.out.println(" Мы проиндексировали ему зарплату!");
        else System.out.println(" Мы проиндексировали ей зарплату!");
        System.out.printf("Теперь %s получает %.0f %s. %s годовой доход вырос на %.0f %s." + "%n",
                p.name, p.getSalary(), newSalaryWord, p.isMale ? "Его" : "Её"
                , annualDelta, annualWord);
    }

    static class Person {
        private String name;
        private boolean isMale;
        private float salary; //с данными задачи прокатит и int, но что если индексация будет 7%

        public boolean isMale() {
            return isMale;
        }

        public String getName() {
            return name;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public Person(String name, int salary, boolean isMale) {
            this.name = name;
            this.salary = salary;
            this.isMale = isMale;
        }

        @Override
        public int hashCode() {
            return name.hashCode() + (int) salary + 31;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;

            Person p = (Person) obj;
            if (this.salary != p.salary || this.isMale == p.isMale) return false;
            if (this.name == null) return p.name == null;
            return this.name.equals(p.name);
        }

        @Override
        public String toString() {
            String template;
            switch ((int) salary % 10) {
                case 1:
                    if (isMale) template = "Это работник %s. Его зарплата %.0f рубль.";
                    else template = "Это работница %s. Её зарплата %.0f рубль.";
                    break;
                case 2:
                case 3:
                case 4:
                    if (isMale) template = "Это работник %s. Его зарплата %.0f рубля.";
                    else template = "Это работница %s. Её зарплата %.0f рубля.";
                    break;
                default:
                    if (isMale) template = "Это работник %s. Его зарплата %.0f рублей.";
                    else template = "Это работница %s. Её зарплата %.0f рублей.";
                    break;
            }
            return String.format(template, name, salary);
        }
    }
}


