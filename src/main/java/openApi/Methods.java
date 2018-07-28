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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Methods {
    static final String openDataUrl = "https://api.opendota.com/api/";
    private CSVReader reader = null;

    /**
     * TODO: вынести
     * Получение данных по урлу
     * @param url
     * @return JsonArray
     */

    private JsonArray getDatasFromApi(String url){
        UtilsParser utilsParser = new UtilsParser();
        return utilsParser.getDatasByUrl(url);
    }

    private JsonObject getDataFromApi(String url){
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
        ArrayList<JsonArray> teamMatches = new ArrayList<>();

        try {
            String[] line;
            reader = new CSVReader(new FileReader(csvFile));
            while ((line = reader.readNext()) != null) {
                String url = this.openDataUrl + "teams/" + line[1] + "/matches";
                teamMatches.add(this.getDatasFromApi(url));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader = new CSVReader(new FileReader(csvFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<JsonArray> expensionTeamMatches = new ArrayList<>();

        try {
            for (JsonArray matches : teamMatches) {
                JsonArray expensionMatches = new JsonArray();
                for (JsonElement match : matches) {
                    if (match.getAsJsonObject().get("start_time").getAsDouble() > 1522281600) {
                        String url = this.openDataUrl + "matches/" + match.getAsJsonObject().get("match_id");
                        JsonElement data = this.getDataFromApi(url);
                        if (data != null){
                            JsonElement matchExtension = data.getAsJsonObject();
                            expensionMatches.add(matchExtension);
                        }
                    }
                }
                String[] line = reader.readNext();
                System.out.println(line[0] + " Закончили полученние данных для команды");

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

                expensionTeamMatches.add(expensionMatches);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return expensionTeamMatches;
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

                PrintWriter writer = new PrintWriter(new FileWriter("src/main/data/teamMatches/" + line[0] + ".txt"), true) ;

                for(JsonElement match: matches){
                    JsonObject jsonText = match.getAsJsonObject();
                    System.out.println(jsonText.toString());
                    if (jsonText.get("start_time").getAsDouble() > 1522281600){
                        writer.write(jsonText.toString() + " \n");
                    }
                }

                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
