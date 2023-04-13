import java.util.Scanner;

class NastyHacks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int noAdvertisementRevenue = s.nextInt();
            int advertisementRevenue = s.nextInt();
            int advertisementCost = s.nextInt();

            int advertisementProfit = advertisementRevenue - advertisementCost;

            if (noAdvertisementRevenue < advertisementProfit) {
                System.out.println("advertise");
            } else if (noAdvertisementRevenue == advertisementProfit) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }

        s.close();
    }
}