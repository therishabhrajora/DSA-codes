public class FindSubsets {
    public static void findSubsets(String str, int index, String currString){
        if(index==str.length()){
            if (!currString.isEmpty()) {
                System.out.println(currString);
            }
            return;
        }

        System.out.println(currString);
        findSubsets(str, index + 1, currString + str.charAt(index));
        System.out.println(currString);
        findSubsets(str, index + 1, currString);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Subsets of the string \"" + str + "\":");
        findSubsets(str, 0, "");
    }
}
