package p207v2;

import A6.a;
import M9.e;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p017b7.d;
import p074h0.i;
import p120l9.m;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23150f;
    public final e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f23151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f23152i;
    public final i j;

    public J(d dVar) {
        this.f23145a = dVar;
        ArrayList arrayList = new ArrayList();
        this.f23146b = arrayList;
        this.f23147c = arrayList;
        this.g = u0.a(-1, 6, null);
        this.f23151h = u0.a(-1, 6, null);
        this.f23152i = new LinkedHashMap();
        i iVar = new i(17, false);
        C1372j c1372j = C1372j.f23256c;
        iVar.f16422s = c1372j;
        iVar.f16423t = c1372j;
        iVar.f16424u = c1372j;
        iVar.F(EnumC1375m.f23268r, C1371i.f23250b);
        this.j = iVar;
    }

    public final b0 a(l0 l0Var) {
        Integer numValueOf;
        d dVar = this.f23145a;
        int i10 = dVar.f13308a;
        ArrayList arrayList = this.f23147c;
        List listC0 = m.C0(arrayList);
        if (l0Var != null) {
            int i11 = l0Var.f23266e;
            int size = this.f23149e;
            int i12 = -this.f23148d;
            int iE = AbstractC0813f2.E(arrayList) - this.f23148d;
            int i13 = i12;
            while (i13 < i11) {
                size += i13 > iE ? i10 : ((Z) arrayList.get(this.f23148d + i13)).f23195r.size();
                i13++;
            }
            int i14 = size + l0Var.f23267f;
            if (i11 < i12) {
                i14 -= i10;
            }
            numValueOf = Integer.valueOf(i14);
        } else {
            numValueOf = null;
        }
        return new b0(listC0, numValueOf, dVar, this.f23149e);
    }

    public final boolean b(int i10, EnumC1375m enumC1375m, Z z10) {
        j.e(enumC1375m, "loadType");
        j.e(z10, "page");
        int i11 = z10.f23197t;
        List list = z10.f23195r;
        int i12 = z10.f23198u;
        int iOrdinal = enumC1375m.ordinal();
        ArrayList arrayList = this.f23146b;
        ArrayList arrayList2 = this.f23147c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i10 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            arrayList.add(z10);
            this.f23148d = 0;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            this.f23150f = i12;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            this.f23149e = i11;
            return true;
        }
        LinkedHashMap linkedHashMap = this.f23152i;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before append");
            }
            if (i10 == 0) {
                arrayList.add(z10);
                if (i12 == Integer.MIN_VALUE) {
                    int size = this.f23150f - list.size();
                    i12 = size < 0 ? 0 : size;
                }
                this.f23150f = i12 != Integer.MIN_VALUE ? i12 : 0;
                linkedHashMap.remove(EnumC1375m.f23270t);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before prepend");
            }
            if (i10 == 0) {
                arrayList.add(0, z10);
                this.f23148d++;
                if (i11 == Integer.MIN_VALUE) {
                    int size2 = this.f23149e - list.size();
                    i11 = size2 < 0 ? 0 : size2;
                }
                this.f23149e = i11 != Integer.MIN_VALUE ? i11 : 0;
                linkedHashMap.remove(EnumC1375m.f23269s);
                return true;
            }
        }
        return false;
    }

    public final C1377o c(Z z10, EnumC1375m enumC1375m) {
        j.e(z10, "<this>");
        int iOrdinal = enumC1375m.ordinal();
        int size = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                size = 0 - this.f23148d;
            } else {
                if (iOrdinal != 2) {
                    throw new a();
                }
                size = (this.f23147c.size() - this.f23148d) - 1;
            }
        }
        List listK = AbstractC0813f2.K(new j0(size, z10.f23195r));
        int iOrdinal2 = enumC1375m.ordinal();
        i iVar = this.j;
        if (iOrdinal2 == 0) {
            C1377o c1377o = C1377o.g;
            return new C1377o(EnumC1375m.f23268r, listK, this.f23149e, this.f23150f, iVar.K(), null);
        }
        if (iOrdinal2 == 1) {
            C1377o c1377o2 = C1377o.g;
            return new C1377o(EnumC1375m.f23269s, listK, this.f23149e, -1, iVar.K(), null);
        }
        if (iOrdinal2 != 2) {
            throw new a();
        }
        C1377o c1377o3 = C1377o.g;
        return new C1377o(EnumC1375m.f23270t, listK, -1, this.f23150f, iVar.K(), null);
    }
}
