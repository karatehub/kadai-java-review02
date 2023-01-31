package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam ts1 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        double winlate =ts1.getRate();
        ts1.report(winlate);
        BaseBallTeam ts2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        double winlate2 =ts2.getRate();
        ts2.report(winlate2);
        BaseBallTeam ts3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        double winlate3 =ts3.getRate();
        ts3.report(winlate3);
        BaseBallTeam ts4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        double winlate4 =ts4.getRate();
        ts4.report(winlate4);
        BaseBallTeam ts5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        double winlate5 =ts5.getRate();
        ts5.report(winlate5);
        BaseBallTeam ts6 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        double winlate6 =ts6.getRate();
        ts6.report(winlate6);
    }

}
