public class Money {
    private long dollars;
    private long cents;

    public Money(long dollars, long cents) { // Constructor to set dollar and cent values
        if (cents >= 100) {
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        } else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    public Money(Money other) { // Copy constructor
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public void add(Money amount) {
        this.cents += amount.cents;
        this.dollars += amount.dollars + (this.cents / 100);
        this.cents %= 100;
    }

    public void subtract(Money amount) {
        long totalThis = this.dollars * 100 + this.cents;
        long totalAmount = amount.dollars * 100 + amount.cents;
        long result = totalThis - totalAmount;

        this.dollars = result / 100;
        this.cents = result % 100;
    }

    public boolean equals(Money other) { // Checks if two Money amounts are equal
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    public int compareTo(Money other) {
        long thisTotal = this.dollars * 100 + this.cents;
        long otherTotal = other.dollars * 100 + other.cents;

        return Long.compare(thisTotal, otherTotal);
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}