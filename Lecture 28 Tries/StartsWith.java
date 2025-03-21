public class StartsWith{
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;
      
      Node(){
        for(int i=0;i<26;i++){
            children[i]=null;
        }
      }
    }   
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static boolean searchStartWith(String prefix){
        Node curr = root;
        for(int level=0;level<prefix.length();level++){
            int idx = prefix.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    
    public static void main(String[] args){
        String words[] = {"apple","app","mango","man","woman"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String prefix="wq";
      System.out.print(searchStartWith(prefix));
    }
}  