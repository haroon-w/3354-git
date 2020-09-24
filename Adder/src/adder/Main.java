package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) {
    	int total = 0;
    	for(int i=0; i < args.length; i++) {
    		total += Integer.parseInt(args[i]);
    	}
        return total;
    }
}
