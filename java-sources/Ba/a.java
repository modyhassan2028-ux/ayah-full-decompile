package Ba;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f658b;

    public a(X509TrustManager x509TrustManager, List list) {
        this.f657a = x509TrustManager;
        this.f658b = list;
        try {
            x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        j.e(x509CertificateArr, "chain");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        j.e(x509CertificateArr, "chain");
        j.e(str, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f657a.getAcceptedIssuers();
        j.d(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }
}
