import com.apicaller.IgniteRepository;

import java.io.IOException;
import java.util.Scanner;

public class TestMenuSystem {
    public static void main(String[] args) throws IOException {
        String ip = "";
        if (args.length>0){
            ip = args[0];
        }else {
            System.out.println("provide server ip.");
            System.exit(0);
        }
        IgniteRepository repository = new IgniteRepository(ip);
        while (true) {
            System.out.println("1. All cache data");
            System.out.println("2. Put String data");
            System.out.println("3. Put int data");
            System.out.println("4. Put boolean data");
            System.out.println("5. Put float data");
            System.out.println("6. Put double data");
            System.out.println("7. Put long data");
            System.out.println("8. Delete cache data");
            System.out.println("Enter menu choice");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            System.out.println("Enter cache name");
            Scanner cacheName = new Scanner(System.in);
            String cache = cacheName.next();
            switch (choice) {
                case "1":
                    System.out.println(repository.getCacheData(cache));
                    break;
                case "2":
                    System.out.println("Enter key");
                    Scanner key = new Scanner(System.in);
                    String keyValue = key.next();
                    System.out.println("Enter value");
                    Scanner value = new Scanner(System.in);
                    String valueValue = value.next();
                    System.out.println(repository.putStringData(cache, keyValue, valueValue));
                    break;
                case "3":
                    System.out.println("Enter key");
                    key = new Scanner(System.in);
                    keyValue = key.next();
                    System.out.println("Enter value");
                    value = new Scanner(System.in);
                    valueValue = value.next();
                    System.out.println(repository.putIntData(cache, keyValue, valueValue));
                    break;
                case "4":
                    System.out.println("Enter key");
                    key = new Scanner(System.in);
                    keyValue = key.next();
                    System.out.println("Enter value");
                    value = new Scanner(System.in);
                    valueValue = value.next();
                    System.out.println(repository.putBooleanData(cache, keyValue, valueValue));
                    break;
                case "5":
                    System.out.println("Enter key");
                    key = new Scanner(System.in);
                    keyValue = key.next();
                    System.out.println("Enter value");
                    value = new Scanner(System.in);
                    valueValue = value.next();
                    System.out.println(repository.putFloatData(cache, keyValue, valueValue));
                    break;
                case "6":
                    System.out.println("Enter key");
                    key = new Scanner(System.in);
                    keyValue = key.next();
                    System.out.println("Enter value");
                    value = new Scanner(System.in);
                    valueValue = value.next();
                    System.out.println(repository.putDoubleData(cache, keyValue, valueValue));
                    break;
                case "7":
                    System.out.println("Enter key");
                    key = new Scanner(System.in);
                    keyValue = key.next();
                    System.out.println("Enter value");
                    value = new Scanner(System.in);
                    valueValue = value.next();
                    System.out.println(repository.putLongData(cache, keyValue, valueValue));
                    break;
                case "8":
                    System.out.println(repository.deleteAllCacheData(cache));
                    break;
                default:
                    continue;
            }
        }
    }
}
