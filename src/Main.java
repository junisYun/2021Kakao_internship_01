public class Main {
    public static void main(String[] args) {
        String s = "23four5six7";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        String answer = "";
        String[] wordArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String tmp = "";
        for(char ch : s.toCharArray()) {
            if(!Character.isDigit(ch)) {
                tmp += ch;
            } else {
                answer += ch;
            }
            for(int i = 0; i < wordArr.length; i++) {
                if(tmp.equals(wordArr[i])) {
                    answer += i;
                    tmp = "";
                }
            }
        }
        return Integer.parseInt(answer);
    }
}