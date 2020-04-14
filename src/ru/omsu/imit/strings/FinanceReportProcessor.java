package ru.omsu.imit.strings;

import java.util.ArrayList;

public class FinanceReportProcessor {
    public FinanceReport getByLetter(char letter, FinanceReport report){
//        FinanceReport ans = new FinanceReport();
        Payment[] temp = new Payment[report.getNumberOfPayments()];
//        ArrayList<Payment> temp = new ArrayList<>();
        int k=0;
        for (int i = 0;i<report.getNumberOfPayments();++i){
            if(report.getiPayment(i).getFIO().charAt(0)==letter){
                temp[k]=report.getiPayment(i);
                ++k;
            }
//                temp.add(report.getiPayment(i));
        }
        Payment[] ans = new Payment[k];
        for (int i = 0;i<k;++i){
            ans[i] = temp[i];
        }
        return new FinanceReport(ans,
                report.getFIO(),
                report.getDay(),
                report.getMonth(),
                report.getYear());
    }

    public FinanceReport getWithSumLessThan(int sum, FinanceReport report){
        Payment[] temp = new Payment[report.getNumberOfPayments()];
        int k=0;
        for (int i = 0;i<report.getNumberOfPayments();++i){
            if(report.getiPayment(i).getSumm()<sum){
                temp[k]=report.getiPayment(i);
                ++k;
            }
        }
        Payment[] ans = new Payment[k];
        for (int i = 0;i<k;++i){
            ans[i] = temp[i];
        }
        return new FinanceReport(ans,
                report.getFIO(),
                report.getDay(),
                report.getMonth(),
                report.getYear());
    }
}
