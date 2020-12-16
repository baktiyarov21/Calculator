public class Rectahgle extends Figure{
    int a;
    int b;
    float result;

    public Rectahgle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perimeter() {
        System.out.print(a * b);
    }

    public void perimeter(int j) {
      result = j / (a * b);
        System.out.println(result);
    }

    public void per(int v) {
        System.out.println(v*a);
    }
}
