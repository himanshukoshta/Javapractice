import java.util.HashMap;

public class hasmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",3);
        System.out.println(map.get("id1"));
    }
}
class hasmaps {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        map.put("id0",1);
        map.put("id2",2);
        map.put("id3",3);
        System.out.println(map.get("id1"));
        System.out.println(map.containsKey("id0"));
        System.out.println(map.containsValue(2));
    }
}
class haasmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
                map.put("id0",1);
                map.put("id2",2);
                map.put("id3",3);

           map.forEach((key,value) -> {
            System.out.println(key+ " "+value);
        });
        }
}

class haaasmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id0", 1);
        map.put("id2", 2);
        map.put("id3", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (int val : map.values()) {
            System.out.println(val);
        }
    }
}

class def{
    public static void main(String[] args) {
        String str="programming";  //p=1,r=2
        char[] ch=str.toCharArray();
        HashMap<Character, Integer> ma=new HashMap<>();
        for(char i:ch)
        {
             ma.put(i, ma.getOrDefault(i,0)+1);
        }
        System.out.println(ma);
    }
}

class deef{
    public static void main(String[] args) {
        String str="programming is a fun and fun is a programming";  //a=2, and=1, is=2, programming=2, fun=2
        HashMap<String, Integer> ma=new HashMap<>();
        String[] se=str.split(" ");
        for(String o:se)
        {
            ma.put(o,ma.getOrDefault(o,0)+1);
        }
        System.out.println(ma);
    }
}

class pli{
    public static void main(String[] args) {
        String str="aaabccddeeef";
        HashMap<Character,Integer> mapp=new HashMap<>();
        char[] c=str.toCharArray();
        for(char v:c)
        {
            mapp.put(v,mapp.getOrDefault(v,0)+1);
        }
        for(char w:mapp.keySet())
        {
            if(mapp.get(w)==1)
            {
                System.out.println(w);
                break;
            }
        }
    }
}