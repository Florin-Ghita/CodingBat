public class String3 {

    public int countYZ(String str) {
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str1.charAt(i))) {
                if (str1.charAt(i - 1) == 'z' || str1.charAt(i - 1) == 'y') {
                    count++;

                }

            }

        }
        if (str1.charAt(str1.length() - 1) == 'z' || str1.charAt(str1.length() - 1) == 'y') {
            count++;

        }
        return count;
    }

    public String withoutString(String base, String remove) {
        return base.replaceAll(remove.toLowerCase(), "").replaceAll(remove.toUpperCase(), "").replaceAll(remove, "");
    }

    public boolean equalIsNot(String str) {

        int countIs = getCount(str, "is");
        int countNot = getCount(str, "not");

        return countIs == countNot;
    }

    int getCount(String str, String target) {
        int count = 0;
        for (int index = str.indexOf(target); index != -1; index = str.indexOf(target, index + target.length())) {
            count++;
        }

        return count;
    }

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            char curent = str.charAt(i);
            if (curent == 'g') {
                if (i != 0 && str.charAt(i - 1) == 'g') {
                    continue;
                }

                if (i == str.length() - 1) {
                    return false;
                }

                if (str.charAt(i + 1) != 'g') {
                    return false;
                }
            }

        }
        return true;

    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2))
                count++;
        }
        return count;
    }

    public int sumDigits(String str) {
        int rez = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                rez += str.charAt(i) - '0';

        }
        return rez;
    }

    public String sameEnds(String string) {
        int len = string.length();
        String rez = "";
        String temp = "";

        for (int i = 0; i < len; i++) {
            temp += string.charAt(i);
            int templen = temp.length();
            if (i < len / 2 && temp.equals(string.substring(len - templen, len)))
                rez = temp;
        }
        return rez;
    }

    public String mirrorEnds(String string) {
        String rez = "";

        for (int i = 0, j = string.length() - 1; i <= j; i++, j--) {
            if (string.charAt(i) == string.charAt(j))
                rez = rez.concat(string.substring(i, i + 1));
            else
                break;
            // continue;
        }
        if (string.length() % 2 == 1 &&
                string.length() / 2 + 1 == rez.length()) {
            return string;
        }
        {

        }
        return rez;
    }

    public int maxBlock(String str) {
        int count = 0;
        int len = str.length();
        int count2 = 1;
        if (len == 0)
            return 0;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && str.charAt(i) == str.charAt(i + 1))
                count2++;
            else
                count2 = 1;

            if (count2 > count)
                count = count2;
        }
        return count;
    }

    public int sumNumbers(String str) {
        int sum = 0;
        String nr = "";
        // boolean button = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    nr += str.charAt(i);
                } else {
                    nr += str.charAt(i);
                    sum += Integer.parseInt(nr);
                    nr = "";
                }
            }

        }
        return sum;
    }

    public String notReplace(String str) {
        String result = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
                    || i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
                result += str.charAt(i);
            } else if (i + 1 < len && str.substring(i, i + 2).equals("is")) {
                result += "is not";
                i++;
            } else
                result += str.charAt(i);
        }
        return result;
    }

}
