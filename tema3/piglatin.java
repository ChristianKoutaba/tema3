public class piglatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence in English: ");
        String sentence = scanner.nextLine();
        System.out.println("Translated sentence in Pig Latin: " + translateToPigLatin(sentence));
        scanner.close();
    }
    public static String translateToPigLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            result.append(translateWordToPigLatin(word)).append(" ");
        }
        return result.toString().trim();
    }
    public static String translateWordToPigLatin(String word) {
        if (startsWithVowelSound(word)) {
            return word + "ay";
        }
        int vowelIndex = findFirstVowelIndex(word);
        String prefix = word.substring(0, vowelIndex);
        String suffix = word.substring(vowelIndex);
        return suffix + prefix + "ay";
    }
    public static boolean startsWithVowelSound(String word) {
        word = word.toLowerCase();
        return word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")
                || word.startsWith("xr") || word.startsWith("yt") || (word.startsWith("y") && !isConsonant(word.charAt(1)));
    }
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }
    public static int findFirstVowelIndex(String word) {
        int index = 0;
        while (index < word.length() && !startsWithVowelSound(word.substring(index))) {
            index++;
        }
        return index;
    }
}