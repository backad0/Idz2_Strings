public class StringService {
    public static int countStrings(String[] string_array, char symbol) {
        int count = 0;

        for (String value : string_array) {
            if (value == null) {
                continue;
            }
            if (value.charAt(0) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int getEqualsStrings(String[] string_array, String word) {
        int count = 0;
        for (String value : string_array) {
            if (value == null) {
                continue;
            }
            if (value == word) {
                count++;
            }
        }
        return count;
    }

    public static int getUnics(String[] string_array, String word) {
        int count = 0;
        for (String value : string_array) {
            if (value == null) {
                continue;
            }
            if (value.indexOf(word) == -1) {
                count++;
            }
        }
        return count;
    }

    public static int getOnesEnters(String[] string_array, String word) {
        int count = 0;
        for (String value : string_array) {
            if (value == null) {
                continue;
            }
            if ((value.indexOf(word) == value.lastIndexOf(word))&&(value.indexOf(word)!=-1)) {
                count++;
            }
        }
        return count;
    }
}
