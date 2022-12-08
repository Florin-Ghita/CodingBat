public class Array3 {

    public int maxSpan(int[] nums) {
        if (nums.length == 0)
            return 0;

        int maxspan = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > maxspan) {
                        maxspan = span;
                        break;
                    }
                }
            }
        }
        return maxspan;
    }

    public int[] fix34(int[] nums) {
        int i = 0;
        while (i < nums.length && nums[i] != 3)
            i++;
        int j = i + 1;

        while (j < nums.length && nums[j] != 4)
            j++;
        while (i < nums.length) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;

                while (j < nums.length && nums[j] != 4)
                    j++;
            }
            i++;
        }
        return nums;
    }

    public int[] fix45(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && j > 0) {
                        if (nums[j - 1] != 4) {
                            int temp = nums[j];
                            nums[j] = nums[i + 1];
                            nums[i + 1] = temp;
                        }
                    } else if (j == 0 && nums[j] == 5) {
                        for (int k = 1; k < nums.length - 1; k++) {
                            if (nums[k + 1] != 5 && nums[k] == 4) {
                                int temp = nums[j];
                                nums[j] = nums[k + 1];
                                nums[k + 1] = temp;
                            }
                        }
                    }
                }
            }
        }

        return nums;
    }

    public boolean canBalance(int[] nums) {
        int sums = 0;

        for (int i = 0; i < nums.length; i++) {
            sums += nums[i];

            int sumd = 0;
            for (int j = nums.length - 1; j > i; j--) {
                sumd += nums[j];
            }

            if (sums == sumd)
                return true;
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        for (int i = 0; i < inner.length; i++) {
            int j = i;
            while (inner[i] > outer[j]) {
                j++;
                if (j == outer.length) {
                    return false;
                }
            }
            if (inner[i] != outer[j]) {
                return false;
            }

        }
        return true;
    }

    public int[] squareUp(int n) {

        int array[] = new int[n * n];

        for (int grup = 0; grup < n; grup++) {
            int[] g = faGrup(n, grup + 1);
            for (int i = 0; i < g.length; i++) {
                array[grup * n + i] = g[i];
            }
        }

        return array;
    }

    public int[] faGrup(int lungime, int maxim) {
        int[] rez = new int[lungime];

        for (int i = 0; i < lungime; i++) {
            if (i + maxim == lungime) {
                rez[i] = maxim;
                maxim--;
            } else {
                rez[i] = 0;
            }

        }

        return rez;
    }

    public int[] seriesUp(int n) {
        int[] rez = new int[n * (n + 1) / 2];

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                rez[count + j] = j + 1;
            }
            count += i;

        }
        return rez;
    }

    public int maxMirror(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    size = Math.max(size, count);
                    count = 0;
                }
            }

            size = Math.max(size, count);
        }

        return size;
    }

    public int countClumps(int[] nums) {
        boolean clump = false;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !clump) {
                clump = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                clump = false;
            }
        }
        return count;
    }

}
