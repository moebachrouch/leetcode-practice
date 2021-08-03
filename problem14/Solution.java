class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(solution.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        boolean common = true;
        boolean stillLetters = true;

        int i = 0;
        int j = 0;

        while (common && stillLetters) {

            String currentWord = strs[i];

            if (!currentWord.isBlank()) {
                Character currentCharacter = currentWord.charAt(j);
                System.out.println(res.toString());

                Character commonChar = strs[0].charAt(j);

                if (j == currentWord.length() - 1) {
                    stillLetters = false;
                }

                if (i == 0) {
                    i++;
                } else {
                    if (currentCharacter != commonChar) {
                        common = false;
                    }

                    if (i == strs.length - 1) {
                        if (common) {
                            res.append(currentCharacter);
                        }
                        i = 0;
                        j++;
                    } else {
                        i++;
                    }
                }
            }

        }

        return res.toString();
    }
}