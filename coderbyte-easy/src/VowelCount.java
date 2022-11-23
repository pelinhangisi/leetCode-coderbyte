/*Have the function VowelCount(str)take the str string parameter being passed and return the number of vowels
the string contains.
("All cows eat grass and moo" would return 8)
Do not count y as a vowel for this challange.*/


public class VowelCount {

    public static int VowelCount(String str) {

        String str2 = str.toLowerCase();
        String[] arr = str2.split("");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a")
                    || arr[i].equals("e")
                    || arr[i].equals("i")
                    || arr[i].equals("o")
                    || arr[i].equals("u")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Count : " + VowelCount("hello"));
        System.out.println("Count : " + VowelCount("coderbyte"));
        System.out.println("Count : " + VowelCount("hello world"));
        System.out.println("Count : " + VowelCount("its my birthday and i'm solving algorithm questions"));
        System.out.println("Count : " + VowelCount("java"));
    }
}
