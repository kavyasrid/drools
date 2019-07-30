package drools.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kavya on 2/21/17.
 */
public class SomeUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(SomeUtil.class);

    private SomeUtil(){
        throw new UnsupportedOperationException("SomeUtil is a utility class that should not be instantiated");
    }

    public static String replaceAWithB(String input){
        LOGGER.debug("Executing some logic");
        return input.toLowerCase().replaceAll("a","b");
    }
}
