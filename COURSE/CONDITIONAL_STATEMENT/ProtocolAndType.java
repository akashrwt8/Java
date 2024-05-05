package COURSE.CONDITIONAL_STATEMENT;

import java.util.Scanner;

/**
 * ProtocolAndType
 */
public class ProtocolAndType {
    public static void protocolAndType(String url) {
        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http")) {
            System.out.println("Hypertext transfer protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("File transfer protocol");
        } else if (protocol.equals("https")) {
            System.out.println("Hypertext transfer protocol secure");
        } else {
            System.out.println("Invalid protocol");
        }
        String ext = url.substring(url.lastIndexOf(".") + 1);
        if (ext.equals("com")) {
            System.out.println("Commercial");
        } else if (ext.equals("org")) {
            System.out.println("Organisation");
        } else if (ext.equals("net")) {
            System.out.println("Network");
        } else {
            System.out.println("Invalid type");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a URL : ");
        String url = sc.nextLine();
        protocolAndType(url);
        sc.close();
    }
}