package utils;

public final class FrameworkConstants {

    private FrameworkConstants(){

    }

    private static final String CONFIGFILEPATH = System.getProperty("user.dir") + "/src/main/resources/config.properties";

    private static final int EXPLICITWAITTIMEOUT = 10;

    public static int getEXPLICITWAITTIMEOUT() {
        return EXPLICITWAITTIMEOUT;
    }

    public static String getConfigFilePath() {
        return CONFIGFILEPATH;
    }

}
