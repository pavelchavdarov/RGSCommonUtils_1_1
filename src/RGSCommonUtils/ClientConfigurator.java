/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RGSCommonUtils;

import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 *
 * @author p.chavdarov
 */
public interface ClientConfigurator {
    public CloseableHttpClient ConfigureSocketLayer() throws Exception;
    public HttpHost ConfigureTarger();
//    public CloseableHttpClient ConfigureSocketLayer(String trustStore, String password);
//    public CloseableHttpClient ConfigureSocketLayer(   String keyStoreResouce,
//                                            String keyStorePassword,
//                                            String trustStoreResouce,
//                                            String trustStorePassword);
}
