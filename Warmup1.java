public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !(weekday == true && vacation == false);

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile == true || bSmile == true) || (aSmile == true && bSmile == true);
    }

    public int sumDouble(int a, int b) {
        if (a == b)
            return 2 * (a + b);
        else
            return (a + b);
    }

    public int diff21(int n) {
        if (n > 21)
            return 2 * Math.abs(n - 21);
        else
            return Math.abs(n - 21);

    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        int sum = a + b;
        if (a == 10 || b == 10)
            return true;
        else if (sum == 10)
            return true;
        else
            return false;
    }

    public boolean nearHundred(int n) {
        int V1 = Math.abs(n - 100);
        int V2 = Math.abs(n - 200);
        return (V1 <= 10 || V2 <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative)
            return (a < 0 && b < 0);
        else
            return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    public String notString(String str) {
        if (!str.startsWith("not"))
            return "not " + str;
        return str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str.length() <= 1)
            return str;
        else
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);

    }

    public String front3(String str) {
        if (str.length() >= 3)
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        else
            return str + str + str;
    }

    public String backAround(String str) {
        if (str.length() <= 1)
            return str + str + str;
        else
            return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        if (str.length() <= 2)
            return str + str + str;
        else
            return str.substring(0, 2) + str + str.substring(0, 2);
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");

    }

    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100));
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13);
    }

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b < 13 || b > 19))
            return true;
        else if ((b >= 13 && b <= 19) && (a < 13 || a > 19))
            return true;
        else
            return false;

    }

    public String delDel(String str) {
        if (str.startsWith("del", 1))
            return str.replace("del", "");
        else
            return str;
    }

    public boolean mixStart(String str) {
        if (str.startsWith("ix", 1))
            return true;
        else
            return false;

    }

    public String startOz(String str) {
        if (str.startsWith("oz"))
            return "oz";
        else if (str.startsWith("o"))
            return "o";
        else if (str.startsWith("z", 1))
            return "z";
        else
            return "";
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    public int close10(int a, int b) {
        int temp1 = Math.abs(a - 10);
        int temp2 = Math.abs(b - 10);
        if (temp1 == temp2)
            return 0;
        else if (temp1 > temp2)
            return b;
        else
            return a;
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40))
            return true;
        else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50))
            return true;
        else
            return false;
    }

    public int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20))
            return Math.max(a, b);
        else if (a >= 10 && a <= 20)
            return a;
        else if (b >= 10 && b <= 20)
            return b;
        return 0;
    }

    public boolean stringE(String str) {
        int nr = 0;

        int index = str.indexOf("e");
        while (index != -1) {
            nr++;
            index = str.indexOf("e", index + 1);
        }
        return nr <= 3 && nr >= 1;
    }

    public boolean lastDigit(int a, int b) {
        int lasta = a % 10;
        int lastb = b % 10;
        return lasta == lastb;
    }

    public String endUp(String str) {
        String sufix;
        if (str.length() <= 3)
            return str.toUpperCase();
        sufix = str.substring(str.length() - 3);
        return str.substring(0, str.length() - 3) + sufix.toUpperCase();

    }

    public String everyNth(String str, int n) {
        String gol = "";
        for (int i = 0; i < str.length(); i = i + n) {
            gol = gol + str.charAt(i);

        }
        return gol;
    }

}