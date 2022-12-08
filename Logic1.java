public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (!isWeekend && cigars >= 40 && cigars <= 60) {
            return true;
        } else if (isWeekend && cigars >= 40) {
            return true;
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        // int stil=you +date;
        if ((you >= 8 || date >= 8) && (you > 2 && date > 2)) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && temp >= 60 && temp <= 90) {
            return true;
        } else if (isSummer && temp >= 60 && temp <= 100) {
            return true;
        }
        {
            return false;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if ((isBirthday && speed <= 65) || (!isBirthday && speed <= 60)) {
            return 0;
        } else if ((isBirthday && speed >= 66 && speed <= 85) || (!isBirthday && speed >= 61 && speed <= 80)) {
            return 1;
        }
        {
            return 2;
        }
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day > 0 && day != 6) {
                return "10:00";
            }
            {
                return "off";
            }
        } else if (day > 0 && day != 6) {
            return "7:00";
        }
        {
            return "10:00";
        }
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        // else if (Math.abs(a+b)==6 || Math.abs(a-b)==6)
        else if (a + b == 6) {
            return true;
        } else if (b - a == 6 || a - b == 6)
            return true;
        return false;

    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            return n >= 1 && n <= 10;
        }
        return n < 1 || n <= 1 || n >= 10;
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        return (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0);
    }

    public boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;

    }

    public boolean nearTen(int num) {
        // return num % 10 == 0 || num % 10 == 1 || num % 10 ==2;
        if (num % 10 >= 8 || num % 10 <= 2)
            return true;

        return false;
    }

    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        }
        return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep) {
            if (isMorning && isMom) {
                return true;
            }

            else if (isMorning && !isMom) {
                return false;
            }
            return true;
        }

        return false;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        }
        return 1;

    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }
        if (str.startsWith("f")) {
            return "Fizz";
        }
        if (str.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        }
        if (n % 3 == 0) {
            return "Fizz!";
        }
        if (n % 5 == 0) {
            return "Buzz!";
        }
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || b + c == a || c + a == b) {
            return true;
        }
        return false;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk) {
            return (b > a && c > b);
        }
        return (c > b);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk) {
            return a < b && b < c;
        }
        return a <= b && b <= c;
    }

    public boolean lastDigit(int a, int b, int c) {
        int am = a % 10;
        int bm = b % 10;
        int cm = c % 10;
        if (am == bm && bm == cm) {
            return true;
        }
        if (am == bm) {
            return true;
        }
        if (bm == cm) {
            return true;
        }
        if (cm == am) {
            return true;
        }
        return false;
    }

    public boolean lessBy10(int a, int b, int c) {
        return (a - b >= 10 || Math.abs(b - c) >= 10 || c - a >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (!noDoubles) {
            return die1 + die2;
        }
        if (noDoubles && die1 == die2) {
            die1++;
            if (die1 == 7) {
                die1 = 1;
            }
            return die1 + die2;
        }

        return die1 + die2;

    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return b > a ? a : b;
        }
        if (a > b) {
            return a;
        }
        return b;

    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        // if (a !=b && b != c)
        // {
        // return 0
        // }
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || b == c || c == a) {
            return 10;
        }
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }
        if (ab - bc == 10 || ab - ac == 10) {
            return 5;
        }
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return (a % 10 == b % 10 || a % 10 == b / 10 || a / 10 == b % 10 || a / 10 == b / 10);
    }

    public int sumLimit(int a, int b) {
        String as = String.valueOf(a);

        int sum = a + b;
        String summ = String.valueOf(sum);
        if (summ.length() == as.length()) {
            return a + b;
        }
        return a;
    }

}
