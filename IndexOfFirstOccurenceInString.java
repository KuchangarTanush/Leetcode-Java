public class IndexOfFirstOccurenceInString {
    public static int FirstOccurence(String haystack, String needle) {
       if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1; 
    }
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        FirstOccurence(haystack,needle);
    }
    
}
