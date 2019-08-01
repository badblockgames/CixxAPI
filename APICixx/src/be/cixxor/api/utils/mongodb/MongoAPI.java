package be.cixxor.api.utils.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoAPI {
	private MongoDatabase database;
	public void connect(String uri, String databaseName) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient(new MongoClientURI(uri));
		setDatabase(client.getDatabase(databaseName));
		MongoMessages.consoleGood("[CixxAPI]MongoDB successfully connected to DataBase");
	}
	public MongoDatabase getDatabase() {
		return database;
	}
	public void setDatabase(MongoDatabase database) {
		this.database = database;
	}
}
