package Z;

import W.C0557f1;
import java.util.ArrayList;

/* JADX INFO: renamed from: Z.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0685h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u.t f10680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p110k9.o f10681f;

    public C0685h0(int i10, ArrayList arrayList) {
        this.f10676a = arrayList;
        this.f10677b = i10;
        if (i10 < 0) {
            AbstractC0689j0.a("Invalid start index");
        }
        this.f10679d = new ArrayList();
        u.t tVar = new u.t();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            O o10 = (O) this.f10676a.get(i12);
            int i13 = o10.f10633c;
            int i14 = o10.f10634d;
            tVar.h(i13, new I(i12, i11, i14));
            i11 += i14;
        }
        this.f10680e = tVar;
        this.f10681f = p110k9.a.d(new C0557f1(6, this));
    }

    public final boolean a(int i10, int i11) {
        int i12;
        u.t tVar = this.f10680e;
        I i13 = (I) tVar.b(i10);
        if (i13 == null) {
            return false;
        }
        int i14 = i13.f10605b;
        int i15 = i11 - i13.f10606c;
        i13.f10606c = i11;
        if (i15 == 0) {
            return true;
        }
        Object[] objArr = tVar.f22733c;
        long[] jArr = tVar.f22731a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i16 = 0;
        while (true) {
            long j = jArr[i16];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8 - ((~(i16 - length)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((255 & j) < 128) {
                        I i19 = (I) objArr[(i16 << 3) + i18];
                        if (i19.f10605b >= i14 && !i19.equals(i13) && (i12 = i19.f10605b + i15) >= 0) {
                            i19.f10605b = i12;
                        }
                    }
                    j >>= 8;
                }
                if (i17 != 8) {
                    return true;
                }
            }
            if (i16 == length) {
                return true;
            }
            i16++;
        }
    }
}
