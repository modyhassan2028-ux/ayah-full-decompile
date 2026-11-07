package p242z;

import p063g1.k;
import p063g1.m;
import p104k1.s;
import p171r0.f;

/* JADX INFO: loaded from: classes.dex */
public final class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24728a;

    public d(long j) {
        this.f24728a = j;
    }

    @Override // p104k1.s
    public final long a(k kVar, long j, m mVar, long j10) {
        int i10 = kVar.f16256a;
        long j11 = this.f24728a;
        return (((long) f.e(i10 + ((int) (j11 >> 32)), (int) (j10 >> 32), (int) (j >> 32), mVar == m.f16261r)) << 32) | (((long) f.e(kVar.f16257b + ((int) (j11 & 4294967295L)), (int) (j10 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L);
    }
}
