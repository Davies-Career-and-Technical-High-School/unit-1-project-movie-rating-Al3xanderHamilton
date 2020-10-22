import java.util.Scanner;

class MovieRating {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("PLease enter the movie name");

    String name = scan.nextLine();

    System.out.println("Enter the time in minutes");

    int time = scan.nextInt();

    System.out.println("Please enter the ratings from movie review website");
    int rating1 = scan.nextInt();
    int rating2 = scan.nextInt();
    int rating3 = scan.nextInt();

    System.out.println("Enter ratings from focus group");

    double r1 = scan.nextDouble();
    double r2 = scan.nextDouble();
    System.out.println("enter avg movie critic rating");
    double cr1 = scan.nextDouble();

    System.out.println("Title: " + name + 
    "\nRunning time: " + time + 
    "\nAverage website rating: " + ((rating1 + rating2 + rating3) / 3) + 
    "\nAvg focus group rating: " + ((r1 + r2) / 3) + 
    "\nAvg critic review: " + (cr1 / 1) + 
    "\nOverall MovieRating: " + 
    (int)(((rating1 + rating2 + rating3) / 3 * .2) + ((r1 + r2) * .3) + (cr1 * .5 )));
  }
}