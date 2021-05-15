package facebook;

import java.util.List;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.Likes;
import com.restfb.types.Likes.LikeItem;
import com.restfb.types.User;
import com.restfb.types.User.Experience;

public class FacebookTest {

    public static void main( String[] args ) {

    	String accessToken = "EAALeTv7JTlgBAOPz75390DBZCrQdOdJiz5adAjGNmOEBheIoxxKJzv93FUqVDxAEFSadsL6ZBygokiqxzstK6618C3YQPUrfAvua4cUVIEZAZBN2iTVuZCkzDgbe5o1zdTQzj102ZCVg85MPCNjpzu2SAJcHmhlEDDz0ZBQ7zpt4hnCg9lHAxXSsKNBNm9hmexo6dLdZC4oTBMAl358GQW7ZBd9RI9zmyZBS2MzRHeu7giaQZDZD";
    	Version apiVersion = Version.LATEST;
    	
    	FacebookClient facebook = new DefaultFacebookClient(accessToken, apiVersion);
    	User me = facebook.fetchObject("me", User.class, Parameter.with("fields", "id,name,birthday,likes"));
    	
    	
    	System.out.println(me.getName());
    	System.out.println(me.getFirstName());
    	System.out.println(me.getBirthday());
    	System.out.println(me.getBio());   
    	System.out.println(me.getBirthdayAsDate());
    	System.out.println(me.getGender());
    	
    	Likes myLikes = me.getLikes();
    	if (myLikes == null) {
    		System.out.println("No permissions");
    		return;
    	}
    	
    	List<LikeItem> myLikeItems = myLikes.getData();
    	
    	for(LikeItem myLike: myLikeItems) {
    		System.out.println(myLike.getName());
    	}
    }
	
}
