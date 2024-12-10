package My_Package;
import java.io.File;

public class CheckDiskSpace {

	    public static void main(String[] args) {
	        File drive = new File("C:\\"); // Replace with the drive path you want to monitor
	        long totalSpace = drive.getTotalSpace(); // Total disk space in bytes
	        long freeSpace = drive.getFreeSpace();   // Free disk space in bytes

	        System.out.println("Total Disk Space: " + totalSpace / (1024 * 1024 * 1024) + " GB");
	        System.out.println("Free Disk Space: " + freeSpace / (1024 * 1024 * 1024) + " GB");
	    }

}
