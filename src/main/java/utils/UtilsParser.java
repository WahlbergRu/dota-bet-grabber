package utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class UtilsParser {
    public JsonArray getDatasByUrl(String url) {
        URL openApi = null;
        URLConnection request = null;
        JsonArray items = null;

        try {
            openApi = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            request = openApi.openConnection();
            request.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            items = root.getAsJsonArray(); //May be an array, may be an object.
        } catch (IOException e) {
            e.printStackTrace();
        }

        return items;
    }

    public JsonObject getDataByUrl(String url) {
        URL openApi = null;
        URLConnection request = null;
        JsonObject item = null;

        try {
            openApi = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            request = openApi.openConnection();
            request.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            item = root.getAsJsonObject(); //May be an array, may be an object.
        } catch (IOException e) {
            e.printStackTrace();
        }

        return item;
    }
}