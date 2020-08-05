
public abstract class UIControl {
  private boolean isEnabled = true;

  public UIControl(boolean isEnabled) { // there is no return type for constructor
    this.isEnabled = isEnabled;
  }

  public abstract void render(); // when inherited by other class, the other class need to provide concrete
                                 // implementation and match method signature

  public final void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}
