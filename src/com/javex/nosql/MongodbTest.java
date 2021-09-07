package com.javex.nosql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

public class MongodbTest {
	static String MONGODB_IP = "127.0.0.1";
	static int MONGODB_PORT=27017;    // * 포트번호
	static String DB_NAME = "javaMongo";
	static String COLL_NAME = "testCollection"; // * 컬렉션 이름
	public static void main(String[] args) {
//		connect();  // * client 호출
//		getCollection(DB_NAME, COLL_NAME);
//		testInsert();
//		testInsertMany();
//		testFindFirst();
//		testFindAll();
//		testFindFilter();
//		testUpdateOne();
//		testUpdateMany();
		testDeleteAll();
	}
	
	// 삭제
	private static void testDeleteAll() {
		MongoCollection<Document> collection =
			getCollection(DB_NAME, COLL_NAME);
		DeleteResult res= collection.deleteMany(new Document());
		System.out.println(res.getDeletedCount() + "개 레코드 삭제");
	}
	// 여러 문서 업데이트
	private static void testUpdateMany() {
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		// 업데이트 조건
		Bson filter = Filters.eq("species", "인간");
		// 갱신 내역
		Bson doc = new Document("$set", new Document("method", "updateMany")
											.append("updateDate", new Date()));
		UpdateResult res = collection.updateMany(filter, doc);
		
		System.out.println(res.getModifiedCount() + "개 업데이트");
	}
	// 업데이트
	private static void testUpdateOne() {
		MongoCollection<Document> collection = 
				getCollection(DB_NAME, COLL_NAME);
		
		// 업데이트 조건
		Bson filter = Filters.eq("species", "인간");
		// 갱신 내역
		Bson doc = new Document("$set", new Document("method", "updateOne"));
		
		UpdateResult res = collection.updateOne(filter, doc);
		
		System.out.println(res.getModifiedCount() + "개 업데이트");
	}
	
	// 조건 검색
	private static void testFindFilter() {
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		
		// 필터 생성
//		Bson bsonFilter = Filters.eq("species", "인간");
		// 복합조건
		/* species = 인간이거나 gender = 여성인 레코드 */
		Bson bsonFilter = Filters.or(
				Filters.eq("species", "인간"),
				Filters.eq("gender", "여성"));
		
		MongoCursor<Document> cursor = 
				collection.find(bsonFilter).iterator();
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc.toJson());
		}
		cursor.close();
	}
	
	// 문서 전체 find
	private static void testFindAll() {
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		
		// find 메서드는 Cursor 반환
		MongoCursor<Document> cursor = collection.find().iterator();
		
		// 루프
		while(cursor.hasNext()) {	// 뒤에 남은 레코드가 있다.
			// 커서 뒤로 이동
			Document doc = cursor.next();
			System.out.printf("%s, %s, %s, %s%n",
					doc.get("_id"),
					doc.get("name"),
					doc.get("species"),
					doc.get("gender"));
			System.out.println("JSON:" +doc.toJson());
		}
	}
	// 1개 문서 find -> findOne
	private static void testFindFirst() {
		MongoCollection<Document> collection =
				getCollection(DB_NAME, COLL_NAME);
		
		// find() -> Cursor가 반환됨
		Document doc = collection.find().first();	// 커서의 첫 번째 위치
		// Document 출력
		System.out.println("DOC:" + doc);
		// * 문서를 수신받음 
		// 필드 확인 get("필드명") 사용
		System.out.printf("%s, %s, %s, %s%n",
				doc.get("_id"),
				doc.get("name"),
				doc.get("species"),
				doc.get("gender"));
		// Document -> JSON 출력: toJson
		System.out.println("JSON:" +doc.toJson());
	}
	private static void testInsertMany() {
		// 여러 Document Insert
		// insertMany (배열)
		List<Document> docs = new ArrayList<>();
		// 문서 생성 -> list 추가
		Document doc = new Document("name", "고길동")
							.append("species", "인간")
							.append("gender", "남성");
		
		docs.add(doc);
		doc = new Document("name", "도우너")
							.append("species", "외계인")
							.append("gender", "남성");
		
		docs.add(doc);
		doc = new Document("name", "또치")
							.append("species", "조류")
							.append("gender", "여성");
		
		docs.add(doc);
		doc = new Document("name", "영희")
							.append("species", "인간")
							.append("gender", "여성");
		
		docs.add(doc);
		
		System.out.println("삽입할 문서들:" + docs);
		
		// 여러 문서 insert
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		collection.insertMany(docs);
	}
	private static MongoCollection<Document> 
		getCollection(String dbName, String collName) {
		// DB 접속
		MongoClient client = connect();

		// 데이터 베이스 선택
		MongoDatabase db = client.getDatabase(dbName);
		// 컬렉션 선택
		MongoCollection<Document> collection = db.getCollection(collName);
		
		System.out.println("Database:" + db);
		System.out.println("Collectiob:" + collection);
		
		return collection;
	}
		
	private static void testInsert() {
		// JSON(BSON)
		Document doc = new Document("name", "둘리")		
									.append("gender", "남성")
									.append("species", "공룡");
		System.out.println("문서:" + doc);
		System.out.println("JSON:" + doc.toJson());
		
		// 컬렉션 얻기
		MongoCollection<Document> collection = 
				getCollection(DB_NAME, COLL_NAME);
		// 1개의 문서 INSERT
		collection.insertOne(doc);
	}
	
	private static MongoClient connect( ) {
		// MongoDB에 접속
		// * 기본 정보 세팅: localhost 27017
		MongoClient client = MongoClients.create();
			
			
		System.out.println(client);
		return client;
	}

}
