package p214w;

import H0.T;
import H0.U;
import l0.e;
import p063g1.m;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: w.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1397j extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1399l f23504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U f23505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f23506t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1397j(C1399l c1399l, U u8, long j) {
        super(1);
        this.f23504r = c1399l;
        this.f23505s = u8;
        this.f23506t = j;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        e eVar = this.f23504r.f23512I.f23518b;
        U u8 = this.f23505s;
        T.f((T) obj, u8, eVar.a((((long) u8.f3169s) & 4294967295L) | (((long) u8.f3168r) << 32), this.f23506t, m.f16261r));
        return y.f19095a;
    }
}
