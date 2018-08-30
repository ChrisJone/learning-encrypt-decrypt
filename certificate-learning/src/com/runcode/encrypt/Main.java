package com.runcode.encrypt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.*;
import java.security.cert.*;
import java.security.cert.Certificate;

public class Main {
    public static void main(String[] args){
        try {
            FileInputStream in = new FileInputStream("/Volumes/Transcend/download/5b8815ee58787.keystore");
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(in,"123456".toCharArray());
            X509Certificate x509Certificate = (X509Certificate) ks.getCertificate("chris");
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            System.out.println(x509Certificate.getNotBefore());

            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            CRL crl = certificateFactory.generateCRL(in);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (CRLException e) {
            e.printStackTrace();
        }
    }
}
