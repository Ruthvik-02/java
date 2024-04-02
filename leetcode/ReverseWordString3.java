public class ReverseWordString3 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();

            result.append(sb);
            result.append(" ");
        }

        return result.toString().trim();
    }
}
