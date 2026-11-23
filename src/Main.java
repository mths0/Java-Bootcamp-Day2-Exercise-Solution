import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Exercise (Java Basics)

        Scanner sc = new Scanner(System.in);


//        1. Develop a program that takes the weight (in kilograms) and height (in meters)
//        as input and calculates the BMI, then prints it.
//              • Input: Weight (kg) = 70, Height (m) = 1.75
//              • Expected Output: BMI = 22.86

        System.out.println("\n\nQuestion 1:");
        System.out.print("Enter Weight (kg): ");
        int weight = sc.nextInt();
        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();
        System.out.println("BMI = " + weight / (height * height));



//        2. Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//              • Input: Obtained Marks = 85, Total Marks = 100
//              • Expected Output: Percentage = 85.0%

        System.out.println("\n\nQuestion 2:");
        System.out.print("Enter Student mark: ");
        double marks = sc.nextDouble();
        System.out.print("Enter the full mark: ");
        double fullMarks = sc.nextDouble();
        System.out.println("Percentage = " + (marks / fullMarks) * 100 + "%");



//        3. Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
//              • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//              • Expected Output: Amount in EUR = 85.0

        System.out.println("\n\nQuestion 3:");
        System.out.print("Enter amount in USD: ");
        double amountInUSD = sc.nextDouble();
        System.out.print("Enter the exchange rate: ");
        double exchangeRate = sc.nextDouble();
        System.out.print("Amount in EUR = " + amountInUSD * exchangeRate);



//        4. Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
//              • Input: "Hello, World!"
//              • Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"
        sc.nextLine();
        System.out.println("\n\nQuestion 4:");
        System.out.print("Enter a sentence ex,\"Hello world!\": ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Length of the string: " + sb.length() + " And Reversed string: " + sb.reverse());



//        5. Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.
//              • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
//              • Expected Output: "brown fox"

        System.out.println("\n\nQuestion 5:");
        System.out.print("Enter a sentence ex,\"The quick brown fox jumps over the lazy dog\": ");
        String sentence5 = sc.nextLine();
        System.out.print("Enter start Index ex(0): ");
        int startIndex5 = sc.nextInt();
        System.out.print("Enter end Index ex(4): ");
        int endIndex5 = sc.nextInt();
        System.out.println(sentence5.substring(startIndex5, endIndex5));



//        6. Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.
//              • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
//              • Expected Output: Keyword "jumps" is present in the sentence.

        sc.nextLine();
        System.out.println("\n\nQuestion 6:");
        System.out.print("Enter a sentence ex,\"The quick brown fox jumps over the lazy dog\": ");
        String sentence6 = sc.nextLine();
        System.out.print("Enter a keyword to search for ex,\"jumps\": ");
        String keyword = sc.nextLine();
        System.out.println("Does keyword exists in the sentence? " + sentence6.contains(keyword));



//        7. Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified
//        sentence.
//              • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
//              • Expected Output: "The quick brown cat jumps over the lazy dog"

        System.out.println("\n\nQuestion 7:");
        System.out.print("Enter a sentence ex,\"The quick brown fox jumps over the lazy dog\": ");
        String sentence7 = sc.nextLine();
        System.out.print("Enter a word that u want to replace ex,\"fox\": ");
        String oldWord = sc.nextLine();
        System.out.print("Enter a word that u want to replace" + oldWord + " with ex,\"cat\": ");
        String newWord = sc.nextLine();
        System.out.println(sentence7.replaceAll(oldWord, newWord));



//        8. Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not.
//              • Input: String 1 = "Hello", String 2 = "hello"
//              • Expected Output: Strings are equal (ignoring case).

        System.out.println("\n\nQuestion 8:");
        System.out.print("Enter the first word: ");
        String firstString = sc.nextLine();
        System.out.print("Enter the second word: ");
        String secondString = sc.nextLine();
        System.out.println("are Strings equal (ignoring case)? " + firstString.equalsIgnoreCase(secondString));



    }
}
