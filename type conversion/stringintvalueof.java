class stringintvalueof {
  public static void main(String[] args) {

    // create string variables
    String str1 = "643";
    String str2 = "1312";

    // convert String to int
    // using valueOf()
    int num1 = Integer.valueOf(str1);
    int num2 = Integer.valueOf(str2);

    // print int values
    System.out.println(num1);    // 643
    System.out.println(num2);    // 1312
  }
}
