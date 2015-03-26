import java.lang.Override;
import java.lang.String;

public class DNAStrand {
  private String dna;

  public DNAStrand(String dna) {
    this.dna = dna;
  }

  public boolean isValidDNA() {
    boolean[] isValid = new boolean[dna.length()];
    for (int i = 0; i < dna.length(); i++) {
      char base = dna.charAt(i);

      if (base == 'A' || base == 'T' || base == 'G' || base == 'C')
        isValid[i] = true;
      else
        isValid[i] = false;
    }

    for (boolean test : isValid)
      if (test == false) return false;

    return true;
  }

  public String complementWC() {
    String complement = "";
    for (int i = 0; i < dna.length(); i++) {
      char base = dna.charAt(i);

      if (base == 'A')
        complement += "T";
      else if (base == 'T')
        complement += "A";
      else if (base == 'G')
        complement += "C";
      else if (base == 'C')
        complement += "G";
    }

    return complement;
  }

  public String palindromeWC() {
    String complement = complementWC();
    String reverse = "";

    for (int i = complement.length(); i > 0; i--) {
      reverse += complement.charAt(i - 1);
    }

    return reverse;
  }

  public boolean containsSequence(String seq) {
    return dna.contains(seq);
  }

  public String toString() {
    return dna;
  }
}
