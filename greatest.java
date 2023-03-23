class greatest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int num3 = 4;
        
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
