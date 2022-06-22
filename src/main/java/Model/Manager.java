package Model;

import Interface.IManagerDuty;
import Enum.CashierRole;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff implements IManagerDuty {


    private Manager() {
        super("Sam", "Manager");

    }

    private static Manager SINGLEMANAGER = new Manager();

    public static Manager getInstance() {
        if (SINGLEMANAGER == null) {
            SINGLEMANAGER = new Manager();
        }
        return SINGLEMANAGER;


        /**
         * Implementing Manager's duty
         * The manager can hire a new cashier base on Experience level i.e if the experience
         * of the cashier is intermediate or professional.

         */


    }

    @Override
    public String canHireCashier(Cashier cashier) {
        if (cashier.getRole() == CashierRole.APPLICANT) {
            if (cashier.getExperienceLevel() == "intermediate" || cashier.getExperienceLevel() == "professional") {
                cashier.setRole(CashierRole.EMPLOYED);
                return "Congratulations, You are welcome on board";
            }
        }
        return "We are happy to announce to you that we have other positions " +
                "available however your experience level does not meet our standard for a cashier role. Thanks";
    }
}
