public class ageArr{    

    public static int minusAction(int x, int y){
        return x - y;
    }
    public static void main(String[] args){
        int[]ages = {3, 9, 23, 64, 2, 8, 28, 93};
        System.out.println("Orginal: ");
        printAges(ages);

        int first = ages [0];
        int last = ages [ages.length - 1];
        int minus = minusAction(last, first);
        System.out.println("Fist number - last number = " + minus);

        int[]ages2 = {3, 9, 23, 64, 2, 8, 28, 93,10};
        System.out.println("New: ");
        printAges2(ages2);

        int first2 = ages2 [0];
        int last2 = ages2 [ages2.length - 1];
        int minus2 = minusAction(last2, first2);
        System.out.println("Fist number - last number = " + minus2);

        average1(ages);

    }
    public static int[] addAge( int[] ages)
    {
        int[] newAges = new int[ages.length+1];

        for(int i = 0; i<ages.length; i++ ){
            newAges[i]= ages[i];
        }
        return newAges;
    }
    public static void printAges(int[] ages){
        for(int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }
    }
    public static void printAges2(int[] ages2){
        for(int i=0; i<ages2.length; i++){
            System.out.println(ages2[i]);
        }
    }
    public static void average1(int[] ages){
        float sum = 0;
        int total = 0;
        while (total < ages.length) {
            sum += ages[total];
            total++;
        }
        float average = sum/ages.length;
        System.out.println("Average : " + average);
    }
    
}  