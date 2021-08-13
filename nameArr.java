public class nameArr {
    public static void main(String[] args){
        String[]names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            System.out.print(names[i] + " ");
        }
        int countLetters = 0;
    

        for(String s: names) {
        countLetters += s.length();
        }
        System.out.println(". Overall letters: " + countLetters);

        int length = countLetters / names.length ;
        System.out.println("The average word length is " + length);

        String word = "laugh";
        int n = 5;
         
        String firstName = "Big";
        String lastName = "Man";

        int[] equal = {10, 20, 30, 50, 12};

        double[] average2 = {100, 200, 300, 400, 500};
        double[] average3 = {150, 250, 350, 450, 550};

        boolean isHotOutside = true;
        double moneyInPocket = 9.50;

        int time = 9;
        boolean doIWork = false;
        int wallet = 90;
  
        nameLengths(names);
        nameLengths2(names);
        combineWords(n, word);
        fullName1(firstName, lastName);
        equal100(equal);
        averageDouble(average2); 
        averageBetween(average2, average3);
        willBuyDrink(isHotOutside, moneyInPocket);
        goOutTonight(time, doIWork, wallet);
        
    
    }
    static void nameLengths(String[] names){
        for (int i = 0; i < names.length; i++) {
            char[] eachLetter = names[i].toCharArray();
            int count = 0;
            for (int j = 0; j < eachLetter.length; j++) {
                if (eachLetter[j] > count && eachLetter[j] > count)
                { count++;
                }
            }
            System.out.println(count + names.length);
        }   
    }
    static void nameLengths2(String[] nameLengths){
        int countLetters2 = 0;
        for (String v : nameLengths){
            countLetters2 += v.length();
        }
        for (int i = 0; i < nameLengths.length; i++) {
            char[] eachLetter = nameLengths[i].toCharArray();
            int count2 = 0;
            for (int j = 0; j < eachLetter.length; j++) {
                if (eachLetter[j] > count2 && eachLetter[j] > count2)
                { count2++;
                }
            }
            System.out.println(count2 + countLetters2);
        }         
    }     
    static void combineWords(int n, String word){
       System.out.println(word.repeat(n)); 
    }
    static void fullName1(String firstName,String lastName){
        System.out.println(firstName + " " + lastName);

    }
    static void equal100(int[] equal){
        

        for(int equals: equal) {
            if(equals >= 100) {
                System.out.println("all of the array is over 100");
            } else{
                System.out.println("all of the array is not over 100");
            }
        } 
               
	

        //for(int c = 0; c < equal.length; ++c){
          //  if (equal[c] < 100){ 
            //System.out.println ("all of the array is not over 100" );
            //}
       // }
        
    }
    static void averageDouble(double[] average2){
        int ave = 0;
        int total1 = 0;
        while (total1 < average2.length) {
            ave += average2[total1];
            total1++;
        }
        int average1= ave/average2.length;
        System.out.println("Average : " + average1);   
    }
    static void averageBetween(double[] average2, double[] average3){
        int ave = 0;
        int total1 = 0;
        while (total1 < average2.length) {
            ave += average2[total1];
            total1++;
        }
        int ave1 = 0;
        int total2 = 0;
        while (total2 < average3.length) {
            ave1 += average3[total2];
            total2++;
        }
        int average1= ave/average2.length;
        int average0 = ave1 /average3.length;
        if(average1 > average0){
            System.out.println("The average of the first array is greater.");
        } else if(average1 < average0){
            System.out.println("The average of the second array is greater.");
        }
        
    }
    static void willBuyDrink(boolean isHotOutside, double moneyInPocket){
        if((isHotOutside = true) && (moneyInPocket > 10.50)){
            System.out.println("You can buy a drink");
        }else{
            System.out.println("You can not buy a drink");
        }
    }
    static void goOutTonight(int time, boolean doIWork, int wallet){
        if(time < 10 && doIWork == false && wallet > 100) {
            System.out.println("Go out and have fun tonight.");
        } else if(time < 10 && doIWork == false && wallet < 100){
            System.out.println("You can go out but you're broke.");
        } else if(time > 10 && doIWork == false && wallet > 100){
            System.out.println("It is too late to go out tonight.");
        }
    }

}
