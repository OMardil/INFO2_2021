package fb;

import java.util.List;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.Likes;
import com.restfb.types.User;
import com.restfb.types.Likes.LikeItem;
import com.restfb.types.User.Experience;

public class FacebookTest {

	public static void main(String[] args) {
		String accessToken = "EAALeTv7JTlgBAOQ9GZAp9gMcnA0nMe9hQJtwSoOlJySWmqjd1OUxqKiaYvOkXj9espRRT34s7rEytQJZBLXtQZBsokbZB96IZAZBncD1ucnvugZAZBy1fs8aZCUvrRFduNMi91qywllZCcngYuAT438f9fT9c56Nn7QKQ847OP65yzpRZB9c1IZAQgdv0HcJyIP2UdlCvSUil7mB1HPMd5Trf1cVX0ZCSwp82bdnaea7T3UhvmAZDZD";
    	Version apiVersion = Version.LATEST;
    	
    	FacebookClient facebook = new DefaultFacebookClient(accessToken, apiVersion);
    	User me = facebook.fetchObject("me", User.class, Parameter.with("fields", "likes"));
    	
    	Likes myLikes = me.getLikes();
    	List<LikeItem> myLikeItems = myLikes.getData();
    	
    	for(LikeItem like: myLikeItems) {
    		System.out.println(like.getName());
    		
    	}
    	
    	
	}

}
