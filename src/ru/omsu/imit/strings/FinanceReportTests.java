package ru.omsu.imit.strings;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
public class FinanceReportTests {
    static Payment[] paym = new Payment[3];
    static FinanceReport financeReport;
    static FinanceReport financeReport2;
    @BeforeClass
    public static void beforetest() {
        paym[0] = new Payment("Alekseev Aleksey Sergeevich", 6, 11, 18, 1100000);
        paym[1] = new Payment("Sergeev Sergey Sergeevich", 6, 11, 18, 1500000);
        paym[2] = new Payment("Petrov Sergey Andreevich", 6, 11, 18, 1500000);
        paym[2] = new Payment("Svetlov Sergey Andreevich", 5, 1, 18, 1000000);
        financeReport = new FinanceReport(paym, "Ivanov Oleg Ivanovich", 15, 5, 19);
    }

    @Test
    public void testToString() {

        System.out.println(financeReport);
    }
    @Test
    public void testConstructor(){
        financeReport2 = new FinanceReport(financeReport);
        financeReport2.setiPayment(1, new Payment("Sidorov Dmitry Ivanovich", 4, 7, 18, 1250000));
        System.out.println(financeReport2);
        System.out.println(financeReport);
        System.out.println(financeReport == financeReport2);
        assertFalse(financeReport2.toString()== financeReport.toString());
    }

    @Test
    public void testProcessor(){
        FinanceReportProcessor financeReportProcessor = new FinanceReportProcessor();
        System.out.println(financeReportProcessor.getByLetter('S', financeReport));
        System.out.println(financeReportProcessor.getWithSumLessThan(1200000, financeReport));
    }
}
