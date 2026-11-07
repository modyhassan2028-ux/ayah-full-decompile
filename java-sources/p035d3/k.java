package p035d3;

import A3.f;
import F2.s;
import J3.B;
import J3.C0304b;
import J3.j;
import J3.x;
import L3.e;
import L3.g;
import android.content.Context;
import com.ayah.common.data.source.database.AyahDatabase;
import com.ayah.common.data.source.preference.model.PreferencesAppNotification;
import com.ayah.common.data.source.preference.model.PreferencesBookmark;
import com.ayah.common.data.source.preference.model.PreferencesKhatmah;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.z;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.ByteArrayInputStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import ka.q;
import ka.r;
import p051e9.a;
import p061f9.b;
import p085i0.n;
import p144o3.h;
import p174r3.l;
import p198u3.d;
import p208v3.c;

/* JADX INFO: loaded from: classes.dex */
public final class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15616c;

    public /* synthetic */ k(a aVar, int i10, int i11) {
        this.f15614a = i11;
        this.f15616c = aVar;
        this.f15615b = i10;
    }

    @Override // p101j9.a
    public final Object get() throws NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException {
        Object rVar;
        switch (this.f15614a) {
            case 0:
                l lVar = (l) this.f15616c;
                int i10 = this.f15615b;
                if (i10 == 0) {
                    return new T3.a(lVar.f15617a);
                }
                if (i10 == 1) {
                    return new p089i4.b((T3.a) lVar.f15621e.get());
                }
                throw new AssertionError(i10);
            default:
                int i11 = 19;
                switch (this.f15615b) {
                    case 0:
                        return new c((j) ((u) this.f15616c).f15662d.get());
                    case 1:
                        return new j(((u) this.f15616c).b(), (JsonAdapter) ((u) this.f15616c).f15661c.get());
                    case 2:
                        G3.a.f2790a.getClass();
                        return new C(new z(0)).a(PreferencesAppNotification.class);
                    case 3:
                        return new g(((u) this.f15616c).f15659a.f1940a);
                    case 4:
                        u uVar = (u) this.f15616c;
                        return new e(uVar.f15659a.f1940a, (c) uVar.f15663e.get());
                    case 5:
                        return new D3.c(((u) this.f15616c).f15659a.f1940a);
                    case 6:
                        return new p174r3.c((D3.c) ((u) this.f15616c).f15665h.get(), (B) ((u) this.f15616c).j.get());
                    case 7:
                        return new B(((u) this.f15616c).b(), (x) ((u) this.f15616c).f15666i.get());
                    case 8:
                        return new x(((u) this.f15616c).b());
                    case 9:
                        u uVar2 = (u) this.f15616c;
                        return new l(uVar2.f15659a.f1940a, (D3.c) uVar2.f15665h.get(), (B3.e) ((u) this.f15616c).f15669m.get(), (s3.a) ((u) this.f15616c).f15673q.get());
                    case 10:
                        u uVar3 = (u) this.f15616c;
                        return new B3.e(uVar3.f15659a.f1940a, (p166q4.a) uVar3.f15668l.get());
                    case 11:
                        return new p166q4.a();
                    case 12:
                        return new s3.a(new n(((u) this.f15616c).c()));
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        rVar = new r(new q());
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        Aa.b bVar = (Aa.b) ((u) this.f15616c).f15671o.get();
                        p251z9.j.e(bVar, "certificates");
                        q qVar = new q();
                        ua.e eVar = ua.e.f22996a;
                        SSLContext sSLContextL = ua.e.f22996a.l();
                        sSLContextL.init(new KeyManager[]{bVar.f558a}, new TrustManager[]{bVar.f559b}, new SecureRandom());
                        SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                        p251z9.j.d(socketFactory, "getSocketFactory(...)");
                        X509TrustManager x509TrustManager = bVar.f559b;
                        if (socketFactory.equals(qVar.f19208o)) {
                            x509TrustManager.equals(qVar.f19209p);
                        }
                        qVar.f19208o = socketFactory;
                        qVar.f19214u = ua.e.f22996a.c(x509TrustManager);
                        qVar.f19209p = x509TrustManager;
                        return new r(qVar);
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        byte[] bytes = "-----BEGIN CERTIFICATE-----\nMIIFazCCA1OgAwIBAgIRAIIQz7DSQONZRGPgu2OCiwAwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMTUwNjA0MTEwNDM4\nWhcNMzUwNjA0MTEwNDM4WjBPMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJu\nZXQgU2VjdXJpdHkgUmVzZWFyY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBY\nMTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAK3oJHP0FDfzm54rVygc\nh77ct984kIxuPOZXoHj3dcKi/vVqbvYATyjb3miGbESTtrFj/RQSa78f0uoxmyF+\n0TM8ukj13Xnfs7j/EvEhmkvBioZxaUpmZmyPfjxwv60pIgbz5MDmgK7iS4+3mX6U\nA5/TR5d8mUgjU+g4rk8Kb4Mu0UlXjIB0ttov0DiNewNwIRt18jA8+o+u3dpjq+sW\nT8KOEUt+zwvo/7V3LvSye0rgTBIlDHCNAymg4VMk7BPZ7hm/ELNKjD+Jo2FR3qyH\nB5T0Y3HsLuJvW5iB4YlcNHlsdu87kGJ55tukmi8mxdAQ4Q7e2RCOFvu396j3x+UC\nB5iPNgiV5+I3lg02dZ77DnKxHZu8A/lJBdiB3QW0KtZB6awBdpUKD9jf1b0SHzUv\nKBds0pjBqAlkd25HN7rOrFleaJ1/ctaJxQZBKT5ZPt0m9STJEadao0xAH0ahmbWn\nOlFuhjuefXKnEgV4We0+UXgVCwOPjdAvBbI+e0ocS3MFEvzG6uBQE3xDk3SzynTn\njh8BCNAw1FtxNrQHusEwMFxIt4I7mKZ9YIqioymCzLq9gwQbooMDQaHWBfEbwrbw\nqHyGO0aoSCqI3Haadr8faqU9GY/rOPNk3sgrDQoo//fb4hVC1CLQJ13hef4Y53CI\nrU7m2Ys6xt0nUW7/vGT1M0NPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNV\nHRMBAf8EBTADAQH/MB0GA1UdDgQWBBR5tFnme7bl5AFzgAiIyBpY9umbbjANBgkq\nhkiG9w0BAQsFAAOCAgEAVR9YqbyyqFDQDLHYGmkgJykIrGF1XIpu+ILlaS/V9lZL\nubhzEFnTIZd+50xx+7LSYK05qAvqFyFWhfFQDlnrzuBZ6brJFe+GnY+EgPbk6ZGQ\n3BebYhtF8GaV0nxvwuo77x/Py9auJ/GpsMiu/X1+mvoiBOv/2X/qkSsisRcOj/KK\nNFtY2PwByVS5uCbMiogziUwthDyC3+6WVwW6LLv3xLfHTjuCvjHIInNzktHCgKQ5\nORAzI4JMPJ+GslWYHb4phowim57iaztXOoJwTdwJx4nLCgdNbOhdjsnvzqvHu7Ur\nTkXWStAmzOVyyghqpZXjFaH3pO3JLF+l+/+sKAIuvtd7u+Nxe5AW0wdeRlN8NwdC\njNPElpzVmbUq4JUagEiuTDkHzsxHpFKVK7q4+63SM1N95R1NbdWhscdCb+ZAJzVc\noyi3B43njTOQ5yOf+1CceWxG1bQVs5ZufpsMljq4Ui0/1lvh+wjChP4kqKOJ2qxq\n4RgqsahDYVvTH9w7jXbyLeiNdd8XM2w9U/t7y0Ff/9yi0GE44Za4rF2LN9d11TPA\nmRGunUHBcnWEvgJBQl9nJEiU0Zsnvgc/ubhPgXRR4Xq37Z0j4r7g1SgEEzwxA57d\nemyPxgcYxn/eR44/KJ4EBs+lVDR3veyJm+kXQ99b21/+jh5Xos1AnX5iItreGCc=\n-----END CERTIFICATE-----".getBytes(H9.a.f3610a);
                        p251z9.j.d(bytes, "getBytes(...)");
                        Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                        Aa.a aVar = new Aa.a(0);
                        p251z9.j.c(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        ((ArrayList) aVar.f556t).add((X509Certificate) certificateGenerateCertificate);
                        ua.e eVar2 = ua.e.f22996a;
                        ua.e.f22996a.getClass();
                        X509TrustManager x509TrustManagerM = ua.e.m();
                        ArrayList arrayList = (ArrayList) aVar.f556t;
                        X509Certificate[] acceptedIssuers = x509TrustManagerM.getAcceptedIssuers();
                        Collections.addAll(arrayList, Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
                        return aVar.f();
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        return new h((x) ((u) this.f15616c).f15666i.get());
                    case 17:
                        C0304b c0304b = (C0304b) ((u) this.f15616c).f15677u.get();
                        ((u) this.f15616c).getClass();
                        return new d(c0304b, u.a());
                    case 18:
                        return new C0304b(((u) this.f15616c).b(), (JsonAdapter) ((u) this.f15616c).f15676t.get());
                    case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                        G3.a.f2790a.getClass();
                        return new C(new z(0)).a(PreferencesBookmark.class);
                    case 20:
                        Context context = ((u) this.f15616c).f15659a.f1940a;
                        C3.a[] aVarArr = {new C3.a(1, 2, 0), new C3.a(2, 3, 1)};
                        F2.q qVarB = f.b(context, AyahDatabase.class, "ayah.db");
                        C3.a[] aVarArr2 = (C3.a[]) Arrays.copyOf(aVarArr, 2);
                        LinkedHashSet linkedHashSet = qVarB.f2308l;
                        p251z9.j.e(aVarArr2, "migrations");
                        for (C3.a aVar2 : aVarArr2) {
                            linkedHashSet.add(Integer.valueOf(aVar2.f722a));
                            linkedHashSet.add(Integer.valueOf(aVar2.f723b));
                        }
                        s sVar = qVarB.j;
                        C3.a[] aVarArr3 = (C3.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length);
                        sVar.getClass();
                        p251z9.j.e(aVarArr3, "migrations");
                        for (C3.a aVar3 : aVarArr3) {
                            sVar.b(aVar3);
                        }
                        return (AyahDatabase) qVarB.a();
                    case 21:
                        return new p144o3.e((p218w3.f) ((u) this.f15616c).f15680x.get(), (p218w3.j) ((u) this.f15616c).f15681y.get());
                    case 22:
                        return new p218w3.f(new i7.B(i11), (x) ((u) this.f15616c).f15666i.get());
                    case 23:
                        return new p218w3.j(new i7.B(i11));
                    case 24:
                        ((u) this.f15616c).getClass();
                        return new p218w3.c(u.a(), (d) ((u) this.f15616c).f15678v.get(), (x) ((u) this.f15616c).f15666i.get());
                    case 25:
                        return new p218w3.h();
                    case 26:
                        return new p218w3.a((x) ((u) this.f15616c).f15666i.get());
                    case 27:
                        return new p025c4.a();
                    case 28:
                        return new p236y3.a((x) ((u) this.f15616c).f15666i.get());
                    case 29:
                        return new p144o3.a();
                    case 30:
                        return new p227x3.a();
                    case 31:
                        d dVar = (d) ((u) this.f15616c).f15678v.get();
                        p218w3.c cVar = (p218w3.c) ((u) this.f15616c).f15642A.get();
                        p218w3.f fVar = (p218w3.f) ((u) this.f15616c).f15680x.get();
                        ((u) this.f15616c).getClass();
                        rVar = new p198u3.l(dVar, cVar, fVar, u.a(), (p218w3.a) ((u) this.f15616c).f15644C.get());
                        break;
                    case 32:
                        return new p166q4.c();
                    case 33:
                        return new p155p3.a();
                    case 34:
                        return new p198u3.f((AyahDatabase) ((u) this.f15616c).f15679w.get());
                    case 35:
                        return new p144o3.b();
                    case 36:
                        return new p198u3.e((AyahDatabase) ((u) this.f15616c).f15679w.get());
                    case 37:
                        return new p189t3.b((J3.d) ((u) this.f15616c).f15656O.get());
                    case 38:
                        return new J3.d(((u) this.f15616c).b(), (j) ((u) this.f15616c).f15662d.get(), (JsonAdapter) ((u) this.f15616c).f15655N.get());
                    case 39:
                        G3.a.f2790a.getClass();
                        return new C(new z(0)).a(PreferencesKhatmah.class);
                    case 40:
                        return new K4.d((p218w3.j) ((u) this.f15616c).f15681y.get(), (p218w3.c) ((u) this.f15616c).f15642A.get(), (p218w3.a) ((u) this.f15616c).f15644C.get());
                    case 41:
                        return new p146o5.a((p144o3.a) ((u) this.f15616c).f15647F.get(), (h) ((u) this.f15616c).f15675s.get());
                    case 42:
                        return new p237y4.c((p218w3.j) ((u) this.f15616c).f15681y.get());
                    case 43:
                        return new p237y4.e(new i7.C(9));
                    case 44:
                        return new s(this);
                    case 45:
                        return new t(this);
                    default:
                        throw new AssertionError(this.f15615b);
                }
                return rVar;
        }
    }
}
