
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Nicknames {

    public static void main(String[] args) {
        
        HashMap<String,String> nickNames = new HashMap<>();
        
        nickNames.put("matthew", "matt");
        nickNames.put("michael", "mix");
        nickNames.put("arthur", "artie");
        
        for(Map.Entry<String,String> entry : nickNames.entrySet()){
            System.out.println(entry.getKey()+"'s nickname is "+ entry.getValue());
        }
        
     
    }

}
