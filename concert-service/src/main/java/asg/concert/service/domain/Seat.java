package asg.concert.service.domain;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Seat {

    private String label;
    private boolean isBooked;
    private LocalDateTime date;
    private BigDecimal price;

    public Seat(){}
	public Seat(String label, BigDecimal price) {
	    this.label = label;
	    this.price = price;
    }

	public Seat(String label, boolean isBooked, LocalDateTime date, BigDecimal price) {
        this.label = label;
        this.isBooked = isBooked;
        this.date = date;
        this.price = price;
	}
	public String getLabel(){
	    return label;
    }
    public boolean getIsBooked(){
	    return isBooked;
    }
    public LocalDateTime getDate(){
	    return date;
    }
    public BigDecimal getPrice(){
	    return price;
    }


}
