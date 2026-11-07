package U0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: U0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0515g f8088a = new C0515g("");

    public static final List a(C0515g c0515g, int i10, int i11, C0516h c0516h) {
        List list;
        if (i10 == i11 || (list = c0515g.f8059r) == null) {
            return null;
        }
        if (i10 != 0 || i11 < c0515g.f8060s.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0513e c0513e = (C0513e) list.get(i12);
                if ((c0516h != null ? ((Boolean) c0516h.e(c0513e.f8054a)).booleanValue() : true) && b(i10, i11, c0513e.f8055b, c0513e.f8056c)) {
                    arrayList.add(new C0513e((InterfaceC0510b) c0513e.f8054a, B0.c.l(c0513e.f8055b, i10, i11) - i10, B0.c.l(c0513e.f8056c, i10, i11) - i10, c0513e.f8057d));
                }
            }
            return arrayList;
        }
        if (c0516h == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = list.get(i13);
            if (((Boolean) c0516h.e(((C0513e) obj).f8054a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
