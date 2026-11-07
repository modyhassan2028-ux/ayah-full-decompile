package p214w;

import A.C0023i;
import H0.T;
import H0.U;
import J0.K;
import p063g1.j;
import p110k9.y;
import p180s0.F;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class C extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f23420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f23421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f23422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f23423v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Object obj, long j, long j10, Object obj2, int i10) {
        super(1);
        this.f23419r = i10;
        this.f23422u = obj;
        this.f23420s = j;
        this.f23421t = j10;
        this.f23423v = obj2;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f23419r) {
            case 0:
                T t2 = (T) obj;
                U u8 = (U) this.f23422u;
                long j = this.f23420s;
                long j10 = this.f23421t;
                C0023i c0023i = (C0023i) this.f23423v;
                t2.getClass();
                T.a(t2, u8);
                u8.Y(j.c((((long) (((int) (j >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L), u8.f3172v), 0.0f, c0023i);
                break;
            default:
                K k7 = (K) obj;
                k7.a();
                p123m2.c.j(k7, (F) this.f23422u, this.f23420s, this.f23421t, 0.0f, (p196u0.c) this.f23423v, 104);
                break;
        }
        return y.f19095a;
    }
}
