public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int weeklyCodedHours; // can be done like this : int weeklyCodedHours = 5 * 6;
        weeklyCodedHours= 5 * 6;
        System.out.println(17 * weeklyCodedHours + " is the total hours a GFA attendee codes during the 17-week semester.");
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println(weeklyCodedHours / 52. * 100 + " % of an attendees week is spent with coding.");
    }
}
