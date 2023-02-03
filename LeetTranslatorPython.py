
def LeetTranslator(text:str) -> str: 
    leetText=""
    leet_map = {
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
    "s": "5 ",
    "t": "7",
    "u": "|_|",
    "v": "\/",
    "w": "\/\/",
    "x": "><",
    "y": "`/",
    "z": "2",     
    }
    
    for word in text.lower(): 
        if word in leet_map:    
            leetText += leet_map[word]
        else:
            leetText += word 

    return leetText

entrada = str(input("Ingrese el texto a traducir a lenguaje leet: "))
print(LeetTranslator(text=entrada))


