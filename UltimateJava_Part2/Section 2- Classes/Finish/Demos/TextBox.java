// public class TextBox {
//   public String text = "";

//   public void setText(String text) {
//     this.text = text;
//   }

//   public void clear() {
//     text = "";
//   }
// }

//my solution
public class TextBox {
  public String text = ""; // always initialize field, otherwise this would be set to null

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = ""; // in this case do not need "this" key word binding
  }
}