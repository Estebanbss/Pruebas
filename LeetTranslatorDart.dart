import 'dart:io';

void main() {
  stdout.writeln("Ingrese el texto a traducir al lenguaje leet: ");
  String? entrada = stdin.readLineSync();

  print(LeetTranslator(entrada!));
}

String LeetTranslator(String text) {
  var leetText = "";
  const Map<String, String> leetmap = {
    "a": "4",
    "b": "|3",
    "c": "(",
    "d": "[>",
    "e": "3",
    "f": "|=",
    "g": "6",
    "h": "|-|",
    "i": "|",
    "j": "_|",
    "k": "[<",
    "l": "|_",
    "m": "/\\/\\",
    "n": "|\|",
    "o": "0",
    "p": "9",
    "q": "0_",
    "r": "|2",
    "s": "5",
    "t": "7",
    "u": "|_|",
    "v": "\/",
    "w": "\/\/",
    "x": "><",
    "y": "`/",
    "z": "2",
  };
  List<String> caracteres = text.toLowerCase().split("");

  for (String caracter in caracteres) {
    if (leetmap.containsKey(caracter)) {
      leetText += leetmap[caracter]!;
    } else {
      leetText += caracter;
    }
  }

  return leetText;
}
