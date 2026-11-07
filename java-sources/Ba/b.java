package Ba;

import Ca.d;
import Ca.l;
import Ca.m;
import Ca.q;
import Ca.s;
import Ca.u;
import Ca.v;
import Ca.w;
import Da.g;
import Da.h;
import Da.k;
import H9.o;
import R7.f;
import W9.i;
import Y9.L;
import Z.C0709z;
import Z9.x;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.media.AudioAttributes;
import android.os.CancellationSignal;
import androidx.lifecycle.N;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookCategory;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.moshi.C;
import com.squareup.moshi.z;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.NoSuchElementException;
import p110k9.j;
import p110k9.y;
import p120l9.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f659r;

    public /* synthetic */ b(int i10) {
        this.f659r = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k9.g] */
    @Override // p241y9.a
    public final Object invoke() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Class<?> returnType;
        String str;
        j jVar;
        int i10 = 0;
        switch (this.f659r) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add("localhost");
                arrayList.add("localhost.localdomain");
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(256, new SecureRandom());
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                p251z9.j.d(keyPairGenerateKeyPair, "run(...)");
                Ca.j jVar2 = m.f833f;
                k kVar = k.f1363u;
                byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
                p251z9.j.d(encoded, "getEncoded(...)");
                k kVarS = f.s(encoded);
                jVar2.getClass();
                h hVar = new h();
                hVar.N(kVarS);
                u uVar = (u) jVar2.d(new q(hVar));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(AbstractC0813f2.K(new Ca.f("localhost", "2.5.4.3")));
                d dVar = keyPairGenerateKeyPair.getPrivate() instanceof RSAPrivateKey ? new d(null, "1.2.840.113549.1.1.11") : new d(k.f1363u, "1.2.840.10045.4.3.2");
                String str2 = dVar.f802a;
                BigInteger bigInteger = BigInteger.ONE;
                p251z9.j.b(bigInteger);
                long jCurrentTimeMillis = System.currentTimeMillis();
                w wVar = new w(jCurrentTimeMillis, 86400000 + jCurrentTimeMillis);
                ArrayList arrayList3 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(n.a0(arrayList, 10));
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        String str3 = (String) obj;
                        H9.m mVar = la.b.f19447a;
                        ArrayList arrayList5 = arrayList;
                        p251z9.j.e(str3, "<this>");
                        H9.m mVar2 = la.b.f19447a;
                        mVar2.getClass();
                        if (mVar2.f3641r.matcher(str3).matches()) {
                            Ca.j jVar3 = m.f830c;
                            k kVar2 = k.f1363u;
                            byte[] address = InetAddress.getByName(str3).getAddress();
                            p251z9.j.d(address, "getAddress(...)");
                            jVar = new j(jVar3, f.s(address));
                        } else {
                            jVar = new j(m.f829b, str3);
                        }
                        arrayList4.add(jVar);
                        arrayList = arrayList5;
                    }
                    arrayList3.add(new s("2.5.29.17", true, arrayList4));
                }
                v vVar = new v(2L, bigInteger, dVar, arrayList2, wVar, arrayList2, uVar, null, null, arrayList3);
                if (str2.equals("1.2.840.113549.1.1.11")) {
                    str = "SHA256WithRSA";
                } else {
                    if (!str2.equals("1.2.840.10045.4.3.2")) {
                        throw new IllegalStateException("unexpected signature algorithm: ".concat(str2).toString());
                    }
                    str = "SHA256withECDSA";
                }
                Signature signature = Signature.getInstance(str);
                signature.initSign(keyPairGenerateKeyPair.getPrivate());
                Ca.j jVar4 = m.g;
                jVar4.getClass();
                signature.update(p245z2.a.o(jVar4, vVar).j());
                k kVar3 = k.f1363u;
                byte[] bArrSign = signature.sign();
                p251z9.j.d(bArrSign, "sign(...)");
                l lVar = new l(vVar, dVar, new Ca.k(f.s(bArrSign), 0));
                Ca.j jVar5 = m.f834h;
                jVar5.getClass();
                k kVarO = p245z2.a.o(jVar5, lVar);
                try {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    h hVar2 = new h();
                    hVar2.N(kVarO);
                    Collection<? extends Certificate> collectionGenerateCertificates = certificateFactory.generateCertificates(new g(hVar2));
                    p251z9.j.b(collectionGenerateCertificates);
                    Object objW0 = p120l9.m.w0(collectionGenerateCertificates);
                    p251z9.j.c(objW0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) objW0;
                    Aa.c cVar = new Aa.c(keyPairGenerateKeyPair, x509Certificate);
                    Aa.a aVar = new Aa.a(0);
                    aVar.f554r = cVar;
                    aVar.f555s = (X509Certificate[]) Arrays.copyOf(new X509Certificate[0], 0);
                    ((ArrayList) aVar.f556t).add(x509Certificate);
                    return aVar.f();
                } catch (IllegalArgumentException e10) {
                    throw new IllegalArgumentException("failed to decode certificate", e10);
                } catch (GeneralSecurityException e11) {
                    throw new IllegalArgumentException("failed to decode certificate", e11);
                } catch (NoSuchElementException e12) {
                    throw new IllegalArgumentException("failed to decode certificate", e12);
                }
            case 1:
                return new C(new z(0)).b(B1.G(BookCategory.class), V8.d.f8425a, null);
            case 2:
                return Boolean.TRUE;
            case 3:
                return y.f19095a;
            case 4:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 5:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 6:
                try {
                    Method method = (Method) S2.b.f7470t.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 7:
                i iVar = i.f9682f;
                W9.f[] fVarArr = new W9.f[0];
                if (o.e1("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (iVar.equals(i.f9679c)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                W9.a aVar2 = new W9.a("kotlin.Unit");
                return new W9.g("kotlin.Unit", iVar, aVar2.f9655b.size(), p120l9.l.o0(fVarArr), aVar2);
            case 8:
                return x.f11069b;
            case 9:
                return Z9.q.f11061b;
            case 10:
                return Z9.n.f11059b;
            case 11:
                return Z9.u.f11067b;
            case 12:
                return Z9.f.f11051b;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                throw new IllegalStateException("No AyahColors palette provided");
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return p120l9.w.i0(new j("saturday", Integer.valueOf(R.string.every_saturday)), new j("sunday", Integer.valueOf(R.string.every_sunday)), new j("monday", Integer.valueOf(R.string.every_monday)), new j("tuesday", Integer.valueOf(R.string.every_tuesday)), new j("wednesday", Integer.valueOf(R.string.every_wednesday)), new j("thursday", Integer.valueOf(R.string.every_thursday)), new j("friday", Integer.valueOf(R.string.every_friday)));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return p120l9.w.i0(new j("saturday", Integer.valueOf(R.string.sat_only)), new j("sunday", Integer.valueOf(R.string.sun_only)), new j("monday", Integer.valueOf(R.string.mon_only)), new j("tuesday", Integer.valueOf(R.string.tue_only)), new j("wednesday", Integer.valueOf(R.string.wed_only)), new j("thursday", Integer.valueOf(R.string.thu_only)), new j("friday", Integer.valueOf(R.string.fri_only)));
            case 17:
                C0709z c0709z = p113l2.a.f19381a;
                return null;
            case 18:
                return NumberFormat.getNumberInstance();
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return NumberFormat.getNumberInstance(Locale.forLanguageTag("ar-EG"));
            case 20:
                if (p060f8.a.f16235a == null) {
                    synchronized (p060f8.a.f16236b) {
                        if (p060f8.a.f16235a == null) {
                            p050e8.f fVarB = p050e8.f.b();
                            fVarB.a();
                            p060f8.a.f16235a = FirebaseAnalytics.getInstance(fVarB.f15843a);
                        }
                        break;
                    }
                }
                FirebaseAnalytics firebaseAnalytics = p060f8.a.f16235a;
                p251z9.j.b(firebaseAnalytics);
                return firebaseAnalytics;
            case 21:
                return new N();
            case 22:
                F2.s sVar = new F2.s(1);
                sVar.a(p251z9.w.a(p197u2.c.class), new p197u2.b(i10));
                return sVar.c();
            default:
                return new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
        }
    }

    public /* synthetic */ b(L l10) {
        this.f659r = 7;
    }
}
