package challenge;

public class CaptainMaker {
    private CaptainMaker() {}

    private static class SingletonHelper {
        private static final CaptainMaker captainMaker = new CaptainMaker();
    }

    public static CaptainMaker getCaptain() {
        return SingletonHelper.captainMaker;
    }
}
