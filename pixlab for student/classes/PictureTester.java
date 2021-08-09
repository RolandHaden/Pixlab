/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test pictureDisplay */
  public static void pictureDisplay()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();

  }
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void keepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  //Test Zero Red
  public static void testZeroRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroRed();
    beach.explore();
  }
  //Keep Only Red
  public static void keepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  //Test Zero Green
  public static void testZeroGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroGreen();
    beach.explore();
  }
  //Keep Only Green
  public static void keepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  //Invert Colors
  public static void invert()
  {
    Picture beach = new Picture("MyPicture.jpeg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  //Grey Colors
  public static void grey()
  {
    Picture beach = new Picture("MyPicture.jpeg");
    beach.explore();
    beach.greyscale();
    beach.explore();
  }
  //Mirror Vertical
  public static void mirrorVert(){
    Picture beach = new Picture("MyPicture.jpeg");
    beach.explore();
    beach.mirrorVertical();
    beach.explore();
  }
  //Mirror Right to Left
  public static void mirrorRightToLeft(){
    Picture beach = new Picture("MyPicture.jpeg");
    beach.explore();
    beach.mirrorRtoL();
    beach.explore();
  }
  //Mirror Horizontal (Top to Bottom)
  public static void mirrorHorz(){
    Picture beach = new Picture("MyPicture.jpeg");
    beach.explore();
    beach.mirrorHorizontal(); //mirrorHorizontalBT()
    beach.explore();
  }
  //Mirror Horizontal (Bottom to Top)
  public static void mirrorHorzBottomTop(){
    Picture beach = new Picture("MyPicture.jpeg");
    beach.explore();
    beach.mirrorHorizontalBT();
    beach.explore();
  }
  //Mirror Diagonal
  public static void mirrorDiag(){
    Picture beach = new Picture("temple.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  //Mirror top right square
  public static void mirrorTRS(){
    Picture beach = new Picture("temple.jpg");
    beach.explore();
    beach.mirrorTopRightSquare();
    beach.explore();
  }
  //Mirror arms of snowman
  public static void mirrorArm(){
    Picture beach = new Picture("snowman.jpg");
    beach.explore();
    beach.mirrorArms();
    beach.explore();
  }
  public static void mirrorGull(){
    Picture beach = new Picture("seagull.jpg");
    beach.explore();
    beach.mirrorGulls();
    beach.explore();
  }
  public static void testCreateCollage(){
    Picture canvas = new Picture("snowy.jpeg");
    canvas.createCollage();
    canvas.explore();
  }
  //Main method for testing. 
  public static void main(String[] args)
  {

    //pictureDisplay();
    
    //TODO: uncomment the testZeroBlue method to run it. 
    //testZeroBlue();
    //invert();
    //grey();
    //mirrorVert();
    //mirrorRightToLeft();
    //mirrorHorz();
    //mirrorHorzBottomTop();
    //mirrorDiag();
    //mirrorTRS();
    //mirrorArm();
    //mirrorGull();
    testCreateCollage();
    //keepOnlyGreen();
    //testZeroGreen();
    //TODO: write testZeroRed() method
    //TODO: write testZeroGreen() method 
    }
}