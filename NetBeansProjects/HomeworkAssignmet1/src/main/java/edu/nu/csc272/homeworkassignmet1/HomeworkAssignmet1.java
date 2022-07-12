

package edu.nu.csc272.homeworkassignmet1;

/**
 *
 * @author IvanReynoso
 */
public class HomeworkAssignmet1 {

    public static void main(String[] args) {
        System.out.println("--- HW #1 Attempt #1");
    
    
        solveHW1();
    }

    static void solveHW1()  {
        System.out.println("Solution 1");
        String phoneNo = "234-5678";
        phoneNo = phoneNo.replace("-","");
        System.out.println("Phone number " + phoneNo);
        
        String digits[] = phoneNo.split("");
        
        int n1 = Integer.parseInt(digits[0]);
         int n2 = Integer.parseInt(digits[1]);
         int n3 = Integer.parseInt(digits[2]);
         int n4 = Integer.parseInt(digits[3]);
         int n5 = Integer.parseInt(digits[4]);
         int n6 = Integer.parseInt(digits[5]);
         int n7 = Integer.parseInt(digits[6]);
         
         
         
         
         String[] letters1 = getLettersFromNumber(n1);
         String[] letters2 = getLettersFromNumber(n2);
         String[] letters3 = getLettersFromNumber(n3);
         String[] letters4 = getLettersFromNumber(n4);
         String[] letters5 = getLettersFromNumber(n5);
         String[] letters6 = getLettersFromNumber(n6);
         String[] letters7 = getLettersFromNumber(n7);
         
         
         for (int i=0;i < 3;i++) {
           
             for (int j=0;j < 3;j++) {
                 System.out.print(letters1[i]);
                 System.out.print(letters2[i]);
                 System.out.print(letters3[i]);
                 System.out.print(letters4[i]);
                 System.out.print(letters5[i]);
                 System.out.print(letters6[i]);
                 System.out.print(letters7[i]);
                  
                 
                 
                 
                 
                 
                 
                 
                 
                }  
             System.out.println(" ");
        }
         
        
        for (int i = 0;i < digits.length; i++ ){
        String digit = digits[i];
        int n = Integer.parseInt(digit);
        System.out.println(" n --> " + n);
        String[] letters = getLettersFromNumber(n);
        for (int j=0;j < letters.length;j++){
            String letter = letters[j];
            System.out.println(" * letter-> " + letter);
            
            }
        
        }
    }

    static String[] getLettersFromNumber(int n) {
       
        
        String[] map = {
          
          "000", // 0
          "111", // 1
          "ABC", // 2
          "DEF", // 3
          "GHI", // 4
          "JKL", // 5
          "MNO", // 6
          "PRS", // 7
          "TUV", // 8
          "WXY", // 9
                  
        };
        
        String[] letters = map[n].split("");
        return letters;
    }

}
