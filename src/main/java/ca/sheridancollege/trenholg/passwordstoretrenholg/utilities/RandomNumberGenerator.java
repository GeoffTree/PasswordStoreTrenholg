package ca.sheridancollege.trenholg.passwordstoretrenholg.utilities;

import java.util.Random;
public class RandomNumberGenerator {
    private static final Random rand = new Random();

    public static Long genLongID(){
        return 100_000_000L + rand.nextLong(999_999_999);
    }
}
