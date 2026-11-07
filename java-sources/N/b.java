package N;

import U0.L;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p063g1.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f5888h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5894f;
    public final Object g;

    public b(m mVar, L l10, p063g1.d dVar, Y0.d dVar2) {
        this.f5891c = mVar;
        this.f5892d = l10;
        this.f5894f = dVar;
        this.g = dVar2;
        this.f5893e = B0.c.a0(l10, mVar);
        this.f5889a = Float.NaN;
        this.f5890b = Float.NaN;
    }

    public static float[] e(float f3, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            p222w7.h hVar = (p222w7.h) arrayList.get(i11);
            p222w7.h hVar2 = (p222w7.h) arrayList.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? hVar2.b().f23776a - hVar.b().f23776a : hVar.d().f23776a - hVar2.d().f23776a) / f3);
            i10++;
        }
        return fArr;
    }

    public static p222w7.h f(p222w7.h hVar, int i10, int i11, float f3, int i12, int i13, float f7) {
        ArrayList arrayList = new ArrayList(hVar.f23784b);
        arrayList.add(i11, (p222w7.g) arrayList.remove(i10));
        p222w7.f fVar = new p222w7.f(hVar.f23783a, f7);
        float f10 = f3;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            p222w7.g gVar = (p222w7.g) arrayList.get(i14);
            float f11 = gVar.f23779d;
            fVar.b((f11 / 2.0f) + f10, gVar.f23778c, f11, i14 >= i12 && i14 <= i13, gVar.f23780e, gVar.f23781f, 0.0f, 0.0f);
            f10 += gVar.f23779d;
            i14++;
        }
        return fVar.d();
    }

    public static p222w7.h g(p222w7.h hVar, float f3, float f7, boolean z10, float f10) {
        int i10;
        List list = hVar.f23784b;
        ArrayList arrayList = new ArrayList(list);
        float f11 = hVar.f23783a;
        p222w7.f fVar = new p222w7.f(f11, f7);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((p222w7.g) it.next()).f23780e) {
                i11++;
            }
        }
        float size = f3 / (list.size() - i11);
        float f12 = z10 ? f3 : 0.0f;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            p222w7.g gVar = (p222w7.g) arrayList.get(i12);
            if (gVar.f23780e) {
                i10 = i12;
                fVar.b(gVar.f23777b, gVar.f23778c, gVar.f23779d, false, true, gVar.f23781f, 0.0f, 0.0f);
            } else {
                i10 = i12;
                boolean z11 = i10 >= hVar.f23785c && i10 <= hVar.f23786d;
                float f13 = gVar.f23779d - size;
                float fA = p222w7.j.a(f13, f11, f10);
                float f14 = (f13 / 2.0f) + f12;
                float f15 = f14 - gVar.f23777b;
                float f16 = gVar.f23781f;
                float f17 = f15;
                if (!z10) {
                    f15 = 0.0f;
                }
                if (z10) {
                    f17 = 0.0f;
                }
                fVar.b(f14, fA, f13, z11, false, f16, f15, f17);
                f12 += f13;
            }
            i12 = i10 + 1;
        }
        return fVar.d();
    }

    public long a(long j, int i10) {
        int i11;
        p063g1.d dVar = (p063g1.d) this.f5894f;
        float f3 = this.f5890b;
        float fB = this.f5889a;
        if (Float.isNaN(f3) || Float.isNaN(fB)) {
            float fB2 = p050e8.b.b(c.f5895a, (L) this.f5893e, p063g1.b.b(0, 0, 15), dVar, (Y0.d) this.g, 1, 96).b();
            fB = p050e8.b.b(c.f5896b, (L) this.f5893e, p063g1.b.b(0, 0, 15), dVar, (Y0.d) this.g, 2, 96).b() - fB2;
            this.f5890b = fB2;
            this.f5889a = fB;
            f3 = fB2;
        }
        if (i10 != 1) {
            int iRound = Math.round((fB * (i10 - 1)) + f3);
            i11 = iRound >= 0 ? iRound : 0;
            int iG = p063g1.a.g(j);
            if (i11 > iG) {
                i11 = iG;
            }
        } else {
            i11 = p063g1.a.i(j);
        }
        return p063g1.b.a(p063g1.a.j(j), p063g1.a.h(j), i11, p063g1.a.g(j));
    }

    public p222w7.h b() {
        List list = (List) this.f5893e;
        return (p222w7.h) list.get(list.size() - 1);
    }

    public p222w7.h c(float f3, float f7, float f10) {
        float fB;
        List list;
        float[] fArr;
        float[] fArr2;
        float f11 = this.f5889a;
        float f12 = f7 + f11;
        float f13 = this.f5890b;
        float f14 = f10 - f13;
        float f15 = d().a().g;
        float f16 = b().c().f23782h;
        if (f11 == f15) {
            f12 += f15;
        }
        if (f13 == f16) {
            f14 -= f16;
        }
        if (f3 < f12) {
            fB = p137n7.a.b(1.0f, 0.0f, f7, f12, f3);
            list = (List) this.f5892d;
            fArr = (float[]) this.f5894f;
        } else {
            if (f3 <= f14) {
                return (p222w7.h) this.f5891c;
            }
            fB = p137n7.a.b(0.0f, 1.0f, f14, f10, f3);
            list = (List) this.f5893e;
            fArr = (float[]) this.g;
        }
        int size = list.size();
        float f17 = fArr[0];
        int i10 = 1;
        while (true) {
            if (i10 >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f18 = fArr[i10];
            if (fB <= f18) {
                fArr2 = new float[]{p137n7.a.b(0.0f, 1.0f, f17, f18, fB), i10 - 1, i10};
                break;
            }
            i10++;
            f17 = f18;
        }
        p222w7.h hVar = (p222w7.h) list.get((int) fArr2[1]);
        p222w7.h hVar2 = (p222w7.h) list.get((int) fArr2[2]);
        float f19 = fArr2[0];
        float f20 = hVar.f23783a;
        List list2 = hVar.f23784b;
        if (f20 != hVar2.f23783a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list3 = hVar2.f23784b;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list2.size(); i11++) {
            p222w7.g gVar = (p222w7.g) list2.get(i11);
            p222w7.g gVar2 = (p222w7.g) list3.get(i11);
            arrayList.add(new p222w7.g(p137n7.a.a(gVar.f23776a, gVar2.f23776a, f19), p137n7.a.a(gVar.f23777b, gVar2.f23777b, f19), p137n7.a.a(gVar.f23778c, gVar2.f23778c, f19), p137n7.a.a(gVar.f23779d, gVar2.f23779d, f19), false, 0.0f, 0.0f, 0.0f));
        }
        return new p222w7.h(hVar.f23783a, arrayList, p137n7.a.c(hVar.f23785c, f19, hVar2.f23785c), p137n7.a.c(hVar.f23786d, f19, hVar2.f23786d));
    }

    public p222w7.h d() {
        List list = (List) this.f5892d;
        return (p222w7.h) list.get(list.size() - 1);
    }

    public b(p222w7.h hVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f5891c = hVar;
        this.f5892d = DesugarCollections.unmodifiableList(arrayList);
        this.f5893e = DesugarCollections.unmodifiableList(arrayList2);
        float f3 = ((p222w7.h) p123m2.c.q(1, arrayList)).b().f23776a - hVar.b().f23776a;
        this.f5889a = f3;
        float f7 = hVar.d().f23776a - ((p222w7.h) p123m2.c.q(1, arrayList2)).d().f23776a;
        this.f5890b = f7;
        this.f5894f = e(f3, arrayList, true);
        this.g = e(f7, arrayList2, false);
    }
}
