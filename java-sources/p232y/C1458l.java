package p232y;

import J0.K;
import p074h0.i;
import p110k9.y;
import p151p.V;
import p171r0.d;
import p180s0.F;
import p180s0.L;
import p196u0.b;
import p196u0.g;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: y.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1458l extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f24558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f24559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f24560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f24561u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f24562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f24563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f24564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f24565y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458l(boolean z10, L l10, long j, float f3, float f7, long j10, long j11, g gVar) {
        super(1);
        this.f24558r = z10;
        this.f24559s = l10;
        this.f24560t = j;
        this.f24561u = f3;
        this.f24562v = f7;
        this.f24563w = j10;
        this.f24564x = j11;
        this.f24565y = gVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        K k7 = (K) obj;
        k7.a();
        b bVar = k7.f3942r;
        if (this.f24558r) {
            p123m2.c.l(k7, this.f24559s, 0L, 0L, this.f24560t, null, 246);
        } else {
            long j = this.f24560t;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f3 = this.f24561u;
            if (fIntBitsToFloat < f3) {
                float f7 = this.f24562v;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.f22795s.v() >> 32));
                float f10 = this.f24562v;
                float f11 = fIntBitsToFloat2 - f10;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f22795s.v() & 4294967295L)) - f10;
                F f12 = this.f24559s;
                long j10 = this.f24560t;
                i iVar = bVar.f22795s;
                long jV = iVar.v();
                iVar.p().q();
                try {
                    ((i) ((V) iVar.f16422s).f20603r).p().l(f7, f7, f11, fIntBitsToFloat3, 0);
                    p123m2.c.l(k7, f12, 0L, 0L, j10, null, 246);
                } finally {
                    iVar.p().n();
                    iVar.J(jV);
                }
            } else {
                p123m2.c.l(k7, this.f24559s, this.f24563w, this.f24564x, d.d(j, f3), this.f24565y, 208);
            }
        }
        return y.f19095a;
    }
}
