*I recommend reading this in the "raw" format,
for it to make sense.*

# Lab_14
Rock, Paper, Scissors.

HOW THE getWinner METHOD WORKS

Instead of using a bunch of if else statemnts, I used this formula that I came up with.
I am sharing this to help people understand it.

-----------------------------------

Paper = 0                <= I'm assigning a specified numerical value to each.
Rock = 0.4              <= (Note: this formula doesn't work with just any numbers.)
Scissors = 0.9

P  >  R  =>  0.0  -  0.4  =  -0.4
P  <  S  =>  0.0  -  0.9  =  -0.9               All of these situations correspond to
R  <  P  =>  0.4  -  0.0  =  +0.4               a different numerical outcome that can
R  >  S  =>  0.4  -  0.9  =  -0.5                be matched by an "if else" statement.
S  >  P  =>  0.9  -  0.0  =  +0.9
S  <  R  =>  0.9  -  0.4  =  +0.5

-The lines with ">" are player 1 victories,
-the ones with "<" are player 2.

-So, if the outcome is -0.4, -0.5, or 0.9, player 1 wins.
-If it's 0.4, 0.5, or -0.9, then player 2 wins.
-If it's 0.0, it's a tie.



--------------------------------------------
I'm giving my own formula, so if you use this in the future,
please credit me. Thanks. -Harley Johnson.
--------------------------------------------
