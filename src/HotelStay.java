import java.util.Scanner;

public class HotelStay {

    public static void main(String[] args) {
        //Variables
        double standartRoomChargePerNight = 175.00;
        double discountValue;
        double finalAmount;
        double discountPercentage;

        Scanner sc = new Scanner(System.in);

        // Print welcome message and question for customer
        System.out.println("Welcome to Artichoke Hotel!");
        System.out.println("Please enter your membership");
        String membership = sc.nextLine();
        System.out.println("How many days are you gonna stay in our hotel? (Please enter 1 or more!)");
        int lenghtOfStay = sc.nextInt();

        // Print membership, length of stay and per room pre night price
        System.out.println("Member Status: " + membership);
        System.out.println("Length of Stay: " + lenghtOfStay + " nights");
        System.out.println("Per Room Per Night: $" + standartRoomChargePerNight);

        // Logics and print discount amount and percentange
        double totalAmountWithoutDiscount = standartRoomChargePerNight * lenghtOfStay;
        if (membership.equals("Gold") && lenghtOfStay >= 2 && lenghtOfStay <= 5) {
            discountPercentage = 0.15;
            discountValue = totalAmountWithoutDiscount * discountPercentage;
            finalAmount = totalAmountWithoutDiscount - discountValue;
            System.out.println("Discount Percentage: " + discountPercentage);
            System.out.println("Discount Amount: " + discountValue);
        } else if (membership.equals("Gold") && lenghtOfStay > 5) {
            discountPercentage = 0.25;
            discountValue = totalAmountWithoutDiscount * discountPercentage;
            finalAmount = totalAmountWithoutDiscount - discountValue;
            System.out.println("Discount Percentage: " + discountPercentage);
            System.out.println("Discount Amount: $" + discountValue);
        } else if (membership.equals("Platinum") && lenghtOfStay >= 2 && lenghtOfStay <= 5) {
            discountPercentage = 0.25;
            discountValue = totalAmountWithoutDiscount * discountPercentage;
            finalAmount = totalAmountWithoutDiscount - discountValue;
            System.out.println("Total Amount Without Discount: $" + totalAmountWithoutDiscount);
            System.out.println("Discount Percentage: " + discountPercentage);
            System.out.println("Discount Amount: " + discountValue);
            System.out.println("Final Amount: " + finalAmount);
        } else if (membership.equals("Platinum") && lenghtOfStay > 5) {
            discountPercentage = 0.40;
            discountValue = totalAmountWithoutDiscount * discountPercentage;
            finalAmount = totalAmountWithoutDiscount - discountValue;
            System.out.println("Discount Percentage: " + discountPercentage);
            System.out.println("Discount Amount: $" + discountValue);
        } else {
            discountPercentage = 0.00;
            discountValue = totalAmountWithoutDiscount * discountPercentage;
            finalAmount = totalAmountWithoutDiscount - discountValue;
            System.out.println("Discount Percentage: " + discountPercentage);
            System.out.println("Discount Amount: $" + discountValue);
        }

        // Print Statement for Customer
        System.out.println("Total Amount Without Discount: $" + totalAmountWithoutDiscount);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Enjoy your stay :)");
    }
}
