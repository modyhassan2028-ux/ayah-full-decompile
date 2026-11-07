package u;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f22757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22758b;

    public s(int i10) {
        this.f22757a = i10 == 0 ? AbstractC1357l.f22737a : new int[i10];
    }

    public final void a(int i10) {
        b(this.f22758b + 1);
        int[] iArr = this.f22757a;
        int i11 = this.f22758b;
        iArr[i11] = i10;
        this.f22758b = i11 + 1;
    }

    public final void b(int i10) {
        int[] iArr = this.f22757a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f22757a = iArrCopyOf;
        }
    }

    public final int c(int i10) {
        if (i10 >= 0 && i10 < this.f22758b) {
            return this.f22757a[i10];
        }
        p204v.a.d("Index must be between 0 and size");
        throw null;
    }

    public final int d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f22758b)) {
            p204v.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f22757a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            p120l9.l.W(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f22758b--;
        return i12;
    }

    public final void e(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f22758b) {
            p204v.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f22757a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            int i10 = sVar.f22758b;
            int i11 = this.f22758b;
            if (i10 == i11) {
                int[] iArr = this.f22757a;
                int[] iArr2 = sVar.f22757a;
                E9.d dVarI0 = B0.c.i0(0, i11);
                int i12 = dVarI0.f1995r;
                int i13 = dVarI0.f1996s;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f22757a;
        int i10 = this.f22758b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f22757a;
        int i10 = this.f22758b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                p251z9.j.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i12);
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        p251z9.j.d(string2, "toString(...)");
        return string2;
    }

    public /* synthetic */ s() {
        this(16);
    }
}
