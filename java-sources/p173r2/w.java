package p173r2;

import B3.f;
import E2.C0112b;
import H9.o;
import android.support.v4.media.session.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p110k9.a;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f21498c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21499d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f21500e = new LinkedHashMap();

    public w(G g, String str) {
        this.f21496a = g;
        this.f21497b = str;
    }

    public v a() {
        v vVarB = b();
        vVarB.getClass();
        C0112b c0112b = vVarB.f21493s;
        for (Map.Entry entry : this.f21498c.entrySet()) {
            String str = (String) entry.getKey();
            C1288h c1288h = (C1288h) entry.getValue();
            j.e(str, "argumentName");
            j.e(c1288h, "argument");
            c0112b.getClass();
            ((LinkedHashMap) c0112b.f1644d).put(str, c1288h);
        }
        ArrayList arrayList = this.f21499d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            final t tVar = (t) obj;
            j.e(tVar, "navDeepLink");
            c0112b.getClass();
            final int i11 = 0;
            ArrayList arrayListE = i.e((LinkedHashMap) c0112b.f1644d, new c() { // from class: u2.i
                @Override // p241y9.c
                public final Object e(Object obj2) {
                    boolean zContains;
                    String str2 = (String) obj2;
                    switch (i11) {
                        case 0:
                            j.e(str2, "key");
                            zContains = tVar.c().contains(str2);
                            break;
                        default:
                            j.e(str2, "key");
                            zContains = tVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + tVar.f21476a + " can't be used to open destination " + ((v) c0112b.f1643c) + ".\nFollowing required arguments are missing: " + arrayListE).toString());
            }
            ((ArrayList) c0112b.f1642b).add(tVar);
        }
        Iterator it = this.f21500e.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            j.e(null, "action");
            throw null;
        }
        String str2 = this.f21497b;
        if (str2 != null) {
            c0112b.getClass();
            if (o.e1(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            j.e(strConcat, "uriPattern");
            final t tVar2 = new t(strConcat);
            final int i12 = 1;
            ArrayList arrayListE2 = i.e((LinkedHashMap) c0112b.f1644d, new c() { // from class: u2.i
                @Override // p241y9.c
                public final Object e(Object obj2) {
                    boolean zContains;
                    String str3 = (String) obj2;
                    switch (i12) {
                        case 0:
                            j.e(str3, "key");
                            zContains = tVar2.c().contains(str3);
                            break;
                        default:
                            j.e(str3, "key");
                            zContains = tVar2.c().contains(str3);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE2.isEmpty()) {
                StringBuilder sbD = p.D("Cannot set route \"", str2, "\" for destination ");
                sbD.append((v) c0112b.f1643c);
                sbD.append(". Following required arguments are missing: ");
                sbD.append(arrayListE2);
                throw new IllegalArgumentException(sbD.toString().toString());
            }
            c0112b.f1646f = a.d(new f(22, strConcat));
            c0112b.f1641a = strConcat.hashCode();
            c0112b.f1645e = str2;
        }
        return vVarB;
    }

    public v b() {
        return this.f21496a.a();
    }
}
