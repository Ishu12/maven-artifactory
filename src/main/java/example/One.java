package example;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }
//Check Polling
//check webhook
  public void uncoveredMethod() {
    System.out.println(foo());
    
  }
}
