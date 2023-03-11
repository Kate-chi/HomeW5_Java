import java.util.HashMap;

public class HW5
{
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("first", "один");
        hashMap.put("second", "два");
        hashMap.put("third", "три");
        hashMap.put("fourth", "четыре");
        hashMap.put("fifth", "пять");
        hashMap.put("sixth", "шесть");

        hashMap.forEach((k, v) -> System.out.println(v));
        System.out.println("=".repeat(23));

        for(String key : hashMap.keySet())
        {
            hashMap.compute(key, (k, v) -> v += "!");
        }

        hashMap.forEach((k, v) -> System.out.println(v));
        System.out.println("=".repeat(23));

        HashMap<String, String> hashMapNew = new HashMap<>();
        hashMapNew.put("third", "три");
        hashMapNew.put("fourth", "четыре");
        hashMapNew.put("fifth", "пять");
        hashMapNew.put("sixth", "шесть");
        hashMapNew.put("seven", "семь");
        hashMapNew.put("eight", "восемь");
        

        for(String s: hashMap.keySet())
        {
            hashMapNew.merge(s, hashMap.getOrDefault(s, " "), String::concat);
        }
        hashMapNew.forEach((k, v) -> System.out.println(v));
    }

}