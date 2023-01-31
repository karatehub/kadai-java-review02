package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        this.name = name;
    }
    
    public double getRate() {
        double winlate = ((double)win / (double)(win+lose));
        return winlate;
    }
    
    public void report(double winlate) {
        System.out.println(name +"の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + winlate + "です。");
    }
}
