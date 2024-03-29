package week6;

public class CreditCard {

    private long number;

    public String owner;

    private int point;

    private int balance;

    public void use(int amount){
        balance += amount;
        System.out.println("현재 카드 사용액: " + balance);
    }

    public void payBill(int amount){
        point += amount/1000;
        System.out.println("보너스 포인트: " + point);
    }

    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
        myCard.number = 3456_7654_8765_5647L;
        myCard.owner = "이수강";
        System.out.print("카드번호 : " + myCard.number);
        System.out.println(", 카드소유자: " + myCard.owner);
        myCard.use(300000);
        myCard.payBill(100000);
    }
}
