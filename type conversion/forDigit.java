class forDigit {
  public static void main(String[] args) {

    // create int variables
    int num1 = 1;
    int num2 = 13;

    // convert int to char
    // for value between 0-9
    char a = Character.forDigit(num1, 10);

    // for value between 0-9
    char b = Character.forDigit(num2, 16);

    // print value
    System.out.println(a);    // 1
    System.out.println(b);    // d
  }
}
