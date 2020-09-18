public class Bonus {
    public static void main(String[] args) {
        long balance =  100;
        long transfer = 900;
        long bonus = transfer / 100;
        if (bonus < 10) {
            bonus = 0;
        }
        long total = balance + transfer + bonus;
        System.out.println(bonus);
        System.out.println(total);
    }
}
