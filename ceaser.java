import java.util.*; 
public class ceaser{
   public static void main (String [] args){
      Scanner input =new Scanner(System.in);
      System.out.println("==== CEASER CIPHER DECODER ===");
      System.out.print("enter the word:");
      String word=input.nextLine();
      
      int[] counts = new int[26];
      int maxCount = 0;
      char mostCommon = '?';
   
      for(int i = 0; i < word.length(); i++) {
         char let = word.charAt(i);
            
         if (let >= 'A' && let <= 'Z') {
            counts[let - 'A']++;
         }
         else if (let >= 'a' && let <= 'z') {
            counts[let - 'a']++;
         }
      }
   
      for(int i = 0; i < 26; i++) {
         if (counts[i] > maxCount) {
            maxCount = counts[i];
            mostCommon = (char)('a' + i);
         }
      }
      System.out.println("Most frequent letter is: " + mostCommon + " (appears " + maxCount + " times)");
      
      while(true){
         System.out.print("enter the expected shift:");
         int shift=input.nextInt();
         
         if (shift==0){
            System.out.print("program exited");
            break;}
        
         for(int i=0;i<word.length();i++){
            char let=word.charAt(i);
         
            if (let>='A'&& let<='Z')
               System.out.print((char)((let-'A'+shift)%26+'A'));
            else if (let>='a'&& let<='z')
               System.out.print((char)((let-'a'+shift)%26+'a')); 
         }
         System.out.println();
         System.out.println("type 0 to exit");
      
        
      }
      input.close();
   }
}
