public class Cube {
  Rectangle mFace;

  public Cube(Rectangle rectangle) {
    mFace = rectangle;
  }

  public int volume() {
    int length = mFace.getLength();
    return length * length * length;
  }

  public int surfaceArea() {
    return mFace.area() * 6;
  }

}
