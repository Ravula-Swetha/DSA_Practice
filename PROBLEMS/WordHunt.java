/* In the village of Alphaville, where the houses are arranged in a grid pattern like a big crossword puzzle,
the local children love playing a game called "Word Hunt." 

In this game, a 2D grid is drawn on the ground, each cell filled with a single English letter. 

The goal is to find specific words in the grid that can be formed by connecting letters horizontally or vertically. 
Words can be read left to right, right to left, top to bottom, or bottom to top.

One sunny day, the children decide to challenge you to this game. 
They provide you with a grid filled with letters and a word to find. 

Your task is to determine if the word exists anywhere in the grid 
according to the game's rules.

Test Case 1
Input = 3 4
a b c s 
s f c e 
a d e e 
see
output = true

Test Case 2
Input = 4 4 
x y z t 
w x y z 
p q r t 
z o o z 
zoom
output = false */

import java.util.*;

class WordHunt{
    public static boolean helper(String[][] str, String key, int m, int n){
        boolean flag = false;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(str[i][j].equals(key.substring(0, 1))){
                    if(check(str, i, j, key, m, n)){
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
    public static boolean check(String[][] str, int row , int col, String key, int m, int n){
        boolean flag = false;
        for(int j = 1; j < key.length(); j++){
            // move down
            while(row < m){
                if(str[row][col].equals(key.substring(j))){
                    row++;
                    if(j == key.length()){
                        flag = true;
                        return flag;
                    } 
                }
                else{
                    break;
                }
            }
            // move up
            while(row >= 0){
                if(str[row][col].equals(key.substring(j))){
                    row--;
                    if(j == key.length()){
                        flag = true;
                        return flag;
                    } 
                }
                else{
                    break;
                }
            }
            // move right
             while(col < n){
                if(str[row][col].equals(key.substring(j))){
                    col++;
                    if(j == key.length()){
                        flag = true;
                        return flag;
                    } 
                }
                else{
                    break;
                }
            }
             while(col >= 0){
                if(str[row][col].equals(key.substring(j))){
                    col--;
                    if(j == key.length()){
                        flag = true;
                        return flag;
                    } 
                }
                else{
                    break;
                }
            }
        }
       return flag;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String[][] str = new String[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                str[i][j] = in.next();
            }
        }
        String key = in.next();
        System.out.println(helper(str, key, m, n));
        in.close();
    }
}