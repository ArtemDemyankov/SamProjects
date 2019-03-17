package task6;

public class ATM {
    private int numOf20;
    private int numOf50;
    private int numOf100;

    public ATM(int numOf20, int numOf50, int numOf100) {
        this.numOf20 = numOf20;
        this.numOf50 = numOf50;
        this.numOf100 = numOf100;
    }

    public void addMoney(int numOf20, int numOf50, int numOf100) {
        if (numOf20 < 0 || numOf50 < 0 || numOf100 < 0) {
            System.out.println("Ошибка!");
            return;
        }

        this.numOf20 += numOf20;
        this.numOf50 += numOf50;
        this.numOf100 += numOf100;
        System.out.println("Деньги добавлены!");
    }

    public boolean withdrawMoney(int money) {
        if (money < 0) {
            System.out.println("Ошибка!");
            return false;
        }

        if (money > getMoney()) {
            System.out.println("В банкомате недостаточно денег!");
            return false;
        }

        if (money % 10 != 0) {
            System.out.println("В банкомате нет таких купюр!");
            return false;
        }

        int getNumOf20;
        int getNumOf50;
        int getNumOf100;

        getNumOf100 = money / 100;
        numOf100 -= getNumOf100;
        money -= getNumOf100 * 100;
        getNumOf50 = money / 50;
        numOf50 -= getNumOf50;
        money -= getNumOf50 * 50;
        getNumOf20 = money / 20;
        numOf20 -= getNumOf20;
        money -= getNumOf20 * 20;

        System.out.println("Кол-во 100: " + getNumOf100 + "\nКол-во 50: " + getNumOf50
                + "\nКол-во 20: " + getNumOf20);

        return true;
    }

    private int getMoney() {
        return 20 * numOf20 + 50 * numOf50 + 100 * numOf100;
    }
}
