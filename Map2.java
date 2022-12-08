public class Map2 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            map.put(temp, temp.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            String first = String.valueOf(temp.charAt(0));
            String last = String.valueOf(temp.charAt(temp.length() - 1));
            map.put(first, last);
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            if (map.containsKey(temp)) {
                int count = map.get(temp);
                map.put(temp, count + 1);
            } else {
                map.put(temp, 1);
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                String value = map.get(key) + strings[i];
                map.put(key, value);
            } else {
                map.put(key, strings[i]);
            }
        }
        return map;

    }

    public String wordAppend(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        String rez = "";

        for (int i = 0; i < strings.length; i++) {
            String chr = strings[i];

            if (!map.containsKey(chr)) {
                map.put(chr, 1);
            } else {
                int count = map.get(chr);
                map.put(chr, count + 1);
                if (map.get(chr) % 2 == 0) {
                    rez += chr;
                }
            }

        }
        return rez;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map2 = new HashMap<String, Boolean>();

        for (int i = 0; i < strings.length; i++) {
            if (map2.containsKey(strings[i])) {
                map2.put(strings[i], true);
            } else {
                map2.put(strings[i], false);
            }
        }

        return map2;

    }

    public String[] allSwap(String[] strings) {

        Map<Character, Map<String, Integer>> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].charAt(0))) {

            } else {

                map.put(strings[i].charAt(0), strings[i]);
            }
        }
        return strings;
    }

    public boolean suntLaFel(String a, String b) {
        return a.charAt(0) == b.charAt(0);
    }

    public String[] firstSwap(String[] strings) {
        String temp = "";
        for (int i = 0; i < strings.length; i++) {
            for (int j = 1; j < strings.length; j++) {
                if (strings[i].charAt(0) == strings[j].charAt(0))
                    temp = strings[i];

                strings[i] = strings[j];
                strings[j] = temp;

                j++;

            }
        }
        return strings;
    }

}
