package p120l9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p017b7.g;
import p110k9.q;
import p110k9.s;
import p110k9.u;
import p110k9.x;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends B1 {
    public static List S(Object[] objArr) {
        j.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        j.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean T(Object obj, Object[] objArr) {
        j.e(objArr, "<this>");
        return l0(obj, objArr) >= 0;
    }

    public static boolean U(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!U((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof q) && (obj2 instanceof q)) {
                    byte[] bArr = ((q) obj).f19087r;
                    byte[] bArr2 = ((q) obj2).f19087r;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof x) && (obj2 instanceof x)) {
                    short[] sArr = ((x) obj).f19094r;
                    short[] sArr2 = ((x) obj2).f19094r;
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof s) && (obj2 instanceof s)) {
                    int[] iArr = ((s) obj).f19089r;
                    int[] iArr2 = ((s) obj2).f19089r;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof u) && (obj2 instanceof u)) {
                    long[] jArr = ((u) obj).f19091r;
                    long[] jArr2 = ((u) obj2).f19091r;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void V(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        j.e(bArr, "<this>");
        j.e(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void W(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        j.e(iArr, "<this>");
        j.e(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void X(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        j.e(objArr, "<this>");
        j.e(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static void Y(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        j.e(cArr, "<this>");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
    }

    public static void Z(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        j.e(jArr, "<this>");
        j.e(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void a0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        W(i10, 0, i11, iArr, iArr2);
    }

    public static /* synthetic */ void b0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        int i13 = (i12 & 2) != 0 ? 0 : 1;
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        X(i13, i10, i11, objArr, objArr2);
    }

    public static byte[] c0(byte[] bArr, int i10, int i11) {
        j.e(bArr, "<this>");
        B1.t(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        j.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] d0(Object[] objArr, int i10, int i11) {
        j.e(objArr, "<this>");
        B1.t(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        j.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void e0(int i10, int i11, Object obj, Object[] objArr) {
        j.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static void f0(int[] iArr, int i10) {
        int length = iArr.length;
        j.e(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i10);
    }

    public static void g0(long[] jArr, long j) {
        int length = jArr.length;
        j.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList i0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int j0(long[] jArr) {
        j.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Object k0(int i10, Object[] objArr) {
        j.e(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static int l0(Object obj, Object[] objArr) {
        j.e(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void m0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, F9.j jVar) {
        j.e(objArr, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            g.I(sb, obj, jVar);
        }
        sb.append(charSequence3);
    }

    public static String n0(String str, Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        m0(objArr, sb, str, "", "", "...", null);
        return sb.toString();
    }

    public static List o0(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new j(objArr, false)) : AbstractC0813f2.K(objArr[0]);
        }
        return r.f19440r;
    }

    public static Set p0(Object[] objArr) {
        j.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return t.f19442r;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            j.d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.g0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static Boolean[] q0(boolean[] zArr) {
        j.e(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Integer[] r0(int[] iArr) {
        j.e(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }
}
