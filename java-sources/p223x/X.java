package p223x;

import B9.a;
import K9.C0389g;
import S9.c;
import S9.d;
import W.C0557f1;
import Z.C0672b;
import Z.C0673b0;
import Z.C0681f0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.concurrent.CancellationException;
import p056f2.AbstractC0939l;
import p093j0.u;
import p110k9.y;
import p173r2.j;
import q9.i;
import u.A;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC0939l {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C1423l f23905I = new C1423l(0.0f);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C1423l f23906J = new C1423l(1.0f);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public O f23911E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f23913G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0681f0 f23915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0681f0 f23916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f23917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q0 f23918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f23919w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0389g f23922z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0557f1 f23920x = new C0557f1(18, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0673b0 f23921y = new C0673b0(0.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final c f23907A = d.a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final L f23908B = new L();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f23909C = Long.MIN_VALUE;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final A f23910D = new A();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final P f23912F = new P(this, 1);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final P f23914H = new P(this, 0);

    public X(j jVar) {
        this.f23915s = C0672b.r(jVar);
        this.f23916t = C0672b.r(jVar);
        this.f23917u = jVar;
    }

    public static final void p(X x9) {
        q0 q0Var = x9.f23918v;
        C0673b0 c0673b0 = x9.f23921y;
        if (q0Var == null) {
            return;
        }
        O o10 = x9.f23911E;
        if (o10 == null) {
            if (x9.f23919w <= 0 || c0673b0.g() == 1.0f || p251z9.j.a(x9.f23916t.getValue(), x9.f23915s.getValue())) {
                o10 = null;
            } else {
                o10 = new O();
                o10.f23867d = c0673b0.g();
                long j = x9.f23919w;
                o10.g = j;
                o10.f23870h = a.W((1.0d - ((double) c0673b0.g())) * j);
                o10.f23868e.e(0, c0673b0.g());
            }
        }
        if (o10 != null) {
            o10.g = x9.f23919w;
            x9.f23910D.a(o10);
            q0Var.m(o10);
        }
        x9.f23911E = null;
    }

    public static final void q(X x9, O o10, long j) {
        long j10 = o10.f23864a;
        C1423l c1423l = o10.f23868e;
        long j11 = j10 + j;
        o10.f23864a = j11;
        long j12 = o10.f23870h;
        if (j11 >= j12) {
            o10.f23867d = 1.0f;
            return;
        }
        A0 a9 = o10.f23865b;
        if (a9 == null) {
            float f3 = j11 / j12;
            o10.f23867d = (f3 * 1.0f) + ((1 - f3) * c1423l.a(0));
            return;
        }
        C1423l c1423l2 = o10.f23869f;
        if (c1423l2 == null) {
            c1423l2 = f23905I;
        }
        o10.f23867d = B0.c.k(((C1423l) a9.l(j11, c1423l, f23906J, c1423l2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object r(X x9, q9.c cVar) {
        S s10;
        x9.getClass();
        if (cVar instanceof S) {
            s10 = (S) cVar;
            int i10 = s10.f23881u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                s10.f23881u = i10 - Integer.MIN_VALUE;
            } else {
                s10 = new S(x9, cVar);
            }
        } else {
            s10 = new S(x9, cVar);
        }
        Object obj = s10.f23879s;
        int i11 = s10.f23881u;
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(obj);
            if (x9.f23910D.g() && x9.f23911E == null) {
                return yVar;
            }
            if (AbstractC1413d.m(s10.getContext()) == 0.0f) {
                x9.v();
                x9.f23909C = Long.MIN_VALUE;
                return yVar;
            }
            if (x9.f23909C == Long.MIN_VALUE) {
                P p10 = x9.f23912F;
                s10.f23878r = x9;
                s10.f23881u = 1;
                if (C0672b.p(s10.getContext()).b0(p10, s10) != aVar) {
                }
            }
            return aVar;
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x9 = s10.f23878r;
        p110k9.a.e(obj);
        do {
            if (!x9.f23910D.h() && x9.f23911E == null) {
                x9.f23909C = Long.MIN_VALUE;
                return yVar;
            }
            s10.f23878r = x9;
            s10.f23881u = 2;
        } while (x9.u(s10) != aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object s(X x9, q9.c cVar) {
        V v10;
        Object value;
        X x10;
        Object obj;
        x9.getClass();
        if (cVar instanceof V) {
            v10 = (V) cVar;
            int i10 = v10.f23899v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                v10.f23899v = i10 - Integer.MIN_VALUE;
            } else {
                v10 = new V(x9, cVar);
            }
        } else {
            v10 = new V(x9, cVar);
        }
        Object obj2 = v10.f23897t;
        int i11 = v10.f23899v;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(obj2);
            value = x9.f23915s.getValue();
            c cVar2 = x9.f23907A;
            v10.f23895r = x9;
            v10.f23896s = value;
            v10.f23899v = 1;
            if (cVar2.e(v10) != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            Object obj3 = v10.f23896s;
            X x11 = v10.f23895r;
            p110k9.a.e(obj2);
            value = obj3;
            x9 = x11;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = v10.f23896s;
            x10 = v10.f23895r;
            p110k9.a.e(obj2);
        }
        if (p251z9.j.a(obj2, obj)) {
            return y.f19095a;
        }
        x10.f23909C = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        v10.f23895r = x9;
        v10.f23896s = value;
        v10.f23899v = 2;
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(v10));
        c0389g.s();
        x9.f23922z = c0389g;
        x9.f23907A.b(null);
        Object objR = c0389g.r();
        if (objR != aVar) {
            x10 = x9;
            obj = value;
            obj2 = objR;
            if (p251z9.j.a(obj2, obj)) {
                return y.f19095a;
            }
            x10.f23909C = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0092, please report this as an issue */
    public static final Object t(X x9, q9.c cVar) {
        W w9;
        X x10;
        Object obj;
        X x11;
        x9.getClass();
        if (cVar instanceof W) {
            w9 = (W) cVar;
            int i10 = w9.f23904v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w9.f23904v = i10 - Integer.MIN_VALUE;
            } else {
                w9 = new W(x9, cVar);
            }
        } else {
            w9 = new W(x9, cVar);
        }
        Object objR = w9.f23902t;
        int i11 = w9.f23904v;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(objR);
            Object value = x9.f23915s.getValue();
            c cVar2 = x9.f23907A;
            w9.f23900r = x9;
            w9.f23901s = value;
            w9.f23904v = 1;
            if (cVar2.e(w9) != aVar) {
                x10 = x9;
                obj = value;
            }
            return aVar;
        }
        if (i11 == 1) {
            obj = w9.f23901s;
            x10 = w9.f23900r;
            p110k9.a.e(objR);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = w9.f23901s;
            x11 = w9.f23900r;
            p110k9.a.e(objR);
        }
        if (!p251z9.j.a(objR, obj)) {
            x11.f23909C = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + objR + " instead of " + obj);
        }
        return y.f19095a;
        Object obj2 = x10.f23917u;
        c cVar3 = x10.f23907A;
        if (!p251z9.j.a(obj, obj2)) {
            w9.f23900r = x10;
            w9.f23901s = obj;
            w9.f23904v = 2;
            C0389g c0389g = new C0389g(1, AbstractC0813f2.H(w9));
            c0389g.s();
            x10.f23922z = c0389g;
            cVar3.b(null);
            objR = c0389g.r();
            if (objR != aVar) {
                x11 = x10;
                if (!p251z9.j.a(objR, obj)) {
                    x11.f23909C = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + objR + " instead of " + obj);
                }
            }
            return aVar;
        }
        cVar3.b(null);
        return y.f19095a;
    }

    @Override // p056f2.AbstractC0939l
    public final Object i() {
        return this.f23916t.getValue();
    }

    @Override // p056f2.AbstractC0939l
    public final Object j() {
        return this.f23915s.getValue();
    }

    @Override // p056f2.AbstractC0939l
    public final void l(Object obj) {
        this.f23916t.setValue(obj);
    }

    @Override // p056f2.AbstractC0939l
    public final void m(q0 q0Var) {
        q0 q0Var2 = this.f23918v;
        if (q0Var2 != null && !q0Var.equals(q0Var2)) {
            M.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f23918v + ", new instance: " + q0Var);
        }
        this.f23918v = q0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k9.g] */
    @Override // p056f2.AbstractC0939l
    public final void n() {
        this.f23918v = null;
        ((u) t0.f24106a.getValue()).c(this);
    }

    public final Object u(q9.c cVar) {
        float fM = AbstractC1413d.m(cVar.getContext());
        y yVar = y.f19095a;
        if (fM <= 0.0f) {
            v();
            return yVar;
        }
        this.f23913G = fM;
        Object objB0 = C0672b.p(cVar.getContext()).b0(this.f23914H, cVar);
        return objB0 == p161p9.a.f21156r ? objB0 : yVar;
    }

    public final void v() {
        q0 q0Var = this.f23918v;
        if (q0Var != null) {
            q0Var.c();
        }
        this.f23910D.c();
        if (this.f23911E != null) {
            this.f23911E = null;
            y(1.0f);
            x();
        }
    }

    public final Object w(float f3, Object obj, i iVar) {
        if (0.0f > f3 || f3 > 1.0f) {
            M.a("Expecting fraction between 0 and 1. Got " + f3);
        }
        q0 q0Var = this.f23918v;
        if (q0Var != null) {
            Object objA = L.a(this.f23908B, new U(obj, this.f23915s.getValue(), this, q0Var, f3, null), iVar);
            if (objA == p161p9.a.f21156r) {
                return objA;
            }
        }
        return y.f19095a;
    }

    public final void x() {
        q0 q0Var = this.f23918v;
        if (q0Var == null) {
            return;
        }
        q0Var.l(a.W(((double) this.f23921y.g()) * ((Number) q0Var.f24074l.getValue()).longValue()));
    }

    public final void y(float f3) {
        this.f23921y.h(f3);
    }
}
