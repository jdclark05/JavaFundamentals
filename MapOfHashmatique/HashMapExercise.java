import java.util.Set;
import java.util.HashMap;

public class HashMapExercise {
    public static void main(String[] args){
        HashMap<String, String> trackListMap = new HashMap<String, String>();
        trackListMap.put("The Ballad of Mona Lisa", "Whoa oh oh oh oh, Mona Lisa - You're guaranteed to run this town - Whoa oh oh oh oh, Mona Lisa - I'd pay to see you frown");
        trackListMap.put("Dying in LA", "Every face along the boulevard - Is a dreamer just like you - You looked at death in a tarot card - And you saw what you had to do");
        trackListMap.put("Nine in the Afternoon", "Cause it's nine in the afternoon - And your eyes are the size of the moon - You could cause you can so you do - We're feeling so good");
        trackListMap.put("Northern Downpour", "Hey moon, please forget to fall down - Hey moon, don't you go down - Sugarcane in the easy mornin' - Weathervanes my one and lonely");
        trackListMap.put("Victorious", "Double bubble disco queen - Headed to the guillotine - Skin as cool as Steve McQueen - Let me be your killer king");

        String track = trackListMap.get("The Ballad of Mona Lisa");
        System.out.println("Get One By Track Title: " + track);

        Set<String> keys = trackListMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackListMap.get(key));
        }
    }
}