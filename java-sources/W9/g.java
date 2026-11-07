package W9;

import Y9.InterfaceC0654j;
import Y9.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p110k9.o;
import p120l9.m;
import p120l9.n;
import p120l9.r;
import p120l9.u;
import p120l9.w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f, InterfaceC0654j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final va.g f9669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f9671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f9672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f[] f9673f;
    public final List[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f9674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f9675i;
    public final f[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f9676k;

    public g(String str, va.g gVar, int i10, List list, a aVar) {
        p251z9.j.e(str, "serialName");
        this.f9668a = str;
        this.f9669b = gVar;
        this.f9670c = i10;
        ArrayList arrayList = aVar.f9655b;
        p251z9.j.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(w.g0(n.a0(arrayList, 12)));
        m.A0(arrayList, hashSet);
        this.f9671d = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f9672e = strArr;
        this.f9673f = M.c(aVar.f9657d);
        this.g = (List[]) aVar.f9658e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f9659f;
        p251z9.j.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        this.f9674h = zArr;
        p251z9.j.e(strArr, "<this>");
        G9.n nVar = new G9.n(1, new B3.f(16, strArr));
        ArrayList arrayList3 = new ArrayList(n.a0(nVar, 10));
        Iterator it2 = nVar.iterator();
        while (true) {
            G9.b bVar = (G9.b) it2;
            if (!bVar.f2920s.hasNext()) {
                this.f9675i = w.j0(arrayList3);
                this.j = M.c(list);
                this.f9676k = p110k9.a.d(new B3.f(7, this));
                return;
            }
            u uVar = (u) bVar.next();
            arrayList3.add(new p110k9.j(uVar.f19444b, Integer.valueOf(uVar.f19443a)));
        }
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        Integer num = (Integer) this.f9675i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // W9.f
    public final String b() {
        return this.f9668a;
    }

    @Override // W9.f
    public final va.g c() {
        return this.f9669b;
    }

    @Override // W9.f
    public final int d() {
        return this.f9670c;
    }

    @Override // W9.f
    public final String e(int i10) {
        return this.f9672e[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (p251z9.j.a(this.f9668a, fVar.b()) && Arrays.equals(this.j, ((g) obj).j)) {
                int iD = fVar.d();
                int i10 = this.f9670c;
                if (i10 == iD) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        f[] fVarArr = this.f9673f;
                        if (p251z9.j.a(fVarArr[i11].b(), fVar.j(i11).b()) && p251z9.j.a(fVarArr[i11].c(), fVar.j(i11).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // W9.f
    public final boolean f() {
        return false;
    }

    @Override // Y9.InterfaceC0654j
    public final Set g() {
        return this.f9671d;
    }

    @Override // W9.f
    public final List getAnnotations() {
        return r.f19440r;
    }

    @Override // W9.f
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.f9676k.getValue()).intValue();
    }

    @Override // W9.f
    public final List i(int i10) {
        return this.g[i10];
    }

    @Override // W9.f
    public final f j(int i10) {
        return this.f9673f[i10];
    }

    @Override // W9.f
    public final boolean k(int i10) {
        return this.f9674h[i10];
    }

    public final String toString() {
        return m.l0(B0.c.i0(0, this.f9670c), ", ", p245z2.a.F(new StringBuilder(), this.f9668a, '('), ")", new E5.a(9, this), 24);
    }
}
