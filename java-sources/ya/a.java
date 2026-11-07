package ya;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p186s9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f24716a;

    public a(d dVar) {
        j.e(dVar, "trustRootIndex");
        this.f24716a = dVar;
    }

    public static boolean d(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i10) {
        if (!j.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i10) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p186s9.b
    public final List a(String str, List list) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        j.e(list, "chain");
        j.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        j.d(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            j.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f24716a.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (d(x509CertificateA, x509CertificateA, arrayList.size() - 2)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                j.d(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        if (!z10) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    j.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                } while (!d(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && j.a(((a) obj).f24716a, this.f24716a);
    }

    public final int hashCode() {
        return this.f24716a.hashCode();
    }
}
