package ru.netology.JavaHomeWork6.servies;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkScheduleTest {
    @ParameterizedTest
 @CsvFileSource(files ="src/test/resources/inputdata.csv")

    public void shauldCalcExact(int income, int expenses, int threshold) {
        WorkSchedule service = new WorkSchedule();
        int count = service.calculate (income,expenses,threshold);
    }
}
