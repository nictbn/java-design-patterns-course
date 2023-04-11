package challenge;

public class Client {
    public static void main(String[] args) {
        Observer averageScoreDisplay = new AverageScoreDisplay();
        Observer currentScoreDisplay = new CurrentScoreDisplay();

        CricketData cricketData = new CricketData();
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
        cricketData.dataChanged();

        cricketData.unregisterObserver(averageScoreDisplay);
        cricketData.dataChanged();
    }
}
