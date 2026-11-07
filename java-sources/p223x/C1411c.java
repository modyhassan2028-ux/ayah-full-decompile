package p223x;

import B0.c;
import Z.C0672b;
import Z.C0681f0;
import p110k9.y;
import p161p9.a;
import p207v2.L;
import p251z9.j;
import q9.i;

/* JADX INFO: renamed from: x.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1411c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f23941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1422k f23943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0681f0 f23944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0681f0 f23945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f23946f;
    public final AbstractC1427p g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1427p f23947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC1427p f23948i;
    public final AbstractC1427p j;

    public C1411c(Object obj, v0 v0Var, Object obj2) {
        this.f23941a = v0Var;
        this.f23942b = obj2;
        C1422k c1422k = new C1422k(v0Var, obj, null, 60);
        this.f23943c = c1422k;
        this.f23944d = C0672b.r(Boolean.FALSE);
        this.f23945e = C0672b.r(obj);
        this.f23946f = new L();
        new C1408a0(3, obj2);
        AbstractC1427p abstractC1427p = c1422k.f24029t;
        boolean z10 = abstractC1427p instanceof C1423l;
        AbstractC1427p abstractC1427p2 = z10 ? AbstractC1413d.f23955e : abstractC1427p instanceof C1424m ? AbstractC1413d.f23956f : abstractC1427p instanceof C1425n ? AbstractC1413d.g : AbstractC1413d.f23957h;
        this.g = abstractC1427p2;
        AbstractC1427p abstractC1427p3 = z10 ? AbstractC1413d.f23951a : abstractC1427p instanceof C1424m ? AbstractC1413d.f23952b : abstractC1427p instanceof C1425n ? AbstractC1413d.f23953c : AbstractC1413d.f23954d;
        this.f23947h = abstractC1427p3;
        this.f23948i = abstractC1427p2;
        this.j = abstractC1427p3;
    }

    public static final Object a(C1411c c1411c, Object obj) {
        v0 v0Var = c1411c.f23941a;
        AbstractC1427p abstractC1427p = c1411c.j;
        AbstractC1427p abstractC1427p2 = c1411c.f23948i;
        if (!j.a(abstractC1427p2, c1411c.g) || !j.a(abstractC1427p, c1411c.f23947h)) {
            AbstractC1427p abstractC1427p3 = (AbstractC1427p) v0Var.f24111a.e(obj);
            int iB = abstractC1427p3.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < iB; i10++) {
                if (abstractC1427p3.a(i10) < abstractC1427p2.a(i10) || abstractC1427p3.a(i10) > abstractC1427p.a(i10)) {
                    abstractC1427p3.e(i10, c.k(abstractC1427p3.a(i10), abstractC1427p2.a(i10), abstractC1427p.a(i10)));
                    z10 = true;
                }
            }
            if (z10) {
                return v0Var.f24112b.e(abstractC1427p3);
            }
        }
        return obj;
    }

    public static final void b(C1411c c1411c) {
        C1422k c1422k = c1411c.f23943c;
        c1422k.f24029t.d();
        c1422k.f24030u = Long.MIN_VALUE;
        c1411c.f23944d.setValue(Boolean.FALSE);
    }

    public static Object c(C1411c c1411c, Object obj, InterfaceC1421j interfaceC1421j, p241y9.c cVar, p150o9.c cVar2, int i10) {
        Object objE = c1411c.f23941a.f24112b.e(c1411c.f23943c.f24029t);
        p241y9.c cVar3 = (i10 & 8) != 0 ? null : cVar;
        Object objD = c1411c.d();
        v0 v0Var = c1411c.f23941a;
        return L.a(c1411c.f23946f, new C1407a(c1411c, objE, new i0(interfaceC1421j, v0Var, objD, obj, (AbstractC1427p) v0Var.f24111a.e(objE)), c1411c.f23943c.f24030u, cVar3, null), cVar2);
    }

    public final Object d() {
        return this.f23943c.f24028s.getValue();
    }

    public final Object e(Object obj, p150o9.c cVar) {
        Object objA = L.a(this.f23946f, new C1409b(this, obj, null), cVar);
        return objA == a.f21156r ? objA : y.f19095a;
    }

    public final Object f(i iVar) {
        Object objA = L.a(this.f23946f, new L(this, null, 1), iVar);
        return objA == a.f21156r ? objA : y.f19095a;
    }

    public /* synthetic */ C1411c(Object obj, v0 v0Var, Object obj2, int i10) {
        this(obj, v0Var, (i10 & 4) != 0 ? null : obj2);
    }
}
