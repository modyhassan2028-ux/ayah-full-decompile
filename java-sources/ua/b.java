package ua;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ya.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f22991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f22992b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f22991a = x509TrustManager;
        this.f22992b = method;
    }

    @Override // ya.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f22992b.invoke(this.f22991a, x509Certificate);
            j.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f22991a, bVar.f22991a) && j.a(this.f22992b, bVar.f22992b);
    }

    public final int hashCode() {
        return this.f22992b.hashCode() + (this.f22991a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f22991a + ", findByIssuerAndSignatureMethod=" + this.f22992b + ')';
    }
}
