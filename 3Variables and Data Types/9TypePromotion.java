class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println("a+b is "+(a+b));
        System.out.println("b-a is "+(b-a));
        // char c = a - b Error converting from char to int and storing in char
        short s = 5;
        byte b1 = 25;
        char A = 'A';
        // byte bt = s + b1 + A; Error because possible lossy conversions from int to byte
        byte bt = (byte)(s + b1 + A); //using type casting everything possible
        System.out.println(bt); // 5 + 25 + A(65) = 95

        // 2nd principle ->
        int int1 = 40;
        float flo1 = 128.193028f;
        long long1 = 9123;
        double double1 = 12908.123890;
        // int resulttest = int1 + flo1 + long1 + double1; error lossy conversion from double to int
        double result = int1 + flo1 + long1 + double1;
        System.out.println(result);
    }
}