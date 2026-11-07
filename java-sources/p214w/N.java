package p214w;

import H0.K;
import H0.T;
import H0.U;
import p063g1.m;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class N extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f23451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f23452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f23453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f23454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ U f23455v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10, long j, int i10, int i11, K k7, U u8) {
        super(1);
        this.f23451r = j;
        this.f23452s = i10;
        this.f23453t = i11;
        this.f23454u = k7;
        this.f23455v = u8;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        T t2 = (T) obj;
        long j = (((long) this.f23452s) << 32) | (((long) this.f23453t) & 4294967295L);
        m layoutDirection = this.f23454u.getLayoutDirection();
        long j10 = this.f23451r;
        float f3 = (((int) (j >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f7 = (((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        float f10 = layoutDirection == m.f16261r ? -1.0f : (-1) * (-1.0f);
        float f11 = 1;
        float f12 = (f10 + f11) * f3;
        T.f(t2, this.f23455v, (((long) Math.round((f11 - 1.0f) * f7)) & 4294967295L) | (((long) Math.round(f12)) << 32));
        return y.f19095a;
    }
}
