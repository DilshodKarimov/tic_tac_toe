package com.example.tic_tac_toe.model;

public class Matrix {
    // true можно ставить х о
    // false нельзя ставить x о
    private boolean set = true;
    private int[][] matrix= new int[3][3];
    // turn x if true
    // turn O if false
    private boolean turn;

    int draw = 0;

    public Matrix(){
        refresh();
    }
    public String getTurn(){
        if(draw == 9){
            return "Ничья))";
        }
        if(!set){
            String res = (turn) ? "нолик" : "иксик";
            return "поздравляю выиграл " + res;

        }
        return (turn) ? "Ход Х" : "Ход 0";
    }
    public void setValue(int i, int j){
       if(matrix[i][j] == -1 && set){
            matrix[i][j] =   (turn) ? 1 : 0;
            turn = !turn;
            set = check();
            draw++;
       }
    }
    public String getValue(int i,int j){
        if(matrix[i][j] == -1){
            return  "";
        }
        return (matrix[i][j] == 1) ? "X" : "0";
    }
    private boolean check (){

        //диоганальная проверка
        for(int i=1;i < 3;i++){
            if(matrix[i][i] != matrix[0][0] || matrix[i][i] == -1){
                break;
            }
            if(i == 2){
                return false;
            }
        }
        for(int i=1;i < 3;i++){
            if(matrix[i][2-i] != matrix[0][2] || matrix[i][2-i] == -1){
                break;
            }
            if(i == 2){
                return false;
            }
        }

        // горизонтальная проверка
        for(int i=0;i < 3;i++){
            for(int j=1;j < 3;j++){
                if(matrix[i][j] != matrix[i][0] || matrix[i][j] == -1){
                    break;
                }
                if(j == 2){
                    return false;
                }
            }
        }

        // вертикальная проверка
        for(int i=0;i < 3;i++){
            for(int j=1;j < 3;j++){
                if(matrix[j][i] != matrix[0][i] || matrix[j][i] == -1 ){
                    break;
                }
                if(j == 2){
                    return false;
                }
            }
        }
        return true;
    }
    public void refresh(){
        set = true;
        turn = true;
        draw = 0;
        for(int i=0;i < 3;i++){
            for(int j=0;j < 3;j++){
                this.matrix[i][j] = -1;
            }
        }
    }
}

