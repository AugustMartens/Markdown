package com.softdev.kuleuven;

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public class Connection {

    private MongoClientURI uri;
    private DBCollection collection;
    private DB database;
    private MongoClient mongoClient;

    public Connection() throws UnknownHostException {

        uri = new MongoClientURI(
                "mongodb+srv://Java:gR9d4U8fYImTz6UR@cluster0-njloi.gcp.mongodb.net/test?retryWrites=true&w=majority");
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDB("Database");
        collection = database.getCollection("collection");

    }

    public Boolean postToDatabase(String q) {
        // Test File
        List<Integer> books = Arrays.asList(27464, 747854);
        DBObject person = new BasicDBObject("_id", "jo")
                .append("name", q)
                .append("address", new BasicDBObject("street", "123 Fake St")
                        .append("city", "Faketon")
                        .append("state", "MA")
                        .append("zip", 12345))
                .append("books", books);

        // Write to DB
        System.out.println("Sending object to database");
        collection.insert(person);
        return true;
    }

    public Boolean getFromDatabase(String q) {

        return true;
    }


}
