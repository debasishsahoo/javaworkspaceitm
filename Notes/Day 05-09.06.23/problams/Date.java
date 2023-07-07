package problams;
/**
 * The Date class models a calendar date with day, month and year.
 * This class does not perform input validation for day, month and year.
 */
public class Date {
   // The private instance variables
   private int year, month, day;

   /** Constructs a Date instance with the given year, month and day. No input validation */
   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   // The public getters/setters for the private variables
   /** Returns the year */
   public int getYear() {
      return this.year;
   }
   /** Returns the month */
   public int getMonth() {
      return this.month;
   }
   /** Returns the day */
   public int getDay() {
      return this.day;
   }
   /** Sets the year. No input validation */
   public void setYear(int year) {
      this.year = year;
   }
   /** Sets the month. No input validation */
   public void setMonth(int month) {
      this.month = month;
   }
   /** Sets the day. No input validation */
   public void setDay(int day) {
      this.day = day;
   }

   /* Returns a descriptive String in the form "MM/DD/YYYY" with leading zero */
   public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d/%02d/%4d", month, day, year);
              // Specifier "0" to print leading zeros
   }

   /** Sets year, month and day. No input validation */
   public void setDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
}