package p223x;

import Z.C0672b;
import Z.C0673b0;
import Z.C0677d0;
import Z.C0681f0;
import Z.D0;
import Z.L0;
import p093j0.n;
import p093j0.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements L0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0681f0 f24044A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AbstractC1427p f24045B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0677d0 f24046C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f24047D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1408a0 f24048E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ q0 f24049F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v0 f24050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0681f0 f24051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0681f0 f24052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0681f0 f24053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public O f24054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i0 f24055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0681f0 f24056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0673b0 f24057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24058z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public n0(q0 q0Var, Object obj, AbstractC1427p abstractC1427p, v0 v0Var) {
        this.f24049F = q0Var;
        this.f24050r = v0Var;
        C0681f0 c0681f0R = C0672b.r(obj);
        this.f24051s = c0681f0R;
        Object objE = null;
        C0681f0 c0681f0R2 = C0672b.r(AbstractC1413d.p(0.0f, 7, null));
        this.f24052t = c0681f0R2;
        this.f24053u = C0672b.r(new i0((InterfaceC1435y) c0681f0R2.getValue(), v0Var, obj, c0681f0R.getValue(), abstractC1427p));
        this.f24056x = C0672b.r(Boolean.TRUE);
        this.f24057y = new C0673b0(-1.0f);
        this.f24044A = C0672b.r(obj);
        this.f24045B = abstractC1427p;
        this.f24046C = new C0677d0(b().f());
        Float f3 = (Float) E0.f23847a.get(v0Var);
        if (f3 != null) {
            float fFloatValue = f3.floatValue();
            AbstractC1427p abstractC1427p2 = (AbstractC1427p) v0Var.f24111a.e(obj);
            int iB = abstractC1427p2.b();
            for (int i10 = 0; i10 < iB; i10++) {
                abstractC1427p2.e(i10, fFloatValue);
            }
            objE = this.f24050r.f24112b.e(abstractC1427p2);
        }
        this.f24048E = AbstractC1413d.p(0.0f, 3, objE);
    }

    public final i0 b() {
        return (i0) this.f24053u.getValue();
    }

    public final void c(long j) {
        if (this.f24057y.g() == -1.0f) {
            this.f24047D = true;
            if (j.a(b().f24017c, b().f24018d)) {
                d(b().f24017c);
            } else {
                d(b().e(j));
                this.f24045B = b().i(j);
            }
        }
    }

    public final void d(Object obj) {
        this.f24044A.setValue(obj);
    }

    public final void e(Object obj, boolean z10) {
        i0 i0Var = this.f24055w;
        Object obj2 = i0Var != null ? i0Var.f24017c : null;
        C0681f0 c0681f0 = this.f24051s;
        boolean zA = j.a(obj2, c0681f0.getValue());
        C0677d0 c0677d0 = this.f24046C;
        C0681f0 c0681f1 = this.f24053u;
        InterfaceC1435y interfaceC1435y = this.f24048E;
        if (zA) {
            c0681f1.setValue(new i0(interfaceC1435y, this.f24050r, obj, obj, this.f24045B.c()));
            this.f24058z = true;
            c0677d0.g(b().f());
            return;
        }
        C0681f0 c0681f2 = this.f24052t;
        if (!z10 || this.f24047D || (((InterfaceC1435y) c0681f2.getValue()) instanceof C1408a0)) {
            interfaceC1435y = (InterfaceC1435y) c0681f2.getValue();
        }
        q0 q0Var = this.f24049F;
        long jE = q0Var.e();
        C0681f0 c0681f3 = q0Var.f24071h;
        c0681f1.setValue(new i0(jE <= 0 ? interfaceC1435y : new C1410b0(interfaceC1435y, q0Var.e()), this.f24050r, obj, c0681f0.getValue(), this.f24045B));
        c0677d0.g(b().f());
        this.f24058z = false;
        c0681f3.setValue(Boolean.TRUE);
        if (q0Var.g()) {
            r rVar = q0Var.f24072i;
            int size = rVar.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                n0 n0Var = (n0) rVar.get(i10);
                C0677d0 c0677d1 = n0Var.f24046C;
                jMax = Math.max(jMax, ((D0) n.u(c0677d1.f10656s, c0677d1)).f10594c);
                n0Var.c(0L);
            }
            c0681f3.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, InterfaceC1435y interfaceC1435y) {
        this.f24051s.setValue(obj2);
        this.f24052t.setValue(interfaceC1435y);
        if (j.a(b().f24018d, obj) && j.a(b().f24017c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, InterfaceC1435y interfaceC1435y) {
        if (this.f24058z) {
            i0 i0Var = this.f24055w;
            if (j.a(obj, i0Var != null ? i0Var.f24017c : null)) {
                return;
            }
        }
        C0681f0 c0681f0 = this.f24051s;
        boolean zA = j.a(c0681f0.getValue(), obj);
        C0673b0 c0673b0 = this.f24057y;
        if (zA && c0673b0.g() == -1.0f) {
            return;
        }
        c0681f0.setValue(obj);
        this.f24052t.setValue(interfaceC1435y);
        Object value = c0673b0.g() == -3.0f ? obj : this.f24044A.getValue();
        C0681f0 c0681f1 = this.f24056x;
        e(value, !((Boolean) c0681f1.getValue()).booleanValue());
        c0681f1.setValue(Boolean.valueOf(c0673b0.g() == -3.0f));
        if (c0673b0.g() >= 0.0f) {
            d(b().e((long) (c0673b0.g() * b().f())));
        } else if (c0673b0.g() == -3.0f) {
            d(obj);
        }
        this.f24058z = false;
        c0673b0.h(-1.0f);
    }

    @Override // Z.L0
    public final Object getValue() {
        return this.f24044A.getValue();
    }

    public final String toString() {
        return "current value: " + this.f24044A.getValue() + ", target: " + this.f24051s.getValue() + ", spec: " + ((InterfaceC1435y) this.f24052t.getValue());
    }
}
