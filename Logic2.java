public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        int tresholdBig = goal / 5;
        if (tresholdBig >= big) {
            return goal - big * 5 <= small;
        }
        return goal - tresholdBig * 5 <= small;

    }

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        if (c == b) {
            return a;
        }
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);

    }

    public int round10(int n) {
        if (n % 10 < 5) {
            return n - (n % 10);
        }
        return n + (10 - (n % 10));
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        return false;
    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21)

        {
            return b;
        } else if (b > 21)

        {
            return a;
        }

        int sumA = 21 - a;
        int sumB = 21 - b;

        if (sumA > sumB) {
            return b;
        }
        return a;

    }

    public boolean evenlySpaced(int a, int b, int c) {
        int difa = 0;
        int difb = 0;
        int difc = 0;
        difa = Math.abs(a - b);
        difb = Math.abs(a - c);
        difc = Math.abs(b - c);
        // difc = Math.abc(c - b);

        if (a == b && a == c) {
            return true;
        }

        if (a == b || b == c || a == c) {
            return false;
        }

        if (difa == difb) {
            return true;
        }
        if (difb == difc) {
            return true;
        }

        if (difa == difc) {
            return true;
        }
        return false;
    }

    public int makeChocolate(int small, int big, int goal) {
        int tresholdBig = goal / 5;
        int tresholdSmall = 0;

        if (tresholdBig >= big) {

            tresholdSmall = goal - big * 5;
        } else {
            tresholdSmall = goal - tresholdBig * 5;
        }
        if (tresholdSmall <= small) {
            return tresholdSmall;
        }
        return -1;

    }

}
