package openApi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import utils.UtilsParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Methods {
    static final String openDataUrl = "https://api.opendota.com/api/";

    /**
     * TODO: вынести
     * Получение данных по урлу
     * @param url
     * @return JsonArray
     */

    private JsonArray getDataFromApi(String url){
        UtilsParser utilsParser = new UtilsParser();
        return utilsParser.getDataByUrl(url);
    }

    /**
     * Получение матчей про команды по урлу
     * @return
     */
    private ArrayList<JsonArray> getProTeamMatches(){
        String csvFile = "src/main/data/teams.csv";
        CSVReader reader = null;
        ArrayList<JsonArray> matches = new ArrayList<>();

        try {
            String[] line;
            reader = new CSVReader(new FileReader(csvFile));
            while ((line = reader.readNext()) != null) {
                String url = this.openDataUrl + "teams/" + line[1] + "/matches";
                matches.add(this.getDataFromApi(url));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return matches;
    }

    private void SaveToCSV(String fileName, String line){

    }

    /**
     * хз пока что это
     */
    public Methods() {
        /**
         * TODO:
         * Создать дополнительный слой для разветлвения архитектуры запуска
         */

//        UtilsParser utilsParser = new UtilsParser();
//        String url = "https://api.opendota.com/api/proMatches";
//        JsonArray proMatches = utilsParser.getDataByUrl(url);

        ArrayList<JsonArray> teamMatches = this.getProTeamMatches();

        int i = 0;
        CSVReader reader = null;

        try {
            String csvFile = "src/main/data/teams.csv";
            reader = new CSVReader(new FileReader(csvFile));
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            for (JsonArray matches : teamMatches) {

                String[] line = reader.readNext();

                CSVWriter writer = new CSVWriter(new FileWriter("src/main/data/csv/" + line[0] + ".csv")) ;

                for(JsonElement match: matches){
                    JsonObject jsonText = match.getAsJsonObject();
                    System.out.println(jsonText.toString());
                    if (jsonText.get("start_time").getAsDouble() > 1522281600){
                        writer.writeNext(new String[]{jsonText.toString()}, false);
                    }
                }

                writer.flush();
                writer.close();

                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
