
public final class CheckBox extends UIControl {
  public CheckBox() {
    super(true);// need to construct parent class first
  }

  @Override
  public void render() {
    System.out.println("Render CheckBox");
  }
}
