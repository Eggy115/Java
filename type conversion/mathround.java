class mathround {
  public static void main(String[] args) {

    // create double variables
    double a = 99.99D;
    double b = 52.11D;

    // convert double into int
    // using typecasting
    int c = (int)Math.round(a);
    int d = (int)Math.round(b);

    System.out.println(c);    // 100
    System.out.println(d);    // 52
  }
}
