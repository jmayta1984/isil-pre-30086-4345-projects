package pe.isil;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {

        // Crear un cliente de MongoDB
        //MongoClient client = MongoClients.create("mongodb+srv://userdb:isil2024@cluster0.mgs0mwa.mongodb.net/");
        MongoClient client = MongoClients.create("mongodb://localhost:27017");

        // Acceder a una base de datos
        MongoDatabase database = client.getDatabase("demo-java");

        // Acceder a una colección
        MongoCollection<Document> collection = database.getCollection("movies");

        // Crear un documento
        Document document = new Document("title", "Inception").append("director", "Christopher Nolan").append("year", "2010");

        // Insertar el documento en la colección
        collection.insertOne(document);

        client.close();
    }
}