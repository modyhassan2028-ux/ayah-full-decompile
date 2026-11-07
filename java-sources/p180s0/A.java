package p180s0;

import H9.p;
import java.util.Arrays;
import p171r0.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f21769a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j, float[] fArr) {
        if (fArr.length < 16) {
            return j;
        }
        float f3 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[7];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f17 = 1 / (((f13 * fIntBitsToFloat2) + (f10 * fIntBitsToFloat)) + f16);
        if ((Float.floatToRawIntBits(f17) & Integer.MAX_VALUE) >= 2139095040) {
            f17 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f11 * fIntBitsToFloat2) + (f3 * fIntBitsToFloat)) + f14) * f17)) << 32) | (((long) Float.floatToRawIntBits(((f12 * fIntBitsToFloat2) + (f7 * fIntBitsToFloat) + f15) * f17)) & 4294967295L);
    }

    public static final void c(float[] fArr, b bVar) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[7];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[15];
        float f17 = bVar.f21383a;
        float f18 = bVar.f21384b;
        float f19 = bVar.f21385c;
        float f20 = bVar.f21386d;
        float f21 = f10 * f17;
        float f22 = f13 * f18;
        float f23 = 1.0f / ((f21 + f22) + f16);
        if ((Float.floatToRawIntBits(f23) & Integer.MAX_VALUE) >= 2139095040) {
            f23 = 0.0f;
        }
        float f24 = f3 * f17;
        float f25 = f11 * f18;
        float f26 = (f24 + f25 + f14) * f23;
        float f27 = f17 * f7;
        float f28 = f18 * f12;
        float f29 = (f27 + f28 + f15) * f23;
        float f30 = f13 * f20;
        float f31 = 1.0f / ((f21 + f30) + f16);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f11 * f20;
        float f33 = (f24 + f32 + f14) * f31;
        float f34 = f12 * f20;
        float f35 = (f27 + f34 + f15) * f31;
        float f36 = f10 * f19;
        float f37 = 1.0f / ((f22 + f36) + f16);
        if ((Float.floatToRawIntBits(f37) & Integer.MAX_VALUE) >= 2139095040) {
            f37 = 0.0f;
        }
        float f38 = f3 * f19;
        float f39 = (f38 + f25 + f14) * f37;
        float f40 = f19 * f7;
        float f41 = (f28 + f40 + f15) * f37;
        float f42 = 1.0f / ((f36 + f30) + f16);
        float f43 = (Float.floatToRawIntBits(f42) & Integer.MAX_VALUE) < 2139095040 ? f42 : 0.0f;
        float f44 = (f38 + f32 + f14) * f43;
        float f45 = (f40 + f34 + f15) * f43;
        bVar.f21383a = Math.min(f26, Math.min(f33, Math.min(f39, f44)));
        bVar.f21384b = Math.min(f29, Math.min(f35, Math.min(f41, f45)));
        bVar.f21385c = Math.max(f26, Math.max(f33, Math.max(f39, f44)));
        bVar.f21386d = Math.max(f29, Math.max(f35, Math.max(f41, f45)));
    }

    public static final void d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f3 = fArr[0];
            float f7 = fArr2[0];
            float f10 = fArr[1];
            float f11 = fArr2[4];
            float f12 = fArr[2];
            float f13 = fArr2[8];
            float f14 = f12 * f13;
            float f15 = fArr[3];
            float f16 = fArr2[12];
            float f17 = f15 * f16;
            float f18 = f17 + f14 + (f10 * f11) + (f3 * f7);
            float f19 = fArr2[1];
            float f20 = fArr2[5];
            float f21 = fArr2[9];
            float f22 = f12 * f21;
            float f23 = fArr2[13];
            float f24 = f15 * f23;
            float f25 = f24 + f22 + (f10 * f20) + (f3 * f19);
            float f26 = fArr2[2];
            float f27 = fArr2[6];
            float f28 = fArr2[10];
            float f29 = f12 * f28;
            float f30 = fArr2[14];
            float f31 = f15 * f30;
            float f32 = f31 + f29 + (f10 * f27) + (f3 * f26);
            float f33 = fArr2[3];
            float f34 = fArr2[7];
            float f35 = fArr2[11];
            float f36 = f12 * f35;
            float f37 = fArr2[15];
            float f38 = f15 * f37;
            float f39 = f38 + f36 + (f10 * f34) + (f3 * f33);
            float f40 = fArr[4];
            float f41 = fArr[5];
            float f42 = fArr[6];
            float f43 = (f42 * f13) + (f41 * f11) + (f40 * f7);
            float f44 = fArr[7];
            float f45 = (f44 * f16) + f43;
            float f46 = (f44 * f23) + (f42 * f21) + (f41 * f20) + (f40 * f19);
            float f47 = (f44 * f30) + (f42 * f28) + (f41 * f27) + (f40 * f26);
            float f48 = f42 * f35;
            float f49 = f44 * f37;
            float f50 = f49 + f48 + (f41 * f34) + (f40 * f33);
            float f51 = fArr[8];
            float f52 = fArr[9];
            float f53 = fArr[10];
            float f54 = (f53 * f13) + (f52 * f11) + (f51 * f7);
            float f55 = fArr[11];
            float f56 = (f55 * f16) + f54;
            float f57 = (f55 * f23) + (f53 * f21) + (f52 * f20) + (f51 * f19);
            float f58 = (f55 * f30) + (f53 * f28) + (f52 * f27) + (f51 * f26);
            float f59 = f53 * f35;
            float f60 = f55 * f37;
            float f61 = f60 + f59 + (f52 * f34) + (f51 * f33);
            float f62 = fArr[12];
            float f63 = fArr[13];
            float f64 = (f11 * f63) + (f7 * f62);
            float f65 = fArr[14];
            float f66 = (f13 * f65) + f64;
            float f67 = fArr[15];
            float f68 = (f16 * f67) + f66;
            float f69 = f21 * f65;
            float f70 = f23 * f67;
            float f71 = f70 + f69 + (f20 * f63) + (f19 * f62);
            float f72 = f28 * f65;
            float f73 = f30 * f67;
            float f74 = f73 + f72 + (f27 * f63) + (f26 * f62);
            float f75 = f65 * f35;
            float f76 = f67 * f37;
            fArr[0] = f18;
            fArr[1] = f25;
            fArr[2] = f32;
            fArr[3] = f39;
            fArr[4] = f45;
            fArr[5] = f46;
            fArr[6] = f47;
            fArr[7] = f50;
            fArr[8] = f56;
            fArr[9] = f57;
            fArr[10] = f58;
            fArr[11] = f61;
            fArr[12] = f68;
            fArr[13] = f71;
            fArr[14] = f74;
            fArr[15] = f76 + f75 + (f63 * f34) + (f62 * f33);
        }
    }

    public static final void f(float[] fArr, float f3, float f7) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = (fArr[8] * 0.0f) + (fArr[4] * f7) + (fArr[0] * f3) + fArr[12];
        float f11 = (fArr[9] * 0.0f) + (fArr[5] * f7) + (fArr[1] * f3) + fArr[13];
        float f12 = (fArr[10] * 0.0f) + (fArr[6] * f7) + (fArr[2] * f3) + fArr[14];
        float f13 = (fArr[11] * 0.0f) + (fArr[7] * f7) + (fArr[3] * f3) + fArr[15];
        fArr[12] = f10;
        fArr[13] = f11;
        fArr[14] = f12;
        fArr[15] = f13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return j.a(this.f21769a, ((A) obj).f21769a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21769a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f21769a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return p.I0(sb.toString());
    }
}
