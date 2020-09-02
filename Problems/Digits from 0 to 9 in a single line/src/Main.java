class Main {
    public static void main(String[] args) {
        // put your code here
        String numbers = "0 1 2 3 4 5 6 7 8 9";
        StringBuilder sbNumbers = new StringBuilder(numbers);
        numbers = sbNumbers.reverse().toString();

        System.out.println(numbers);
        /* for(int i = 0; i < 10; i--){
            System.out.print(i + " ");
        }

         */
    }
}
