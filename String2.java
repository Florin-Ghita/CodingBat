public class String2 {

    public String doubleChar(String str) {
        String res = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            res = res + str.charAt(i) + str.charAt(i);
        }
        return res;
    }

    public int countHi(String str) {
        int rez = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
                rez++;
        }
        return rez;
    }

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            }

            if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }

        }
        return dog == cat;

    }

    public int countCode(String str) {
        int rez = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e')
                rez++;
        }
        return rez;
    }

    public boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();

        }
        return a.substring(a.length() - b.length()).equals(b);
    }

    public boolean xyzThere(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("xyz"))

            return true;
        for (int i = 1; i <= str.length() - 3; i++) {

            if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))

                return true;

        }
        return false;

    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }

        }
        return false;
    }

    public boolean xyBalance(String str) {
        String mij = str.substring(str.length() / 2, str.length());
        if (str.length() == 0) {
            return true;
        }
        if (str.charAt(str.length() - 1) == 'x' || str.length() < 1) {
            return false;

        }

        if (str.contains("x")) {

            return mij.contains("y");
        }
        return true;

    }

    public String mixString(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        String rez = "";

        int limit = Math.max(a.length(), b.length());

        for (int i = 0; i < limit; i++) {
            if (i < alen) {
                rez = rez + a.substring(i, i + 1);
            }
            if (i < blen) {
                rez = rez + b.substring(i, i + 1);
            }
        }
        return rez;
    }

    public String repeatEnd(String str, int n) {
        int len = str.length();
        String rez = "";
        for (int i = 0; i < n; i++) {
            rez += str.substring(len - n, len);
        }
        return rez;

    }

    public String repeatFront(String str, int n) {
        String rez = "";
        for (int i = n; i >= 0; i--) {
            rez = rez + str.substring(0, i);
        }
        return rez;

    }

    public String repeatSeparator(String word, String sep, int count) {
        String rez = "";
        for (int i = 0; i < count; i++) {
            if (i < count - 1)

                rez = rez + word + sep;
            else
                rez = rez + word;
        }
        return rez;
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length(); i++) {
            if (n + i <= str.length()) {
                if (prefix.equals(str.substring(i, i + n)))
                    return true;
            }

        }
        return false;
    }

    public boolean xyzMiddle(String str) {

        if (str.length() < 3)
            return false;

        int panaLaTarget = str.indexOf("xyz", str.length() / 2 - 2);
        int restu = str.length() - (panaLaTarget + 3);

        if (Math.abs(panaLaTarget - restu) <= 1) {
            return true;
        }

        return false;
    }

    public String getSandwich(String str) {
        int start = str.indexOf("bread");
        int end = str.lastIndexOf("bread");
        if (str.length() > 9) {
            return str.substring(start + 5, end);
        }
        return "";
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*')

                if (str.charAt(i - 1) != str.charAt(i + 1) && str.length() > 3) {
                    return false;
                }

        }
        return true;

    }

    public String oneTwo(String str) {
        String rez = "";
        for (int i = 0; i < str.length() - 2; i = i + 3) {

            rez += switchP(str.substring(i, i + 3));
        }
        return rez;
    }

    public String switchP(String coaie) {
        String rez = "";
        rez += coaie.charAt(1);
        rez += coaie.charAt(2);
        rez += coaie.charAt(0);
        return rez;
    }

    public String zipZap(String str) {
        String rez = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            rez += str.substring(i, i + 1);
            if (i > 0 && i < len - 1) {
                if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p')

                    rez = rez.substring(0, rez.length() - 1);
            }
        }
        return rez;
    }

    public String starOut(String str) {
        int len = str.length();
        String rez = "";

        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) != '*')
                rez += str.charAt(i);
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
                rez += str.charAt(i);
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
                rez = rez.substring(0, rez.length() - 1);
        }
        return rez;
    }

    public String plusOut(String str, String word) {
        int strl = str.length();
        int worl = word.length();
        String rez = "";
        String temp = "";
        for (int i = 0; i < strl; i++) {
            if (i <= strl - worl) {
                temp = str.substring(i, i + worl);
                if (temp.equals(word)) {
                    rez += word;
                    i += worl - 1;
                } else
                    rez += "+";
            } else
                rez += "+";
        }
        return rez;
    }

    public String wordEnds(String str, String word) {
        int lens = str.length();
        int lenw = word.length();
        String rez = "";
        for (int i = 0; i < lens - lenw + 1; i++) {
            String temp = str.substring(i, i + lenw);
            if (i > 0 && temp.equals(word))
                rez += str.substring(i - 1, i);
            if (i < lens - lenw && temp.equals(word))
                rez += str.substring(i + lenw, i + lenw + 1);
        }
        return rez;

    }

}
