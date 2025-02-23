<img src="q6part1.png">
<img src="q6part2.png">

```
import java.util.Scanner;


    class EncoderDecoder {
     String encode(String[] a){
         
         StringBuilder b=new StringBuilder();
     
     for(int i=0;i<a.length;i++){
         b.append(a[i]);
         if(i != a.length-1){
             b.append("#");
         }
     }
     
     return b.toString();
     
     
}
     String[] decode(String a){
         return a.split("#");
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

```