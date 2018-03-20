package parsing_json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.oracle.javafx.jmx.json.JSONReader;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class ElementCollectionInitializer {
    public static ElementCollection generate() throws FileNotFoundException {

            JSONReader reader = (JSONReader) new JsonReader(new FileReader("periodic_table.json"));
            Gson gson = new Gson();
            ElementCollection periodicTableOfElements= gson.fromJson((JsonElement) reader,ElementCollection.class);
            return periodicTableOfElements;
        }

}
