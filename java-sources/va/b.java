package va;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p186s9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f23395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f23396b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f23395a = x509TrustManager;
        this.f23396b = x509TrustManagerExtensions;
    }

    @Override // p186s9.b
    public final List a(String str, List list) throws SSLPeerUnverifiedException {
        p251z9.j.e(list, "chain");
        p251z9.j.e(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f23396b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            p251z9.j.d(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f23395a == this.f23395a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f23395a);
    }
}
