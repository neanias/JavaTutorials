public class DNAStrandTester {
  public static void summarise(DNAStrand dna) {
    System.out.println("Original DNA Sequence: " + dna);
    if (dna.isValidDNA()) {
      System.out.println("Is valid");
      System.out.println("Complement: " + dna.complementWC());
      System.out.println("WC Palindrome: " + dna.palindromeWC());
    }
    else {
      System.out.println("Not Valid DNA");
    }
  }

  public static void main(String[] args) {
    DNAStrand dna1 = new DNAStrand("ATGC");
    DNAStrand dna2 = new DNAStrand("GTCAGAT");
    DNAStrand dna3 = new DNAStrand("AFgSTAS");

    summarise(dna1);
    summarise(dna2);
    summarise(dna3);
  }
}
