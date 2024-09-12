import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
  private String birth;

  public void birthday() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String dateInString = this.birth;
    try {
      Date date = formatter.parse(dateInString);
      Date today = new Date();
      if ((today.getDate() == date.getDate()) && (today.getMonth() == date.getMonth())) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

}