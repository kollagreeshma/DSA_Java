public class backtracking4 {
    public static void findSubString(String str,int index,String current){
        if(index==str.length()){
            System.out.println(current);
            return;
        }
        findSubString(str, index+1,current+str.charAt(index));
        findSubString(str,index+1,current);
    }
    public static void main(String[] args) {
        String str ="abc";
        findSubString(str,0,"");
    }
}
