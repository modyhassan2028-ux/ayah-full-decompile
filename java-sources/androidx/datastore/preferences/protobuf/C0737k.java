package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.B1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0737k extends B1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f12478i = Logger.getLogger(C0737k.class.getName());
    public static final boolean j = j0.f12476e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f12479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f12480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12481f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T1.f0 f12482h;

    public C0737k(T1.f0 f0Var, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f12480e = new byte[iMax];
        this.f12481f = iMax;
        this.f12482h = f0Var;
    }

    public static int X(int i10, C0733g c0733g) {
        int iZ = Z(i10);
        int size = c0733g.size();
        return a0(size) + size + iZ;
    }

    public static int Y(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0748w.f12518a).length;
        }
        return a0(length) + length;
    }

    public static int Z(int i10) {
        return a0(i10 << 3);
    }

    public static int a0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int b0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Override // com.google.android.gms.internal.measurement.B1
    public final void P(byte[] bArr, int i10, int i11) throws IOException {
        f0(bArr, i10, i11);
    }

    public final void S(int i10) {
        int i11 = this.g;
        int i12 = i11 + 1;
        this.g = i12;
        byte[] bArr = this.f12480e;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.g = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.g = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.g = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void T(long j10) {
        int i10 = this.g;
        int i11 = i10 + 1;
        this.g = i11;
        byte[] bArr = this.f12480e;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.g = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.g = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.g = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.g = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.g = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.g = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.g = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void U(int i10, int i11) {
        V((i10 << 3) | i11);
    }

    public final void V(int i10) {
        boolean z10 = j;
        byte[] bArr = this.f12480e;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.g;
                this.g = i11 + 1;
                j0.j(bArr, i11, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            int i12 = this.g;
            this.g = i12 + 1;
            j0.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.g;
            this.g = i13 + 1;
            bArr[i13] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        int i14 = this.g;
        this.g = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void W(long j10) {
        boolean z10 = j;
        byte[] bArr = this.f12480e;
        if (z10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.g;
                this.g = i10 + 1;
                j0.j(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            int i11 = this.g;
            this.g = i11 + 1;
            j0.j(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i12 = this.g;
            this.g = i12 + 1;
            bArr[i12] = (byte) ((((int) j10) | 128) & 255);
            j10 >>>= 7;
        }
        int i13 = this.g;
        this.g = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    public final void c0() throws IOException {
        this.f12482h.write(this.f12480e, 0, this.g);
        this.g = 0;
    }

    public final void d0(int i10) throws IOException {
        if (this.f12481f - this.g < i10) {
            c0();
        }
    }

    public final void e0(byte b5) throws IOException {
        if (this.g == this.f12481f) {
            c0();
        }
        int i10 = this.g;
        this.g = i10 + 1;
        this.f12480e[i10] = b5;
    }

    public final void f0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.g;
        int i13 = this.f12481f;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f12480e;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.g += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.g = i13;
        c0();
        if (i16 > i13) {
            this.f12482h.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.g = i16;
        }
    }

    public final void g0(int i10, boolean z10) throws IOException {
        d0(11);
        U(i10, 0);
        byte b5 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.g;
        this.g = i11 + 1;
        this.f12480e[i11] = b5;
    }

    public final void h0(int i10, C0733g c0733g) {
        s0(i10, 2);
        i0(c0733g);
    }

    public final void i0(C0733g c0733g) throws IOException {
        u0(c0733g.size());
        P(c0733g.f12454s, c0733g.f(), c0733g.size());
    }

    public final void j0(int i10, int i11) {
        d0(14);
        U(i10, 5);
        S(i11);
    }

    public final void k0(int i10) throws IOException {
        d0(4);
        S(i10);
    }

    public final void l0(long j10, int i10) {
        d0(18);
        U(i10, 1);
        T(j10);
    }

    public final void m0(long j10) throws IOException {
        d0(8);
        T(j10);
    }

    public final void n0(int i10, int i11) throws IOException {
        d0(20);
        U(i10, 0);
        if (i11 >= 0) {
            V(i11);
        } else {
            W(i11);
        }
    }

    public final void o0(int i10) throws IOException {
        if (i10 >= 0) {
            u0(i10);
        } else {
            w0(i10);
        }
    }

    public final void p0(int i10, AbstractC0727a abstractC0727a, W w9) throws IOException {
        s0(i10, 2);
        u0(abstractC0727a.a(w9));
        w9.c(abstractC0727a, this.f12479d);
    }

    public final void q0(int i10, String str) throws IOException {
        s0(i10, 2);
        r0(str);
    }

    public final void r0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iA0 = a0(length);
            int i10 = iA0 + length;
            int i11 = this.f12481f;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iN = m0.f12487a.n(str, bArr, 0, length);
                u0(iN);
                f0(bArr, 0, iN);
                return;
            }
            if (i10 > i11 - this.g) {
                c0();
            }
            int iA1 = a0(str.length());
            int i12 = this.g;
            byte[] bArr2 = this.f12480e;
            try {
                try {
                    if (iA1 == iA0) {
                        int i13 = i12 + iA1;
                        this.g = i13;
                        int iN2 = m0.f12487a.n(str, bArr2, i13, i11 - i13);
                        this.g = i12;
                        V((iN2 - i12) - iA1);
                        this.g = iN2;
                    } else {
                        int iA = m0.a(str);
                        V(iA);
                        this.g = m0.f12487a.n(str, bArr2, this.g, iA);
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new C0736j(e10);
                }
            } catch (l0 e11) {
                this.g = i12;
                throw e11;
            }
        } catch (l0 e12) {
            f12478i.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(AbstractC0748w.f12518a);
            try {
                u0(bytes.length);
                P(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e13) {
                throw new C0736j(e13);
            }
        }
    }

    public final void s0(int i10, int i11) {
        u0((i10 << 3) | i11);
    }

    public final void t0(int i10, int i11) throws IOException {
        d0(20);
        U(i10, 0);
        V(i11);
    }

    public final void u0(int i10) throws IOException {
        d0(5);
        V(i10);
    }

    public final void v0(long j10, int i10) {
        d0(20);
        U(i10, 0);
        W(j10);
    }

    public final void w0(long j10) throws IOException {
        d0(10);
        W(j10);
    }
}
