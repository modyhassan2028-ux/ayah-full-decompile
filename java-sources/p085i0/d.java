package p085i0;

import java.util.Map;
import p241y9.e;
import p251z9.k;
import u.E;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f16712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f16713t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16714r;

    static {
        int i10 = 2;
        f16712s = new d(i10, 0);
        f16713t = new d(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f16714r = i11;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006c A[LOOP:0: B:9:0x0025->B:22:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[SYNTHETIC] */
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16714r) {
            case 0:
                g gVar = (g) obj2;
                Map map = gVar.f16721a;
                E e10 = gVar.f16722b;
                Object[] objArr = e10.f22670b;
                Object[] objArr2 = e10.f22671c;
                long[] jArr = e10.f22669a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj3 = objArr[i13];
                                    Map mapC = ((j) objArr2[i13]).c();
                                    if (mapC.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapC);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            default:
                return obj2;
        }
    }
}
