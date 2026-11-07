package p223x;

import Aa.a;
import p003a2.d;
import p151p.V;
import p214w.AbstractC1389b;
import p214w.J;
import p214w.K;
import p241y9.c;
import p251z9.j;

/* JADX INFO: renamed from: x.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1430t implements InterfaceC1417f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f24100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1427p f24102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1427p f24103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC1427p f24104f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f24105h;

    public C1430t(C1431u c1431u, v0 v0Var, Object obj, AbstractC1427p abstractC1427p) {
        a aVar = new a(c1431u.f24107a);
        this.f24099a = aVar;
        this.f24100b = v0Var;
        this.f24101c = obj;
        AbstractC1427p abstractC1427p2 = (AbstractC1427p) v0Var.f24111a.e(obj);
        this.f24102d = abstractC1427p2;
        this.f24103e = AbstractC1413d.j(abstractC1427p);
        c cVar = v0Var.f24112b;
        if (((AbstractC1427p) aVar.f557u) == null) {
            aVar.f557u = abstractC1427p2.c();
        }
        AbstractC1427p abstractC1427p3 = (AbstractC1427p) aVar.f557u;
        if (abstractC1427p3 == null) {
            j.k("targetVector");
            throw null;
        }
        int iB = abstractC1427p3.b();
        int i10 = 0;
        while (i10 < iB) {
            AbstractC1427p abstractC1427p4 = (AbstractC1427p) aVar.f557u;
            if (abstractC1427p4 == null) {
                j.k("targetVector");
                throw null;
            }
            V v10 = (V) aVar.f554r;
            float fA = abstractC1427p2.a(i10);
            float fA2 = abstractC1427p.a(i10);
            d dVar = (d) v10.f20603r;
            double dB = dVar.b(fA2);
            double d5 = K.f23448a;
            int i11 = i10;
            abstractC1427p4.e(i11, (Math.signum(fA2) * ((float) (Math.exp((d5 / (d5 - 1.0d)) * dB) * ((double) (dVar.f11132a * dVar.f11133b))))) + fA);
            i10 = i11 + 1;
        }
        AbstractC1427p abstractC1427p5 = (AbstractC1427p) aVar.f557u;
        if (abstractC1427p5 == null) {
            j.k("targetVector");
            throw null;
        }
        this.g = cVar.e(abstractC1427p5);
        a aVar2 = this.f24099a;
        AbstractC1427p abstractC1427p6 = this.f24102d;
        if (((AbstractC1427p) aVar2.f556t) == null) {
            aVar2.f556t = abstractC1427p6.c();
        }
        AbstractC1427p abstractC1427p7 = (AbstractC1427p) aVar2.f556t;
        if (abstractC1427p7 == null) {
            j.k("velocityVector");
            throw null;
        }
        int iB2 = abstractC1427p7.b();
        long jMax = 0;
        for (int i12 = 0; i12 < iB2; i12++) {
            V v11 = (V) aVar2.f554r;
            abstractC1427p6.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((d) v11.f20603r).b(abstractC1427p.a(i12)) / (((double) K.f23448a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f24105h = jMax;
        AbstractC1427p abstractC1427pJ = AbstractC1413d.j(this.f24099a.w(jMax, this.f24102d, abstractC1427p));
        this.f24104f = abstractC1427pJ;
        int iB3 = abstractC1427pJ.b();
        for (int i13 = 0; i13 < iB3; i13++) {
            AbstractC1427p abstractC1427p8 = this.f24104f;
            float fA3 = abstractC1427p8.a(i13);
            this.f24099a.getClass();
            this.f24099a.getClass();
            abstractC1427p8.e(i13, B0.c.k(fA3, -0.0f, 0.0f));
        }
    }

    @Override // p223x.InterfaceC1417f
    public final boolean d() {
        return false;
    }

    @Override // p223x.InterfaceC1417f
    public final Object e(long j) {
        if (p123m2.c.a(this, j)) {
            return this.g;
        }
        c cVar = this.f24100b.f24112b;
        a aVar = this.f24099a;
        AbstractC1427p abstractC1427p = (AbstractC1427p) aVar.f555s;
        AbstractC1427p abstractC1427p2 = this.f24102d;
        if (abstractC1427p == null) {
            aVar.f555s = abstractC1427p2.c();
        }
        AbstractC1427p abstractC1427p3 = (AbstractC1427p) aVar.f555s;
        if (abstractC1427p3 == null) {
            j.k("valueVector");
            throw null;
        }
        int iB = abstractC1427p3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC1427p abstractC1427p4 = (AbstractC1427p) aVar.f555s;
            if (abstractC1427p4 == null) {
                j.k("valueVector");
                throw null;
            }
            V v10 = (V) aVar.f554r;
            float fA = abstractC1427p2.a(i10);
            long j10 = j / 1000000;
            J jA = ((d) v10.f20603r).a(this.f24103e.a(i10));
            long j11 = jA.f23447c;
            abstractC1427p4.e(i10, (Math.signum(jA.f23445a) * jA.f23446b * AbstractC1389b.a(j11 > 0 ? j10 / j11 : 1.0f).f23470a) + fA);
        }
        AbstractC1427p abstractC1427p5 = (AbstractC1427p) aVar.f555s;
        if (abstractC1427p5 != null) {
            return cVar.e(abstractC1427p5);
        }
        j.k("valueVector");
        throw null;
    }

    @Override // p223x.InterfaceC1417f
    public final long f() {
        return this.f24105h;
    }

    @Override // p223x.InterfaceC1417f
    public final v0 g() {
        return this.f24100b;
    }

    @Override // p223x.InterfaceC1417f
    public final Object h() {
        return this.g;
    }

    @Override // p223x.InterfaceC1417f
    public final AbstractC1427p i(long j) {
        if (p123m2.c.a(this, j)) {
            return this.f24104f;
        }
        return this.f24099a.w(j, this.f24102d, this.f24103e);
    }

    @Override // p223x.InterfaceC1417f
    public final /* synthetic */ boolean j(long j) {
        return p123m2.c.a(this, j);
    }
}
