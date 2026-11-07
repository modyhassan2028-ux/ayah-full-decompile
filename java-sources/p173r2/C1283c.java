package p173r2;

import B9.a;
import F9.n;
import android.os.Bundle;
import java.util.Arrays;
import p120l9.l;
import p251z9.j;

/* JADX INFO: renamed from: r2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1283c extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21436e;

    public static float[] g(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] h(String str) {
        return new int[]{((Number) E.f21427a.d(str)).intValue()};
    }

    public static long[] i(String str) {
        return new long[]{((Number) E.f21428b.d(str)).longValue()};
    }

    public static boolean[] j(String str) {
        return new boolean[]{((Boolean) E.f21429c.d(str)).booleanValue()};
    }

    @Override // p173r2.E
    public final Object a(String str, Bundle bundle) {
        switch (this.f21436e) {
            case 0:
                j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || a.K(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                n.J(str);
                throw null;
            case 1:
                j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || a.K(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                n.J(str);
                throw null;
            case 2:
                j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || a.K(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                n.J(str);
                throw null;
            case 3:
                j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || a.K(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                n.J(str);
                throw null;
            default:
                j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || a.K(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                n.J(str);
                throw null;
        }
    }

    @Override // p173r2.E
    public final String b() {
        switch (this.f21436e) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // p173r2.E
    public final Object c(Object obj, String str) {
        switch (this.f21436e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return j(str);
                }
                boolean[] zArrJ = j(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrJ, 0, zArrCopyOf, length, 1);
                j.b(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return g(str);
                }
                float[] fArrG = g(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrG, 0, fArrCopyOf, length2, 1);
                j.b(fArrCopyOf);
                return fArrCopyOf;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return h(str);
                }
                int[] iArrH = h(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrH, 0, iArrCopyOf, length3, 1);
                j.b(iArrCopyOf);
                return iArrCopyOf;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return i(str);
                }
                long[] jArrI = i(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrI, 0, jArrCopyOf, length4, 1);
                j.b(jArrCopyOf);
                return jArrCopyOf;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                j.b(objArrCopyOf);
                return (String[]) objArrCopyOf;
        }
    }

    @Override // p173r2.E
    public final Object d(String str) {
        switch (this.f21436e) {
            case 0:
                return j(str);
            case 1:
                return g(str);
            case 2:
                return h(str);
            case 3:
                return i(str);
            default:
                return new String[]{str};
        }
    }

    @Override // p173r2.E
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f21436e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                j.e(str, "key");
                if (zArr == null) {
                    Y2.a.a0(str, bundle);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                float[] fArr = (float[]) obj;
                j.e(str, "key");
                if (fArr == null) {
                    Y2.a.a0(str, bundle);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 2:
                int[] iArr = (int[]) obj;
                j.e(str, "key");
                if (iArr == null) {
                    Y2.a.a0(str, bundle);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 3:
                long[] jArr = (long[]) obj;
                j.e(str, "key");
                if (jArr == null) {
                    Y2.a.a0(str, bundle);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                j.e(str, "key");
                if (strArr == null) {
                    Y2.a.a0(str, bundle);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
        }
    }

    @Override // p173r2.E
    public final boolean f(Object obj, Object obj2) {
        Float[] fArr;
        Long[] lArr;
        switch (this.f21436e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                return l.U(zArr != null ? l.q0(zArr) : null, zArr2 != null ? l.q0(zArr2) : null);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length = fArr2.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        fArr[i10] = Float.valueOf(fArr2[i10]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length2 = fArr3.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        fArr4[i11] = Float.valueOf(fArr3[i11]);
                    }
                }
                return l.U(fArr, fArr4);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                return l.U(iArr != null ? l.r0(iArr) : null, iArr2 != null ? l.r0(iArr2) : null);
            case 3:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length3 = jArr.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        lArr[i12] = Long.valueOf(jArr[i12]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length4 = jArr2.length;
                    for (int i13 = 0; i13 < length4; i13++) {
                        lArr2[i13] = Long.valueOf(jArr2[i13]);
                    }
                }
                return l.U(lArr, lArr2);
            default:
                return l.U((String[]) obj, (String[]) obj2);
        }
    }
}
