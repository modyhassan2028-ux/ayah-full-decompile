package K0;

import android.graphics.Outline;
import android.os.Build;
import p180s0.AbstractC1302k;
import p180s0.C1300i;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4935a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Outline f4936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p180s0.F f4937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1300i f4938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p180s0.E f4939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4940f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p180s0.E f4941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p171r0.g f4942i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4945m;

    public H0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f4936b = outline;
        this.f4943k = 0L;
        this.f4944l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    public final void a(p180s0.o oVar) {
        e();
        p180s0.E e10 = this.f4939e;
        if (e10 != null) {
            oVar.b(e10);
            return;
        }
        float f3 = this.j;
        if (f3 <= 0.0f) {
            oVar.l(Float.intBitsToFloat((int) (this.f4943k >> 32)), Float.intBitsToFloat((int) (this.f4943k & 4294967295L)), Float.intBitsToFloat((int) (this.f4944l >> 32)) + Float.intBitsToFloat((int) (this.f4943k >> 32)), Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) + Float.intBitsToFloat((int) (this.f4943k & 4294967295L)), 1);
            return;
        }
        p180s0.E eA = this.f4941h;
        p171r0.g gVar = this.f4942i;
        if (eA != null) {
            long j = this.f4943k;
            long j10 = this.f4944l;
            if (gVar == null || !p171r0.h.e(gVar)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f4943k >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f4944l >> 32)) + Float.intBitsToFloat((int) (this.f4943k >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) + Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                float f7 = this.j;
                p171r0.g gVarA = p171r0.h.a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f7)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f7))));
                if (eA == null) {
                    eA = AbstractC1302k.a();
                } else {
                    ((C1300i) eA).c();
                }
                p123m2.c.c(eA, gVarA);
                this.f4942i = gVarA;
                this.f4941h = eA;
            } else {
                int i10 = (int) (j >> 32);
                if (gVar.f21393a == Float.intBitsToFloat(i10)) {
                    int i11 = (int) (j & 4294967295L);
                    if (gVar.f21394b == Float.intBitsToFloat(i11)) {
                        if (gVar.f21395c == Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10)) {
                            if (gVar.f21396d != Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11) || Float.intBitsToFloat((int) (gVar.f21397e >> 32)) != f3) {
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.f4943k >> 32));
                                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (this.f4944l >> 32)) + Float.intBitsToFloat((int) (this.f4943k >> 32));
                                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) + Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                                float f10 = this.j;
                                p171r0.g gVarA2 = p171r0.h.a(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, (((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10))));
                                if (eA == null) {
                                    eA = AbstractC1302k.a();
                                } else {
                                    ((C1300i) eA).c();
                                }
                                p123m2.c.c(eA, gVarA2);
                                this.f4942i = gVarA2;
                                this.f4941h = eA;
                            }
                        } else {
                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (this.f4943k >> 32));
                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                            float fIntBitsToFloat11 = Float.intBitsToFloat((int) (this.f4944l >> 32)) + Float.intBitsToFloat((int) (this.f4943k >> 32));
                            float fIntBitsToFloat12 = Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) + Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                            float f11 = this.j;
                            p171r0.g gVarA3 = p171r0.h.a(fIntBitsToFloat9, fIntBitsToFloat10, fIntBitsToFloat11, fIntBitsToFloat12, (((long) Float.floatToRawIntBits(f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f11))));
                            if (eA == null) {
                                eA = AbstractC1302k.a();
                            } else {
                                ((C1300i) eA).c();
                            }
                            p123m2.c.c(eA, gVarA3);
                            this.f4942i = gVarA3;
                            this.f4941h = eA;
                        }
                    } else {
                        float fIntBitsToFloat13 = Float.intBitsToFloat((int) (this.f4943k >> 32));
                        float fIntBitsToFloat14 = Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                        float fIntBitsToFloat15 = Float.intBitsToFloat((int) (this.f4944l >> 32)) + Float.intBitsToFloat((int) (this.f4943k >> 32));
                        float fIntBitsToFloat16 = Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) + Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                        float f12 = this.j;
                        p171r0.g gVarA4 = p171r0.h.a(fIntBitsToFloat13, fIntBitsToFloat14, fIntBitsToFloat15, fIntBitsToFloat16, (((long) Float.floatToRawIntBits(f12)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f12))));
                        if (eA == null) {
                            eA = AbstractC1302k.a();
                        } else {
                            ((C1300i) eA).c();
                        }
                        p123m2.c.c(eA, gVarA4);
                        this.f4942i = gVarA4;
                        this.f4941h = eA;
                    }
                } else {
                    float fIntBitsToFloat17 = Float.intBitsToFloat((int) (this.f4943k >> 32));
                    float fIntBitsToFloat18 = Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                    float fIntBitsToFloat19 = Float.intBitsToFloat((int) (this.f4944l >> 32)) + Float.intBitsToFloat((int) (this.f4943k >> 32));
                    float fIntBitsToFloat110 = Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) + Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
                    float f13 = this.j;
                    p171r0.g gVarA5 = p171r0.h.a(fIntBitsToFloat17, fIntBitsToFloat18, fIntBitsToFloat19, fIntBitsToFloat110, (((long) Float.floatToRawIntBits(f13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f13))));
                    if (eA == null) {
                        eA = AbstractC1302k.a();
                    } else {
                        ((C1300i) eA).c();
                    }
                    p123m2.c.c(eA, gVarA5);
                    this.f4942i = gVarA5;
                    this.f4941h = eA;
                }
            }
        } else {
            float fIntBitsToFloat111 = Float.intBitsToFloat((int) (this.f4943k >> 32));
            float fIntBitsToFloat112 = Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
            float fIntBitsToFloat113 = Float.intBitsToFloat((int) (this.f4944l >> 32)) + Float.intBitsToFloat((int) (this.f4943k >> 32));
            float fIntBitsToFloat114 = Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) + Float.intBitsToFloat((int) (this.f4943k & 4294967295L));
            float f14 = this.j;
            p171r0.g gVarA6 = p171r0.h.a(fIntBitsToFloat111, fIntBitsToFloat112, fIntBitsToFloat113, fIntBitsToFloat114, (((long) Float.floatToRawIntBits(f14)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f14))));
            if (eA == null) {
                eA = AbstractC1302k.a();
            } else {
                ((C1300i) eA).c();
            }
            p123m2.c.c(eA, gVarA6);
            this.f4942i = gVarA6;
            this.f4941h = eA;
        }
        oVar.b(eA);
    }

    public final Outline b() {
        e();
        if (this.f4945m && this.f4935a) {
            return this.f4936b;
        }
        return null;
    }

    public final boolean c(long j) {
        p180s0.F f3;
        if (this.f4945m && (f3 = this.f4937c) != null) {
            return P.m(f3, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    public final boolean d(p180s0.F f3, float f7, boolean z10, float f10, long j) {
        this.f4936b.setAlpha(f7);
        boolean zA = p251z9.j.a(this.f4937c, f3);
        boolean z11 = !zA;
        if (!zA) {
            this.f4937c = f3;
            this.f4940f = true;
        }
        this.f4944l = j;
        boolean z12 = f3 != null && (z10 || f10 > 0.0f);
        if (this.f4945m != z12) {
            this.f4945m = z12;
            this.f4940f = true;
        }
        return z11;
    }

    public final void e() {
        if (this.f4940f) {
            this.f4943k = 0L;
            this.j = 0.0f;
            this.f4939e = null;
            this.f4940f = false;
            this.g = false;
            p180s0.F f3 = this.f4937c;
            Outline outline = this.f4936b;
            if (f3 == null || !this.f4945m || Float.intBitsToFloat((int) (this.f4944l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f4944l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f4935a = true;
            if (f3 instanceof p180s0.C) {
                p171r0.e eVar = ((p180s0.C) f3).f21771e;
                float f7 = eVar.f21389a;
                float f10 = eVar.f21390b;
                this.f4943k = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                float f11 = eVar.f21391c;
                float f12 = eVar.f21392d;
                this.f4944l = (4294967295L & ((long) Float.floatToRawIntBits(f12 - f10))) | (Float.floatToRawIntBits(f11 - f7) << 32);
                outline.setRect(Math.round(f7), Math.round(f10), Math.round(f11), Math.round(f12));
                return;
            }
            if (!(f3 instanceof p180s0.D)) {
                if (f3 instanceof p180s0.B) {
                    f(((p180s0.B) f3).f21770e);
                    return;
                }
                return;
            }
            p171r0.g gVar = ((p180s0.D) f3).f21772e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f21397e >> 32));
            float f13 = gVar.f21393a;
            float f14 = gVar.f21394b;
            this.f4943k = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
            float fB = gVar.b();
            this.f4944l = (((long) Float.floatToRawIntBits(gVar.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            if (p171r0.h.e(gVar)) {
                this.f4936b.setRoundRect(Math.round(f13), Math.round(f14), Math.round(gVar.f21395c), Math.round(gVar.f21396d), fIntBitsToFloat);
                this.j = fIntBitsToFloat;
                return;
            }
            C1300i c1300iA = this.f4938d;
            if (c1300iA == null) {
                c1300iA = AbstractC1302k.a();
                this.f4938d = c1300iA;
            }
            c1300iA.c();
            p123m2.c.c(c1300iA, gVar);
            f(c1300iA);
        }
    }

    public final void f(p180s0.E e10) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f4936b;
        if (i10 > 28 || ((C1300i) e10).f21829a.isConvex()) {
            if (i10 >= 30) {
                I0.f4948a.a(outline, e10);
            } else {
                if (!(e10 instanceof C1300i)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((C1300i) e10).f21829a);
            }
            this.g = !outline.canClip();
        } else {
            this.f4935a = false;
            outline.setEmpty();
            this.g = true;
        }
        this.f4939e = e10;
    }
}
