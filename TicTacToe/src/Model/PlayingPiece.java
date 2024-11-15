package Model;

public class PlayingPiece {
    PieceType pieceType;

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    PlayingPiece (PieceType pieceType){
        this.pieceType=pieceType;
    }

}
