package j$.time.format;

import j$.time.temporal.TemporalField;

/* JADX INFO: loaded from: classes2.dex */
public class i implements InterfaceC1057e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f17871f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalField f17872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f17875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17876e;

    public long a(y yVar, long j) {
        return j;
    }

    public i(TemporalField temporalField, int i10, int i11, F f3) {
        this.f17872a = temporalField;
        this.f17873b = i10;
        this.f17874c = i11;
        this.f17875d = f3;
        this.f17876e = 0;
    }

    public i(TemporalField temporalField, int i10, int i11, F f3, int i12) {
        this.f17872a = temporalField;
        this.f17873b = i10;
        this.f17874c = i11;
        this.f17875d = f3;
        this.f17876e = i12;
    }

    public i d() {
        if (this.f17876e == -1) {
            return this;
        }
        return new i(this.f17872a, this.f17873b, this.f17874c, this.f17875d, -1);
    }

    public i e(int i10) {
        return new i(this.f17872a, this.f17873b, this.f17874c, this.f17875d, this.f17876e + i10);
    }

    @Override // j$.time.format.InterfaceC1057e
    public boolean k(y yVar, StringBuilder sb) {
        TemporalField temporalField = this.f17872a;
        Long lA = yVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(yVar, lA.longValue());
        C c10 = yVar.f17929b.f17851c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i10 = this.f17874c;
        if (length > i10) {
            throw new j$.time.b("Field " + temporalField + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i10);
        }
        c10.getClass();
        int i11 = this.f17873b;
        F f3 = this.f17875d;
        if (jA >= 0) {
            int i12 = AbstractC1054b.f17865a[f3.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb.append('+');
                }
            } else if (i11 < 19 && jA >= f17871f[i11]) {
                sb.append('+');
            }
        } else {
            int i13 = AbstractC1054b.f17865a[f3.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb.append('-');
            } else if (i13 == 4) {
                throw new j$.time.b("Field " + temporalField + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - string.length(); i14++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public boolean b(v vVar) {
        int i10 = this.f17876e;
        if (i10 != -1) {
            return i10 > 0 && this.f17873b == this.f17874c && this.f17875d == F.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x017d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0198  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0174, code lost:
    
        if (r6 <= r10) goto L98;
     */
    @Override // j$.time.format.InterfaceC1057e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(j$.time.format.v r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.l(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public int c(v vVar, long j, int i10, int i11) {
        return vVar.f(this.f17872a, j, i10, i11);
    }

    public String toString() {
        int i10 = this.f17874c;
        TemporalField temporalField = this.f17872a;
        F f3 = this.f17875d;
        int i11 = this.f17873b;
        if (i11 == 1 && i10 == 19 && f3 == F.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i11 == i10 && f3 == F.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i11 + ")";
        }
        return "Value(" + temporalField + "," + i11 + "," + i10 + "," + f3 + ")";
    }
}
