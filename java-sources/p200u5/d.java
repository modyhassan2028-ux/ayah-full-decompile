package p200u5;

import A6.a;
import p063g1.k;
import p063g1.m;
import p104k1.s;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22962a;

    public d(int i10) {
        this.f22962a = i10;
    }

    @Override // p104k1.s
    public final long a(k kVar, long j, m mVar, long j10) {
        j.e(kVar, "anchorBounds");
        j.e(mVar, "layoutDirection");
        int i10 = kVar.f16257b - ((int) (j10 & 4294967295L));
        int iOrdinal = mVar.ordinal();
        int i11 = this.f22962a;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new a();
            }
            i11 = (((int) (j >> 32)) - ((int) (j10 >> 32))) - i11;
        }
        return (((long) i11) << 32) | (((long) i10) & 4294967295L);
    }
}
