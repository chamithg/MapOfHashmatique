import java.util.HashMap;

public class HashMatique {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("IDGAF", "Dua Lipa");
        map.put("StarBOy", "Weeknd");
        map.put("In DE Club", "50 cent");
        map.put("Down On me", "50 cent");

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println("The Song -->" + key +"-- the artist -->"  +map.get(key));
        }
        
    }
}