public class Dalek2 {
  private String[] sayings;

  public void setSayings(String[] sayings) {
    this.sayings = sayings;
  }

  public void speak() {
    int n = this.sayings.length;
    String utterance;
    int i;
    if (n > 0) {
      i = (int) (Math.random() * n);
      utterance = sayings[i];
    } else {
      utterance = "No sayings installed!";
    }

    System.out.println(utterance);
  }

  public static void main(String[] args) {

    Dalek2 d1 = new Dalek2();
    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
            "Daleks do not feel fear.", "The Daleks must survive!" };
    d1.setSayings(u1);

    System.out.println("\nDalek d1 says: ");
    for (int i = 0; i < 10; i++) {
      d1.speak();
    }

    System.out.println("\nDalek d2 says: ");
    Dalek2 d2 = new Dalek2();
    String[] u2 = { "I obey!" };
    d2.setSayings(u2);

    for (int i = 0; i < 10; i++) {
      d2.speak();
    }

  }
}
