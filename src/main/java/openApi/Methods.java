package openApi;

import com.google.gson.JsonArray;
import utils.UtilsParser;



public class Methods {
    static final String openDataUrl = "https://api.opendota.com/api";

    private JsonArray getDataFromApi(String url){
        UtilsParser utilsParser = new UtilsParser();
        return utilsParser.getDataByUrl(url);
    }

    private CSVReader getTeams(){
        String csvFile = "src/main/data/teams.csv";
        CSVReader reader = null;

        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Team [id= " + line[1] + ", name= " + line[0] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return reader;
    }

    public Methods() {
        /**
         * TODO:
         * Создать дополнительный слой для разветлвения архитектуры запуска
         */

//        UtilsParser utilsParser = new UtilsParser();
//        String url = "https://api.opendota.com/api/proMatches";
//        JsonArray proMatches = utilsParser.getDataByUrl(url);
        this.getTeams();
        String url = this.openDataUrl + "proMatches";
        System.out.println(this.getDataFromApi(url));
    }

}
