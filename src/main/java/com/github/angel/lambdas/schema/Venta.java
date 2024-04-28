package com.github.angel.lambdas.schema;

import java.time.Month;

public class Venta {
    private double total;
    private Month month;

    public Venta(Month month, double total) {
        this.month = month;
        this.total = total;
    }

    public Venta() {
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return STR."Venta{total=\{total}, month=\{month}\{'}'}";
    }
}
