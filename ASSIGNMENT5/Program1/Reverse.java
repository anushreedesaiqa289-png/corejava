/*
1) Write a java program to reverse a String 
Q2) Write a java code to check string is palindrome. 
Q3) write a java program to count number of words in a String. 
Hint:  You can use , trim() , length() and split() methods
*/
public class Reverse{
    public static void main(String[] args){
        String s= "Was it a car or a cat I saw";
        s = s.trim();
        int len=s.length();
        String[] arr = s.split(" ");
        System.out.println("Length of string is " +len);
        System.out.println("Number of Words of string is " +arr.length);

        for(int i=len-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        String newString = String.join("",arr);
        newString = newString.toLowerCase();
        len=newString.length();
        int left  = 0;
        int right = len-1;
        
        while(left<right){
           
            if( newString.charAt(left) == newString.charAt(right) ){
                left++;
                right--;

            }
            else{
                System.out.println("Not palindrome");
                return;
            }
           
        }
         System.out.println("palindrome");
    }
}