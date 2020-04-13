import java.util.Date;
import java.util.Objects;

public class Card {

    private int number;
    private Date hiringDate;

    public Card() {}

    public Card(int number, Date hiringDate) {
        this.number = number;
        this.hiringDate = hiringDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number &&
                Objects.equals(hiringDate, card.hiringDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, hiringDate);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", hiringDate=" + hiringDate +
                '}';
    }
}
