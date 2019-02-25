package com.venky;

public class Main {

    public static void main(String[] args) {


        firstMethod(true, 800, 5, 100);

        firstMethod(true, 10000, 8, 200);

        int var = firstMethod2(true, 800, 5, 100);
        System.out.println("the secondscore result is = " + var);


    }


    public static void firstMethod(boolean game, int score, int levelCompleted, int bonus) {
        if (game) {
            int result = score + (levelCompleted * bonus);
            result += 1000;
            System.out.println("the secondscore result is = " + result);
        }
    }

    public static int firstMethod2(boolean game, int score, int levelCompleted, int bonus) {
        if (game) {
            int result = score + (levelCompleted * bonus);
            result += 1000;
            return result;
        }
        return -1;
        //else {
//       // return -1;
//    }
    }


}


