package hello;

import java.io.PrintWriter;
public class HelloWorld {

  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Hello, GitHub! Edits");
    pen.flush();
  } // main(String[])

}
