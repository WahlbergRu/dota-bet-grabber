package openApi;

import com.google.gson.JsonArray;
import utils.UtilsParser;



public class Methods {
    static final String openDataUrl = "https://api.opendota.com/api";
    static final long[] teams = [];

    private JsonArray getDataFromApi(String url){
        UtilsParser utilsParser = new UtilsParser();
        return utilsParser.getDataByUrl(url);
    }

    public Methods() {
        /**
         * TODO:
         * Создать дополнительный слой для разветлвения архитектуры запуска
         */

//        UtilsParser utilsParser = new UtilsParser();
//        String url = "https://api.opendota.com/api/proMatches";
//        JsonArray proMatches = utilsParser.getDataByUrl(url);
        String url = this.openDataUrl + "proMatches";
        System.out.println(this.getDataFromApi(url));
    }

}
