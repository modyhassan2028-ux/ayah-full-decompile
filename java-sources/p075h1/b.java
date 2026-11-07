package p075h1;

import p063g1.i;
import p204v.a;
import u.AbstractC1361p;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f16430a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile P f16431b = new P(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f16432c;

    static {
        Object[] objArr = new Object[0];
        f16432c = objArr;
        synchronized (objArr) {
            f16431b.f((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f16431b.f((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f16431b.f((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f16431b.f((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f16431b.f((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f16431b.e(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f3) {
        float fE;
        a cVar;
        float[] fArr = f16430a;
        if (f3 < 1.03f) {
            return null;
        }
        int i10 = (int) (f3 * 100.0f);
        a aVar = (a) f16431b.d(i10);
        if (aVar != null) {
            return aVar;
        }
        P p10 = f16431b;
        if (p10.f22704r) {
            AbstractC1361p.a(p10);
        }
        int iA = a.a(p10.f22707u, i10, p10.f22705s);
        if (iA >= 0) {
            return (a) f16431b.h(iA);
        }
        int i11 = -(iA + 1);
        int i12 = i11 - 1;
        if (i11 >= f16431b.g()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f3});
            b(f3, cVar2);
            return cVar2;
        }
        if (i12 < 0) {
            cVar = new c(fArr, fArr);
            fE = 1.0f;
        } else {
            fE = f16431b.e(i12) / 100.0f;
            cVar = (a) f16431b.h(i12);
        }
        float fE2 = f16431b.e(i11) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fE == fE2 ? 0.0f : (f3 - fE) / (fE2 - fE))) * 1.0f) + 0.0f;
        a aVar2 = (a) f16431b.h(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f7 = fArr[i13];
            float fB = cVar.b(f7);
            fArr2[i13] = ((aVar2.b(f7) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f3, cVar3);
        return cVar3;
    }

    public static void b(float f3, c cVar) {
        synchronized (f16432c) {
            P pClone = f16431b.clone();
            pClone.f((int) (f3 * 100.0f), cVar);
            f16431b = pClone;
        }
    }
}
