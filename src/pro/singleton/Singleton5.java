package pro.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton5 {
	private static Map<String, Object> objMap = new HashMap<String, Object>();

	public static void regsiterService(String key, Object instance) {
		if (!objMap.containsKey(key)) {
			objMap.put(key, instance);
		}
	}
	
	public static Object getSerivce(String key) {
		return objMap.get(key);
	}
}
