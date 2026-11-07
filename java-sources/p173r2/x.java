package p173r2;

import A9.a;
import E2.C0124h;
import G9.k;
import H9.o;
import I1.V;
import java.util.ArrayList;
import java.util.Iterator;
import p074h0.i;
import p120l9.l;
import p120l9.m;
import p251z9.j;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public class x extends v implements Iterable, a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f21501x = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0124h f21502w;

    public x(z zVar) {
        super(zVar);
        this.f21502w = new C0124h(this);
    }

    @Override // p173r2.v
    public final u d(i iVar) {
        u uVarD = super.d(iVar);
        C0124h c0124h = this.f21502w;
        c0124h.getClass();
        return c0124h.B(uVarD, iVar, false, (x) c0124h.f1674c);
    }

    public final u e(i iVar, v vVar) {
        return this.f21502w.B(super.d(iVar), iVar, true, vVar);
    }

    @Override // p173r2.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x) || !super.equals(obj)) {
            return false;
        }
        C0124h c0124h = this.f21502w;
        int iG = ((P) c0124h.f1675d).g();
        C0124h c0124h2 = ((x) obj).f21502w;
        if (iG != ((P) c0124h2.f1675d).g() || c0124h.f1673b != c0124h2.f1673b) {
            return false;
        }
        P p10 = (P) c0124h.f1675d;
        j.e(p10, "<this>");
        for (v vVar : (G9.a) k.a0(new V(6, p10))) {
            if (!vVar.equals(((P) c0124h2.f1675d).d(vVar.f21493s.f1641a))) {
                return false;
            }
        }
        return true;
    }

    public final u f(String str, boolean z10, v vVar) {
        u uVarF;
        j.e(str, "route");
        C0124h c0124h = this.f21502w;
        c0124h.getClass();
        x xVar = (x) c0124h.f1674c;
        u uVarM = xVar.f21493s.m(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = xVar.iterator();
        while (true) {
            p197u2.j jVar = (p197u2.j) it;
            uVarF = null;
            if (!jVar.hasNext()) {
                break;
            }
            v vVar2 = (v) jVar.next();
            if (!j.a(vVar2, vVar)) {
                if (vVar2 instanceof x) {
                    uVarF = ((x) vVar2).f(str, false, xVar);
                } else {
                    vVar2.getClass();
                    uVarF = vVar2.f21493s.m(str);
                }
            }
            if (uVarF != null) {
                arrayList.add(uVarF);
            }
        }
        u uVar = (u) m.o0(arrayList);
        x xVar2 = xVar.f21494t;
        if (xVar2 != null && z10 && !xVar2.equals(vVar)) {
            uVarF = xVar2.f(str, true, xVar);
        }
        return (u) m.o0(l.i0(new u[]{uVarM, uVar, uVarF}));
    }

    @Override // p173r2.v
    public final int hashCode() {
        C0124h c0124h = this.f21502w;
        int iE = c0124h.f1673b;
        P p10 = (P) c0124h.f1675d;
        int iG = p10.g();
        for (int i10 = 0; i10 < iG; i10++) {
            iE = (((iE * 31) + p10.e(i10)) * 31) + ((v) p10.h(i10)).hashCode();
        }
        return iE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0124h c0124h = this.f21502w;
        c0124h.getClass();
        return new p197u2.j(c0124h);
    }

    @Override // p173r2.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        C0124h c0124h = this.f21502w;
        String str = (String) c0124h.f1677f;
        c0124h.getClass();
        v vVarS = (str == null || o.e1(str)) ? null : c0124h.s(str, true);
        if (vVarS == null) {
            vVarS = c0124h.r(c0124h.f1673b);
        }
        sb.append(" startDestination=");
        if (vVarS == null) {
            String str2 = (String) c0124h.f1677f;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) c0124h.f1676e;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(c0124h.f1673b));
                }
            }
        } else {
            sb.append("{");
            sb.append(vVarS.toString());
            sb.append("}");
        }
        String string = sb.toString();
        j.d(string, "toString(...)");
        return string;
    }
}
