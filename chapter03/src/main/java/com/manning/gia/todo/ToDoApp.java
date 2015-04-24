package com.manning.gia.todo;

import com.manning.gia.todo.utils.CommandLineInput;
import com.manning.gia.todo.utils.CommandLineInputHandler;

public class ToDoApp {
    public static final char DEFAULT_INPUT = '\u0000';

    public static void main(String[] args) {
       CommandLineInputHandler handler = new CommandLineInputHandler();
       char command = DEFAULT_INPUT;

       while (CommandLineInput.EXIT.getShortCmd() != command) {
           handler.printOptions();
           String input = handler.readInput();
           char[] inputChars = input.length() == 1 ? input.toCharArray() : new char[]{DEFAULT_INPUT};
           command = inputChars[0];
           CommandLineInput commandLineInput = CommandLineInput.getCommandLineInputForInput(command);
           handler.processInput(commandLineInput);
       }
    }
}
