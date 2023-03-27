class parseDouble {
  public static void main(String[] args) {

    // create string variables
    String str1 = "23";
    String str2 = "456.6";

    // convert string to double
    // using parseDouble()
    double num1 = Double.parseDouble(str1);
    double num2 = Double.parseDouble(str2);

    // print double values
    System.out.println(num1);    // 23.0
    System.out.println(num2);    // 456.6
  }
}
