package com.squareup.moshi;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f15467A = new String[128];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Da.i f15468y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f15469z;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f15467A[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f15467A;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public q(Da.i iVar) {
        int[] iArr = new int[32];
        this.f15484s = iArr;
        this.f15485t = new String[32];
        this.f15486u = new int[32];
        this.f15489x = -1;
        this.f15468y = iVar;
        this.f15483r = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void c0(Da.i iVar, String str) {
        String str2;
        iVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = f15467A[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        iVar.h(str, i10, i11);
                    }
                    iVar.T(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    iVar.h(str, i10, i11);
                }
                iVar.T(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            iVar.h(str, i10, length);
        }
        iVar.writeByte(34);
    }

    @Override // com.squareup.moshi.s
    public final q A() {
        if (this.f15488w) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + n());
        }
        if (this.f15469z != null) {
            if (!this.f15487v) {
                this.f15469z = null;
                return this;
            }
            d0();
        }
        V();
        this.f15468y.T("null");
        int[] iArr = this.f15486u;
        int i10 = this.f15483r - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.s
    public final q F(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d5);
        }
        if (this.f15488w) {
            this.f15488w = false;
            w(Double.toString(d5));
            return this;
        }
        d0();
        V();
        this.f15468y.T(Double.toString(d5));
        int[] iArr = this.f15486u;
        int i10 = this.f15483r - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.s
    public final q H(long j) {
        if (this.f15488w) {
            this.f15488w = false;
            w(Long.toString(j));
            return this;
        }
        d0();
        V();
        this.f15468y.T(Long.toString(j));
        int[] iArr = this.f15486u;
        int i10 = this.f15483r - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.s
    public final q L(Number number) {
        if (number == null) {
            A();
            return this;
        }
        String string = number.toString();
        if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f15488w) {
            this.f15488w = false;
            w(string);
            return this;
        }
        d0();
        V();
        this.f15468y.T(string);
        int[] iArr = this.f15486u;
        int i10 = this.f15483r - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.s
    public final q N(String str) {
        if (str == null) {
            A();
            return this;
        }
        if (this.f15488w) {
            this.f15488w = false;
            w(str);
            return this;
        }
        d0();
        V();
        c0(this.f15468y, str);
        int[] iArr = this.f15486u;
        int i10 = this.f15483r - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.s
    public final q O(boolean z10) {
        if (this.f15488w) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + n());
        }
        d0();
        V();
        this.f15468y.T(z10 ? "true" : "false");
        int[] iArr = this.f15486u;
        int i10 = this.f15483r - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final void V() {
        int iE = E();
        int i10 = 2;
        if (iE != 1) {
            Da.i iVar = this.f15468y;
            if (iE == 2) {
                iVar.writeByte(44);
            } else if (iE == 4) {
                iVar.T(":");
                i10 = 5;
            } else {
                if (iE == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iE != 6) {
                    if (iE != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i10 = 7;
            }
        }
        this.f15484s[this.f15483r - 1] = i10;
    }

    public final void X(int i10, int i11, char c10) {
        int iE = E();
        if (iE != i11 && iE != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f15469z != null) {
            throw new IllegalStateException("Dangling name: " + this.f15469z);
        }
        int i12 = this.f15483r;
        int i13 = ~this.f15489x;
        if (i12 == i13) {
            this.f15489x = i13;
            return;
        }
        int i14 = i12 - 1;
        this.f15483r = i14;
        this.f15485t[i14] = null;
        int[] iArr = this.f15486u;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f15468y.writeByte(c10);
    }

    @Override // com.squareup.moshi.s
    public final q b() {
        if (this.f15488w) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + n());
        }
        d0();
        b0(1, 2, '[');
        return this;
    }

    public final void b0(int i10, int i11, char c10) {
        int i12;
        int i13 = this.f15483r;
        int i14 = this.f15489x;
        if (i13 == i14 && ((i12 = this.f15484s[i13 - 1]) == i10 || i12 == i11)) {
            this.f15489x = ~i14;
            return;
        }
        V();
        int i15 = this.f15483r;
        int[] iArr = this.f15484s;
        if (i15 == iArr.length) {
            if (i15 == 256) {
                throw new A6.a("Nesting too deep at " + n() + ": circular reference?");
            }
            this.f15484s = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f15485t;
            this.f15485t = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f15486u;
            this.f15486u = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f15484s;
        int i16 = this.f15483r;
        this.f15483r = i16 + 1;
        iArr3[i16] = i10;
        this.f15486u[i16] = 0;
        this.f15468y.writeByte(c10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15468y.close();
        int i10 = this.f15483r;
        if (i10 > 1 || (i10 == 1 && this.f15484s[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15483r = 0;
    }

    public final void d0() {
        if (this.f15469z != null) {
            int iE = E();
            Da.i iVar = this.f15468y;
            if (iE == 5) {
                iVar.writeByte(44);
            } else if (iE != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f15484s[this.f15483r - 1] = 4;
            c0(iVar, this.f15469z);
            this.f15469z = null;
        }
    }

    @Override // com.squareup.moshi.s
    public final q e() {
        if (this.f15488w) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + n());
        }
        d0();
        b0(3, 5, '{');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f15483r == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15468y.flush();
    }

    @Override // com.squareup.moshi.s
    public final q i() {
        this.f15488w = false;
        X(3, 5, '}');
        return this;
    }

    @Override // com.squareup.moshi.s
    public final q w(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f15483r == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iE = E();
        if ((iE != 3 && iE != 5) || this.f15469z != null || this.f15488w) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f15469z = str;
        this.f15485t[this.f15483r - 1] = str;
        return this;
    }
}
