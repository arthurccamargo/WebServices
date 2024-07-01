package com.webservices.services.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Payment implements Serializable {
    private Long id;
    private Instant moment;
    private Order order;

    public Payment() {}

    public Payment(Instant moment, Order order, Long id) {
        this.moment = moment;
        this.order = order;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}