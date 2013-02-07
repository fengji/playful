package controllers;

import org.codehaus.jackson.node.ObjectNode;

import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
public class SampleWebServiceController extends Controller {
	@BodyParser.Of(play.mvc.BodyParser.Json.class)
	public static Result sampleJSON(){
		ObjectNode result = Json.newObject();
		result.put("name1", "value1");
		result.put("name2", "value2");
		result.put("name3", "value3");
		result.put("name4", "value4");
		return ok(result);
	}
	
	public static Result sampleJSONWithParam(String name){
		ObjectNode result = Json.newObject();
		result.put("hello", name);
		return ok(result);
	}
}
