package com.company;

public class Main {
    public static void main(String[] args) {
        int playerFirstChoice, playerSecondChoice, doorWithPrize, hostDoesntOpen, winCount, loseCount, numberOfSimulations, numberOfDoors;
        winCount = loseCount = 0;
        numberOfSimulations = 100;
        numberOfDoors = 50;
        boolean changeAnswer = true;
        for(int i = 0; i < numberOfSimulations; i++) {
            doorWithPrize = (int) (Math.ceil(Math.random()*numberOfDoors));
            playerFirstChoice = (int) (Math.ceil(Math.random()*numberOfDoors));
            while(true) {
                hostDoesntOpen = (int) (Math.ceil(Math.random()*numberOfDoors));
                if(playerFirstChoice!=doorWithPrize) {
                    if (hostDoesntOpen == doorWithPrize) {
                        break;
                    }
                } else {
                    if(hostDoesntOpen != playerFirstChoice) {
                        break;
                    }
                }
            }
            if(changeAnswer) {
                playerSecondChoice = hostDoesntOpen;
            } else {
                playerSecondChoice = playerFirstChoice;
            }
            if(playerSecondChoice==doorWithPrize) {
                System.out.println("Player Wins - The player chose the door: "+playerSecondChoice+
                        ", Original choice: "+playerFirstChoice+", Door with prize: "+doorWithPrize+
                        ", Shown door: "+hostDoesntOpen);
                winCount++;
            } else {
                System.out.println("Player Loses - The player chose the door: "+playerSecondChoice+
                        ", Original choice: "+playerFirstChoice+", Door with prize: "+doorWithPrize+
                        ", Shown door: "+hostDoesntOpen);
                loseCount++;
            }
        }
        System.out.println("Wins: "+winCount+", Losses: "+loseCount);
    }
}
