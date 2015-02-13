public class SplitPathName {
  public static String[] splitPath(String s) {
    String[] pathParts = new String[4];

    int finalSlash = s.lastIndexOf("/");
    if (finalSlash != -1) {
      pathParts[0] = s.substring(0, finalSlash + 1);
      pathParts[1] = s.substring(finalSlash + 1);
    } else
      pathParts[1] = s;


    int finalDot = s.lastIndexOf(".");
    if (finalDot != -1) {
      pathParts[2] = s.substring(finalSlash, finalDot);
      pathParts[3] = s.substring(finalDot);
    } else
      pathParts[2] = s.substring(finalSlash);

    return pathParts;
  }

  public static void main(String[] args) {
    for (String arg : args) {
      String[] components = splitPath(arg);

      System.out.printf("File: %s Type: %s [%s]",
                        components[1], components[3], components[0]);
      System.out.println();
    }
  }
}
