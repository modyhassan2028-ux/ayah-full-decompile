package p223x;

import Da.r;
import java.util.Arrays;
import p120l9.l;
import p204v.a;
import p251z9.j;
import u.s;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC1432v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f23854a;

    public H(r rVar) {
        this.f23854a = rVar;
    }

    @Override // p223x.InterfaceC1432v, p223x.InterfaceC1421j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final D0 a(v0 v0Var) {
        int[] iArr;
        Object[] objArr;
        r rVar = this.f23854a;
        t tVar = (t) rVar.f1388t;
        s sVar = new s(tVar.f22735e + 2);
        t tVar2 = new t(tVar.f22735e);
        int[] iArr2 = tVar.f22732b;
        Object[] objArr2 = tVar.f22733c;
        long[] jArr = tVar.f22731a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr2[i14];
                            G g = (G) objArr2[i14];
                            sVar.a(i15);
                            tVar2.h(i15, new C0((AbstractC1427p) v0Var.f24111a.e(g.f23852a), g.f23853b));
                        }
                        j >>= i11;
                        i13++;
                        iArr2 = iArr2;
                        i11 = i11;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!tVar.a(0)) {
            int i16 = sVar.f22758b;
            if (i16 < 0) {
                a.d("Index must be between 0 and size");
                throw null;
            }
            sVar.b(i16 + 1);
            int[] iArr3 = sVar.f22757a;
            int i17 = sVar.f22758b;
            if (i17 != 0) {
                l.W(1, 0, i17, iArr3, iArr3);
            }
            iArr3[0] = 0;
            sVar.f22758b++;
        }
        if (!tVar.a(rVar.f1387s)) {
            sVar.a(rVar.f1387s);
        }
        int i18 = sVar.f22758b;
        if (i18 != 0) {
            int[] iArr4 = sVar.f22757a;
            j.e(iArr4, "<this>");
            Arrays.sort(iArr4, 0, i18);
        }
        return new D0(sVar, tVar2, rVar.f1387s, AbstractC1434x.f24124d);
    }
}
