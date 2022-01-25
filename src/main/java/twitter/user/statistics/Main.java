package twitter.user.statistics;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: ./TwitterUserStatistics [username]");
            return;
        }

        String username = args[0];
	// write your code here
        // simple heuristics to determine whether a user is legitimate or fake
        // has the twitter verified
        // more followers
        // manually put in the fact that... this user is legitimate... and report the rest?
        // given a person... look through their tweets to see if they have the tweets
        // that say please report so and so...
        // build the objects that
        // the format of... 'report' and a bunch of handles... report followed by a bunch of handles...
        // https://github.com/square/retrofit
        // i want to develop something that... pulls a user's data. keeps pulling in the tweets and just
        // compiles a bunch of stats on them.
        // some information to learn would be...
        // most common words? most common words (removed with some stuff)
        // average length of words
        // when they usually tweet
        // which days...
        // which time
        // how often they tweet
    }
}
