import java.util.*;
public class IdentifyDataType{

 public static void main(String[] args)
 {
 Scanner input = new Scanner (System.in);

 if (input.hasNextShort())
 {
    System.out.println("Recommended type Short.");
    if (input.hasNextInt())
    System.out.println("Can be stored in type Integer.");
    if (input.hasNextLong())
    System.out.println("Can be stored in type Long.");
  }


  else if (input.hasNextInt())
  {
    System.out.println("Recommended type Integer.");
    if (input.hasNextLong())
    System.out.println("Can be stored in type Long.");
  }

  else if (input.hasNextLong())
  System.out.println("Recommended type Long.");

   else if (input.hasNextFloat())
   {
     System.out.println("Recommended type Float.");
     if (input.hasNextDouble())
     System.out.println("Can be stored in type Double.");
   }

  else if (input.hasNextDouble())
  System.out.println("Recommended type Double.");

  else if (input.hasNextBoolean())
  System.out.println("Recommended type Boolean.");

  else if (input.hasNextLine())
  System.out.println("Recommended type string.");

 }
}
