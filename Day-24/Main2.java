import java.util.Scanner;

  
class StringOps {

    public String manipulate(String[] input_data) {
        if (input_data.length == 1) {
            StringBuilder sb = new StringBuilder(input_data[0]);
            return sb.reverse().toString();
        }
        else if (input_data.length == 2) {
            return input_data[0] + input_data[1];
        }
        else {
            return "Invalid input";
        }        
    }    
}
class Main2 {
    public static void main(String[] args) {
        StringOps seetha = new StringOps();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] input_data = input.split(" ");
        String result = seetha.manipulate(input_data);
        System.out.println(result);
    }
}
