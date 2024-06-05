# Shut_the_box_game
a game where you roll a dice and knock down corresponding tiles, till you run out of tiles to be able to knock down 

Game class 

Private instance variables 

Private int[] arr;
Creates a global integer array to store the values of the boarc 
Private int remaining;
Stores the total number of remaining tiles the player has 
Private String plyName;
Stores the players name

Public Game()
Default constructor 
Initializes array arr with a size of 12
Remaining is set to 0
And inputs values from 1-12 into the array 

Public void setRemaining(int val)
Sets remaining variable to val
Public String getPlyName()
Returns the players name 
Public void setPlyName(String name)
Sets players name with name 
Public int getRemaining()
Adds up all the numbered tiles in the array 
Public void enterGame()
Allows players to start the game and enter their name 
Preconditions: none
Post conditions: statements are printed 
Public void startGame()
Uses math.random to print out two dices 
Players are then to replace tiles on their board with 0’s
The board is printed 
Players are allowed to stop playing when they run out of tiles 
Preconditions: none
Post conditions: board is printed with certain tiles knocked out
Public void printBoard()
Prints the values in the array 
Preconditions: none 
Post conditions: board is printed

Main class 

Public static void findTheWinner()
Calls getRemaining() for each player and find the player with the least amount of points remaining 
Preconditions: none
Post conditions: prints which player has won 



