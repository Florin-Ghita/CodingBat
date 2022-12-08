public class Warmup2 {

    public String stringTimes(String str, int n) {
        String asd = "";
        for (int i = 0; i < n; i++)
            asd = asd + str;
        return asd;

    }

    public String frontTimes(String str, int n) {
        String pref = "";
        String rez = "";

        if (str.length() < 3) {
            pref = str;
        } else {
            pref = str.substring(0, 3);
        }

        for (int i = 0; i < n; i++) {
            rez += pref;
        }

        return rez;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
            if (str.substring(i, i + 2).equals("xx"))
                count++;
        return count;
    }

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i + 1 >= str.length())
            return false;
        return str.substring(i + 1, i + 2).equals("x");
    }

    public String stringBits(String str) {
        String rez = "";
        for (int i = 0; i < str.length(); i = i + 2)
            rez += str.charAt(i);
        return rez;
    }

    public String stringSplosion(String str) {
        String rez = "";
        for (int i = 0; i <= str.length(); i++)
            rez += str.substring(0, i);
        return rez;
    }

    public int last2(String str) {
        if (str.length() < 2)
            return 0;
        String sufix = str.substring(str.length() - 2);
        int count = 0;
        int index = str.indexOf(sufix);
        while (index != -1) {
            index = str.indexOf(sufix, index + 1);

            count++;
        }
        return count - 1;
    }

    public int arrayCount9(int[] nums) {
        int i = 0;
        int nr = 0;
        for (i = 0; i < nums.length; i++)
            if (nums[i] == 9)
                nr++;
        return nr;
    }

    public boolean arrayFront9(int[] nums) {

        for (int i = 0; i < nums.length && i < 3; i++)
            if (nums[i] == 9)
                return true;

        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len - 1; i++) {
            String groupa = a.substring(i, i + 2);
            String groupb = b.substring(i, i + 2);
            if (groupa.equals(groupb)) {
                count++;
            }

        }

        return count;

    }

    public String stringX(String str) {
        if (str.length() <= 2) {
            return str;
        }
        char prefix = str.charAt(0);
        char sufix = str.charAt(str.length() - 1);
        String mij = str.substring(1, str.length() - 1);
        return prefix + mij.replace("x", "") + sufix;

    }

    public String altPairs(String str) {
        String rezultat = "";
        for (int i = 0; i < str.length(); i = i + 4) {
            rezultat = rezultat + str.charAt(i);

            if (i < str.length() - 1) {
                rezultat = rezultat + str.charAt(i + 1);
            }
        }
        return rezultat;
    }

    public String stringYak(String str) {
        return str.replace("yak", "");
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2])
                return false;
        return true;

    }

    public boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {

                return true;
            }
        return false;

    }

}
