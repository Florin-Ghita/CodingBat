public class Array1 {

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6)
            return true;
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[] { 3, 1, 4 };
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[] { nums[1], nums[2], nums[0] };
    }

    public int[] reverse3(int[] nums) {
        return new int[] { nums[2], nums[1], nums[0] };
    }

    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            return new int[] { nums[0], nums[0], nums[0] };
        }
        {
            return new int[] { nums[2], nums[2], nums[2] };
        }

    }

    public int sum2(int[] nums) {
        if (nums.length < 2 && nums.length > 0)
            return nums[0];
        else if (nums.length == 0) {
            return 0;
        }
        {
            return nums[1] + nums[0];

        }
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[] { a[1], b[1] };
    }

    public int[] makeEnds(int[] nums) {
        return new int[] { nums[0], nums[nums.length - 1] };
    }

    public boolean has23(int[] nums) {
        if (nums[1] == 2 || nums[1] == 3 || nums[0] == 2 || nums[0] == 3) {
            return true;
        }
        {
            return false;
        }
    }

    public boolean no23(int[] nums) {
        if (nums[1] == 2 || nums[1] == 3 || nums[0] == 2 || nums[0] == 3) {
            return false;
        }
        {
            return true;
        }
    }

    public int[] makeLast(int[] nums) {
        int[] num = new int[nums.length * 2];
        num[nums.length * 2 - 1] = nums[nums.length - 1];
        {
            return num;
        }
    }

    public boolean double23(int[] nums) {
        if (nums.length != 1 && nums.length != 0)
            return (nums[0] == 2 && nums[1] == 2 || (nums[0] == 3 && nums[1] == 3));
        else
            return false;
    }

    public int[] fix23(int[] nums) {

        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }

        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return new int[] { nums[0], nums[1], nums[2] };
    }

    public int start1(int[] a, int[] b) {
        int rez = 0;

        if (a.length > 0 && a[0] == 1)
            rez++;
        if (b.length > 0 && b[0] == 1)
            rez++;
        return rez;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if ((a[0] + a[1]) > (b[0] + b[1]))
            return new int[] { a[0], a[1] };
        if ((a[0] + a[1]) == (b[0] + b[1]))
            return new int[] { a[0], a[1] };
        return new int[] { b[0], b[1] };

    }

    public int[] makeMiddle(int[] nums) {
        int am = (nums.length / 2) - 1;
        int amm = nums.length / 2;
        return new int[] { nums[am], nums[amm] };
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[] { a[0], a[1], b[0], b[1] };
    }

    public int[] swapEnds(int[] nums) {
        int pref = nums[0];
        int suf = nums[nums.length - 1];
        nums[0] = suf;
        nums[nums.length - 1] = pref;
        return nums;
    }

    public int[] midThree(int[] nums) {
        return new int[] { nums[(nums.length / 2) - 1], nums[nums.length / 2], nums[(nums.length / 2) + 1] };
    }

    public int maxTriple(int[] nums) {
        int pref = nums[0];
        int mij = nums[(nums.length) / 2];
        int suf = nums[nums.length - 1];
        int rez = 0;
        if (pref > mij && pref > suf) {
            rez = pref;
        }

        if (mij > pref && mij > suf) {
            rez = mij;

        }
        if (suf > pref && suf > mij) {
            rez = suf;
        }

        return rez;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        } else if (nums.length == 1) {
            return new int[] { nums[0] };
        } else {
            return new int[] { nums[0], nums[1] };
        }

    }

    public boolean unlucky1(int[] nums) {
        if (nums.length >= 2) {
            return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)
                    || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
        } else if (nums.length == 1) {
            return false;
        } else {
            return false;
        }
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            return new int[] { b[0], b[1] };

        } else if (a.length == 1) {
            return new int[] { a[0], b[0] };
        }

        return new int[] { a[0], a[1] };
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length > 1) {
            return new int[] { b[0] };
        } else if (b.length == 0 && a.length > 1) {
            return new int[] { a[0] };
        } else if (a.length == 0 && b.length == 0) {
            return new int[0];
        }
        return new int[] { a[0], b[0] };
    }

}
