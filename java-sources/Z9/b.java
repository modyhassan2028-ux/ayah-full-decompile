package Z9;

import E2.C0124h;
import H7.C0227a;
import U6.C0532j;
import Z0.B;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11042d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0227a f11043a = new C0227a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0532j f11044b = p019ba.a.f13343a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f11045c = new B(1);

    public final Object a(U9.a aVar, String str) {
        p251z9.j.e(aVar, "deserializer");
        this.f11043a.getClass();
        C0124h c0124h = new C0124h(str);
        Object objC = new p009aa.m(this, p009aa.q.OBJ, c0124h, aVar.d()).c(aVar);
        if (c0124h.g() == 10) {
            return objC;
        }
        C0124h.p(c0124h, "Expected EOF after parsing, but had " + str.charAt(c0124h.f1673b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(U9.a aVar, Object obj) {
        char[] cArr;
        p251z9.j.e(aVar, "serializer");
        Da.r rVar = new Da.r((char) 0, 5);
        p009aa.b bVar = p009aa.b.f11234t;
        synchronized (bVar) {
            p120l9.k kVar = (p120l9.k) bVar.f3713s;
            cArr = null;
            char[] cArr2 = (char[]) (kVar.isEmpty() ? null : kVar.removeLast());
            if (cArr2 != null) {
                bVar.f3712r -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        rVar.f1388t = cArr;
        try {
            p009aa.q qVar = p009aa.q.OBJ;
            p009aa.n[] nVarArr = new p009aa.n[p009aa.q.f11276y.b()];
            this.f11043a.getClass();
            new p009aa.n(new G1.f((Object) rVar, false), this, qVar, nVarArr).p(aVar, obj);
            return rVar.toString();
        } finally {
            rVar.n();
        }
    }
}
