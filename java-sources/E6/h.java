package E6;

import Z.InterfaceC0686i;
import Z.t0;
import Z.u0;
import android.os.Trace;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import u.F;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1926f;
    public Serializable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f1928i;
    public Object j;

    public h(Set set) {
        this.f1921a = set;
        p011b0.e eVar = new p011b0.e(new u0[16]);
        this.f1922b = eVar;
        this.f1923c = eVar;
        this.f1924d = new p011b0.e(new Object[16]);
        this.f1925e = new p011b0.e(new p241y9.a[16]);
        this.g = new ArrayList();
        this.f1927h = new u.s();
        this.f1928i = new u.s();
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f1927h;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public i b() {
        String strZ = ((String) this.f1921a) == null ? " transportName" : "";
        if (((n) this.f1925e) == null) {
            strZ = strZ.concat(" encodedPayload");
        }
        if (((Long) this.f1926f) == null) {
            strZ = android.support.v4.media.session.p.z(strZ, " eventMillis");
        }
        if (((Long) this.g) == null) {
            strZ = android.support.v4.media.session.p.z(strZ, " uptimeMillis");
        }
        if (((HashMap) this.f1927h) == null) {
            strZ = android.support.v4.media.session.p.z(strZ, " autoMetadata");
        }
        if (strZ.isEmpty()) {
            return new i((String) this.f1921a, (Integer) this.f1923c, (n) this.f1925e, ((Long) this.f1926f).longValue(), ((Long) this.g).longValue(), (HashMap) this.f1927h, (Integer) this.f1924d, (String) this.f1922b, (byte[]) this.f1928i, (byte[]) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strZ));
    }

    public void c() {
        Set set = (Set) this.f1921a;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                t0 t0Var = (t0) it.next();
                it.remove();
                t0Var.c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void d() {
        p011b0.e eVar = (p011b0.e) this.f1922b;
        Set set = (Set) this.f1921a;
        e(Integer.MIN_VALUE);
        p011b0.e eVar2 = (p011b0.e) this.f1924d;
        if (eVar2.f13127t != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                F f3 = (F) this.f1926f;
                int i10 = eVar2.f13127t;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    Object obj = eVar2.f13125r[i10];
                    if (obj instanceof u0) {
                        t0 t0Var = ((u0) obj).f10830a;
                        set.remove(t0Var);
                        t0Var.d();
                    }
                    if (obj instanceof InterfaceC0686i) {
                        if (f3 == null || !f3.c(obj)) {
                            ((InterfaceC0686i) obj).e();
                        } else {
                            ((InterfaceC0686i) obj).d();
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (eVar.f13127t != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Object[] objArr = eVar.f13125r;
                int i11 = eVar.f13127t;
                for (int i12 = 0; i12 < i11; i12++) {
                    t0 t0Var2 = ((u0) objArr[i12]).f10830a;
                    set.remove(t0Var2);
                    t0Var2.b();
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public void e(int i10) {
        u.s sVar = (u.s) this.f1928i;
        ArrayList arrayList = (ArrayList) this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        int i11 = 0;
        ArrayList arrayListM = null;
        int i12 = 0;
        u.s sVar2 = null;
        u.s sVar3 = null;
        while (i12 < sVar.f22758b) {
            if (i10 <= sVar.c(i12)) {
                Object objRemove = arrayList.remove(i12);
                int iD = sVar.d(i12);
                int iD2 = ((u.s) this.f1927h).d(i12);
                if (arrayListM == null) {
                    arrayListM = AbstractC0813f2.M(objRemove);
                    sVar3 = new u.s();
                    sVar3.a(iD);
                    sVar2 = new u.s();
                    sVar2.a(iD2);
                } else {
                    p251z9.j.c(sVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    p251z9.j.c(sVar3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListM.add(objRemove);
                    sVar3.a(iD);
                    sVar2.a(iD2);
                }
            } else {
                i12++;
            }
        }
        if (arrayListM != null) {
            p251z9.j.c(sVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            p251z9.j.c(sVar3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListM.size() - 1;
            while (i11 < size) {
                int i13 = i11 + 1;
                int size2 = arrayListM.size();
                for (int i14 = i13; i14 < size2; i14++) {
                    int iC = sVar3.c(i11);
                    int iC2 = sVar3.c(i14);
                    if (iC < iC2 || (iC2 == iC && sVar2.c(i11) < sVar2.c(i14))) {
                        Object obj = arrayListM.get(i11);
                        arrayListM.set(i11, arrayListM.get(i14));
                        arrayListM.set(i14, obj);
                        int iC3 = sVar2.c(i11);
                        sVar2.e(i11, sVar2.c(i14));
                        sVar2.e(i14, iC3);
                        int iC4 = sVar3.c(i11);
                        sVar3.e(i11, sVar3.c(i14));
                        sVar3.e(i14, iC4);
                    }
                }
                i11 = i13;
            }
            p011b0.e eVar = (p011b0.e) this.f1924d;
            eVar.d(eVar.f13127t, arrayListM);
        }
    }

    public void f(Object obj, int i10, int i11, int i12) {
        e(i10);
        if (i12 < 0 || i12 >= i10) {
            ((p011b0.e) this.f1924d).b(obj);
            return;
        }
        ((ArrayList) this.g).add(obj);
        ((u.s) this.f1927h).a(i11);
        ((u.s) this.f1928i).a(i12);
    }
}
