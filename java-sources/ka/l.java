package ka;

import Z0.B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable, A9.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f19177s = new l(new String[0]);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String[] f19178r;

    public l(String[] strArr) {
        p251z9.j.e(strArr, "namesAndValues");
        this.f19178r = strArr;
    }

    public final String b(String str) {
        String[] strArr = this.f19178r;
        p251z9.j.e(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int iC = p186s9.b.c(length, 0, -2);
        if (iC > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iC) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i10) {
        String str = (String) p120l9.l.k0(i10 * 2, this.f19178r);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public final B d() {
        B b5 = new B(17);
        ArrayList arrayList = (ArrayList) b5.f10875s;
        p251z9.j.e(arrayList, "<this>");
        String[] strArr = this.f19178r;
        p251z9.j.e(strArr, "elements");
        arrayList.addAll(p120l9.l.S(strArr));
        return b5;
    }

    public final String e(int i10) {
        String str = (String) p120l9.l.k0((i10 * 2) + 1, this.f19178r);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f19178r, ((l) obj).f19178r);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19178r);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        p110k9.j[] jVarArr = new p110k9.j[size];
        for (int i10 = 0; i10 < size; i10++) {
            jVarArr[i10] = new p110k9.j(c(i10), e(i10));
        }
        return p251z9.j.h(jVarArr);
    }

    public final int size() {
        return this.f19178r.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strC = c(i10);
            String strE = e(i10);
            sb.append(strC);
            sb.append(": ");
            if (la.c.i(strC)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append("\n");
        }
        return sb.toString();
    }
}
