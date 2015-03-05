public class AbsolutePath {
  public static String ensureAbsolute(String path) {
    if (path.startsWith("/"))
      return path;
    else
      return (System.getProperty("user.dir") + "/" + path);
  }

  public static String[] absoluteSplitPath(String s) {
    String[] pathArray = SplitPathName.splitPath(s);

    pathArray[0] = ensureAbsolute(pathArray[0]);

    return pathArray;
  }

  public static void main(String[] args) {
    for (String arg : args) {
      String[] components = absoluteSplitPath(arg);

      System.out.printf("File: %s Type: %s [%s]", components[1], components[3], components[0]);
      System.out.println();
    }
  }
}
