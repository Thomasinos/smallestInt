# smallestInt

Thomas,

As you know, the code runs. It is not useable for its intended purpose. If you wish to reclaim some of your deducted points on Assignment Week 3, please read my comments below, make revisions, and discuss your modified work with me in a weekend appointment or in office hours Monday.

Thank you for your consideration,
Laura
--
Your variable noans is a good device for figuring out whether the user entered any integers. Notice that the initial noans value (true) is immediately overwritten with false in every case in your implementation.

Instead of using true as the condition on your while loop, how about prompting the user for initial input before writing the while loop. (You can initialize a variable minText to the user's String input.) You will be able to assign a correct value to noans at this point. Then you can use !firstinp.equals("Q") && !firstinp.equals("q") as the condition that must be met for the while loop to be executed.  (Perhaps userText would be a better name for the variable than firstinp.) You are now free to compare the integer version of userText and the integer version of minText. 

You are right to prompt the user for userText again in the body of the while loop: Remember that you have to update the loop variable (in the body of the while loop) to avoid an infinite loop.

As the finishing touch, compare your output with the formatting in the assignment specification. In order to match the specifications, omit the printing (repeating) of the user's input.
