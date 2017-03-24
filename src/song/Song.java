/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song;

/**
 *
 * @author areeyatipyasothi
 */
public class Song {
     //bop
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int linesInVerse = 2;
        int firstVerse = 1;
        lyrics(firstVerse);

    }
    public static String ordinalNum(int verse){
        switch(verse){
            case 1: return "1st";
            case 2: return "2nd";
            case 3: return "3rd";
            default: return verse + "th";
        }
    }
    public static void lyrics(int firstVerse){
        for(int verse = firstVerse; verse < 8; verse++){
            System.out.println("On the " + ordinalNum(verse) + " day of \"Xmas\", my "
                    + "true love gave to me");
            switch(verse){
                case 7: System.out.println("seven areeyas crying,");
                case 6: System.out.println("six geese a-laying,");
                case 5: System.out.println("five golden rings,");
                case 4: System.out.println("four calling birds,");
                case 3: System.out.println("three French hens,");
                case 2: System.out.println("two turtle doves, and");
                case 1: System.out.println("a partridge in a pear tree.");
            }
            System.out.println();
            
        }
    }
}
