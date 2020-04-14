package ru.omsu.imit.strings;

import java.util.Arrays;

public class FinanceReport {
    private Payment[] payments;
    private String FIO;
    private int day, month, year;

    public Payment[] getPayments() {
        return payments;
    }

    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getDay() {
        return day;
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

    public FinanceReport(Payment[] payments, String FIO, int day, int month, int year) {
        this.payments = payments;
        this.FIO = FIO;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public FinanceReport(FinanceReport financeReport) {
        payments = new Payment[financeReport.payments.length];
        for (int i=0;i<financeReport.payments.length;++i)
            this.payments[i] = financeReport.payments[i];
        this.FIO = financeReport.FIO;
        this.day = financeReport.day;
        this.month = financeReport.month;
        this.year = financeReport.year;
    }

    public int getNumberOfPayments() {
        return payments.length;
    }

    public Payment getiPayment(int i) {
        return payments[i];
    }

    public void setiPayment(int i, Payment payment) {
        payments[i] = payment;
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i< payments.length;++i){
            ans+=String.format("Плательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.\n",
                    payments[i].getFIO(),
                    payments[i].getDay(),
                    payments[i].getMonth(),
                    payments[i].getYear(),
                    payments[i].getSumm()/100,
                    payments[i].getSumm()%100);
        }
        return String.format("Автор: %s, дата: %d.%d.%d, Платежи: [\n",
                getFIO(),
                getDay(),
                getMonth(),
                getYear())
                +ans+"]";
    }
}
