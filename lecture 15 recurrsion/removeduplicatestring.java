public class removeduplicatestring{
    public static void removeduplicate(String str, int idx, StringBuilder newstr, boolean map[]){
        //base case
        if(idx== str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
        //duplicate
        removeduplicate(str, idx+1, newstr, map);
    }
    else{
        map[currChar-'a'] = true;
        removeduplicate(str,idx+1,newstr.append(currChar),map);//for adding new character in string
    }
    } 
    public static void main(String args[]){
         String str= "apnacollege";
         removeduplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}
