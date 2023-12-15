import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Dialog {

    int currentYear;

    Dialog(int currentYear) {

        this.currentYear = currentYear;

    }

    public void getYearOfBirth() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast: fødselsår");

        int Year = scanner.nextInt();
        System.out.println("fødelsår er: " + Year);

        int yearsToRetirement = getYearsToRetirement(Year);
        System.out.println("Du har nu " + yearsToRetirement + " år til pensionering.");

    }

    public int getYearsToRetirement(int i) {

        int Retirement = i + 67;
        return Retirement - currentYear;

    }


}
