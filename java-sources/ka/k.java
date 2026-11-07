package ka;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f19173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f19174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p110k9.o f19176d;

    public k(y yVar, f fVar, List list, p241y9.a aVar) {
        this.f19173a = yVar;
        this.f19174b = fVar;
        this.f19175c = list;
        this.f19176d = p110k9.a.d(new A5.c(13, aVar));
    }

    public final List a() {
        return (List) this.f19176d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f19173a == this.f19173a && p251z9.j.a(kVar.f19174b, this.f19174b) && p251z9.j.a(kVar.a(), a()) && p251z9.j.a(kVar.f19175c, this.f19175c);
    }

    public final int hashCode() {
        return this.f19175c.hashCode() + ((a().hashCode() + ((this.f19174b.hashCode() + ((this.f19173a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(p120l9.n.a0(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                p251z9.j.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f19173a);
        sb.append(" cipherSuite=");
        sb.append(this.f19174b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f19175c;
        ArrayList arrayList2 = new ArrayList(p120l9.n.a0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                p251z9.j.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
