import Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Deque<Player> players ;
    Board gameBoard;

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1",crossPiece);

        PlayingPieceO zeroPiece = new PlayingPieceO();
        Player player2 = new Player("Player2",zeroPiece);
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);

    }
    public String startgame(){
        boolean noWinner = true;
        while (noWinner){
            Player player = players.removeFirst();
            gameBoard.printBoard();
            gameBoard.getFreeCells();
            System.out.println("pls Select row colums for Player seperated by column"+player.getName());
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] splits = s.split(",");
          //  System.out.println(splits[0] + " " );
            int row= Integer.valueOf(splits[0]);
            int col = Integer.valueOf(splits[1]);

            boolean pieceAdded = gameBoard.addPiece(row,col,player.getP());

            if(!pieceAdded){
                System.out.println("incorrect position, try again");
                players.addFirst(player);
                continue;
            }
            players.addLast(player);
            boolean winner = isThereWinner(row,col,player.getP());
            if(winner){
                return player.getName();
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int col, PlayingPiece p) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // row checking
        for(int i=0;i<gameBoard.getSize();i++) {
            if(gameBoard.getBoard()[row][i]== null || !gameBoard.getBoard()[row][i].getPieceType().toString().equals(p.getPieceType().toString())) {
                rowMatch=false;
            }
        }
        // col checking
        for(int i=0;i<gameBoard.getSize();i++) {
            if(gameBoard.getBoard()[i][col]== null || !gameBoard.getBoard()[i][col].getPieceType().toString().equals(p.getPieceType().toString())) {
                colMatch=false;
            }
        }
// diagonal Match
        for(int i=0,j=0;i<gameBoard.getSize();i++,j++) {
            if(gameBoard.getBoard()[i][j]== null || !gameBoard.getBoard()[i][j].getPieceType().toString().equals(p.getPieceType().toString())) {
                diagonalMatch=false;
            }
        }
// antidiagonal
        for(int i=0,j= gameBoard.getSize()-1;i<gameBoard.getSize();i++,j--) {
            if(gameBoard.getBoard()[i][j]== null || !gameBoard.getBoard()[i][j].getPieceType().toString().equals(p.getPieceType().toString())) {
                antiDiagonalMatch=false;
            }
        }
          return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
