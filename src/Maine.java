public class Maine {
    public static void main(String[] args) {
        long customerАccount = 100;
        long topupАmount = 1100;
        int limit = 1000;
        long bonus;
        if (topupАmount > limit) {
            bonus = topupАmount / 100;
        } else {
            bonus = 0;
        }
long amountcredited = customerАccount + topupАmount + bonus;
        System.out.println(bonus);
    }
}
