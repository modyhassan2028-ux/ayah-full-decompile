package D6;

import D6.s;
import K.u0;
import W.AbstractC0607v1;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p151p.C1256n;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1313f;
    public Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f1315i;

    public static void d(JSONObject jSONObject, String str) {
        StringBuilder sbC = android.support.v4.media.session.p.C(str);
        sbC.append(jSONObject.toString());
        String string = sbC.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public x8.b a(int i10) {
        x8.b bVar = null;
        try {
            if (!AbstractC0607v1.a(2, i10)) {
                JSONObject jSONObjectL = ((C1256n) this.f1312e).l();
                if (jSONObjectL != null) {
                    x8.b bVarK = ((C1256n) this.f1310c).k(jSONObjectL);
                    d(jSONObjectL, "Loaded cached settings: ");
                    ((i7.C) this.f1311d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (AbstractC0607v1.a(3, i10) || bVarK.f24393c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return bVarK;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = bVarK;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public x8.b b() {
        return (x8.b) ((AtomicReference) this.f1314h).get();
    }

    public void c(E6.j jVar, int i10) {
        byte[] bArr;
        long j;
        F6.a aVar;
        String str;
        F6.a aVar2;
        int i11;
        C6.c cVarG;
        String str2;
        Integer numValueOf;
        s sVar;
        final s sVar2 = this;
        final E6.j jVar2 = jVar;
        byte[] bArr2 = jVar2.f1938b;
        M6.c cVar = (M6.c) sVar2.f1313f;
        F6.g gVarA = ((F6.e) sVar2.f1309b).a(jVar2.f1937a);
        long jMax = 0;
        while (true) {
            final int i12 = 0;
            L6.i iVar = (L6.i) cVar;
            if (!((Boolean) iVar.w(new M6.b(sVar2) { // from class: K6.g

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ s f5262s;

                {
                    this.f5262s = sVar2;
                }

                @Override // M6.b
                public final Object b() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            E6.j jVar3 = jVar2;
                            L6.i iVar2 = (L6.i) ((L6.d) this.f5262s.f1310c);
                            SQLiteDatabase sQLiteDatabaseB = iVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lE = L6.i.e(sQLiteDatabaseB, jVar3);
                                if (lE == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = iVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lE.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            L6.i iVar3 = (L6.i) ((L6.d) this.f5262s.f1310c);
                            iVar3.getClass();
                            return (Iterable) iVar3.i(new u0(3, iVar3, jVar2));
                    }
                }
            })).booleanValue()) {
                iVar.w(new K6.i(jMax, sVar2, jVar2));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) iVar.w(new M6.b(sVar2) { // from class: K6.g

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ s f5262s;

                {
                    this.f5262s = sVar2;
                }

                @Override // M6.b
                public final Object b() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            E6.j jVar3 = jVar2;
                            L6.i iVar2 = (L6.i) ((L6.d) this.f5262s.f1310c);
                            SQLiteDatabase sQLiteDatabaseB = iVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lE = L6.i.e(sQLiteDatabaseB, jVar3);
                                if (lE == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = iVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lE.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            L6.i iVar3 = (L6.i) ((L6.d) this.f5262s.f1310c);
                            iVar3.getClass();
                            return (Iterable) iVar3.i(new u0(3, iVar3, jVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i14 = 4;
            if (gVarA == null) {
                Y2.a.v("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar2);
                aVar2 = new F6.a(-1L, 3);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((L6.b) it.next()).f5542c);
                }
                if (bArr2 != null) {
                    L6.c cVar2 = (L6.c) sVar2.f1315i;
                    Objects.requireNonNull(cVar2);
                    H6.a aVar3 = (H6.a) iVar.w(new C6.b(i14, cVar2));
                    E6.h hVar = new E6.h();
                    hVar.f1927h = new HashMap();
                    hVar.f1926f = Long.valueOf(((N6.a) sVar2.g).e());
                    hVar.g = Long.valueOf(((N6.a) sVar2.f1314h).e());
                    hVar.f1921a = "GDT_CLIENT_METRICS";
                    B6.b bVar = new B6.b("proto");
                    aVar3.getClass();
                    android.support.v4.media.session.r rVar = E6.q.f1951a;
                    rVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        rVar.B(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar.f1925e = new E6.n(bVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C6.d) gVarA).a(hVar.b()));
                }
                C6.d dVar = (C6.d) gVarA;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    E6.i iVar2 = (E6.i) obj;
                    String str3 = iVar2.f1929a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(iVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar2);
                        map.put(str3, arrayList2);
                    }
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    E6.i iVar3 = (E6.i) ((List) entry.getValue()).get(0);
                    K k7 = K.f1245r;
                    long jE = dVar.f780f.e();
                    long jE2 = dVar.f779e.e();
                    n nVar = new n(new l(Integer.valueOf(iVar3.b("sdk-version")), iVar3.a("model"), iVar3.a("hardware"), iVar3.a("device"), iVar3.a("product"), iVar3.a("os-uild"), iVar3.a("manufacturer"), iVar3.a("fingerprint"), iVar3.a("locale"), iVar3.a("country"), iVar3.a("mcc_mnc"), iVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (E6.i iVar4 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        E6.n nVar2 = iVar4.f1931c;
                        byte[] bArr3 = iVar4.j;
                        B6.b bVar2 = nVar2.f1947a;
                        byte[] bArr4 = nVar2.f1948b;
                        long j10 = jMax;
                        if (bVar2.equals(new B6.b("proto"))) {
                            sVar = new s();
                            sVar.f1313f = bArr4;
                        } else {
                            if (bVar2.equals(new B6.b("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                s sVar3 = new s();
                                sVar3.g = str4;
                                sVar = sVar3;
                            } else {
                                String strO = Y2.a.O("CctTransportBackend");
                                if (Log.isLoggable(strO, 5)) {
                                    Log.w(strO, "Received event of unsupported encoding " + bVar2 + ". Skipping...");
                                }
                            }
                            it2 = it3;
                            jMax = j10;
                        }
                        sVar.f1308a = Long.valueOf(iVar4.f1932d);
                        sVar.f1309b = Long.valueOf(iVar4.f1933e);
                        String str5 = (String) iVar4.f1934f.get("tz-offset");
                        sVar.f1310c = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        sVar.f1314h = new w((I) I.f1243r.get(iVar4.b("net-type")), (H) H.f1241r.get(iVar4.b("mobile-subtype")));
                        Integer num = iVar4.f1930b;
                        if (num != null) {
                            sVar.f1311d = num;
                        }
                        Integer num2 = iVar4.g;
                        if (num2 != null) {
                            r rVar2 = new r(new q(num2));
                            A a9 = A.f1239r;
                            sVar.f1312e = new o(rVar2);
                        }
                        byte[] bArr5 = iVar4.f1936i;
                        if (bArr5 != null || bArr3 != null) {
                            if (bArr5 == null) {
                                bArr5 = null;
                            }
                            sVar.f1315i = new p(bArr5, bArr3 != null ? bArr3 : null);
                        }
                        String strZ = ((Long) sVar.f1308a) == null ? " eventTimeMs" : "";
                        if (((Long) sVar.f1309b) == null) {
                            strZ = strZ.concat(" eventUptimeMs");
                        }
                        if (((Long) sVar.f1310c) == null) {
                            strZ = android.support.v4.media.session.p.z(strZ, " timezoneOffsetSeconds");
                        }
                        if (!strZ.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strZ));
                        }
                        arrayList4.add(new t(((Long) sVar.f1308a).longValue(), (Integer) sVar.f1311d, (o) sVar.f1312e, ((Long) sVar.f1309b).longValue(), (byte[]) sVar.f1313f, (String) sVar.g, ((Long) sVar.f1310c).longValue(), (w) sVar.f1314h, (p) sVar.f1315i));
                        it2 = it3;
                        jMax = j10;
                    }
                    arrayList3.add(new u(jE, jE2, nVar, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                j = jMax;
                m mVar = new m(arrayList3);
                URL urlB = dVar.f778d;
                if (bArr != null) {
                    try {
                        C6.a aVarA = C6.a.a(bArr);
                        str = aVarA.f769b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f768a;
                        if (str6 != null) {
                            urlB = C6.d.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new F6.a(-1L, 3);
                    }
                } else {
                    str = null;
                }
                try {
                    android.support.v4.media.session.r rVar3 = new android.support.v4.media.session.r(urlB, mVar, str, 2);
                    C6.b bVar3 = new C6.b(0, dVar);
                    int i16 = 5;
                    do {
                        cVarG = bVar3.g(rVar3);
                        URL url = cVarG.f773b;
                        if (url != null) {
                            Y2.a.v("CctTransportBackend", "Following redirect to: %s", url);
                            rVar3 = new android.support.v4.media.session.r(url, (m) rVar3.f11365t, (String) rVar3.f11366u, 2);
                        } else {
                            rVar3 = null;
                        }
                        if (rVar3 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = cVarG.f772a;
                    if (i17 == 200) {
                        aVar2 = new F6.a(cVarG.f774c, 1);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new F6.a(-1L, 2);
                        } else if (i17 == 400) {
                            try {
                                aVar = new F6.a(-1L, 4);
                            } catch (IOException e10) {
                                e = e10;
                                Y2.a.w("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new F6.a(-1L, 2);
                            }
                        } else {
                            aVar = new F6.a(-1L, 3);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i11 = 2;
            int i18 = aVar2.f2407a;
            if (i18 == i11) {
                iVar.w(new K6.h(this, iterable, jVar, j));
                ((android.support.v4.media.session.r) this.f1311d).M(jVar, i10 + 1, true);
                return;
            }
            sVar2 = this;
            jVar2 = jVar;
            jMax = j;
            iVar.w(new u0(1, sVar2, iterable));
            if (i18 == 1) {
                jMax = Math.max(jMax, aVar2.f2408b);
                if (bArr != null) {
                    iVar.w(new C6.b(6, sVar2));
                }
            } else if (i18 == 4) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str7 = ((L6.b) it4.next()).f5542c.f1929a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                iVar.w(new u0(2, sVar2, map2));
            }
            bArr2 = bArr;
        }
    }
}
