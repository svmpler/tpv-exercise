package oop.inheritance.data;

import java.time.LocalDateTime;

public class TransactionBuilder {
    private int amountInCents;
    private Card card;
    private LocalDateTime localDateTime;

    TransactionBuilder{

    }

    public TransactionBuilder amountInCents(int amountInCents) {
        this.amountInCents = amountInCents;

        return this;
    }

    public TransactionBuilder Card(Card card) {
        this.card = card;

        return this;
    }

    public TransactionBuilder LocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;

        return this;
    }
    public Transaction build(){
        return new Transaction();
    }
}
