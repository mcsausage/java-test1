# Start IT Java group practical test
2019-04-05

### Welcome, young grasshopper!

Today you will create your own start-up business. *(Wait, wasn't this about programming or something?)*

My name is Tom and I will be your personal assistant on this journey.
Like any good story, yours will also require a lot of logical thinking and problem solving skills. Your tools for the job are your brain and the Java programming language. As you encounter problems, think about them in an abstract manner, break them down into steps and sub-problems, and apply the toolset you have acquired over the last 1.5 weeks.

Godspeed!

### Task 1: Grand opening!

It is the first day of your new business. Time to do a grand opening! Sadly the robot that you hired to do meet-and-greet is broken. The main module is missing and it is up to you to write the core functionality and save the opening ceremony.

Create an application that:
- greets the user and asks for their name
- politely echoes the user's name back, and invites them into the opening ceremony

### Task 2: A Visual Update

The grand opening day is over and went great! While interacting with potential customers, we got a lot of ideas, for example, about a new logo. Supposedly, you can draw pretty spirals by using the Fibonacci sequence as a guide. The Fibonacci sequence is a sequence of numbers where each new number is generated by adding the two previous numbers. The first few Fibonacci numbers are: `1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .... etc.` To create a really beautiful spiral-logo, the designer needs at least 1000 Fibonacci numbers for reference.

Create an application that:
- prints 1000 Fibonacci numbers

_(if you are curious, after the test you can learn more about the Fibonacci spiral here: https://en.wikipedia.org/wiki/Fibonacci_number )_

### Task 3: Branding

Now that we have a hip logo, let's work on our business name. Nowadays all cool brand names are palindromes - words or sentences that read the same from both ends. For example: "level", "step on no pets". We should make our company name palindromic as well, and we should do it quick!

Create an application that:
- prints if your user input is a palindrome or not

#### Examples:
input|output
:-|:-:
`Amazon`|`no`
`Amazama`|`yes`

**Note:** Java is case-sensitive by default, and by default will consider, say, `E` to be different from `e`

### Task 4: Mobile market

With the brand all set up, you decided to make a run in the smartphone app market. You outsourced the development of your mobile app, but of course the company tasked with it was incompetent. Credit card encryption is seriously flawed and it is up to you to fix it. You decide to pick the current top-notch encryption algorithm which goes like this.

Looking at the credit card number digit-by-digit (ignoring any letters or dashes) create a single "hash" by summing together all digits that are followed by the same digit. To increase security consider the card number to "loop" around itself (a.k.a.imagine that the first digit follows the last one).

Create an application that:
- lets the user input their credit card number
- outputs the hash

#### Examples:
input|output|comments
:-|:-:|:-
`1122`|`3`|1 + 2, because the first digit (1) matches the second and the third digit (2) matches the fourth
`22-22`|`8`|2+2+2+2, because each digit (all 2) matches the next one (remember that the digits "loop" around and non-digits are ignored)
`1234`|`0`|because no number matches the next one
`HA-9121219`|`9`|because only the last nine matches the next digit (the first nine, and symbols are ignored)