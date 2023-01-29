
public class Review02 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int num = 0;
        
        while (num < 100) {
            num = num + 1;
            if(num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if(num % 3 == 0){
                System.out.println("Fizz");
            }else if(num % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(num);
            }
        }
            
        
    }

}
