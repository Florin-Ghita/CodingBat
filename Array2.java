public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);

        }
        return (sum - max - min) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13)
                sum += nums[i];
            else if (nums[i] == 13 && i < nums.length - 1) {
                nums[i] = 0;
                nums[i + 1] = 0;
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        boolean aduna = true;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                aduna = false;
            }
            if (aduna) {
                sum += nums[i];

            }
            if (nums[i] == 7) {
                aduna = true;
            }

        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1] && nums[i] == 2)

                return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3)

                return false;
        }
        return true;

    }

    public boolean sum28(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                count++;
        }
        return count * 2 == 8;
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count1++;
            else if (nums[i] == 4)
                count4++;
        }
        return count1 > count4;
    }

    public int[] fizzArray(int n) {
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        return nums;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4)
                return false;
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public boolean no14(int[] nums) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                one = true;
            if (nums[i] == 4)
                four = true;

        }
        if (nums.length == 0 || nums.length == 1)
            return true;
        else if (one == true && four == true)
            return false;
        else if (one || four)
            return true;
        else
            return false;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                return false;
        }
        return true;

    }

    public boolean either24(int[] nums) {
        boolean doi = false;
        boolean patru = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                doi = true;
            if (nums[i] == 4 && nums[i + 1] == 4)
                patru = true;
        }

        return doi != patru;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) == 1 || Math.abs(nums1[i] - nums2[i]) == 2)
                count++;
        }
        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7) {
                if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2])

                    return true;
            }
            if (nums[nums.length - 2] == 7 && nums[nums.length - 1] != 7)
                return false;
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean avem1 = false;
        boolean avem2 = false;

        for (int i = 0, j = 0; i < nums.length && j < nums.length; i++, j++) {
            if (nums[i] == 1) {
                avem1 = true;
            }
            if (avem1 && nums[j] == 2) {
                avem2 = true;
            }
        }
        return avem1 && avem2;
    }

    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (ePar(nums[i])) {
                if (ePar(nums[i + 1]) && ePar(nums[i + 2])) {
                    return true;
                }
            } else {
                if ((!ePar(nums[i + 1]) && !ePar(nums[i + 2]))) {
                    return true;
                }
            }

        }
        return false;
    }

    boolean ePar(int nr) {
        return nr % 2 == 0;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean este = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3)

                este = false;

            if (nums[i] == 3 && este == true)
                return false;

            if (nums[i] == 3 && este == false) {
                este = true;
                count++;
            }

        }

        if (count == 3)
            return true;
        else
            return false;
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 0) {
            return true;
        }
        if (nums.length == 1 && nums[0] != 2) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++)

        {

            if (nums[i] == 2) {

                if (nums[i + 1] != 2)
                    return false;
                else {

                    i++;
                }
            }
        }
        if (nums.length < 2)
            return false;
        if (nums[nums.length - 2] != 2 && nums[nums.length - 1] == 2) {
            return false;
            // if(nums.length < 1)
            // return false;
        }

        return true;
    }

    public boolean sameEnds(int[] nums, int len) {

        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        boolean rez = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] - nums[i + 1] == -1 && nums[i + 1] - nums[i + 2] == -1) {
                rez = true;
            }
        }
        return rez;
    }

    public int[] fizzArray3(int start, int end) {
        int nr = end - start;
        int[] rez = new int[nr];
        for (int i = 0; i < nr; i++)
            rez[i] = start++;
        return rez;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length < 1)
            return nums;
        int first = nums[0];

        for (int i = 1; i < nums.length; i++)
            nums[i - 1] = nums[i];
        nums[nums.length - 1] = first;

        return nums;
    }

    public int[] tenRun(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {

                for (int j = i + 1; j < nums.length && !(nums[j] % 10 == 0); j++)
                    nums[j] = nums[i];
            }
        }

        return nums;
    }

    public int[] pre4(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 4) {
                count++;

            } else {
                break;
            }
        }

        int pre[] = new int[count];
        for (int i = 0; i < count; i++) {

            pre[i] = nums[i];
        }
        return pre;
    }

    public int[] post4(int[] nums) {

        int pozitie = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                pozitie = i + 1;
                break;
            }

        }
        int arr[] = new int[nums.length - pozitie];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[pozitie + i];
        }

        return arr;
    }

    public int[] notAlone(int[] nums, int val) {

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val)
                if (nums[i - 1] != nums[i] && nums[i + 1] != nums[i])
                    if (nums[i + 1] > nums[i - 1])
                        nums[i] = nums[i + 1];
                    else if (nums[i + 1] < nums[i - 1])
                        nums[i] = nums[i - 1];

        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int len = nums.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[count];
                nums[count] = 0;
                count++;
            }

        }
        return nums;
    }

    public int[] withoutTen(int[] nums) {

        int[] res = new int[nums.length];

        int count = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 10) {
                res[count] = nums[i];
                count++;
            }
        }

        return res;
    }

    public int[] zeroMax(int[] nums) {

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < len; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > nums[i]) {
                        nums[i] = nums[j];
                    }
                }

            }

        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int len = nums.length;
        int tempe = 0;
        int tempo = len - 1;
        int[] rez = new int[len];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                rez[tempe] = nums[i];
                tempe++;
            } else {
                rez[tempo] = nums[i];
                tempo--;
            }
        }
        return rez;
    }

    public String[] fizzBuzz(int start, int end) {
        int poz = 0;
        String[] rez = new String[end - start];
        for (int i = start; i < end; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if (fizz && buzz)
                rez[poz] = "FizzBuzz";

            else if (fizz)
                rez[poz] = "Fizz";

            else if (buzz)
                rez[poz] = "Buzz";

            else
                rez[poz] = i + "";
            poz++;

        }
        return rez;
    }

}
