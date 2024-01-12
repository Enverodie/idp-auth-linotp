package edu.kit.scc.linotp;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class ConcreteHostnameVerifier implements HostnameVerifier {

    @Override
    public boolean verify(String arg0, SSLSession arg1) {
        // TODO: Make this fancy
        return true;
    }
    
}
