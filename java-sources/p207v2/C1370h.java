package p207v2;

import java.util.ArrayList;
import p120l9.d;
import p123m2.c;

/* JADX INFO: renamed from: v2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1370h extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f23241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f23242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f23243t;

    public C1370h(ArrayList arrayList, int i10, int i11) {
        this.f23241r = i10;
        this.f23242s = i11;
        this.f23243t = arrayList;
    }

    @Override // p120l9.a
    public final int b() {
        return this.f23243t.size() + this.f23241r + this.f23242s;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f23241r;
        if (i10 >= 0 && i10 < i11) {
            return null;
        }
        ArrayList arrayList = this.f23243t;
        if (i10 < arrayList.size() + i11 && i11 <= i10) {
            return arrayList.get(i10 - i11);
        }
        int size = arrayList.size() + i11;
        if (i10 < b() && size <= i10) {
            return null;
        }
        StringBuilder sbW = c.w(i10, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        sbW.append(b());
        throw new IndexOutOfBoundsException(sbW.toString());
    }
}
