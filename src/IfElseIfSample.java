
public class IfElseIfSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int score = 80;
        
        if(score == 100) {
            System.out.println("満点ですご褒美を上げます");
        }else if(score >= 80){
            System.out.println("よくできました");
        }else if(score >= 60) {
            System.out.println("合格です");
        }else {
            System.out.println("赤点です");
        }
    }

}
