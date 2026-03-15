package com.gla.Methods.Level_3;

//Create a program to find the shortest, tallest, and mean height of players present in a
//football team.
//Hint =>
//a. The formula to calculate the mean is: mean = sum of all elements/number of elements
//b. Create an int array named heights of size 11 and get 3 digits random height in cms for
//each player in the range 150 cms to 250 cms
//c. Write the method to Find the sum of all the elements present in the array.
//d. Write the method to find the mean height of the players on the football team
//e. Write the method to find the shortest height of the players on the football team
//f. Write the method to find the tallest height of the players on the football team
//g. Finally display the results

class FootballTeam {
    public int[] generateHeights(int teamSize) {
        int[] heights = new int[teamSize];
        for (int i = 0; i < teamSize; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) sum += array[i];
        return sum;
    }

    public double findMeanHeight(int[] heights) {
        return (double) sumArray(heights) / heights.length;
    }

    public int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++)
            if (heights[i] < shortest) shortest = heights[i];
        return shortest;
    }

    public int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > tallest) tallest = heights[i];
        return tallest;
    }

    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        int[] heights = team.generateHeights(11);
        System.out.println("Heights of Players (in cms):");
        for (int i = 0; i < heights.length; i++)
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cms");
        System.out.println("\nShortest Height : " + team.findShortestHeight(heights) + " cms");
        System.out.println("Tallest Height  : " + team.findTallestHeight(heights) + " cms");
        System.out.printf("Mean Height     : %.2f cms%n", team.findMeanHeight(heights));
    }
}



