public class RemoveDuplicate {

public static void removeDuplicate(String str,int idx,StringBuilder newStr, boolean map[]){
    // baseCase
    if(idx == str.length()){ 
        System.out.println(newStr);
        return;
    }
    // kaam 
        // check is char is present in map
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true){
        // dupplicate
        removeDuplicate(str,  idx+1 , newStr, map);
    }else{
        map[currChar - 'a'] = true;
        removeDuplicate(str, idx+1, newStr.append(currChar), map);
    }

}
    public static void main(String[] args) {
        String str = "altafkhan";
        removeDuplicate(str, 0, new StringBuilder("") , new boolean[26]);
    }
} 