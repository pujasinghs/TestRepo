package My_Package;
import java.io.IOException;

public class PingServer {
	    public static void main(String[] args) {
	        String ipAddress = "facebook.com"; // Replace with the IP or server name to ping

	        try {
	            Process process = Runtime.getRuntime().exec("ping -n 3 " + ipAddress); // '-n 3' pings 3 times (Windows)
	            int returnCode = process.waitFor();

	            if (returnCode == 0) {
	                System.out.println(ipAddress + " is reachable.");
	            } else {
	                System.out.println(ipAddress + " is not reachable.");
	            }
	        } catch (IOException | InterruptedException e) {
	            System.out.println("An error occurred while pinging the server.");
	            e.printStackTrace();
	        }
	    }
}
