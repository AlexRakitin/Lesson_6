public class CreditCart {
    String accountNumber;
    int startSum;

    public CreditCart() {
    }

    public CreditCart(int startSum) {
        this.accountNumber = "1515-1212-1414-1616";
        this.startSum = 25;
    }
    public void outDataAccNumb() {
        System.out.println("Account number: " + this.accountNumber + "\n" + "Sum of beginning: " + this.startSum + " рублей ");
    }

    public void calc(int whatDoCard) {

        switch (whatDoCard) {
            case 1:
                System.out.println("Сумма положить деньги: ");
                break;
            case 2:
                System.out.println("Сумма снять деньги: ");
                break;
            case 3:
                System.out.println("Ваш баланс: ");
                break;
            default:
                System.out.println("Операция выбрана не верно!");
        }
    }


    private void sum(int b) {
        System.out.println(((b + this.startSum)));
    }

    private void subst(int b) {
        if (b <= this.startSum) {
            System.out.println(((this.startSum - b)));
        }else{
            System.out.println((("Недостаточно средств!")));
        }
    }

    public void outData() {
        System.out.println("Ваш баланс:" + this.startSum);
    }
}

