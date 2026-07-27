import java.util.Scanner;
import java.util.Arrays;

public class Declaration{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the samir");
        String s=scanner.nextLine();
        String[] word=s.split("\\s+");
        System.out.println(Arrays.toString(word));
        for(int i=0;i< word.length;i++){
            System.out.println(word[i]);
        }
    }
}
