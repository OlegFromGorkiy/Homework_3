public class Task_2 {
    /*
        Ниже дан список различных значений. Инициализируйте переменные, используя изученные ранее типы переменных.
        Значения:
        27.12
        987 678 965 549
        2,786
        false
        569
        -159
        27897
        67
     */
    float f1 = 27.12f;
    long l = 987_678_965_549L;
    double d = 2.786;
    boolean condition = false;
    char c = 569;
    short s = -159;
    int i = 27879;
    byte b = 67;

    public static void solution() {
        String[] numbers = {"27.12", "987 678 965 549", "2,786", "false", "569", "-159", "27897", "67"};
        String[] types = {"float", "long", "double", "boolean", "char", "short", "int", "byte"};
        String template = "Числу %s подойдет тип переменных %s.";
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(template, numbers[i], types[i]);
            if (i != numbers.length - 1) System.out.print("\n");
        }
    }
}

