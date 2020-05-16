# Project: Coffee Machine


## About:

This is simple Java program represents the coffee machine.


## Description:

The program contains one class and 5 methods: start(); buy(); fill(); remaining(); take();

The class use system input to handle input that comes to it via these methods and its string argument.

This system simulates pretty accurately how real-world electronic devices work. External components (like buttons on the coffee machine or tapping on the screen) generate events that pass into the single interface of the program.


## Challenges:

The class should not use system input at all; it only should handle input that comes to it via method and its string argument.
Every time the user inputs a line (a string) to the console, the program invokes this method with one argument.
How can the method determine what that input is?

## Solution:

Store the current state of the machine. every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information about the current state.
The most efficient way of handling states is using an enum with all predefined states. 