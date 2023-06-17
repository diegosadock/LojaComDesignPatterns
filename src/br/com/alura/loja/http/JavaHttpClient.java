package br.com.alura.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{
    public void post(String url, Map<String, Object> dados) throws IOException {
        URL urlDaApi = new URL(url);
        URLConnection connection = urlDaApi.openConnection();
        connection.connect();
    }
}
