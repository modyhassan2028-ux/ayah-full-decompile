package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class E2 implements K2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f14021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0818g2 f14022b;

    public E2(C0818g2 c0818g2, T1 t2) {
        C0818g2 c0818g3 = AbstractC0798c2.f14219a;
        this.f14022b = c0818g2;
        this.f14021a = t2;
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final AbstractC0828i2 a() {
        T1 t2 = this.f14021a;
        return t2 instanceof AbstractC0828i2 ? (AbstractC0828i2) ((AbstractC0828i2) t2).o(4) : ((AbstractC0823h2) ((AbstractC0828i2) t2).o(5)).d();
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final void b(Object obj) {
        this.f14022b.getClass();
        O2 o10 = ((AbstractC0828i2) obj).zzc;
        if (o10.f14096e) {
            o10.f14096e = false;
        }
        C0818g2 c0818g2 = AbstractC0798c2.f14219a;
        throw p123m2.c.p(obj);
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final void c(Object obj, byte[] bArr, int i10, int i11, W1 w9) {
        AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) obj;
        if (abstractC0828i2.zzc == O2.f14091f) {
            abstractC0828i2.zzc = O2.a();
        }
        throw p123m2.c.p(obj);
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final void d(Object obj, Object obj2) {
        L2.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final int e(T1 t2) {
        O2 o10 = ((AbstractC0828i2) t2).zzc;
        int i10 = o10.f14095d;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < o10.f14092a; i11++) {
            int i12 = o10.f14093b[i11] >>> 3;
            Z1 z10 = (Z1) o10.f14094c[i11];
            int iW0 = C0788a2.w0(8);
            int iW1 = C0788a2.w0(i12) + C0788a2.w0(16);
            int iW2 = C0788a2.w0(24);
            int iD = z10.d();
            iO += iW0 + iW0 + iW1 + android.support.v4.media.session.p.o(iD, iD, iW2);
        }
        o10.f14095d = iO;
        return iO;
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final int f(AbstractC0828i2 abstractC0828i2) {
        return abstractC0828i2.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final void g(Object obj, C0902x2 c0902x2) {
        throw p123m2.c.p(obj);
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final boolean h(Object obj) {
        throw p123m2.c.p(obj);
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final boolean i(AbstractC0828i2 abstractC0828i2, AbstractC0828i2 abstractC0828i3) {
        return abstractC0828i2.zzc.equals(abstractC0828i3.zzc);
    }
}
