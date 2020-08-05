
import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) { // match the signature when overriding
    if (this == obj)
      return true;

    if (!(obj instanceof Point))
      return false;

    var other = (Point) obj; // downcasting
    return other.x == x && other.y == y;
  }

  @Override
  public int hashCode() { // hash the content of an object as the hashcode
    return Objects.hash(x, y);// this method can take multiple args
  }
}
