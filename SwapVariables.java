class SwapVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
