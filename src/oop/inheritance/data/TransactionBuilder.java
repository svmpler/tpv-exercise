package oop.inheritance.data;

import java.time.LocalDateTime;

public class TransactionBuilder {
    private int amountInCents;
    private Card card;
    private LocalDateTime localDateTime;

    TransactionBuilder{

    }

    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
        return this;
    }

    public void setCard(Card card) {
        this.card = card;
        return this;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }
    public Transaction build(){
        return new Transaction();
    }
}
