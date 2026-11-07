package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0730d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class Z1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Z1 f14184t = new Z1(AbstractC0863p2.f14383b);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14185r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f14186s;

    static {
        int i10 = V1.f14144a;
    }

    public Z1(byte[] bArr) {
        bArr.getClass();
        this.f14186s = bArr;
    }

    public static Z1 e(byte[] bArr, int i10, int i11) {
        f(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new Z1(bArr2);
    }

    public static int f(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i10);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < i10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb3.append("End index: ");
        sb3.append(i11);
        sb3.append(" >= ");
        sb3.append(i12);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public byte b(int i10) {
        return this.f14186s[i10];
    }

    public byte c(int i10) {
        return this.f14186s[i10];
    }

    public int d() {
        return this.f14186s.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Z1) && d() == ((Z1) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof Z1)) {
                return obj.equals(this);
            }
            Z1 z10 = (Z1) obj;
            int i10 = this.f14185r;
            int i11 = z10.f14185r;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int iD = d();
                if (iD > z10.d()) {
                    int iD2 = d();
                    StringBuilder sb = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
                    sb.append("Length too large: ");
                    sb.append(iD);
                    sb.append(iD2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iD <= z10.d()) {
                    byte[] bArr = z10.f14186s;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < iD) {
                        if (this.f14186s[i12] == bArr[i13]) {
                            i12++;
                            i13++;
                        }
                    }
                    return true;
                }
                int iD3 = z10.d();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iD);
                sb2.append(", ");
                sb2.append(iD3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f14185r;
        if (i10 != 0) {
            return i10;
        }
        int iD = d();
        int i11 = iD;
        for (int i12 = 0; i12 < iD; i12++) {
            i11 = (i11 * 31) + this.f14186s[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f14185r = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0730d(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            strConcat = Y2.a.n0(this);
        } else {
            int iF = f(0, 47, d());
            strConcat = Y2.a.n0(iF == 0 ? f14184t : new Y1(iF, this.f14186s)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iD);
        sb.append(" contents=\"");
        return android.support.v4.media.session.p.B(sb, strConcat, "\">");
    }
}
