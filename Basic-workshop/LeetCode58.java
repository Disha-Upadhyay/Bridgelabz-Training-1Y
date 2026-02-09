class LeetCode58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lastWord = arr[arr.length-1];
        return lastWord.length();

      
    }
	public static void main(String[] args){
	String s = "Hello World";
	LeetCode58 obj = new LeetCode58();
	System.out.println(obj.lengthOfLastWord(s));
	}
}