// Rhea Toves
// 1/7/2021
// TA: Jeremy Chen
// Assignment #1
//
// This program will generate the song "There Was An Old Woman Who Swallowed A Fly" as output.

public class Song {
   public static void main(String[] args) {
      firstVerse();
      System.out.println();
      secondVerse();
      System.out.println();
      thirdVerse();
      System.out.println();
      fourthVerse();
      System.out.println();
      fifthVerse();
      System.out.println();
      sixthVerse();
      System.out.println();
      seventhVerse();
   }
   
   public static void iDontKnowWhy() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
   }
   
   public static void swallowedSpider() {
      System.out.println("She swallowed the spider to catch the fly,");
   }
   
   public static void swallowedBird() {
      System.out.println("She swallowed the bird to catch the spider,");
   }
   
   public static void swallowedCat () {
      System.out.println("She swallowed the cat to catch the bird,");
   }
   
   public static void swallowedDog() {
      System.out.println("She swallowed the dog to catch the cat,");
   }
   
   public static void firstVerse() {
      System.out.println("There was an old woman who swallowed a fly.");
      iDontKnowWhy();
   }
   
   public static void secondVerse() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      swallowedSpider();
      iDontKnowWhy();
   }
   
   public static void thirdVerse() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      swallowedBird();
      swallowedSpider();
      iDontKnowWhy();
   }
   
   public static void fourthVerse() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      swallowedCat();
      swallowedBird();
      swallowedSpider();
      iDontKnowWhy();
   }
   
   public static void fifthVerse() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      swallowedDog();
      swallowedCat();
      swallowedBird();
      swallowedSpider();
      iDontKnowWhy();
   }
   
   public static void sixthVerse() {
      System.out.println("There was an old woman who swallowed a wolf,");
      System.out.println("Her mouth opened so wide as she engulfed.");
      swallowedDog();
      swallowedCat();
      swallowedBird();
      swallowedSpider();
      iDontKnowWhy();
   }
   
   public static void seventhVerse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
}
