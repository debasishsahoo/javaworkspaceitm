package problams;

/**
 * The Time class models a time instance with second, minute and hour. This
 * class performs input validations.
 */
public class TimeInputValidation {
	// The private instance variables - with input validations.
	private int second; // valid range is [0, 59]
	private int minute; // valid range is [0, 59]
	private int hour; // valid range is [0, 23]

	// Input validations are done in the setters.
	// All the other methods (such as constructors and setTime()) invoke
	// these setters to perform input validations to avoid code duplication.
	/** Sets the second to the given value with input validation */
	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
			this.second = 0; // Set to 0 and print error message
			System.out.println("error: invalid second");
		}
	}

	/** Sets the minute to the given value with input validation */
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		} else {
			this.minute = 0;
			System.out.println("error: invalid minute");
		}
	}

	/** Sets the hour to the given value with input validation */
	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		} else {
			this.hour = 0;
			System.out.println("error: invalid hour");
		}
	}

	/** Sets second, minute and hour to the given values with input validation */
	public void setTime(int second, int minute, int hour) {
		// Invoke setters to do input validation
		this.setSecond(second);
		this.setMinute(minute);
		this.setHour(hour);
	}

	/** Constructs a Time instance with the given values with input validation */
	   public TimeInputValidation(int second, int minute, int hour) {
	      // Invoke setters to do input validation
	      this.setTime(second, minute, hour);
	   }

	/** Constructs a Time instance with default values */
	   public TimeInputValidation() {  // The default constructor
	      this.second = 0;
	      this.minute = 0;
	      this.hour = 0;
	   }

	// The public getters
	/** Returns the second */
	public int getSecond() {
		return this.second;
	}

	/** Returns the minute */
	public int getMinute() {
		return this.minute;
	}

	/** Returns the hour */
	public int getHour() {
		return this.hour;
	}

	/**
	 * Returns a self-descriptive string in the form of "hh:mm:ss" with leading
	 * zeros
	 */
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	/**
	 * Advances this Time instance by one second and returns this instance to
	 * support chaining
	 */
	public TimeInputValidation nextSecond() {
		++second;
		if (second == 60) { // We are sure that second <= 60 here because of the input validation
			second = 0;
			++minute;
			if (minute == 60) {
				minute = 0;
				++hour;
				if (hour == 24) {
					hour = 0;
				}
			}
		}
		return this; // Return this instance, to support chaining
	}
}
