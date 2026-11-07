package p173r2;

import E2.C0112b;
import E2.C0124h;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p245z2.a;
import p251z9.j;
import p251z9.v;
import u.P;

/* JADX INFO: loaded from: classes.dex */
@F("navigation")
public class z extends G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H f21505c;

    public z(H h7) {
        j.e(h7, "navigatorProvider");
        this.f21505c = h7;
    }

    @Override // p173r2.G
    public final void d(List list, C c10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            v vVar = jVar.f21442s;
            j.c(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            x xVar = (x) vVar;
            C0112b c0112b = xVar.f21493s;
            v vVar2 = new v();
            vVar2.f24886r = jVar.f21448y.a();
            C0124h c0124h = xVar.f21502w;
            int i10 = c0124h.f1673b;
            String str = (String) c0124h.f1677f;
            if (i10 == 0 && str == null) {
                c0112b.getClass();
                String strValueOf = String.valueOf(c0112b.f1641a);
                j.e(strValueOf, "superName");
                if (((x) c0124h.f1674c).f21493s.f1641a == 0) {
                    strValueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(strValueOf).toString());
            }
            v vVarS = str != null ? c0124h.s(str, false) : (v) ((P) c0124h.f1675d).d(i10);
            if (vVarS == null) {
                if (((String) c0124h.f1676e) == null) {
                    String strValueOf2 = (String) c0124h.f1677f;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(c0124h.f1673b);
                    }
                    c0124h.f1676e = strValueOf2;
                }
                String str2 = (String) c0124h.f1676e;
                j.b(str2);
                throw new IllegalArgumentException(a.D("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            C0112b c0112b2 = vVarS.f21493s;
            if (str != null) {
                if (!str.equals((String) c0112b2.f1645e)) {
                    u uVarM = c0112b2.m(str);
                    Bundle bundle = uVarM != null ? uVarM.f21487s : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                        bundleP.putAll(bundle);
                        Bundle bundle2 = (Bundle) vVar2.f24886r;
                        if (bundle2 != null) {
                            bundleP.putAll(bundle2);
                        }
                        vVar2.f24886r = bundleP;
                    }
                }
                if (vVarS.c().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListE = i.e(vVarS.c(), new E5.a(18, vVar2));
                    if (!arrayListE.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + vVarS + ". Missing required arguments [" + arrayListE + ']').toString());
                    }
                }
            }
            this.f21505c.b(vVarS.f21492r).d(AbstractC0813f2.K(b().b(vVarS, vVarS.b((Bundle) vVar2.f24886r))), c10);
        }
    }

    @Override // p173r2.G
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x a() {
        return new x(this);
    }
}
