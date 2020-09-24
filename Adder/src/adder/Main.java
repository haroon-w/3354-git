package adder;

public class Main {

	public static void main(String[] args) {
		try {
			int result = addArguments(args);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.err.println("Integers were not formatted correctly");
		} catch (IllegalArgumentException e) {
			System.err.println("Please enter at least two integers");
		} catch (Exception e) {
			System.err.println("An unexpected error occurred");
		}
	}

	private static int addArguments(String[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += Integer.parseInt(args[i]);
		}
		return total;
	}
}
