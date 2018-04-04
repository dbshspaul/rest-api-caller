package com.apicaller;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IgniteRepository {
    String ip;

    public IgniteRepository(String ip) {
        this.ip = ip;
    }

    public String getCacheData(String cacheName) throws IOException {
        HttpGet httpGet = new HttpGet("http://" + ip + ":8080/cache?cache=" + cacheName);

        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        HttpResponse response = httpClient.execute(httpGet);
        return getResponseAsString(response);
    }

    public String getCacheDataByKey(String cacheName, String key) throws IOException {
        HttpGet httpGet = new HttpGet("http://" + ip + ":8080/cache/"+key+"?cache=" + cacheName);

        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        HttpResponse response = httpClient.execute(httpGet);
        return getResponseAsString(response);
    }

    public String deleteAllCacheData(String cacheName) throws IOException {
        HttpDelete httpDelete = new HttpDelete("http://" + ip + ":8080/cache?cache=" + cacheName);

        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        HttpResponse response = httpClient.execute(httpDelete);
        return getResponseAsString(response);
    }

    public String putStringData(String cacheName, String key, String value) throws IOException {
        HttpPut httpPut = new HttpPut("http://" + ip + ":8080/putString");
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("cache", cacheName));
        nvps.add(new BasicNameValuePair("key", key));
        nvps.add(new BasicNameValuePair("value", value));
        httpPut.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(httpPut);
        return getResponseAsString(response);
    }

    public String putIntData(String cacheName, String key, String value) throws IOException {
        HttpPut httpPut = new HttpPut("http://" + ip + ":8080/putInt");
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("cache", cacheName));
        nvps.add(new BasicNameValuePair("key", key));
        nvps.add(new BasicNameValuePair("value", value));
        httpPut.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(httpPut);
        return getResponseAsString(response);
    }

    public String putLongData(String cacheName, String key, String value) throws IOException {
        HttpPut httpPut = new HttpPut("http://" + ip + ":8080/putlong");
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("cache", cacheName));
        nvps.add(new BasicNameValuePair("key", key));
        nvps.add(new BasicNameValuePair("value", value));
        httpPut.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(httpPut);
        return getResponseAsString(response);
    }

    public String putFloatData(String cacheName, String key, String value) throws IOException {
        HttpPut httpPut = new HttpPut("http://" + ip + ":8080/putFloat");
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("cache", cacheName));
        nvps.add(new BasicNameValuePair("key", key));
        nvps.add(new BasicNameValuePair("value", value));
        httpPut.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(httpPut);
        return getResponseAsString(response);
    }

    public String putDoubleData(String cacheName, String key, String value) throws IOException {
        HttpPut httpPut = new HttpPut("http://" + ip + ":8080/putDouble");
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("cache", cacheName));
        nvps.add(new BasicNameValuePair("key", key));
        nvps.add(new BasicNameValuePair("value", value));
        httpPut.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(httpPut);
        return getResponseAsString(response);
    }

    public String putBooleanData(String cacheName, String key, String value) throws IOException {
        HttpPut httpPut = new HttpPut("http://" + ip + ":8080/putBoolean");
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials("admin", "admin");
        provider.setCredentials(AuthScope.ANY, credentials);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("cache", cacheName));
        nvps.add(new BasicNameValuePair("key", key));
        nvps.add(new BasicNameValuePair("value", value));
        httpPut.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(httpPut);
        return getResponseAsString(response);
    }



    private String getResponseAsString(HttpResponse response) throws IOException {
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        return result.toString();
    }
}
