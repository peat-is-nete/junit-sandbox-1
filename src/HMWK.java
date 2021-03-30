public class HMWK {


    /**
     * PROMPT 1
     ***********************************************/

    public static float maxOfTwoNumbers(float A, float B) {
        return (A > B) ? A : B;
    }

    /**
     * PROMPT 2
     ***********************************************/

    public static int maxOfThree(int a, int b, int c) {
        int max = 0;

        if (a > b) {
            if (a > c) {
                max = a;
            }
        }else {
            if (b>a){
                if(b>c){
                    max = b;
                }else{
                    max = c;

                }
            }
        }
        return max;
    }

    /**
     * PROMPT 3
     ***********************************************/

    public static boolean isCharacterAVowel(char input) {
        boolean vowel = false;
        char upperCase = Character.toUpperCase(input);

        if (upperCase == 'A' || upperCase == 'E') {
            vowel = true;
        } else if (upperCase == 'I' || upperCase == 'O') {
            vowel = true;
        } else if (upperCase == 'U') {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }

    /**
     * PROMPT 4
     ***********************************************/

    public static int numOfArgument(int... integers) {

        return integers.length;
    }

    /**
     * PROMPT 5
     ***********************************************/

    public static String reverseString(String toReverse) {

        String x = "";

        if (toReverse.length() > 0) {
            x += toReverse.charAt(toReverse.length() - 1);
            String y = reverseString(toReverse.substring(0, toReverse.length() - 1));
            x += y;
        }

        return x;

    }

}


