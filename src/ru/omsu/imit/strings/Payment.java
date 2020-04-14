package ru.omsu.imit.strings;

import java.util.Objects;

public class Payment {
    private String FIO;
    private int day,month,year;
    private int summ;

    public Payment() {
        FIO = "";
        day = 1;
        month = 1;
        year = 1;
        summ = 0;
    }

    public int getDay() {
        return day;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public Payment(String FIO, int day, int month, int year, int summ) {
        this.FIO = FIO;
        this.day = day;
        this.month = month;
        this.year = year;
        this.summ = summ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day &&
                month == payment.month &&
                year == payment.year &&
                summ == payment.summ &&
                Objects.equals(FIO, payment.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, day, month, year, summ);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "FIO='" + FIO + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", summ=" + summ +
                '}';
    }
}
