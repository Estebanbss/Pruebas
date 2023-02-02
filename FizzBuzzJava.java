public class FizzBuzzJava{
  public static void main(String[] args) {
    FizzBuzz primosBuscador = new FizzBuzz();

    primosBuscador.fizzBuzzM();
}  
}

class FizzBuzz{
   public void fizzBuzzM(){
    for (int i=1; i<=100; i++){
        if (i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
        }
        else if (i%3==0){
            System.out.println("Fizz");
        }
        else if (i%5==0){
            System.out.println("Buzz");
        }
        else{
           System.out.println(i);
        }
    }
   }
}