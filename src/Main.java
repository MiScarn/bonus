public class Main {
    public static void main(String[] args) {
        int initial = 100;
        int depositAmount = 1200;
        int percent;
        if (depositAmount > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = depositAmount / 100 * percent;
        System.out.println(initial + depositAmount + bonus);
        System.out.println(depositAmount / 100 * percent);

    }
}