public class Map1 {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.get("a") != null) {
            map.put("b", map.get("a"));

        }
        return map;

    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.get("ice cream") != null) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.get("spinach") != null) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.get("potato") != null) {
            map.put("fries", map.get("potato"));
        }
        if (map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {

            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }

        }
        return map;

    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.get("a") == null && map.get("b") != null) {
            map.put("a", map.get("b"));
        }
        if (map.get("b") == null && map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            } else if (map.get("a").length() < map.get("b").length()) {
                map.put("c", map.get("b"));

            } else
                map.put("c", map.get("a"));
        }

        return map;
    }

}
