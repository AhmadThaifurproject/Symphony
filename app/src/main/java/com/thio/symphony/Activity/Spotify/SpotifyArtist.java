package com.thio.symphony.Activity.Spotify;

import org.asynchttpclient.*;

public class SpotifyArtist {
    public static void main(String[] args) throws Exception {
        AsyncHttpClient client = Dsl.asyncHttpClient();

        String artistEndpoint = "https://spotify23.p.rapidapi.com/artists/?ids=2w9zwq3AktTeYYMuhMjju8";

        Response response = client.prepare("GET", artistEndpoint)
                .setHeader("X-RapidAPI-Key", "40ef6a1287msh640a107b85a6835p1da02ejsn0b00b8ccb431")
                .setHeader("X-RapidAPI-Host", "spotify23.p.rapidapi.com")
                .execute()
                .toCompletableFuture()
                .get();

        System.out.println(response.getResponseBody());

        client.close();
    }
}
