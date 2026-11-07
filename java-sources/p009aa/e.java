package p009aa;

import Da.r;
import G1.f;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11238t;

    public e(r rVar, boolean z10) {
        super((Object) rVar, false);
        this.f11238t = z10;
    }

    @Override // G1.f
    public final void f(byte b5) {
        if (this.f11238t) {
            m(String.valueOf(b5 & 255));
        } else {
            k(String.valueOf(b5 & 255));
        }
    }

    @Override // G1.f
    public final void i(int i10) {
        if (this.f11238t) {
            m(Long.toString(4294967295L & ((long) i10), 10));
        } else {
            k(Long.toString(4294967295L & ((long) i10), 10));
        }
    }

    @Override // G1.f
    public final void j(long j) {
        int i10 = 63;
        String str = "0";
        if (this.f11238t) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j >>> 1) / ((long) 5);
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            m(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j >>> 1) / ((long) 5);
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j12 * j13)), 10);
                while (j12 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        k(str);
    }

    @Override // G1.f
    public final void l(short s10) {
        if (this.f11238t) {
            m(String.valueOf(s10 & 65535));
        } else {
            k(String.valueOf(s10 & 65535));
        }
    }
}
