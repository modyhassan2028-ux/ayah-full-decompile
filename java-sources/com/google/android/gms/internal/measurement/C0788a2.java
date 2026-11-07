package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0736j;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788a2 extends B9.a {
    public static final Logger j = Logger.getLogger(C0788a2.class.getName());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f14195k = T2.f14132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0902x2 f14196f;
    public final byte[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14198i;

    public C0788a2(int i10, byte[] bArr) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.g = bArr;
        this.f14198i = 0;
        this.f14197h = i10;
    }

    public static int f0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int g0(String str) {
        int length;
        try {
            length = V2.b(str);
        } catch (U2 unused) {
            length = str.getBytes(AbstractC0863p2.f14382a).length;
        }
        return w0(length) + length;
    }

    public static int w0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void h0(int i10, int i11) throws C0736j {
        q0((i10 << 3) | i11);
    }

    public final void i0(int i10, int i11) throws C0736j {
        q0(i10 << 3);
        p0(i11);
    }

    public final void j0(int i10, int i11) throws C0736j {
        q0(i10 << 3);
        q0(i11);
    }

    public final void k0(int i10, int i11) throws C0736j {
        q0((i10 << 3) | 5);
        r0(i11);
    }

    public final void l0(long j10, int i10) throws C0736j {
        q0(i10 << 3);
        s0(j10);
    }

    public final void m0(long j10, int i10) throws C0736j {
        q0((i10 << 3) | 1);
        t0(j10);
    }

    public final void n0(Z1 z10) throws C0736j {
        q0(z10.d());
        u0(z10.d(), z10.f14186s);
    }

    public final void o0(byte b5) throws C0736j {
        int i10 = this.f14198i;
        try {
            int i11 = i10 + 1;
            try {
                this.g[i10] = b5;
                this.f14198i = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new C0736j(i10, this.f14197h, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    public final void p0(int i10) throws C0736j {
        if (i10 >= 0) {
            q0(i10);
        } else {
            s0(i10);
        }
    }

    public final void q0(int i10) throws C0736j {
        int i11;
        int i12 = this.f14198i;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.g;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f14198i = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C0736j(i11, this.f14197h, 1, e10);
                }
            }
            throw new C0736j(i11, this.f14197h, 1, e10);
        }
    }

    public final void r0(int i10) throws C0736j {
        int i11 = this.f14198i;
        try {
            byte[] bArr = this.g;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f14198i = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new C0736j(i11, this.f14197h, 4, e10);
        }
    }

    public final void s0(long j10) throws C0736j {
        int i10;
        int i11 = this.f14198i;
        int i12 = this.f14197h;
        byte[] bArr = this.g;
        if (!f14195k || i12 - i11 < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                int i13 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i11 = i13;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i10 = i13;
                    throw new C0736j(i10, i12, 1, e);
                }
            }
            i10 = i11 + 1;
            try {
                bArr[i11] = (byte) j11;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new C0736j(i10, i12, 1, e);
            }
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                T2.f14130c.a(bArr, T2.f14133f + ((long) i11), (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            T2.f14130c.a(bArr, T2.f14133f + ((long) i11), (byte) j12);
        }
        this.f14198i = i10;
    }

    public final void t0(long j10) throws C0736j {
        int i10 = this.f14198i;
        try {
            byte[] bArr = this.g;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f14198i = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new C0736j(i10, this.f14197h, 8, e10);
        }
    }

    public final void u0(int i10, byte[] bArr) throws C0736j {
        try {
            System.arraycopy(bArr, 0, this.g, this.f14198i, i10);
            this.f14198i += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C0736j(this.f14198i, this.f14197h, i10, e10);
        }
    }

    public final void v0(String str) throws C0736j {
        int i10 = this.f14198i;
        try {
            int iW0 = w0(str.length() * 3);
            int iW1 = w0(str.length());
            int i11 = this.f14197h;
            byte[] bArr = this.g;
            if (iW1 != iW0) {
                q0(V2.b(str));
                int i12 = this.f14198i;
                this.f14198i = V2.c(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + iW1;
                this.f14198i = i13;
                int iC = V2.c(str, bArr, i13, i11 - i13);
                this.f14198i = i10;
                q0((iC - i10) - iW1);
                this.f14198i = iC;
            }
        } catch (U2 e10) {
            this.f14198i = i10;
            j.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(AbstractC0863p2.f14382a);
            try {
                int length = bytes.length;
                q0(length);
                u0(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new C0736j(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new C0736j(e12);
        }
    }
}
