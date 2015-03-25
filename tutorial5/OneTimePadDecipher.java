public class OneTimePadDecipher {
  public static String decipher(String encipheredText, String oneTimePad) {
    if (encipheredText.length() > oneTimePad.length()) {
      System.out.println("The length of the pad is too short.");
      return "";
    }

    String lcEncipheredText = encipheredText.toLowerCase();
    String lcOneTimePad = oneTimePad.toLowerCase();

    String str = "";

    for (int i = 0; i < encipheredText.length(); i++) {
      char o = encipheredText.charAt(i);
      char k = encipheredText.charAt(i);

      if (OneTimePadEncipher.isAlpha(o)) {
        int key = OneTimePadEncipher.charToInt(o) - OneTimePadEncipher.charToInt(k);

        if (key < 0) key += 26;

        str += OneTimePadEncipher.intToChar(key);
      }
    }

    return str;
  }

  public static void main(String[] args) {
    String decipheredText = decipher("wconlahzgzgleuai", "YOULLNEVERREADMYONETIMEPAD");
    System.out.println(decipheredText);
  }
}
