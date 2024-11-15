package Model;

public class Player {
    String name;
    PlayingPiece p;

    public Player(String name, PlayingPiece p) {
        this.name = name;
        this.p = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getP() {
        return p;
    }

    public void setP(PlayingPiece p) {
        this.p = p;
    }
}
