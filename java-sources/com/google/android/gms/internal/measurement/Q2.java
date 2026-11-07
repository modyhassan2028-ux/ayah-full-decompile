package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Q2 extends S2 {
    @Override // com.google.android.gms.internal.measurement.S2
    public final void a(Object obj, long j, byte b5) {
        if (T2.g) {
            T2.c(obj, j, b5);
        } else {
            T2.d(obj, j, b5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S2
    public final boolean b(long j, Object obj) {
        return T2.g ? T2.n(j, obj) : T2.o(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.S2
    public final void c(Object obj, long j, boolean z10) {
        if (T2.g) {
            T2.c(obj, j, z10 ? (byte) 1 : (byte) 0);
        } else {
            T2.d(obj, j, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S2
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(this.f14127a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.S2
    public final void e(Object obj, long j, float f3) {
        this.f14127a.putInt(obj, j, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.measurement.S2
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(this.f14127a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.S2
    public final void g(Object obj, long j, double d5) {
        this.f14127a.putLong(obj, j, Double.doubleToLongBits(d5));
    }
}
