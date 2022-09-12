public class SharedDigit {

    public class SharedDigit {

        public static boolean hasSharedDigit (int num1, int num2) {
            // Edge Cases
            if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
                return false;
            }

            // compare first digits and last digits
            if (num1 / 10 == num2 / 10 || num1 / 10 == num2 % 10 || num1 % 10 == num2 / 10 || num1 % 10 == num2 % 10) {
                return true;
            } else {
                return false;
            }
        }
    }

}
