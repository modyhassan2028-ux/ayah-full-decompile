package D0;

import A.d1;
import J0.AbstractC0283f;
import K0.c1;
import K9.AbstractC0405x;
import K9.C0389g;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class N implements p063g1.c, p150o9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0389g f1068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f1069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0389g f1070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EnumC0097o f1071u = EnumC0097o.f1124s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p150o9.i f1072v = p150o9.i.f20380r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O f1073w;

    public N(O o10, C0389g c0389g) {
        this.f1073w = o10;
        this.f1068r = c0389g;
        this.f1069s = o10;
    }

    @Override // p063g1.c
    public final int E(float f3) {
        O o10 = this.f1069s;
        o10.getClass();
        return android.support.v4.media.session.p.c(o10, f3);
    }

    @Override // p063g1.c
    public final long M(long j) {
        O o10 = this.f1069s;
        o10.getClass();
        return android.support.v4.media.session.p.h(j, o10);
    }

    @Override // p063g1.c
    public final float Q(long j) {
        O o10 = this.f1069s;
        o10.getClass();
        return android.support.v4.media.session.p.g(j, o10);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return this.f1069s.X(f3);
    }

    public final Object a(EnumC0097o enumC0097o, q9.a aVar) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(aVar));
        c0389g.s();
        this.f1071u = enumC0097o;
        this.f1070t = c0389g;
        return c0389g.r();
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return this.f1069s.b0(i10);
    }

    public final long d() {
        O o10 = this.f1073w;
        o10.getClass();
        long jH = android.support.v4.media.session.p.h(AbstractC0283f.x(o10).R.g(), o10);
        long j = o10.f1084P;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jH >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jH & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / this.f1069s.getDensity();
    }

    public final c1 e() {
        O o10 = this.f1073w;
        o10.getClass();
        return AbstractC0283f.x(o10).R;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [K9.a0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [K9.a0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [y9.e] */
    public final Object f(long j, p241y9.e eVar, q9.c cVar) {
        K k7;
        C0389g c0389g;
        if (cVar instanceof K) {
            k7 = (K) cVar;
            int i10 = k7.f1060u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k7.f1060u = i10 - Integer.MIN_VALUE;
            } else {
                k7 = new K(this, cVar);
            }
        } else {
            k7 = new K(this, cVar);
        }
        Object objInvoke = k7.f1058s;
        int i11 = k7.f1060u;
        try {
            if (i11 == 0) {
                p110k9.a.e(objInvoke);
                if (j <= 0 && (c0389g = this.f1070t) != null) {
                    c0389g.resumeWith(p110k9.a.b(new p(j)));
                }
                K9.A aX = AbstractC0405x.x(this.f1073w.h0(), null, new L(j, this, null), 3);
                k7.f1057r = aX;
                k7.f1060u = 1;
                objInvoke = eVar.invoke(this, k7);
                p161p9.a aVar = p161p9.a.f21156r;
                j = aX;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K9.A a9 = k7.f1057r;
                p110k9.a.e(objInvoke);
                j = a9;
            }
            j.e(C0084b.f1086r);
            return objInvoke;
        } catch (Throwable th) {
            j.e(C0084b.f1086r);
            throw th;
        }
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return this.f1072v;
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f1069s.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j, d1 d1Var, q9.a aVar) {
        M m10;
        if (aVar instanceof M) {
            m10 = (M) aVar;
            int i10 = m10.f1067t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m10.f1067t = i10 - Integer.MIN_VALUE;
            } else {
                m10 = new M(this, aVar);
            }
        } else {
            m10 = new M(this, aVar);
        }
        Object obj = m10.f1065r;
        int i11 = m10.f1067t;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return obj;
            }
            p110k9.a.e(obj);
            m10.f1067t = 1;
            Object objF = f(j, d1Var, m10);
            Object obj2 = p161p9.a.f21156r;
            return objF == obj2 ? obj2 : objF;
        } catch (p unused) {
            return null;
        }
    }

    @Override // p063g1.c
    public final float n() {
        return this.f1069s.n();
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        O o10 = this.f1073w;
        synchronized (o10.f1081M) {
            o10.f1080L.k(this);
        }
        this.f1068r.resumeWith(obj);
    }

    @Override // p063g1.c
    public final long v(long j) {
        O o10 = this.f1069s;
        o10.getClass();
        return android.support.v4.media.session.p.f(j, o10);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return this.f1069s.getDensity() * f3;
    }

    @Override // p063g1.c
    public final float z(long j) {
        O o10 = this.f1069s;
        o10.getClass();
        return android.support.v4.media.session.p.e(j, o10);
    }
}
