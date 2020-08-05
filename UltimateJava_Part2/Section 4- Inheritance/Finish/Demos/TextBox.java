
public class TextBox extends UIControl {
  private String text = "";

  public TextBox() {
    super(true);// call base class first
  }

  @Override
  public void render() {
    System.out.println("Render TextBox");
  }

  @Override
  public String toString() {
    return text;// this method will be used when pass the object to println function
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}
