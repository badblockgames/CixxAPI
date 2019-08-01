package be.cixxor.api.utils.mongodb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoAPI {
	
	public void preConnection(String uri, String dbName, String collectionName) {
	MongoClientURI clientURI = new MongoClientURI(uri);
	MongoClient mongoClient = new MongoClient(clientURI);
	
	MongoDatabase mongoDatabase = mongoClient.getDatabase(dbName);
	MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);	
	System.out.println("[Cixx-API]MongoDataBase connected !");
	}
}
