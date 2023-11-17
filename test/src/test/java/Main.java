import java.util.Scanner;

/*** @Author：Skinger
 * @Date 2023/10/21 15:47
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] split = s.split(",");
        int y= Integer.parseInt(split[0]);
        int m= Integer.parseInt(split[1]);
        int d= Integer.parseInt(split[2]);
    }
}


