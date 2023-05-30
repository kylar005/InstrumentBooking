package Entities;
import jakarta.persistence.*;
import javax.annotation.processing.Generated;
@Entity
@Table (name = "instrument")
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer instruId;
    @Column(nullable = false, length = 25)
    private String instruName ;
    @Column (nullable = false)
    private int amount;

    public Integer getInstruId() {
        return instruId;
    }

    public void setInstruId(Integer instruId) {
        this.instruId = instruId;
    }

    public String getInstruName() {
        return instruName;
    }

    public void setInstruName(String instruName) {
        this.instruName = instruName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}