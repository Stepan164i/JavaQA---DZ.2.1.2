public class Main {
    public static void main(String[] args) {
        long clientАcount = 100;
        long topUpАmount = 1100;
        int limit = 1000;
        long bonus;
        if (topUpАmount > limit) {
            bonus = topUpАmount / 100;
        } else {
            bonus = 0;
        }
        long amountCredited = clientАcount + topUpАmount + bonus;
        System.out.println(bonus);
    }
}
