// Start of loaded import list in Java for Clanboto Complier
import java.util.Scanner;
import java.util.*; 
import java.io.*; 
import java.net.URL; 
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;
//Loaded import list for command query in Clanboto!
class Main {
  public static void main(String[ ] args) throws InterruptedException, IOException {
    Scanner scan = new Scanner(System.in);
    System.out.println("Initlizing"); 
    System.out.println(); 
    Thread.sleep(500);
    System.out.println("Clanboto Developer Complier version 1.7.65_32 made by Alen J."); 
    System.out.println("Clanboto(TM) XSE Runtime Environment (build 1.5.8_32-a2) Stable Release Version 1.5.8_32-a2"); 
    System.out.println("Clanboto Dual Quantam and Axel Engine(TM) Server Virtualized Machine (build 45.89-v39.2.11)");
    Thread.sleep(2000); 
    System.out.println(); 
    System.out.println("Type help in the console to get a list of commands to initiate in Clanboto Complier and also please press run after a command has been completed or initilized!");
    String input1 = scan.nextLine();  
    for(String varString = "str.var()"; input1.equals(varString);) {
      System.out.println("Please type in a parameter"); 
      String input2 = scan.nextLine();
      Thread.sleep(2000);  
      System.out.println(input2);
      System.out.println("Command Sucess!");
      break; 
   }
   for(String varInteger = "int.var()"; input1.equals(varInteger);) { 
     System.out.println("Enter a Number Value;"); 
     int input3 = scan.nextInt();
     Thread.sleep(2000); 
     System.out.println(input3); 
     System.out.println("Command Sucess"); 
     break; 
   }
   for(String varBoolean = "boollogic.var()"; input1.equals(varBoolean);) { 
     System.out.println("Enter True or False!"); 
     boolean input4 = scan.nextBoolean(); 
     Thread.sleep(2000); 
     System.out.println(input4); 
     System.out.println("Command Sucess"); 
     break; 
   }
   for(String varDecimal = "decimal.var()"; input1.equals(varDecimal);) { 
     System.out.println("Enter a Number that is rational!"); 
     double input5 = scan.nextDouble();
     Thread.sleep(2000);  
     System.out.println(input5); 
     System.out.println("Command Sucess"); 
     break; 
   }
   for(String floatInverse = "num.floatInverse()"; input1.equals(floatInverse);) {
     System.out.println("What number do you want to float to?"); 
     double input6 = scan.nextFloat();
     Thread.sleep(2000);  
     System.out.println(input6); 
     System.out.println("Command Sucess"); 
     break; 
   } 
   for(String netConnection = "network.config()"; input1.equals(netConnection);) { 
      try { 
        System.out.println("Please Input Site URL (include http:// or https://)!"); 
        String input7 = scan.nextLine(); 
        Thread.sleep(1000); 
        URL url = new URL(input7); 
            URLConnection connection = url.openConnection(); 
            connection.connect(); 
  
            System.out.println("Connection Successful"); 
        } 
        catch (Exception e) { 
            System.out.println("Request Timed Out!"); 
        } 
        break; 
   }
   /*
   for(String netConnectionLocation = "networkLocation.config()"; input1.equals(netConnectionLocation);) {
     System.out.println("To access a location, remember to follow these instructions!");
     System.out.println("1st go to https://ipapi.co"); 
     System.out.println("2nd go type your IP address above the address bar example: 90.120.333.344 is my IP and I type in the URL (https://ipapi.co/90.120.333.344/json"); 
     System.out.println("Then type that following address into the console below and then the location geography can be found");
      FileWriter fw = new FileWriter("networkGeography.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      String urlinput = scan.nextLine(); 
      bw.write(urlinput);
      bw.newLine();
      bw.write("Go to that link and then go back to Main.Java and then follow below instructions!");
      bw.newLine();
      bw.write("Copy the JSON file inside and then input it into the file!");
    
      bw.close();
      fw.close();
      System.out.println("Sucessful, plese check the file!"); 
      Thread.sleep(5000); 
      FileReader fr = new FileReader("networkGeography.txt");
      BufferedReader br = new BufferedReader(fr);
      
      String line8 = Files.readAllLines(Paths.get("networkGeography.txt")).get(8);
      String line9 = Files.readAllLines(Paths.get("networkGeography.txt")).get(9);
      String line10 = Files.readAllLines(Paths.get("networkGeography.txt")).get(10);
      String line11 = Files.readAllLines(Paths.get("networkGeography.txt")).get(11);
      String line12 = Files.readAllLines(Paths.get("networkGeography.txt")).get(12);
      String line15 = Files.readAllLines(Paths.get("networkGeography.txt")).get(15);
      String line16 = Files.readAllLines(Paths.get("networkGeography.txt")).get(16);
      String line17 = Files.readAllLines(Paths.get("networkGeography.txt")).get(17);
        break; 
   }
   */
   for(String binaryval1 = "bin.(1)"; input1.equals(binaryval1);) {  
     int bin1 = 1; 
     Thread.sleep(1000); 
     System.out.println("Command Sucessful!"); 
     System.out.println("returned " + bin1);
     break;
   }
   for(String binaryval0 = "bin.(0)"; input1.equals(binaryval0);) { 
     int bin0 = 0; 
     Thread.sleep(1000); 
     System.out.println("Command Sucessful"); 
     System.out.println("returned " + bin0); 
     break;
   }
   for(String adddigits = "num.function(add)"; input1.equals(adddigits);) { 
     System.out.println("Type first number");
     double addend1 = scan.nextDouble(); 
     System.out.println("Type second number");
     double addend2 = scan.nextDouble();
     System.out.println("Do you want to add more than 3 digits? (Put Y or N)"); 
     String input8 = scan.next(); 
     if (input8.equals("Y")) { 
       System.out.println("Type in your third digit"); 
       double addend3 = scan.nextDouble(); 
       Thread.sleep(1000); 
       System.out.println(); 
       System.out.println("Type in your fourth digit (put 0 if not needed)"); 
       double addend4 = scan.nextDouble();
       Thread.sleep(1000); 
       System.out.println();  
       System.out.println("Type your fifth digit (place 0 if not needed)");
       double addend5 = scan.nextDouble();
       Thread.sleep(1000); 
       System.out.println(); 
       System.out.println("Adding all digits!"); 
       double allsum = addend1 + addend2 + addend3 + addend4 + addend5; 
       Thread.sleep(1000);
       System.out.println(allsum); 
       System.out.println("Added all of your inputted digits sucessfully!");  
     } else { 
       System.out.println("Adding all of your digits!"); 
       double twosum = addend1 + addend2;
       Thread.sleep(1000);  
       System.out.println("Done!"); 
       System.out.println(twosum); 
     }
     break; 
   }
   for(String subtractdigits = "num.function(subtract)"; input1.equals(subtractdigits);) { 
     System.out.println("First Digit"); 
     double minuendone = scan.nextDouble();
     System.out.println(); 
     System.out.println("Second Digit");  
     double minuendtwo = scan.nextDouble();
     System.out.println();  
     System.out.println("Do you want to subtract more digits (Type Y or N)"); 
     String input9 = scan.next();
     System.out.println();  
     if (input9.equals("Y")) { 
       System.out.println("Third Digit"); 
       double minuendthree = scan.nextDouble();
       System.out.println();  
       System.out.println("Fourth Digit (Put Zero if not needed)"); 
       double minuendfourth = scan.nextDouble(); 
       System.out.println("Fifth Digit (Put Zero if not needed)");
       double minuendfifth = scan.nextDouble(); 
       System.out.println("Subtracting digits"); 
       Thread.sleep(1000); 
       double differenceall = minuendone - minuendtwo - minuendthree - minuendfourth - minuendfifth;
       System.out.println("Done!"); 
       System.out.println(differenceall); 
       } else {  
         Thread.sleep(1000); 
         double differencetwo = minuendone - minuendtwo; 
         System.out.println("Done!"); 
         System.out.println(differencetwo); 
       }
       break; 
   }
   for(String multiplier = "num.function(multiply)"; input1.equals(multiplier);) { 
     System.out.println("First Value"); 
     double factor1 = scan.nextDouble(); 
     System.out.println("Second Value"); 
     double factor2 = scan.nextDouble(); 
     System.out.println("Do you want to do more than two values (Type Y or N)"); 
     String input10 = scan.next(); 
     if (input10.equals("Y")) { 
       System.out.println("Third Value"); 
       double factor3 = scan.nextDouble(); 
       System.out.println("Fourth Value (Add Zero if not needed)"); 
       double factor4 = scan.nextDouble(); 
       System.out.println("Fifth Value (Add Zero if not needed"); 
       double factor5 = scan.nextDouble(); 
       System.out.println("Multipliying Digits"); 
       double product = factor1 * factor2 * factor3 * factor4 * factor5; 
       System.out.println("Done!"); 
       System.out.println(product); 
     } else { 
       System.out.println("Multiplying digits"); 
       double semiproduct = factor1 * factor2; 
       System.out.println("Done!"); 
       System.out.println(semiproduct); 
     }
     break; 
   }
   for(String divider = "num.function(divide)"; input1.equals(divider);) { 
     System.out.println("First Value"); 
     double dividend1 = scan.nextDouble(); 
     System.out.println("Second Value"); 
     double dividend2 = scan.nextDouble(); 
     System.out.println("Do you want to divide more values (Type Y or N)"); 
     String input11 = scan.next(); 
     if (input11.equals("Y")) { 
       System.out.println("Third Value"); 
       double dividend3 = scan.nextDouble(); 
       System.out.println("Fourth Value (Type Zero if not needed)"); 
       double dividend4 = scan.nextDouble(); 
       System.out.println("Fifth Value (Type Zero if not needed)"); 
       double dividend5 = scan.nextDouble();
       Thread.sleep(2000);  
       double quoitentall = dividend1 / dividend2 / dividend3 / dividend4 /dividend5; 
       System.out.println("Done!"); 
       System.out.println(quoitentall); 
     } else { 
       double quoitent2 = dividend1 / dividend2;
       Thread.sleep(2000);
       System.out.println("Done!");
       System.out.println(quoitent2);
     }
     break; 
   }
  for(String squarerootMath = "num.function(squareroot)"; input1.equals(squarerootMath);) {
    System.out.println("Enter a Digit"); 
    double sqrtnumerical = scan.nextDouble(); 
    double squareroot = Math.sqrt(sqrtnumerical);
    Thread.sleep(2000);  
    System.out.println("Done!"); 
    System.out.println(squareroot);
    break;  
  }
  for(String exponentFunction = "num.function(exponent)";input1.equals(exponentFunction);) {
    System.out.println("Type in base"); 
    double baseExponent = scan.nextDouble(); 
    System.out.println("Type in a exponent power"); 
    double powerExponent = scan.nextDouble(); 
    double resultExponent = Math.pow(baseExponent, powerExponent); 
    Thread.sleep(2000); 
    System.out.println("Done!"); 
    System.out.println(resultExponent); 
    break;  
  }
  for(String cuberootFunction = "num.function(cuberoot)"; input1.equals(cuberootFunction);) {
    System.out.println("Enter a digit"); 
    double cuberootnumerical = scan.nextDouble(); 
    double cuberootresult = Math.cbrt(cuberootnumerical); 
    Thread.sleep(2000); 
    System.out.println("Done!"); 
    System.out.println(cuberootresult); 
    break; 
  }
  for(String logarithmicFunction = "num.function(log)"; input1.equals(logarithmicFunction);) {
    System.out.println("Enter a Value"); 
    double numericalLog = scan.nextDouble(); 
    double logResult = Math.log(numericalLog); 
    Thread.sleep(2000); 
    System.out.println("Done!"); 
    System.out.println(logResult);
    break;  
  }
  for(String sinFunction = "num.function(sin)"; input1.equals(sinFunction);) {
    System.out.println("Enter a digit"); 
    double numerical1 = scan.nextDouble(); 
    System.out.println("Do you want to set mode to Radians or Degress for trigonometric function parameter?"); 
    String trigoanswer = scan.next(); 
    if(trigoanswer.equals("Radians")) {
      double numericalRadians = Math.toRadians(numerical1); 
      double sinanswer = Math.sin(numericalRadians);
      Thread.sleep(2000); 
      System.out.println("Done!"); 
      System.out.println(sinanswer); 
    }else { 
      double numericalDegrees = Math.toDegrees(numerical1);
      double sinanswer = Math.sin(numericalDegrees);
      Thread.sleep(2000); 
      System.out.println("Done!"); 
      System.out.println(sinanswer);
    }
    break; 
  }
  for(String cosineFunction = "num.function(cos)"; input1.equals(cosineFunction);) {
    System.out.println("Enter a digit"); 
    double numerical2 = scan.nextDouble(); 
    System.out.println("Do you want to set mode to Radians or Degress for trigonometric function parameter?"); 
    String trigoanswer = scan.next(); 
    if(trigoanswer.equals("Radians")) {
      double numericalRadians1 = Math.toRadians(numerical2); 
      double cosanswer = Math.cos(numericalRadians1);
      Thread.sleep(2000); 
      System.out.println("Done!"); 
      System.out.println(cosanswer); 
    }else { 
      double numericalDegrees1 = Math.toDegrees(numerical2);
      double cosanswer = Math.cos(numericalDegrees1);
      Thread.sleep(2000); 
      System.out.println("Done!"); 
      System.out.println(cosanswer);
    }
    break; 
  }
   for(String tangentFunction = "num.function(tan)"; input1.equals(tangentFunction);) {
    System.out.println("Enter a digit"); 
    double numerical3 = scan.nextDouble(); 
    System.out.println("Do you want to set mode to Radians or Degress for trigonometric function parameter?"); 
    String trigoanswer = scan.next(); 
    if(trigoanswer.equals("Radians")) {
      double numericalRadians2 = Math.toRadians(numerical3); 
      double tananswer = Math.tan(numericalRadians2);
      Thread.sleep(2000); 
      System.out.println("Done!"); 
      System.out.println(tananswer); 
    }else { 
      double numericalDegrees2 = Math.toDegrees(numerical3);
      double tananswer = Math.tan(numericalDegrees2);
      Thread.sleep(2000); 
      System.out.println("Done!"); 
      System.out.println(tananswer);
    }
    break; 
  }
  for(String averageFunction = "num.function(Mean)"; input1.equals(averageFunction);) 
  {
    System.out.println("Add First Value"); 
    double average1 = scan.nextDouble();
    Thread.sleep(1000); 
    System.out.println();  
    System.out.println("Second Value"); 
    double average2 = scan.nextDouble();
    Thread.sleep(1000); 
    System.out.println(); 
    System.out.println("Do you want to add more values to this function?"); 
    String questionAvg = scan.next(); 
    if(questionAvg.equals("Yes")) { 
      System.out.println("Third Value"); 
      double average3 = scan.nextDouble(); 
      System.out.println();
      Thread.sleep(1000);
      System.out.println("Fourth Value"); 
      double average4 = scan.nextDouble(); 
      System.out.println(); 
      Thread.sleep(1000); 
      System.out.println("Fifth Value"); 
      double average5 = scan.nextDouble(); 
      System.out.println(); 
      Thread.sleep(1000); 
      System.out.println("Calculating values!"); 
      Thread.sleep(3000); 
      double averagelistValues = average1 + average2 + average3 + average4 + average5; 
      double average = averagelistValues / 5; 
      System.out.println("Done!"); 
      System.out.println(average);
    } else { 
      System.out.println("Calculating Values!"); 
      Thread.sleep(2000); 
      double averagelistValues1 = average1 + average2; 
      double averageTotal1 = averagelistValues1 / 2; 
      System.out.println("Done!"); 
      System.out.println(averageTotal1); 
    }
    break; 
  }
  for(String slopeVariation = "num.function(alg.slopeIntForm)"; input1.equals(slopeVariation);) 
  {
    System.out.println("Slope? (convert to decimal)");
    double slopeLine = scan.nextDouble(); 
    System.out.println(); 
    Thread.sleep(1000); 
    System.out.println("Y intercept (Put Negative or positive signs in front!"); 
    double yintform = scan.nextDouble(); 
    Thread.sleep(1000); 
    System.out.println(); 
    System.out.println("Is the Y intercept a Positive or Negative?"); 
    String answerOutput1 = scan.next(); 
    if(answerOutput1.equals("Positive")) { 
    System.out.println("Calculating...");
    Thread.sleep(2000); 
    System.out.println("Done!");
    System.out.println();
    System.out.println("Y = " + slopeLine + "x" + "+" + yintform); 
    System.out.println();
    }else{
    System.out.println("Calculating...");
    Thread.sleep(2000);
    System.out.println("Done!"); 
    System.out.println();
    System.out.println("Y = " + slopeLine + "x" + "-" + yintform); 
    System.out.println();
    }
    break; 
  }
  for(String medianOfList = "num.function(median)"; input1.equals(medianOfList);)
  {
    System.out.println("First Value"); 
    double ObjMedian1 = scan.nextDouble(); 
    System.out.println("Second Value"); 
    double ObjMedian2 = scan.nextDouble(); 
    System.out.println("Third Value"); 
    double ObjMedian3 = scan.nextDouble(); 
    System.out.println("Would you like to add more values?"); 
    String answerToQuestionMedian = scan.next(); 
    if(answerToQuestionMedian.equals("Yes")) { 
      System.out.println("Fourth Value"); 
      double ObjMedian4 = scan.nextDouble(); 
      System.out.println("Fifth Value"); 
      double ObjMedian5 = scan.nextDouble(); 
      System.out.println("{" + ObjMedian1 + ", " + ObjMedian2 + ", " + ObjMedian3 + ", " + ObjMedian4 +", " + ObjMedian5 + "}"); 
      System.out.println("Calculating Median from List!"); 
      Thread.sleep(2000); 
      System.out.println(); 
      System.out.println("Done!"); 
      System.out.println(ObjMedian3); 
    }else{ 
      System.out.println("{" + ObjMedian1 + ", " + ObjMedian2 + ", " + ObjMedian3 + "}"); 
      System.out.println("Calculating Median from List");
      System.out.println(); 
      Thread.sleep(2000);  
      System.out.println("Done!"); 
      System.out.println(ObjMedian2);
    }
    break; 
  }
  for(String mathAbsolute = "math.function(abs)"; input1.equals(mathAbsolute);) { 
    System.out.println("Do you want to return a value or an equation?"); 
    String answerForMath = scan.next(); 
    if(answerforMath.equals("value")) { 
      System.out.println("Enter One digit"); 
      double digits = scan.nextDouble(); 
      System.out.println("Calculating...");
      Thread.sleep(2000); 
      double absolute = Math.abs(digits); 
      System.out.println("Done!"); 
      System.out.println(absolute); 
    }else {
      System.out.println("Please Remember that whenever you are creating the equation, please put the sign next to the value cause our system is not that complex enough to guess if you want add/subtract/multiply/divide"); 
      String optionalesNxt = scan.next(); 
      
    }
    break; 
  }
  for(String changelog = "changelog"; input1.equals(changelog);) { 
    System.out.println("Checking Latest Updates from Clanboto Servers"); 
    Thread.sleep(2000); 
    System.out.println("Done!"); 
    System.out.println("Welcome to Clanboto Complier Update Ver 1.7.65"); 
    System.out.println(); 
    System.out.println("We have added new Math functions that are now accessible (eg: Square root function, cube root function, exponent function, logarithm functions, and trigonometric functions"); 
    System.out.println(); 
    System.out.println("Stay tuned for more major updates!"); 
    break; 
  }
   for(String helpCommand = "help"; input1.equals(helpCommand);) { 
     System.out.println("Welcome to help catalog! Here is a list of Commands to run"); 
     Thread.sleep(2000);  
     System.out.println("str.var()"); 
     System.out.println("int.var()"); 
     System.out.println("boollogic.var()"); 
     System.out.println("decimal.var()"); 
     System.out.println("num.floatInverse()"); 
     System.out.println("network.config()"); 
     System.out.println("bin.(1)"); 
     System.out.println("bin.(0)"); 
     System.out.println("num.func(add)"); 
     System.out.println("num.func(subtract)");
     System.out.println("num.func(multiply)");  
     System.out.println("num.func(divide)"); 
     System.out.println("num.function(squareroot)");
     System.out.println("num.function(exponent)");
     System.out.println("num.function(cuberoot)"); 
     System.out.println("num.function(log)"); 
     System.out.println("num.function(sin)"); 
     System.out.println("num.function(cos)"); 
     System.out.println("num.function(tan)"); 
     System.out.println("num.function(Mean)"); 
     System.out.println("num.function(median)"); 
     System.out.println("num.function(mode)"); 
     System.out.println("num.function(alg.slopeIntForm)"); 
     System.out.println("changelog"); 
     break; 
   }
  } 
} 
