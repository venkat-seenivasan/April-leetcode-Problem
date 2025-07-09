import java.util.*;  // Import all collection classes

public class LegacyVsNonLegacy {
    public static void main(String[] args) {

        // -------- Legacy Collection: Vector --------
        Vector<String> legacyVector = new Vector<>();
        legacyVector.add("Apple");
        legacyVector.add("Banana");
        legacyVector.add("Cherry");

        System.out.println("Legacy Vector: " + legacyVector);

        // -------- Legacy Collection: Hashtable --------
        Hashtable<Integer, String> legacyHashtable = new Hashtable<>();
        legacyHashtable.put(1, "One");
        legacyHashtable.put(2, "Two");

        System.out.println("Legacy Hashtable: " + legacyHashtable);

        // -------- Non-Legacy Collection: ArrayList --------
        ArrayList<String> modernList = new ArrayList<>();
        modernList.add("Dog");
        modernList.add("Elephant");
        modernList.add("Fox");

        System.out.println("Non-Legacy ArrayList: " + modernList);

        // -------- Non-Legacy Collection: HashMap --------
        HashMap<Integer, String> modernMap = new HashMap<>();
        modernMap.put(10, "Ten");
        modernMap.put(20, "Twenty");

        System.out.println("Non-Legacy HashMap: " + modernMap);
    }
}