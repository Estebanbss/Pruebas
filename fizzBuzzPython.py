#multiplos de 3 = fizz
#multiplos de 5 = buzz
#multiplos de 3 y 5 = fizzBuzz
#identificando del 1 al 100 los multiplos con determinada palabra, dicho anteriormente


def fizzBuzzPython():
    for i in range (1,101):
       if(i%3 == 0 and i%5 == 0):
           print("fizzBuzz")
       elif(i%5 == 0):
           print("buzz")
       elif(i%3 == 0):
           print("fizz")
       else:
           print(i)

fizzBuzzPython(),