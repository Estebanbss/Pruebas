//multiplos de 3 = fizz
//multiplos de 5 = buzz
//multiplos de 3 y 5 = fizzBuzz
//identificando del 1 al 100 los multiplos con determinada palabra, dicho anteriormente

void main() {
  fizzBuzzDart();
}

void fizzBuzzDart() {
  for (int i = 1; i <= 100; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
      print("fizzBuzz");
    } else if (i % 3 == 0) {
      print("fizz");
    } else if (i % 5 == 0) {
      print("Buzz");
    } else {
      print(i);
    }
  }
}
