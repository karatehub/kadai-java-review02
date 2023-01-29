
public class Triangle {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int a = 8;
        int b = 7;
        int c = 8;
        
        if(a == b && b == c) {
            System.out.println("正三角形です");
        }else if(a == b || b == c || c == a){
            System.out.println("二等辺三角形");
        }else {
            System.out.println("不等辺三角形");
        }
    }

}
