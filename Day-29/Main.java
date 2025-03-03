import java.util.Scanner;

class EncoderDecoder {
   
    public String encode(String[] messages) {
        StringBuilder sb = new StringBuilder();
        for (String x : messages) {
            sb.append(x + "#");

        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    public String[] decode(String encoded) {
        String decoded[] = encoded.split("#");
       
        return decoded;
    }
    
    
    
    
}

class Main {
    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] messages = userInput.split(" ");
        String encoded = encoderDecoder.encode(messages);
        System.out.println("Encoded: " + encoded);
        String[] decoded = encoderDecoder.decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decoded) {
            System.out.println(message);
        }

        scanner.close();
    }
}