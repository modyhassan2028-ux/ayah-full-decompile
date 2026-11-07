package D0;

import A.C0040q0;
import A.M0;
import A.Z;
import J0.A0;
import J0.AbstractC0283f;
import J0.w0;
import K9.AbstractC0405x;
import K9.C0389g;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O extends l0.q implements z, p063g1.c, w0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Object f1074F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Object f1075G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public q9.i f1076H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public PointerInputEventHandler f1077I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public K9.A f1078J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0096n f1079K = I.f1055a;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p011b0.e f1080L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p011b0.e f1081M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final p011b0.e f1082N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0096n f1083O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f1084P;

    public O(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f1074F = obj;
        this.f1075G = obj2;
        this.f1077I = pointerInputEventHandler;
        p011b0.e eVar = new p011b0.e(new N[16]);
        this.f1080L = eVar;
        this.f1081M = eVar;
        this.f1082N = new p011b0.e(new N[16]);
        this.f1084P = 0L;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        this.f1084P = j;
        if (enumC0097o == EnumC0097o.f1123r) {
            this.f1079K = c0096n;
        }
        p150o9.c cVar = null;
        if (this.f1078J == null) {
            this.f1078J = AbstractC0405x.x(h0(), null, new C0040q0(this, cVar, 2), 1);
        }
        w0(c0096n, enumC0097o);
        ?? r10 = c0096n.f1119a;
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!u.c((v) r10.get(i10))) {
                this.f1083O = c0096n;
            }
        }
        c0096n = null;
        this.f1083O = c0096n;
    }

    @Override // p063g1.c
    public final /* synthetic */ int E(float f3) {
        return android.support.v4.media.session.p.c(this, f3);
    }

    @Override // J0.w0
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // p063g1.c
    public final /* synthetic */ long M(long j) {
        return android.support.v4.media.session.p.h(j, this);
    }

    @Override // J0.w0
    public final void P() {
        x0();
    }

    @Override // p063g1.c
    public final /* synthetic */ float Q(long j) {
        return android.support.v4.media.session.p.g(j, this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // J0.w0
    public final void R() {
        C0096n c0096n = this.f1083O;
        if (c0096n == null) {
            return;
        }
        ?? r10 = c0096n.f1119a;
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((v) r10.get(i10)).f1135d) {
                ArrayList arrayList = new ArrayList(r10.size());
                int size2 = r10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    v vVar = (v) r10.get(i11);
                    long j = vVar.f1132a;
                    long j10 = vVar.f1134c;
                    long j11 = vVar.f1133b;
                    float f3 = vVar.f1136e;
                    boolean z10 = vVar.f1135d;
                    arrayList.add(new v(j, j11, j10, false, f3, j11, j10, z10, z10, vVar.f1139i, 0L));
                }
                C0096n c0096n2 = new C0096n(arrayList, null);
                this.f1079K = c0096n2;
                w0(c0096n2, EnumC0097o.f1123r);
                w0(c0096n2, EnumC0097o.f1124s);
                w0(c0096n2, EnumC0097o.f1125t);
                this.f1083O = null;
                return;
            }
        }
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return android.support.v4.media.session.p.i(this, d0(f3));
    }

    @Override // J0.w0
    public final /* synthetic */ void a0() {
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return i10 / getDensity();
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / getDensity();
    }

    @Override // p063g1.c
    public final float getDensity() {
        return AbstractC0283f.x(this).f3912P.getDensity();
    }

    @Override // l0.q
    public final void m0() {
        x0();
    }

    @Override // p063g1.c
    public final float n() {
        return AbstractC0283f.x(this).f3912P.n();
    }

    @Override // l0.q
    public final void n0() {
        x0();
    }

    @Override // J0.w0
    public final long q() {
        return A0.f3873a;
    }

    @Override // p063g1.c
    public final /* synthetic */ long v(long j) {
        return android.support.v4.media.session.p.f(j, this);
    }

    public final Object v0(p241y9.e eVar, p150o9.c cVar) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
        c0389g.s();
        N n6 = new N(this, c0389g);
        synchronized (this.f1081M) {
            this.f1080L.b(n6);
            new p150o9.j(AbstractC0813f2.H(AbstractC0813f2.r(n6, n6, eVar))).resumeWith(p110k9.y.f19095a);
        }
        c0389g.u(new M0(3, n6));
        return c0389g.r();
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return getDensity() * f3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    public final void w0(C0096n c0096n, EnumC0097o enumC0097o) {
        Object[] objArr;
        int i10;
        int i11;
        N n6;
        C0389g c0389g;
        C0389g c0389g2;
        synchronized (this.f1081M) {
            p011b0.e eVar = this.f1082N;
            eVar.c(eVar.f13127t, this.f1080L);
        }
        try {
            int iOrdinal = enumC0097o.ordinal();
            if (iOrdinal == 0) {
                p011b0.e eVar2 = this.f1082N;
                objArr = eVar2.f13125r;
                i10 = eVar2.f13127t;
                for (i11 = 0; i11 < i10; i11++) {
                    n6 = (N) objArr[i11];
                    if (enumC0097o != n6.f1071u && (c0389g = n6.f1070t) != null) {
                        n6.f1070t = null;
                        c0389g.resumeWith(c0096n);
                    }
                }
            } else if (iOrdinal == 1) {
                p011b0.e eVar3 = this.f1082N;
                int i12 = eVar3.f13127t - 1;
                Object[] objArr2 = eVar3.f13125r;
                if (i12 < objArr2.length) {
                    while (i12 >= 0) {
                        N n10 = (N) objArr2[i12];
                        if (enumC0097o == n10.f1071u && (c0389g2 = n10.f1070t) != null) {
                            n10.f1070t = null;
                            c0389g2.resumeWith(c0096n);
                        }
                        i12--;
                    }
                }
            } else if (iOrdinal == 2) {
                p011b0.e eVar4 = this.f1082N;
                objArr = eVar4.f13125r;
                i10 = eVar4.f13127t;
                while (i11 < i10) {
                    n6 = (N) objArr[i11];
                    if (enumC0097o != n6.f1071u) {
                    }
                }
            }
            this.f1082N.g();
        } catch (Throwable th) {
            this.f1082N.g();
            throw th;
        }
    }

    public final void x0() {
        K9.A a9 = this.f1078J;
        if (a9 != null) {
            a9.r(new Z("Pointer input was reset", 1));
            this.f1078J = null;
        }
    }

    @Override // p063g1.c
    public final /* synthetic */ float z(long j) {
        return android.support.v4.media.session.p.e(j, this);
    }
}
