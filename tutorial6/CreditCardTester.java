public class CreditCardTester {
  public static void main(String[] args) {
    CreditCard cc1 = new CreditCard(10, 2014, "Bob", "Jones", "1234567890123456");
    CreditCard cc2 = new CreditCard(10, 2015, "Bob", "Jones", "2345678901234567");
    CreditCard cc3 = new CreditCard(2, 2017, "William", "Mathewson", "4751170001601727");

    System.out.println(cc1.toString());
    System.out.println(cc2.toString());
    System.out.println(cc3.toString());
  }
}
