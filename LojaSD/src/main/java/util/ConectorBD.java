package util;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class ConectorBD {
	
	MongoClientURI uri = new MongoClientURI(
	    "mongodb+srv://SDistribuidos:<password>@lojasd.s5whu.azure.mongodb.net/<dbname>?retryWrites=true&w=majority");
	
	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("test");

	
		/*
		 * http://mongodb.github.io/mongo-java-driver/4.0/driver/getting-started/quick-start/
		 * https://cloud.mongodb.com/v2/5f09136b015c1a18c5b57f8b#clusters/commandLineTools/LojaSD
		 *  */
			
}