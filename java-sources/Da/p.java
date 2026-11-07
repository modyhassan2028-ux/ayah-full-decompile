package Da;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p120l9.d implements RandomAccess {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k[] f1378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f1379s;

    public p(k[] kVarArr, int[] iArr) {
        this.f1378r = kVarArr;
        this.f1379s = iArr;
    }

    @Override // p120l9.a
    public final int b() {
        return this.f1378r.length;
    }

    @Override // p120l9.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return super.contains((k) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f1378r[i10];
    }

    @Override // p120l9.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return super.indexOf((k) obj);
        }
        return -1;
    }

    @Override // p120l9.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return super.lastIndexOf((k) obj);
        }
        return -1;
    }
}
