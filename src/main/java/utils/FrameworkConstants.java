package utils;

public final class FrameworkConstants {

    private FrameworkConstants(){

    }

    private static final String CONFIGFILEPATH = System.getProperty("user.dir") + "/src/main/resources/config.properties";

    public static String getConfigFilePath() {
        return CONFIGFILEPATH;
    }

}
