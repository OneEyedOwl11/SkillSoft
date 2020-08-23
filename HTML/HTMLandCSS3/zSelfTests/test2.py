"""keepGoing.py
demonstrate loop with multiple exits"""

correct = "IndyPy"
tries = 0

keepGoing = True
while(keepGoing):

  tries = tries + 1
  print ("try # ", tries)

  guess = input("What is the Password? ")
  if guess == correct:
    print("thats' correct: here's the treasure!")
    keepGoing = False
    
  elif tries >= 3:
    print("Too many wrong tries. Launching the Missiles!")
    keepGoing = False
    