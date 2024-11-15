package Model;

public class Seat {
    int seat_No;
    int row_No;
    SeatCategory seatCategory;

    public int getSeat_No() {
        return seat_No;
    }

    public void setSeat_No(int seat_No) {
        this.seat_No = seat_No;
    }

    public int getRow_No() {
        return row_No;
    }

    public void setRow_No(int row_No) {
        this.row_No = row_No;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
