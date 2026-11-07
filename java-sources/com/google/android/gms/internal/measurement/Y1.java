package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 extends Z1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14178u;

    public Y1(int i10, byte[] bArr) {
        super(bArr);
        Z1.f(0, i10, bArr.length);
        this.f14178u = i10;
    }

    @Override // com.google.android.gms.internal.measurement.Z1
    public final byte b(int i10) {
        int i11 = this.f14178u;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f14186s[i10];
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb2.append("Index > length: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.Z1
    public final byte c(int i10) {
        return this.f14186s[i10];
    }

    @Override // com.google.android.gms.internal.measurement.Z1
    public final int d() {
        return this.f14178u;
    }
}
