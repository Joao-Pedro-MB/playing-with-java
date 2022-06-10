package store_v1.http;

import java.util.Map;

public class ApacheHttpAdapter implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		// Chamada a API via Apache HTTP Client...
		System.out.println("Registrando budget via Apache HTTP Client");
	}
}