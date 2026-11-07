package p055f1;

import java.util.ArrayList;
import p086i1.a;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f15913b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f15914c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f15915d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15916a;

    public l(int i10) {
        this.f15916a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f15916a == ((l) obj).f15916a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15916a;
    }

    public final String toString() {
        int i10 = this.f15916a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + a.a(62, ", ", arrayList) + ']';
    }
}
