package dimitri_durmishian_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private final String studentName;

    public Fantasy(String studentName) {
        this.studentName = "Dimitri Durmishian";
    }

    @Override
    public String toString() {
        return "Fantasy: " + studentName;
    }

    @Override
    public String getJustice1() {
        return "Implementing justice in fantasy";
    }

    @Override
    public String getTrumpet2() {
        return "Trumpeting in fantasy";
    }

    @Override
    public String methodBackpack3(String argAir5) {
        return "Implementing methodBackpack3";
    }

    @Override
    public List<String> methodCoaxial4(String argLedger6) {
        List<String> result = new ArrayList<>();
        result.add("Using coaxial in fantasy with argument: " + argLedger6);
        return result;
    }
}
