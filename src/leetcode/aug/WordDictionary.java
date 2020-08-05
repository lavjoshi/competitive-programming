package leetcode.aug;

class WordDictionary {

    /** Initialize your data structure here. */
    private  WordDictionary child[];
    private  boolean isEnd;

    public WordDictionary() {
        child = new WordDictionary[26];
        isEnd = false;
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        WordDictionary curr = this;
        for(char c : word.toCharArray()){
            if(curr.child[c-'a'] == null){
                curr.child[c-'a'] = new WordDictionary();
            }
            curr = curr.child[c-'a'];
        }
        curr.isEnd = true;

    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public  boolean search(String word) {
        WordDictionary curr = this;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(WordDictionary ch : curr.child){
                    if(ch != null && ch.search(word.substring(i+1))){
                        return true;
                    }
                }
                return false;
            }
            if(curr.child[c-'a'] == null){
                return false;
            }
            curr = curr.child[c-'a'];
        }
        return curr != null && curr.isEnd;
    }



}
class WordMain{
    public static void main(String ar[]){
        WordDictionary w = new WordDictionary();
        w.addWord("bad");
        System.out.print(w.search(".ad"));
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */