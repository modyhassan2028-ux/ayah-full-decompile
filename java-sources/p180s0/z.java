package p180s0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;
import p171r0.c;

/* JADX INFO: loaded from: classes.dex */
public final class z extends H {
    public final List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21852i;

    public z(List list, long j, long j10) {
        this.g = list;
        this.f21851h = j;
        this.f21852i = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.g.equals(zVar.g) && c.b(this.f21851h, zVar.f21851h) && c.b(this.f21852i, zVar.f21852i);
    }

    public final int hashCode() {
        return (c.f(this.f21852i) + ((c.f(this.f21851h) + (this.g.hashCode() * 961)) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.f21851h;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) c.j(j)) + ", ";
        } else {
            str = "";
        }
        long j10 = this.f21852i;
        if (((((j10 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) c.j(j10)) + ", ";
        }
        return "LinearGradient(colors=" + this.g + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }

    @Override // p180s0.H
    public final Shader x(long j) {
        int i10;
        int[] iArr;
        int i11;
        float[] fArr;
        long j10 = this.f21851h;
        char c10 = ' ';
        int i12 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i12);
        long j11 = 4294967295L;
        int i13 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i13);
        long j12 = this.f21852i;
        int i14 = (int) (j12 >> 32);
        if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
            i14 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i14);
        int i15 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i15) == Float.POSITIVE_INFINITY) {
            i15 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i15);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.g;
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 0;
        } else {
            int iE = AbstractC0813f2.E(list);
            i10 = 0;
            int i16 = 1;
            while (i16 < iE) {
                char c11 = c10;
                long j13 = j11;
                if (q.d(((q) list.get(i16)).f21845a) == 0.0f) {
                    i10++;
                }
                i16++;
                c10 = c11;
                j11 = j13;
            }
        }
        char c12 = c10;
        long j14 = j11;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c12));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & j14));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c12));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j14));
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = F.u(((q) list.get(i17)).f21845a);
            }
        } else {
            iArr = new int[list.size() + i10];
            int iE2 = AbstractC0813f2.E(list);
            int size2 = list.size();
            int i18 = 0;
            for (int i19 = 0; i19 < size2; i19++) {
                long j15 = ((q) list.get(i19)).f21845a;
                if (q.d(j15) == 0.0f) {
                    if (i19 == 0) {
                        i11 = i18 + 1;
                        iArr[i18] = F.u(q.b(((q) list.get(1)).f21845a, 0.0f));
                    } else if (i19 == iE2) {
                        i11 = i18 + 1;
                        iArr[i18] = F.u(q.b(((q) list.get(i19 - 1)).f21845a, 0.0f));
                    } else {
                        int i20 = i18 + 1;
                        iArr[i18] = F.u(q.b(((q) list.get(i19 - 1)).f21845a, 0.0f));
                        i18 += 2;
                        iArr[i20] = F.u(q.b(((q) list.get(i19 + 1)).f21845a, 0.0f));
                    }
                    i18 = i11;
                } else {
                    iArr[i18] = F.u(j15);
                    i18++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i10 == 0) {
            fArr = null;
        } else {
            fArr = new float[list.size() + i10];
            fArr[0] = 0.0f;
            int iE3 = AbstractC0813f2.E(list);
            int i21 = 1;
            for (int i22 = 1; i22 < iE3; i22++) {
                long j16 = ((q) list.get(i22)).f21845a;
                float fE = i22 / AbstractC0813f2.E(list);
                int i23 = i21 + 1;
                fArr[i21] = fE;
                if (q.d(j16) == 0.0f) {
                    i21 += 2;
                    fArr[i23] = fE;
                } else {
                    i21 = i23;
                }
            }
            fArr[i21] = 1.0f;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr2, fArr, Shader.TileMode.CLAMP);
    }
}
