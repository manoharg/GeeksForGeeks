class Trie {

    class Node
    {
        public Map<Character,Node> children;
       public  boolean endOfword;
        Node()
        {
            children= new HashMap<>();
            endOfword=false;
        }
    }
    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root= new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node current= root;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            Node temp= current.children.get(ch);
            if(temp==null)
            {
                temp= new Node();
                current.children.put(ch, temp);
            }
            current = temp;
        }
        current.endOfword=true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        
        return match(root, word,0);
//         Node current = root;
//         for(int i=0;i<word.length();i++)
//         {
//              char ch = word.charAt(i);
//             Node temp= current.children.get(ch);
//             if(temp==null)
//                 return false;
//             current= temp;
//         }
//         if(current.endOfword)
//             return true;
//         return false;
        
    }
    
    private boolean match(Node cur, String word, int k)
    {
        if(k==word.length())
            return cur.endOfword;
        char ch= word.charAt(k);
        Node temp= cur.children.get(ch);
        if(temp==null)
            return false;
        return match(temp, word, k+1);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
        Node current = root;
        for(int i=0;i<prefix.length();i++)
        {
              char ch = prefix.charAt(i);
            Node temp= current.children.get(ch);
            if(temp==null)
                return false;
            current= temp;
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */