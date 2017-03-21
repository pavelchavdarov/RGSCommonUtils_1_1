/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RGSCommonUtils;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/**
 *
 * @author p.chavdarov
 */
public interface RequestConfigurator {
    public HttpPost Configurate(HttpPost request);
    public HttpGet Configurate(HttpGet request);
    public HttpPut Configurate(HttpPut request);
}
