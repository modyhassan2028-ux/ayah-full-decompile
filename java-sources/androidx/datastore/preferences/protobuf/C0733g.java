package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0733g implements Iterable, Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0733g f12451t = new C0733g(AbstractC0748w.f12519b);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0731e f12452u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12453r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f12454s;

    static {
        f12452u = AbstractC0729c.a() ? new C0731e(1) : new C0731e(0);
    }

    public C0733g(byte[] bArr) {
        bArr.getClass();
        this.f12454s = bArr;
    }

    public static int c(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(p245z2.a.B(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(android.support.v4.media.session.p.w(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.session.p.w(i11, i12, "End index: ", " >= "));
    }

    public static C0733g d(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        c(i10, i10 + i11, bArr.length);
        switch (f12452u.f12448a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C0733g(bArrCopyOfRange);
    }

    public byte b(int i10) {
        return this.f12454s[i10];
    }

    public void e(int i10, byte[] bArr) {
        System.arraycopy(this.f12454s, 0, bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0733g) || size() != ((C0733g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0733g)) {
            return obj.equals(this);
        }
        C0733g c0733g = (C0733g) obj;
        int i10 = this.f12453r;
        int i11 = c0733g.f12453r;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c0733g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0733g.size()) {
            StringBuilder sbW = p123m2.c.w(size, "Ran off end of other: 0, ", ", ");
            sbW.append(c0733g.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        byte[] bArr = c0733g.f12454s;
        int iF = f() + size;
        int iF2 = f();
        int iF3 = c0733g.f();
        while (iF2 < iF) {
            if (this.f12454s[iF2] != bArr[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i10) {
        return this.f12454s[i10];
    }

    public final int hashCode() {
        int i10 = this.f12453r;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int iF = f();
        int i11 = size;
        for (int i12 = iF; i12 < iF + size; i12++) {
            i11 = (i11 * 31) + this.f12454s[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f12453r = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0730d(this);
    }

    public int size() {
        return this.f12454s.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC0813f2.u(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iC = c(0, 47, size());
            sb.append(AbstractC0813f2.u(iC == 0 ? f12451t : new C0732f(this.f12454s, f(), iC)));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return android.support.v4.media.session.p.B(sb2, string, "\">");
    }
}
