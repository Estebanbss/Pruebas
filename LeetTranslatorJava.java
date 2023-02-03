import java.util.Map;
import java.util.Scanner;

public class LeetTranslatorJava {
    public static void main(String[] args) {
        LeetTranslatorJava translator = new LeetTranslatorJava();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese el texto a traducir ");
       String text = scanner.nextLine();
       System.out.println(translator.LeetTranslator(text)); 
        scanner.close();
    }


private String LeetTranslator(String texto){
  String leetText="";
   Map<String,String> leetmap = Map.ofEntries(
     Map.entry("a", "4"),
     Map.entry("b", "|3"),
     Map.entry("c", "("),
     Map.entry("d", "[>"),
     Map.entry("e", "3"),
     Map.entry("f", "|="),
     Map.entry("g", "6"),
     Map.entry("h", "|-|"),
     Map.entry("i", "|"),
     Map.entry("j", "_|"),
     Map.entry("k", "[<"),
     Map.entry("l", "|_"),
     Map.entry("m", "/\\/\\"),
     Map.entry("n", "|\\|"),
     Map.entry("o", "0"),
     Map.entry("p", "9"),
     Map.entry("q",  "0_"),
     Map.entry("r","|2"),
     Map.entry("s", "5"),
     Map.entry("t", "7"),
     Map.entry("u", "|_|"),
     Map.entry("v", "\\/"),
     Map.entry("w", "\\/\\/"),
     Map.entry("x", "><"),
     Map.entry("y", "`/"),
     Map.entry("z", "2")

   );
   String textominuscula = texto.toLowerCase();

   for (int i =0; i < textominuscula.length(); i++){
   char c =textominuscula.charAt(i);
  
    if(leetmap.containsKey(String.valueOf(c))){
      leetText += leetmap.get(String.valueOf(c));
    }
    else{
      leetText += c;
    }
   } 
   
   return leetText;
}

}