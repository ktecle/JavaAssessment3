package user_management;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.oracle.javafx.jmx.json.JSONReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserCollectionInitializer {
    public static UserCollection generate() throws FileNotFoundException{

        JSONReader reader = (JSONReader) new JsonReader(new FileReader("users.json"));
        Gson gson = new Gson();
        UserCollection users= gson.fromJson((JsonElement) reader,UserCollection.class);
        return users;
    }
}
