package com.uecpe20231122784;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class labact3 {
    public static void program1() {
        int number = 4;
        System.out.println("number is " + number);
        System.out.println("I will increment number.");
        number++;
        System.out.println("Now, number is " + number);
        System.out.println("I will decrement number.");
        number--;
        System.out.println("Now, number is " + number);
    }

    public static void program2() {
        int number = 4;
        System.out.println("number is " + number);
        System.out.println("I will increment number.");
        ++number;
        System.out.println("Now, number is " + number);
        System.out.println("I will decrement number.");
        --number;
        System.out.println("Now, number is " + number);
    }

    public static void program3() {
        int number = 1;
        while (number <= 5)
        {
            System.out.println("Hello");
            number++;
        }
        System.out.println("That's all!");
    }

    public static void program4() {
        final int MIN_PLAYERS = 9;     // Minimum players per team
        final int MAX_PLAYERS = 15;    // Maximum players per team
        int players;                   // Number of available players
        int teamSize;                  // Number of players per team
        int teams;                     // Number of teams
        int leftOver;                  // Number of leftover players
        String input;                  // To hold the user input
        input = JOptionPane.showInputDialog("Enter the number of players per team.");
        teamSize = Integer.parseInt(input);
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
        {
           input = JOptionPane.showInputDialog("The number must be at least " + MIN_PLAYERS + " and no more than " + MAX_PLAYERS + ".\n Enter the number of players.");
           teamSize = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog("Enter the available number of players.");
        players = Integer.parseInt(input);
        while (players < 0)
        {
           input = JOptionPane.showInputDialog("Enter 0 or greater.");
           players = Integer.parseInt(input);
        }
        teams = players / teamSize;
        leftOver = players % teamSize;
        JOptionPane.showMessageDialog(null, "There will be " + teams + " teams with " + leftOver + " players left over.");
        System.exit(0);
    }

    public static void program5() {
        int score1, score2, score3;      // Three test scores
        double average;                  // Average test score
        char repeat;                     // To hold 'y' or 'n'
        String input;                    // To hold input
        System.out.println("This program calculates the average of three test scores.");
        Scanner keyboard = new Scanner(System.in);
        do
        {
           System.out.print("Enter score #1: ");
           score1 = keyboard.nextInt();
           System.out.print("Enter score #2: ");
           score2 = keyboard.nextInt();
           System.out.print("Enter score #3: ");
           score3 = keyboard.nextInt();
           keyboard.nextLine();
           average = (score1 + score2 + score3) / 3.0;
           System.out.println("The average is " + average);
           System.out.println(); 
           System.out.println("Would you like to average another set of test scores?");
           System.out.print("Enter Y for yes or N for no: ");
           input = keyboard.nextLine();
           repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y');

        keyboard.close();
    }

    public static void program6() {
        int number; // Loop control variable
        System.out.println("Number Number Squared");
        System.out.println("------------------------");
        for (number = 1; number <= 10; number++)
        {
           System.out.println(number + "\t\t" + number * number);
        }
    }

    public static void program7() {
        int number;      // Loop control variable
        int maxValue;    // Maximum value to display
        System.out.println("I will display a table of numbers and their squares.");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How high should I go? ");
        maxValue = keyboard.nextInt();
        System.out.println("Number Number Squared");
        System.out.println("-----------------------");
        for (number = 1; number <= maxValue; number++)
        {
           System.out.println(number + "\t\t" + number * number);
        }
    }

    public static void program8() {
        for (int hours = 1; hours <= 12; hours++)
        {
            for (int minutes = 0; minutes <= 59; minutes++)
            {
                for (int seconds = 0; seconds <= 59; seconds++)
                {
                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                }
            }
        }
    }

    public static void program9() throws IOException {
        String filename = "default";      // File name
        String friendName;    // Friend's name
        int numFriends;       // Number of friends
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();
        PrintWriter outputFile = new PrintWriter(filename);
        for (int i = 1; i <= numFriends; i++)
        {
            System.out.print("Enter the name of friend number " + i + ": ");
            friendName = keyboard.nextLine();
            outputFile.println(friendName);
        }
        outputFile.close();
        System.out.println("Data written to the file.");

        keyboard.close();
    }

    public static void program10() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a file: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        String line = inputFile.nextLine();
        System.out.println("The first line in the file is:");
        System.out.println(line);
        inputFile.close();
        keyboard.close();
    }

    public static void program11() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext())
        {
           String friendName = inputFile.nextLine();
           System.out.println(friendName);
        }
        inputFile.close();
        keyboard.close();
    }

    public static void program12() throws IOException {
        double sum = 0.0;
        File file = new File("Numbers.txt"); // create Numbers.txt and fill with LF-separated numbers
        if (!file.exists())
        {
           System.out.println("The file Numbers.txt is not found.");
           System.exit(0);
        }
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
           double number = inputFile.nextDouble();
           sum = sum + number;
        }
        inputFile.close();
        System.out.println("The sum of the numbers in Numbers.txt is " + sum);
    }

    public static void program13() throws IOException {
        String filename;           // Filename
        String friendName;         // Friend's name
        int numFriends;            // Number of friends
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();
        File file = new File(filename);
        if (file.exists())
        {
           System.out.println("The file " + filename + " already exists.");
           System.exit(0);
        }
        PrintWriter outputFile = new PrintWriter(file);
        for (int i = 1; i <= numFriends; i++)
        {
            System.out.print("Enter the name of friend number " + i + ": ");
           friendName = keyboard.nextLine();
           outputFile.println(friendName);
        }
        outputFile.close();
        keyboard.close();
        System.out.println("Data written to the file.");
    }

    public static void program14() {
        int number1;        // A number
        int number2;        // Another number
        int sum;            // The sum of the numbers
        int userAnswer;     // The user's answer
        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        number1 = randomNumbers.nextInt(100);
        number2 = randomNumbers.nextInt(100);
        System.out.println("What is the answer to the following problem?");
        System.out.print(number1 + " + " + number2 + " = ? ");
        sum = number1 + number2;
        userAnswer = keyboard.nextInt();
        if (userAnswer == sum)
            System.out.println("Correct!");
        else
            System.out.println("Sorry, wrong answer. The correct answer is " + sum);
        keyboard.close();
    }

    public static void program15() {
        
    }
}
