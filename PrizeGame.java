//Jada Young 

import java.util.Scanner; 

public class PrizeGame {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String smallboxPrize = "For making it out you have won a brand new iPhone!"; //creating strings for the prize
        String hatPrize = "an envelope with $100,000 in it!";
        String travelbagPrize = "a brand new car!";

        System.out.println("Ranger, you are stuck in the wilderness and have to get out! I will give you 3 options. Would you like to keep a flashlight, "
                + "a protective hat or a bag? Enter \"keep\", \"hat\", or \"bag\":"); //This will print and the person gets to make a decision so they can continue

        String responseOne = key.next(); //this is to obtain the users 1st response

        if (responseOne.equals("keep")) { //this is if the user says "keep" then this question and statement will print
            System.out.println("OK! Let's see if you can make it out!");
            System.out.println("First obstacle: What is 56 * 50? Enter \"2700\", \"8900\", or \"2800\":");
            String responseTwo = key.next();

            if (responseTwo.equals("2800")) {
                System.out.println("That is correct! You are close to making it out brave one! It's time to move on to the second obstacle!");
            } else {
                System.out.println("Oh no! Wrong answer, unfortunately you are stuck in the wilderness!");
                System.exit(0); // this will exit the game if wrong and stop it from running
            }

            System.out.println("Oh no! There is a bear! Answer to avoid it! Bears love to eat ____. Enter \"fruit\", \"fish\", or \"both\":");
            String responseThree = key.next();
            if (responseThree.equals("both")) {
                System.out.println("Great Job avoiding that! You are almost out! Here is the final obstacle!");
                System.out.println("The sun is not a star. Enter \"true\" or \"false\":"); //boolean 
                String responseFour = key.next();
                if (responseFour.equals("true")) {
                    System.out.println("Congratulations! You have completed the final obstacle and you are free I also have a little suprise for you!");
                    System.out.println("Ranger,  " + smallboxPrize); //using this variable to display the prize if the user wins
                } else {//this will print if the user gets the 3rd decision wrong 
                    System.out.println("Oh no! Wrong answer, unfortunately you are stuck! Try again you were so close!");
                }
            } else {//this will print if the user gets the 4th decision wrong
                System.out.println("Oh no! Wrong answer, you have been attacked by a bear!");
            }

            
            
            
        } else if (responseOne.equals("hat")) {
            System.out.println("That's a great choice because the weather may be terrible! Let's see if you can make it out!");
            System.out.println("First obstacle: What year was president Barack Obama elected? Enter \"2007\", \"2009\", or \"2008\":");
            String responseTwo = key.next();

            if (responseTwo.equals("2008")) {
                System.out.println("That is correct! You are close to making it out brave one! It's time to move on to the second obstacle!");
            } else {
                System.out.println("Oh no! Wrong answer, unfortunately you are stuck in the wilderness!");
                System.exit(0); //this will exit the game if wrong
            }

            System.out.println("Oh no! There is a bear! Answer to avoid it! Fill in the blank. Michael ____ is a famous basketball player. Enter \"Jackson\", \"Jordan\", or \"Phelps\":");
            String responseThree = key.next();
            if (responseThree.equals("Jordan")) {
                System.out.println("Great Job avoiding that! You are almost out! Here is the final obstacle!");
                System.out.println("On average, how many days are in a month?");
                int responseFour = key.nextInt();
                if (responseFour >= 28 && responseFour <= 31) {//this is used to check if both statements are true
                    System.out.println("Congratulations! You have completed the final obstacle and you are free I also have a little suprise for you!");
                    System.out.println("Ranger, you have won " + hatPrize);
                } else {
                    System.out.println("Oh no! Wrong answer, unfortunately you are stuck! Try again you were so close!");
                }
            } else {
                System.out.println("Oh no! Wrong answer, you have been attacked by a bear!");
            }

            
            
        } else if (responseOne.equals("bag")) {
            System.out.println("That's a great choice my smart Ranger! Lets see if you can make it out!");
            System.out.println("First obstacle: How many planets are in the solar system? Enter \"7\", \"9\", or \"8\":");
            String responseTwo = key.next();

            if (responseTwo.equals("8")) {
                System.out.println("That is correct! You are close to making it out brave one! It's time to move on to the second obstacle!");
            } else {
                System.out.println("Oh no! Wrong answer, unfortunately you are stuck in the wilderness!");
                System.exit(0); 
            }

            System.out.println("Oh no! There is a bear! Answer to avoid it! When life gives you lemons, make ____. Enter \"Orange juice\", \"Lemonade\", or \"Sweet tea\":");
            String responseThree = key.next();
            if (responseThree.equals("Lemonade")) {
                System.out.println("Great Job avoiding that! You are almost out! Here is the final obstacle!");
                System.out.println("On average, how long (in minutes) does it take for the average person to fall asleep?");
                int responseFour = key.nextInt();
                if (responseFour >= 15 && responseFour <= 20) {//this is checking to see if both statements are true
                    System.out.println("Congratulations! You have completed the final obstacle and you are free I also have a little suprise for you!");
                    System.out.println("Contestant 1, you have won " + travelbagPrize);
                } else {
                    System.out.println("Oh no! Wrong answer, unfortunately you are stuck! Try again you were so close!");  
                }
            } else {
                System.out.println("Oh no! Wrong answer, you have been attacked by a bear!");
            }
        } 

        System.exit(0); 
    }
}

