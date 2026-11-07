package G;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cloneable f2674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2675e;

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.lang.Cloneable] */
    public int a(long j) {
        int i10 = this.f2671a + 1;
        long[] jArr = (long[]) this.f2673c;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            ?? r10 = new int[i11];
            p120l9.l.Z(jArr, jArr2, 0, 0, jArr.length);
            p120l9.l.a0(0, 0, 14, (int[]) this.f2674d, r10);
            this.f2673c = jArr2;
            this.f2674d = r10;
        }
        int i12 = this.f2671a;
        this.f2671a = i12 + 1;
        int length2 = ((int[]) this.f2675e).length;
        if (this.f2672b >= length2) {
            int i13 = length2 * 2;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr[i14] = i15;
                i14 = i15;
            }
            p120l9.l.a0(0, 0, 14, (int[]) this.f2675e, iArr);
            this.f2675e = iArr;
        }
        int i16 = this.f2672b;
        int[] iArr2 = (int[]) this.f2675e;
        this.f2672b = iArr2[i16];
        long[] jArr3 = (long[]) this.f2673c;
        jArr3[i12] = j;
        ((int[]) this.f2674d)[i12] = i16;
        iArr2[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (jArr3[i17] <= j) {
                break;
            }
            c(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public void b(Context context, XmlResourceParser xmlResourceParser) {
        s1.l lVar = new s1.l();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i10))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i10);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                lVar.i(context, xmlResourceParser);
                ((SparseArray) this.f2675e).put(identifier, lVar);
                return;
            }
        }
    }

    public void c(int i10, int i11) {
        long[] jArr = (long[]) this.f2673c;
        int[] iArr = (int[]) this.f2674d;
        int[] iArr2 = (int[]) this.f2675e;
        long j = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }

    public void d(float f3, float f7, int i10) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f2673c;
        SparseArray sparseArray = (SparseArray) this.f2674d;
        int i11 = this.f2671a;
        int i12 = 0;
        if (i11 == i10) {
            s1.e eVar = i10 == -1 ? (s1.e) sparseArray.valueAt(0) : (s1.e) sparseArray.get(i11);
            int i13 = this.f2672b;
            if (i13 == -1 || !((s1.f) eVar.f21924b.get(i13)).a(f3, f7)) {
                ArrayList arrayList = eVar.f21924b;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    } else if (((s1.f) arrayList.get(i12)).a(f3, f7)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                ArrayList arrayList2 = eVar.f21924b;
                if (this.f2672b == i12) {
                    return;
                }
                s1.l lVar = i12 == -1 ? null : ((s1.f) arrayList2.get(i12)).f21932f;
                if (i12 != -1) {
                    int i14 = ((s1.f) arrayList2.get(i12)).f21931e;
                }
                if (lVar == null) {
                    return;
                }
                this.f2672b = i12;
                lVar.b(constraintLayout);
                return;
            }
            return;
        }
        this.f2671a = i10;
        s1.e eVar2 = (s1.e) sparseArray.get(i10);
        ArrayList arrayList3 = eVar2.f21924b;
        while (true) {
            if (i12 >= arrayList3.size()) {
                i12 = -1;
                break;
            } else if (((s1.f) arrayList3.get(i12)).a(f3, f7)) {
                break;
            } else {
                i12++;
            }
        }
        ArrayList arrayList4 = eVar2.f21924b;
        s1.l lVar2 = i12 == -1 ? eVar2.f21926d : ((s1.f) arrayList4.get(i12)).f21932f;
        if (i12 != -1) {
            int i15 = ((s1.f) arrayList4.get(i12)).f21931e;
        }
        if (lVar2 != null) {
            this.f2672b = i12;
            lVar2.b(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f3 + ", " + f7);
    }
}
