public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length())
                + str.substring(str.length() - 2, str.length());
    }

    public String firstTwo(String str) {
        if (str.length() > 2)
            return str.substring(0, 2);
        return str;
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        int la = a.length();
        int lb = b.length();
        if (la < lb) {
            return a + b + a;
        }
        return b + a + b;
    }

    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);

    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }

    public String withouEnd2(String str) {
        int len = str.length();
        if (len < 3)
            return "";
        else
            return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int jum = str.length() / 2;
        return str.substring(jum - 1, jum + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        if (str.length() == 3)
            return str;
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        String str1 = str.substring(0, 3);
        if (str1.equals("bad")) {
            return true;
        }

        if (str.length() < 4) {
            return false;
        }
        String str2 = str.substring(1, 4);
        return str2.equals("bad");

    }

    public String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        }

        if (str.length() < 2) {
            return str + "@";
        }

        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0)
            a = "@";

        if (b.length() == 0)

            b = "@";

        return a.substring(0, 1) + b.substring(b.length() - 1);

    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }
        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0, 1)))
            return a + b.substring(1, b.length());
        {

        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2)
            return str;
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;

        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return true;
        } else
            return false;
    }

    public String minCat(String a, String b) {
        int la = a.length();
        int lb = b.length();
        if (la == lb) {
            return a + b;
        }
        if (la > lb) {
            int dif = la - lb;
            return a.substring(dif, a.length()) + b;
        } else {
            int dif = b.length() - a.length();
            return a + b.substring(dif, b.length());
        }
    }

    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    public String without2(String str) {
        int len = str.length();
        if (len == 2) {
            return "";
        }
        if (len < 2) {
            return str;
        } else {
            if (str.substring(0, 2).equals(str.substring(len - 2, len))) {
                return str.substring(2, len);
            } else
                return str;
        }
    }

    public String deFront(String str) {
        String rez = "";
        if (str.charAt(0) == 'a') {
            rez = rez + str.charAt(0);
        }

        if (str.charAt(1) == 'b') {
            rez += str.charAt(1);
        }
        return rez + str.substring(2, str.length());

    }

    public String startWord(String str, String word) {
        int lenstr = str.length();
        int lenword = word.length();
        if (lenstr == 0)
            return "";
        if (lenword > lenstr)
            return "";
        if (word.length() == 1)
            return str.substring(0, 1);
        else if (str.substring(1, lenword).equals(word.substring(1, lenword))) {
            return str.substring(0, lenword);
        }

        return "";
    }

    public String withoutX(String str) {
        if (str.length() <= 2) {
            return str.replaceAll("x", "");
        }
        return str.substring(0, 1).replaceAll("x", "") +
                str.substring(1, str.length() - 2) +
                str.substring(str.length() - 2).replaceAll("x", "");

    }

    public String withoutX2(String str) {
        if (str.length() >= 2) {
            return (str.substring(0, 2).replaceAll("x", "") + str.substring(2, str.length()));
        }
        return str.substring(0, str.length()).replaceAll("x", "");
    }

}
