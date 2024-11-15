package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void setBoard(PlayingPiece[][] board) {
        this.board = board;
    }

    PlayingPiece [][] board;
     public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int x, int y, PlayingPiece playingPiece){
        if(board[x][y] != null) {
            return false;
        }
        board[x][y] = playingPiece;
        return true;
    }

    public List<Pair> getFreeCells(){
         List<Pair> freeCells = new ArrayList<>();
         for(int i =0;i<size; i++) {
             for (int j =0;j<size;j++){
                 if(board[i][j] == null ){
                     freeCells.add(new Pair(i,j));
                 }
             }
         }
         return  freeCells;
    }

    public void printBoard() {
        for(int i =0;i<size; i++) {
            for (int j =0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType.name() + " ");
                }
                else {
                    System.out.print( "  ");
                }
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }
}
