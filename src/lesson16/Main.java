package lesson16;

import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER =  Logger.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.error("nawe coo6wenie error");
        LOGGER.debug("nawe coo6wenie debug");
        LOGGER.info("nawe coo6wenie info");
        LOGGER.warn("nawe coo6wenie warn");
        LOGGER.fatal("nawe coo6wenie fatal");
        LOGGER.trace("nawe coo6wenie trace");
    }
}
