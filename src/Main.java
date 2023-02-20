public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] monthlySalary = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < monthlySalary.length; i++) {
            sum = sum + monthlySalary[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] monthlySalary = generateRandomArray();
        int max = 0;
        int min = 200000;
        for (int i = 0; i < monthlySalary.length; i++) {
            if (min>monthlySalary[i]) {
                min = monthlySalary[i];
            }
            if (max<monthlySalary[i]) {
                max = monthlySalary[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей, а максимальная составила "+max+" рублей.");
        }
    public static void task3() {
        System.out.println("Задача 3");
        int[] monthlySalary = generateRandomArray();
        int sum = 0;
        float delta;
        for (int i = 0; i < monthlySalary.length; i++) {
            sum = sum + monthlySalary[i];
        }
        delta = sum/monthlySalary.length;
        System.out.println("Средняя сумма трат за месяц составила  "+delta+" рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}