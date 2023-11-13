//William Han, Josh Zeng
public class MediaLib {
  private Book book;
  public static String owner = "PLTW";

  // Step 14
  private static int numEntries = 0;

  public void addBook(Book b) {
    if (book != null) {
      System.out.println("already book in here"); // Step 24
      return;
    }
    numEntries++; // Step 15
    book = b;
  }

  // new step 18-22
  /*
   * test scenario
   * public void testBook(Book tester)
   * {
   * tester.setTitle("Animal Farm");
   * // show state chagne with one of the following
   * System.out.println(" in test: " + tester);
   * System.out.println(" in test: " + tester.getTitle());
   * }
   */

  public String toString() {
    String info = "";

    // Step 5, avoid crashing by testing that book is not null before using its
    // toString method
    if (book != null)
      info += "Book: " + book + "\n";

    return info;
  }

  // Step 1
  public static String getOwner() {
    return owner;
  }

  // Step 8
  public static void changeOwner(String newOwner) {
    owner = newOwner;
  }

  // Step 14
  public int getNumEntries() {
    System.out.println("Test: Owner is " + owner);
    return numEntries;
  }
}
