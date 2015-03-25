public class OneTimePadEncipher {
  public static int charToInt(char l) {
    int c = Character.toLowerCase(l) - 'a';
    return c;
  }

  public static char intToChar(int i) {
    return (char) (((i + 26) % 26) + 'a');
  }

  public static boolean isAlpha(char c) {
    int t = charToInt(c);
    if (t >= 0 && t < 26) {
      return true;
    }
    return false;
  }

  public static String encipher(String original, String oneTimePad) {
    if (original.length() > oneTimePad.length()) {
      System.out.println("The length of the OTP is too short");
      return "";
    }

    String lcPlaintext = original.toLowerCase();
    String lcOnetimepad = oneTimePad.toLowerCase();

    String newStr = "";
    for (int i = 0; i < lcPlaintext.length(); i++) {
      char o = lcPlaintext.charAt(i);
      char k = lcOnetimepad.charAt(i);

      if (isAlpha(o)) {
        newStr += intToChar(charToInt(o) + charToInt(k));
      }
      else {
        newStr += o;
      }
    }
    return newStr;
  }

  public static void main(String[] args) {
    String cipherText = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
    System.out.println(cipherText);
  }
}
