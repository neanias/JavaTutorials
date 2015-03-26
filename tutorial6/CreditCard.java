import java.lang.Override;
import java.lang.String;
import java.util.Calendar;

public class CreditCard {
  // Expiry date
  private int expiryMonth, expiryYear;
  // Card name
  private String firstName, lastName;
  // Card number
  private String ccNumber;

  public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
    this.expiryMonth = expiryMonth;
    this.expiryYear = expiryYear;
    this.firstName = firstName;
    this.lastName = lastName;
    this.ccNumber = ccNumber;
  }

  public String formatExpiryDate() {
    String shortYear = Integer.toString(expiryYear).substring(2, 4);
    return expiryMonth + "/" + shortYear;
  }

  public String formatFullName() {
    return firstName + " " + lastName;
  }

  public String formatCCNumber() {
    String[] formattedNumber = new String[4];
    for (int i = 0; i < formattedNumber.length; i++) {
      int idx = i * 4;
      formattedNumber[i] = ccNumber.substring(idx, idx + 4);
    }

    return String.format("%s %s %s %s", (Object[]) formattedNumber);
  }

  public boolean isValid() {
    Calendar now = Calendar.getInstance();

    if (expiryYear < now.get(Calendar.YEAR)) {
      return false;
    } else if (expiryYear == now.get(Calendar.YEAR) &&
            expiryMonth < now.get(Calendar.MONTH))
      return false;
    else
      return true;
  }

  public String toString() {
    return "Number: " + formatCCNumber() + "\n" +
            "Expiration date: " + formatExpiryDate() + "\n" +
            "Account holder: " + formatFullName() + "\n" +
            "Is valid: " + isValid() + "\n";
  }
}
