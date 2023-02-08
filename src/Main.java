public class Main {
    public static void main(String[] args) {
        int initial = 500;
        int depositAmount = 2000;
        int percent;
        if (depositAmount > 1000) {
            percent = 10;
        } else {
            percent = 0;
        }
        int bonus = depositAmount / 100 * percent;
        System.out.println(initial + depositAmount + bonus);
        System.out.println(depositAmount / 100 * percent);

    }
}