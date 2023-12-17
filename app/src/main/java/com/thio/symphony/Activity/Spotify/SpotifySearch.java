package com.thio.symphony.Activity.Spotify;

import org.asynchttpclient.*;

public class SpotifySearch {
    public static void main(String[] args) throws Exception {
        AsyncHttpClient client = Dsl.asyncHttpClient();

        String searchEndpoint = "https://spotify23.p.rapidapi.com/search/?q=%3CREQUIRED%3E&type=multi&offset=0&limit=10&numberOfTopResults=5";

        Response response = client.prepare("GET", searchEndpoint)
                .setHeader("X-RapidAPI-Key", "40ef6a1287msh640a107b85a6835p1da02ejsn0b00b8ccb431")
                .setHeader("X-RapidAPI-Host", "spotify23.p.rapidapi.com")
                .execute()
                .toCompletableFuture()
                .get();

        System.out.println(response.getResponseBody());

        client.close();
    }
}

