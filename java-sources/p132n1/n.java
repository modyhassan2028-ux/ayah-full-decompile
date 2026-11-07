package p132n1;

import E2.C0140p;
import J0.C0280d0;
import Y2.a;
import android.support.v4.media.session.p;
import android.util.SparseArray;
import android.view.View;
import io.realm.RealmFieldTypeConstants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import m1.b;
import m1.e;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f19895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19896b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a[] f19901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f19902i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f19905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double[] f19906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double[] f19907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f19908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f19909q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashMap f19914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap f19915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f19916x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19897c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f19898d = new w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f19899e = new w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f19900f = new m();
    public final m g = new m();
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19903k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19904l = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f19910r = new float[4];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f19911s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f19912t = new float[1];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f19913u = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19917y = -1;

    public n(View view) {
        this.f19895a = view;
        this.f19896b = view.getId();
        view.getLayoutParams();
    }

    public final float a(float f3, float[] fArr) {
        float f7 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f10 = this.f19904l;
            if (f10 != 1.0d) {
                float f11 = this.f19903k;
                if (f3 < f11) {
                    f3 = 0.0f;
                }
                if (f3 > f11 && f3 < 1.0d) {
                    f3 = (f3 - f11) * f10;
                }
            }
        }
        e eVar = this.f19898d.f19952r;
        ArrayList arrayList = this.f19911s;
        int size = arrayList.size();
        float f12 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            e eVar2 = wVar.f19952r;
            if (eVar2 != null) {
                float f13 = wVar.f19954t;
                if (f13 < f3) {
                    eVar = eVar2;
                    f7 = f13;
                } else if (Float.isNaN(f12)) {
                    f12 = wVar.f19954t;
                }
            }
        }
        if (eVar != null) {
            float f14 = (Float.isNaN(f12) ? 1.0f : f12) - f7;
            double d5 = (f3 - f7) / f14;
            f3 = (((float) eVar.a(d5)) * f14) + f7;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d5);
            }
        }
        return f3;
    }

    public final void b(float f3, float f7, float f10, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f19912t;
        float fA = a(f3, fArr2);
        a[] aVarArr = this.f19901h;
        w wVar = this.f19898d;
        int i10 = 0;
        if (aVarArr == null) {
            w wVar2 = this.f19899e;
            float f11 = wVar2.f19956v - wVar.f19956v;
            float f12 = wVar2.f19957w - wVar.f19957w;
            float f13 = wVar2.f19958x - wVar.f19958x;
            float f14 = (wVar2.f19959y - wVar.f19959y) + f12;
            fArr[0] = ((f13 + f11) * f7) + ((1.0f - f7) * f11);
            fArr[1] = (f14 * f10) + ((1.0f - f10) * f12);
            return;
        }
        double d5 = fA;
        aVarArr[0].N(d5, this.f19907o);
        this.f19901h[0].J(d5, this.f19906n);
        float f15 = fArr2[0];
        while (true) {
            dArr = this.f19907o;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f15);
            i10++;
        }
        b bVar = this.f19902i;
        if (bVar == null) {
            int[] iArr = this.f19905m;
            double[] dArr2 = this.f19906n;
            wVar.getClass();
            w.d(f7, f10, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f19906n;
        if (dArr3.length > 0) {
            bVar.J(d5, dArr3);
            this.f19902i.N(d5, this.f19907o);
            int[] iArr2 = this.f19905m;
            double[] dArr4 = this.f19907o;
            double[] dArr5 = this.f19906n;
            wVar.getClass();
            w.d(f7, f10, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final boolean c(float f3, long j, View view, s sVar) {
        boolean zB;
        I i10;
        float f7;
        I i11 = null;
        float fA = a(f3, null);
        HashMap map = this.f19915w;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((F) it.next()).c(view, fA);
            }
        }
        HashMap map2 = this.f19914v;
        if (map2 != null) {
            I i12 = null;
            zB = false;
            for (K k7 : map2.values()) {
                if (k7 instanceof I) {
                    i12 = (I) k7;
                } else {
                    zB |= k7.b(fA, j, view, sVar);
                }
            }
            i11 = i12;
        } else {
            zB = false;
        }
        a[] aVarArr = this.f19901h;
        w wVar = this.f19898d;
        if (aVarArr != null) {
            double d5 = fA;
            aVarArr[0].J(d5, this.f19906n);
            this.f19901h[0].N(d5, this.f19907o);
            b bVar = this.f19902i;
            if (bVar != null) {
                double[] dArr = this.f19906n;
                if (dArr.length > 0) {
                    bVar.J(d5, dArr);
                    this.f19902i.N(d5, this.f19907o);
                }
            }
            int[] iArr = this.f19905m;
            double[] dArr2 = this.f19906n;
            double[] dArr3 = this.f19907o;
            float f10 = wVar.f19956v;
            float f11 = wVar.f19957w;
            float f12 = wVar.f19958x;
            float f13 = wVar.f19959y;
            int i13 = 1;
            if (iArr.length != 0) {
                i10 = i11;
                if (wVar.f19950C.length <= iArr[iArr.length - 1]) {
                    int i14 = iArr[iArr.length - 1] + 1;
                    wVar.f19950C = new double[i14];
                    wVar.f19951D = new double[i14];
                }
            } else {
                i10 = i11;
            }
            float f14 = f12;
            Arrays.fill(wVar.f19950C, Double.NaN);
            for (int i15 = 0; i15 < iArr.length; i15++) {
                double[] dArr4 = wVar.f19950C;
                int i16 = iArr[i15];
                dArr4[i16] = dArr2[i15];
                wVar.f19951D[i16] = dArr3[i15];
            }
            int i17 = 0;
            float f15 = f13;
            float f16 = Float.NaN;
            float f17 = 0.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            float f20 = 0.0f;
            while (true) {
                double[] dArr5 = wVar.f19950C;
                if (i17 >= dArr5.length) {
                    break;
                }
                if (Double.isNaN(dArr5[i17])) {
                    f7 = f15;
                } else {
                    f7 = f15;
                    float f21 = (float) (Double.isNaN(wVar.f19950C[i17]) ? 0.0d : wVar.f19950C[i17] + 0.0d);
                    float f22 = (float) wVar.f19951D[i17];
                    if (i17 == i13) {
                        f17 = f22;
                        f10 = f21;
                    } else if (i17 == 2) {
                        f19 = f22;
                        f11 = f21;
                    } else if (i17 != 3) {
                        if (i17 == 4) {
                            f20 = f22;
                            f15 = f21;
                        } else if (i17 == 5) {
                            f15 = f7;
                            f16 = f21;
                        }
                        i17++;
                        i13 = 1;
                    } else {
                        f18 = f22;
                        f14 = f21;
                    }
                }
                f15 = f7;
                i17++;
                i13 = 1;
            }
            float f23 = f15;
            if (!Float.isNaN(f16)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2((f20 / 2.0f) + f19, (f18 / 2.0f) + f17)) + ((double) f16) + ((double) (Float.isNaN(Float.NaN) ? 0.0f : Float.NaN))));
            } else if (!Float.isNaN(Float.NaN)) {
                view.setRotation(Float.NaN);
            }
            float f24 = f10 + 0.5f;
            int i18 = (int) f24;
            float f25 = f11 + 0.5f;
            int i19 = (int) f25;
            int i20 = (int) (f24 + f14);
            int i21 = (int) (f25 + f23);
            int i22 = i20 - i18;
            int i23 = i21 - i19;
            if (i22 != view.getMeasuredWidth() || i23 != view.getMeasuredHeight()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i22, 1073741824), View.MeasureSpec.makeMeasureSpec(i23, 1073741824));
            }
            view.layout(i18, i19, i20, i21);
            HashMap map3 = this.f19915w;
            if (map3 != null) {
                for (F f26 : map3.values()) {
                    if (f26 instanceof D) {
                        double[] dArr6 = this.f19907o;
                        view.setRotation(((D) f26).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                    }
                }
            }
            if (i10 != null) {
                double[] dArr7 = this.f19907o;
                double d9 = dArr7[0];
                double d10 = dArr7[1];
                I i24 = i10;
                view.setRotation(i24.a(fA, j, view, sVar) + ((float) Math.toDegrees(Math.atan2(d10, d9))));
                zB |= i24.f19846d;
            }
            int i25 = 1;
            while (true) {
                a[] aVarArr2 = this.f19901h;
                if (i25 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i25];
                float[] fArr = this.f19910r;
                aVar.K(d5, fArr);
                ((s1.a) wVar.f19949B.get(this.f19908p[i25 - 1])).g(view, fArr);
                i25++;
            }
            m mVar = this.f19900f;
            if (mVar.f19887s == 0) {
                if (fA <= 0.0f) {
                    view.setVisibility(mVar.f19888t);
                } else {
                    m mVar2 = this.g;
                    if (fA >= 1.0f) {
                        view.setVisibility(mVar2.f19888t);
                    } else if (mVar2.f19888t != mVar.f19888t) {
                        view.setVisibility(0);
                    }
                }
            }
        } else {
            boolean z10 = zB;
            float f27 = wVar.f19956v;
            w wVar2 = this.f19899e;
            float fN = p.n(wVar2.f19956v, f27, fA, f27);
            float f28 = wVar.f19957w;
            float fN2 = p.n(wVar2.f19957w, f28, fA, f28);
            float f29 = wVar.f19958x;
            float f30 = wVar2.f19958x;
            float fN3 = p.n(f30, f29, fA, f29);
            float f31 = wVar.f19959y;
            float f32 = wVar2.f19959y;
            float f33 = fN + 0.5f;
            int i26 = (int) f33;
            float f34 = fN2 + 0.5f;
            int i27 = (int) f34;
            int i28 = (int) (f33 + fN3);
            int iN = (int) (f34 + p.n(f32, f31, fA, f31));
            int i29 = i28 - i26;
            int i30 = iN - i27;
            if (f30 != f29 || f32 != f31) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
            }
            view.layout(i26, i27, i28, iN);
            zB = z10;
        }
        HashMap map4 = this.f19916x;
        if (map4 != null) {
            for (AbstractC1222h abstractC1222h : map4.values()) {
                if (abstractC1222h instanceof C1220f) {
                    double[] dArr8 = this.f19907o;
                    view.setRotation(((C1220f) abstractC1222h).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    abstractC1222h.c(view, fA);
                }
            }
        }
        return zB;
    }

    public final void d(w wVar) {
        float x9 = (int) this.f19895a.getX();
        float y10 = (int) this.f19895a.getY();
        float width = this.f19895a.getWidth();
        float height = this.f19895a.getHeight();
        wVar.f19956v = x9;
        wVar.f19957w = y10;
        wVar.f19958x = width;
        wVar.f19959y = height;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:206:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:272:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:274:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:398:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:440:0x09ab A[PHI: r5 r6
      0x09ab: PHI (r5v25 java.lang.String) = (r5v22 java.lang.String), (r5v26 java.lang.String) binds: [B:439:0x09a9, B:435:0x0991] A[DONT_GENERATE, DONT_INLINE]
      0x09ab: PHI (r6v22 java.lang.String) = (r6v19 java.lang.String), (r6v23 java.lang.String) binds: [B:439:0x09a9, B:435:0x0991] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:477:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:578:0x0ab5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:255:0x0453. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void e(long j) {
        ArrayList arrayList;
        String str;
        n nVar;
        ArrayList arrayList2;
        Object obj;
        Class cls;
        int i10;
        Object obj2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte b5;
        byte b10;
        C1218d c1218d;
        AbstractC1222h c1218d2;
        AbstractC1222h c1218d3;
        HashSet hashSet;
        Iterator it;
        K g;
        H h7;
        K k7;
        ArrayList arrayList3;
        String str7;
        int i11;
        F b11;
        C c10;
        n nVar2 = this;
        new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashMap map = new HashMap();
        int i12 = nVar2.f19917y;
        w wVar = nVar2.f19898d;
        if (i12 != -1) {
            wVar.f19948A = i12;
        }
        m mVar = nVar2.f19900f;
        float f3 = mVar.f19886r;
        m mVar2 = nVar2.g;
        if (m.b(f3, mVar2.f19886r)) {
            hashSet3.add("alpha");
        }
        if (m.b(mVar.f19889u, mVar2.f19889u)) {
            hashSet3.add("elevation");
        }
        int i13 = mVar.f19888t;
        int i14 = mVar2.f19888t;
        if (i13 != i14 && mVar.f19887s == 0 && (i13 == 0 || i14 == 0)) {
            hashSet3.add("alpha");
        }
        if (m.b(mVar.f19890v, mVar2.f19890v)) {
            hashSet3.add("rotation");
        }
        if (!Float.isNaN(mVar.f19883F) || !Float.isNaN(mVar2.f19883F)) {
            hashSet3.add("transitionPathRotate");
        }
        String str8 = "progress";
        if (!Float.isNaN(mVar.f19884G) || !Float.isNaN(mVar2.f19884G)) {
            hashSet3.add("progress");
        }
        if (m.b(mVar.f19891w, mVar2.f19891w)) {
            hashSet3.add("rotationX");
        }
        String str9 = "rotationY";
        if (m.b(mVar.f19892x, mVar2.f19892x)) {
            hashSet3.add("rotationY");
        }
        if (m.b(mVar.f19878A, mVar2.f19878A)) {
            hashSet3.add("transformPivotX");
        }
        if (m.b(mVar.f19879B, mVar2.f19879B)) {
            hashSet3.add("transformPivotY");
        }
        String str10 = "scaleX";
        if (m.b(mVar.f19893y, mVar2.f19893y)) {
            hashSet3.add("scaleX");
        }
        if (m.b(mVar.f19894z, mVar2.f19894z)) {
            hashSet3.add("scaleY");
        }
        w wVar2 = wVar;
        String str11 = "translationX";
        if (m.b(mVar.f19880C, mVar2.f19880C)) {
            hashSet3.add("translationX");
        }
        HashMap map2 = map;
        String str12 = "translationY";
        if (m.b(mVar.f19881D, mVar2.f19881D)) {
            hashSet3.add("translationY");
        }
        if (m.b(mVar.f19882E, mVar2.f19882E)) {
            hashSet3.add("translationZ");
        }
        ArrayList arrayList4 = nVar2.f19913u;
        if (arrayList4 != null) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                throw p245z2.a.z(it2);
            }
        }
        boolean zIsEmpty = hashSet3.isEmpty();
        String str13 = "CUSTOM,";
        HashSet hashSet5 = hashSet3;
        String str14 = ",";
        if (zIsEmpty) {
            arrayList = arrayList4;
            str = "CUSTOM,";
        } else {
            int i15 = 1;
            nVar2.f19915w = new HashMap();
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                Iterator it4 = it3;
                String str15 = (String) it3.next();
                if (!str15.startsWith(str13)) {
                    arrayList3 = arrayList4;
                    str7 = str13;
                    switch (str15.hashCode()) {
                        case -1249320806:
                            if (str15.equals("rotationX")) {
                                i11 = 0;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -1249320805:
                            if (str15.equals("rotationY")) {
                                i11 = i15;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -1225497657:
                            if (str15.equals("translationX")) {
                                i11 = 2;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -1225497656:
                            if (str15.equals("translationY")) {
                                i11 = 3;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -1225497655:
                            if (str15.equals("translationZ")) {
                                i11 = 4;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -1001078227:
                            if (str15.equals("progress")) {
                                i11 = 5;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -908189618:
                            if (str15.equals("scaleX")) {
                                i11 = 6;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -908189617:
                            if (str15.equals("scaleY")) {
                                i11 = 7;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -797520672:
                            if (str15.equals("waveVariesBy")) {
                                i11 = 8;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -760884510:
                            if (str15.equals("transformPivotX")) {
                                i11 = 9;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -760884509:
                            if (str15.equals("transformPivotY")) {
                                i11 = 10;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -40300674:
                            if (str15.equals("rotation")) {
                                i11 = 11;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case -4379043:
                            if (str15.equals("elevation")) {
                                i11 = 12;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case 37232917:
                            if (str15.equals("transitionPathRotate")) {
                                i11 = 13;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case 92909918:
                            if (str15.equals("alpha")) {
                                i11 = 14;
                            } else {
                                i11 = -1;
                            }
                            break;
                        case 156108012:
                            if (str15.equals("waveOffset")) {
                                i11 = 15;
                            } else {
                                i11 = -1;
                            }
                            break;
                        default:
                            i11 = -1;
                            break;
                    }
                    switch (i11) {
                        case 0:
                            b11 = new B(5);
                            break;
                        case 1:
                            b11 = new B(6);
                            break;
                        case 2:
                            b11 = new B(9);
                            break;
                        case 3:
                            b11 = new B(10);
                            break;
                        case 4:
                            b11 = new B(11);
                            break;
                        case 5:
                            E e10 = new E();
                            e10.f19835f = false;
                            b11 = e10;
                            break;
                        case 6:
                            b11 = new B(7);
                            break;
                        case 7:
                            b11 = new B(8);
                            break;
                        case 8:
                            b11 = new B(0);
                            break;
                        case 9:
                            b11 = new B(2);
                            break;
                        case 10:
                            b11 = new B(3);
                            break;
                        case 11:
                            b11 = new B(4);
                            break;
                        case 12:
                            b11 = new B(i15);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                            b11 = new D();
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                            b11 = new B(0);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                            b11 = new B(0);
                            break;
                        default:
                            b11 = null;
                            break;
                    }
                } else {
                    str7 = str13;
                    SparseArray sparseArray = new SparseArray();
                    String str16 = str15.split(",")[i15];
                    Iterator it5 = arrayList4.iterator();
                    if (it5.hasNext()) {
                        throw p245z2.a.z(it5);
                    }
                    arrayList3 = arrayList4;
                    c10 = new C();
                    String str17 = str15.split(",")[i15];
                    c10.f19834f = sparseArray;
                }
                if (b11 == null) {
                    b11 = c10;
                } else {
                    b11 = c10;
                    b11.f19840e = str15;
                    nVar2.f19915w.put(str15, b11);
                }
                str13 = str7;
                it3 = it4;
                arrayList4 = arrayList3;
                i15 = 1;
            }
            ArrayList arrayList5 = arrayList4;
            str = str13;
            if (arrayList5 != null) {
                int size = arrayList5.size();
                int i16 = 0;
                while (i16 < size) {
                    ArrayList arrayList6 = arrayList5;
                    Object obj3 = arrayList6.get(i16);
                    i16++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    arrayList5 = arrayList6;
                }
            }
            arrayList = arrayList5;
            mVar.a(nVar2.f19915w, 0);
            mVar2.a(nVar2.f19915w, 100);
            Iterator it6 = nVar2.f19915w.keySet().iterator();
            while (it6.hasNext()) {
                String str18 = (String) it6.next();
                HashMap map3 = map2;
                ((F) nVar2.f19915w.get(str18)).d(map3.containsKey(str18) ? ((Integer) map3.get(str18)).intValue() : 0);
                it6 = it6;
                map2 = map3;
            }
        }
        HashMap map4 = map2;
        if (hashSet2.isEmpty()) {
            nVar = nVar2;
            arrayList2 = arrayList;
        } else {
            if (nVar2.f19914v == null) {
                nVar2.f19914v = new HashMap();
            }
            Iterator it7 = hashSet2.iterator();
            while (it7.hasNext()) {
                String str19 = (String) it7.next();
                if (!nVar2.f19914v.containsKey(str19)) {
                    String str20 = str;
                    if (str19.startsWith(str20)) {
                        it = it7;
                        SparseArray sparseArray2 = new SparseArray();
                        String str21 = str19.split(str14)[1];
                        Iterator it8 = arrayList.iterator();
                        if (it8.hasNext()) {
                            throw p245z2.a.z(it8);
                        }
                        str = str20;
                        H h10 = new H();
                        h10.f19841h = new SparseArray();
                        String str22 = str19.split(str14)[1];
                        h10.g = sparseArray2;
                        h7 = h10;
                    } else {
                        it = it7;
                        str = str20;
                        switch (str19) {
                            case "rotationX":
                                g = new G(3);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "rotationY":
                                g = new G(4);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "translationX":
                                g = new G(7);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "translationY":
                                g = new G(8);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "translationZ":
                                g = new G(9);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "progress":
                                J j10 = new J();
                                j10.g = false;
                                g = j10;
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "scaleX":
                                g = new G(5);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "scaleY":
                                g = new G(6);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "rotation":
                                g = new G(2);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "elevation":
                                g = new G(1);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "transitionPathRotate":
                                g = new I();
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            case "alpha":
                                g = new G(0);
                                str14 = str14;
                                g.f19847e = j;
                                k7 = g;
                                break;
                            default:
                                h7 = null;
                                break;
                        }
                        if (k7 == null) {
                            nVar2 = this;
                        } else {
                            k7.f19844b = str19;
                            this.f19914v.put(str19, k7);
                            nVar2 = this;
                        }
                        str14 = str14;
                        it7 = it;
                    }
                    k7 = h7;
                    if (k7 == null) {
                        nVar2 = this;
                    } else {
                        k7.f19844b = str19;
                        this.f19914v.put(str19, k7);
                        nVar2 = this;
                    }
                    str14 = str14;
                    it7 = it;
                }
            }
            nVar = nVar2;
            if (arrayList != null) {
                int size2 = arrayList.size();
                int i17 = 0;
                while (i17 < size2) {
                    ArrayList arrayList7 = arrayList;
                    Object obj4 = arrayList7.get(i17);
                    i17++;
                    if (obj4 != null) {
                        throw new ClassCastException();
                    }
                    arrayList = arrayList7;
                }
            }
            arrayList2 = arrayList;
            Iterator it9 = nVar.f19914v.keySet().iterator();
            while (it9.hasNext()) {
                String str23 = (String) it9.next();
                HashMap map5 = map4;
                ((K) nVar.f19914v.get(str23)).c(map5.containsKey(str23) ? ((Integer) map5.get(str23)).intValue() : 0);
                it9 = it9;
                map4 = map5;
            }
        }
        ArrayList arrayList8 = nVar.f19911s;
        int size3 = arrayList8.size();
        int i18 = size3 + 2;
        w[] wVarArr = new w[i18];
        wVarArr[0] = wVar2;
        int i19 = size3 + 1;
        w wVar3 = nVar.f19899e;
        wVarArr[i19] = wVar3;
        ArrayList arrayList9 = arrayList2;
        if (arrayList8.size() > 0) {
            obj = "rotationX";
            if (nVar.f19897c == -1) {
                nVar.f19897c = 0;
            }
        } else {
            obj = "rotationX";
        }
        int size4 = arrayList8.size();
        int i20 = 1;
        int i21 = 0;
        while (i21 < size4) {
            Object obj5 = arrayList8.get(i21);
            i21++;
            wVarArr[i20] = (w) obj5;
            i20++;
        }
        HashSet hashSet6 = new HashSet();
        Iterator it10 = wVar3.f19949B.keySet().iterator();
        while (it10.hasNext()) {
            String str24 = (String) it10.next();
            Iterator it11 = it10;
            w wVar4 = wVar2;
            if (wVar4.f19949B.containsKey(str24)) {
                wVar2 = wVar4;
                hashSet = hashSet5;
                if (!hashSet.contains(str + str24)) {
                    hashSet6.add(str24);
                }
            } else {
                wVar2 = wVar4;
                hashSet = hashSet5;
            }
            it10 = it11;
            hashSet5 = hashSet;
        }
        String[] strArr = (String[]) hashSet6.toArray(new String[0]);
        nVar.f19908p = strArr;
        nVar.f19909q = new int[strArr.length];
        int i22 = 0;
        while (true) {
            String[] strArr2 = nVar.f19908p;
            if (i22 < strArr2.length) {
                String str25 = strArr2[i22];
                nVar.f19909q[i22] = 0;
                for (int i23 = 0; i23 < i18; i23++) {
                    if (wVarArr[i23].f19949B.containsKey(str25)) {
                        int[] iArr = nVar.f19909q;
                        iArr[i22] = ((s1.a) wVarArr[i23].f19949B.get(str25)).d() + iArr[i22];
                        break;
                    }
                }
                i22++;
            } else {
                boolean z10 = wVarArr[0].f19948A != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                int i24 = 1;
                while (i24 < i18) {
                    boolean z11 = z10;
                    w wVar5 = wVarArr[i24];
                    boolean[] zArr2 = zArr;
                    w wVar6 = wVarArr[i24 - 1];
                    wVar5.getClass();
                    zArr2[0] = zArr2[0] | w.b(wVar5.f19955u, wVar6.f19955u);
                    zArr2[1] = zArr2[1] | w.b(wVar5.f19956v, wVar6.f19956v) | z11;
                    zArr2[2] = zArr2[2] | w.b(wVar5.f19957w, wVar6.f19957w) | z11;
                    zArr2[3] = zArr2[3] | w.b(wVar5.f19958x, wVar6.f19958x);
                    zArr2[4] = w.b(wVar5.f19959y, wVar6.f19959y) | zArr2[4];
                    i24++;
                    z10 = z11;
                    zArr = zArr2;
                    str9 = str9;
                }
                boolean[] zArr3 = zArr;
                String str26 = str9;
                int i25 = 0;
                for (int i26 = 1; i26 < length; i26++) {
                    if (zArr3[i26]) {
                        i25++;
                    }
                }
                nVar.f19905m = new int[i25];
                nVar.f19906n = new double[i25];
                nVar.f19907o = new double[i25];
                int i27 = 0;
                for (int i28 = 1; i28 < length; i28++) {
                    if (zArr3[i28]) {
                        nVar.f19905m[i27] = i28;
                        i27++;
                    }
                }
                int[] iArr2 = {i18, nVar.f19905m.length};
                Class cls2 = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls2, iArr2);
                double[] dArr2 = new double[i18];
                int i29 = 0;
                while (i29 < i18) {
                    w wVar7 = wVarArr[i29];
                    double[] dArr3 = dArr[i29];
                    int i30 = i29;
                    int[] iArr3 = nVar.f19905m;
                    String str27 = str11;
                    float[] fArr = {wVar7.f19955u, wVar7.f19956v, wVar7.f19957w, wVar7.f19958x, wVar7.f19959y, wVar7.f19960z};
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < iArr3.length) {
                        int i33 = iArr3[i31];
                        int i34 = i31;
                        if (i33 < 6) {
                            dArr3[i32] = fArr[i33];
                            i32++;
                        }
                        i31 = i34 + 1;
                        str8 = str8;
                    }
                    dArr2[i30] = wVarArr[i30].f19954t;
                    i29 = i30 + 1;
                    str11 = str27;
                    str8 = str8;
                }
                String str28 = str11;
                String str29 = str8;
                int i35 = 0;
                while (true) {
                    int[] iArr4 = nVar.f19905m;
                    if (i35 < iArr4.length) {
                        if (iArr4[i35] < 6) {
                            String strB = p.B(new StringBuilder(), w.f19947E[nVar.f19905m[i35]], " [");
                            for (int i36 = 0; i36 < i18; i36++) {
                                StringBuilder sbC = p.C(strB);
                                sbC.append(dArr[i36][i35]);
                                strB = sbC.toString();
                            }
                        }
                        i35++;
                    } else {
                        nVar.f19901h = new a[nVar.f19908p.length + 1];
                        int i37 = 0;
                        while (true) {
                            String[] strArr3 = nVar.f19908p;
                            if (i37 >= strArr3.length) {
                                String str30 = str12;
                                String str31 = str10;
                                nVar.f19901h[0] = a.x(nVar.f19897c, dArr2, dArr);
                                if (wVarArr[0].f19948A != -1) {
                                    int[] iArr5 = new int[i18];
                                    double[] dArr4 = new double[i18];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls2, i18, 2);
                                    for (int i38 = 0; i38 < i18; i38++) {
                                        w wVar8 = wVarArr[i38];
                                        iArr5[i38] = wVar8.f19948A;
                                        dArr4[i38] = wVar8.f19954t;
                                        double[] dArr6 = dArr5[i38];
                                        dArr6[0] = wVar8.f19956v;
                                        dArr6[1] = wVar8.f19957w;
                                    }
                                    nVar.f19902i = new b(iArr5, dArr4, dArr5);
                                }
                                nVar.f19916x = new HashMap();
                                if (arrayList9 != null) {
                                    Iterator it12 = hashSet4.iterator();
                                    while (it12.hasNext()) {
                                        String str32 = (String) it12.next();
                                        if (str32.startsWith("CUSTOM")) {
                                            C1219e c1219e = new C1219e();
                                            c1219e.f19871d = new float[1];
                                            it12 = it12;
                                            c1218d2 = c1219e;
                                            obj2 = obj;
                                            str2 = str30;
                                            str3 = str28;
                                            str4 = str26;
                                            str5 = str31;
                                            str6 = str29;
                                        } else {
                                            switch (str32.hashCode()) {
                                                case -1249320806:
                                                    obj2 = obj;
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    b5 = str32.equals(obj2) ? (byte) 0 : (byte) -1;
                                                    break;
                                                case -1249320805:
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    if (str32.equals(str4)) {
                                                        obj2 = obj;
                                                        b5 = 1;
                                                    } else {
                                                        obj2 = obj;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    obj2 = obj;
                                                    if (str32.equals(str3)) {
                                                        str4 = str26;
                                                        b5 = 2;
                                                    } else {
                                                        str4 = str26;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str2 = str30;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    obj2 = obj;
                                                    if (str32.equals(str2)) {
                                                        str3 = str28;
                                                        str4 = str26;
                                                        b5 = 3;
                                                    } else {
                                                        str3 = str28;
                                                        str4 = str26;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str5 = str31;
                                                    str6 = str29;
                                                    if (str32.equals("translationZ")) {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        b5 = 4;
                                                    } else {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str5 = str31;
                                                    str6 = str29;
                                                    if (str32.equals(str6)) {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        b5 = 5;
                                                    } else {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                    }
                                                    break;
                                                case -908189618:
                                                    str5 = str31;
                                                    obj2 = obj;
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    if (str32.equals(str5)) {
                                                        str6 = str29;
                                                        b5 = 6;
                                                    } else {
                                                        str6 = str29;
                                                    }
                                                    break;
                                                case -908189617:
                                                    if (str32.equals("scaleY")) {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                        b5 = 7;
                                                    } else {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                    }
                                                    break;
                                                case -797520672:
                                                    if (str32.equals("waveVariesBy")) {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                        b5 = 8;
                                                    } else {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                    }
                                                    break;
                                                case -40300674:
                                                    if (str32.equals("rotation")) {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                        b5 = 9;
                                                    } else {
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                    }
                                                    break;
                                                case -4379043:
                                                    if (str32.equals("elevation")) {
                                                        b10 = 10;
                                                        b5 = b10;
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                    }
                                                    obj2 = obj;
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    break;
                                                case 37232917:
                                                    if (str32.equals("transitionPathRotate")) {
                                                        b10 = 11;
                                                        b5 = b10;
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                    }
                                                    obj2 = obj;
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    break;
                                                case 92909918:
                                                    if (str32.equals("alpha")) {
                                                        b10 = 12;
                                                        b5 = b10;
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                    }
                                                    obj2 = obj;
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    break;
                                                case 156108012:
                                                    if (str32.equals("waveOffset")) {
                                                        b10 = 13;
                                                        b5 = b10;
                                                        obj2 = obj;
                                                        str2 = str30;
                                                        str3 = str28;
                                                        str4 = str26;
                                                        str5 = str31;
                                                        str6 = str29;
                                                    }
                                                    obj2 = obj;
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    break;
                                                default:
                                                    obj2 = obj;
                                                    str2 = str30;
                                                    str3 = str28;
                                                    str4 = str26;
                                                    str5 = str31;
                                                    str6 = str29;
                                                    break;
                                            }
                                            switch (b5) {
                                                case 0:
                                                    it12 = it12;
                                                    c1218d3 = new C1218d(3);
                                                    break;
                                                case 1:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(4);
                                                    break;
                                                case 2:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(7);
                                                    break;
                                                case 3:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(8);
                                                    break;
                                                case 4:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(9);
                                                    break;
                                                case 5:
                                                    it12 = it12;
                                                    C1221g c1221g = new C1221g();
                                                    c1221g.f19872d = false;
                                                    c1218d2 = c1221g;
                                                    break;
                                                case 6:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(5);
                                                    break;
                                                case 7:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(6);
                                                    break;
                                                case 8:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(0);
                                                    break;
                                                case 9:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(2);
                                                    break;
                                                case 10:
                                                    it12 = it12;
                                                    c1218d2 = new C1218d(1);
                                                    break;
                                                case 11:
                                                    it12 = it12;
                                                    c1218d2 = new C1220f();
                                                    break;
                                                case 12:
                                                    c1218d = new C1218d(0);
                                                    c1218d2 = c1218d;
                                                    break;
                                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                                    c1218d = new C1218d(0);
                                                    c1218d2 = c1218d;
                                                    break;
                                                default:
                                                    it12 = it12;
                                                    c1218d2 = null;
                                                    break;
                                            }
                                            if (c1218d3 == null) {
                                                c1218d3.f19874b = str32;
                                                nVar.f19916x.put(str32, c1218d3);
                                            }
                                            it12 = it12;
                                            str31 = str5;
                                            str29 = str6;
                                            str30 = str2;
                                            str28 = str3;
                                            str26 = str4;
                                            obj = obj2;
                                        }
                                        c1218d3 = c1218d2;
                                        if (c1218d3 == null) {
                                            c1218d3.f19874b = str32;
                                            nVar.f19916x.put(str32, c1218d3);
                                        }
                                        it12 = it12;
                                        str31 = str5;
                                        str29 = str6;
                                        str30 = str2;
                                        str28 = str3;
                                        str26 = str4;
                                        obj = obj2;
                                    }
                                    int size5 = arrayList9.size();
                                    int i39 = 0;
                                    while (i39 < size5) {
                                        ArrayList arrayList10 = arrayList9;
                                        Object obj6 = arrayList10.get(i39);
                                        i39++;
                                        if (obj6 != null) {
                                            throw new ClassCastException();
                                        }
                                        arrayList9 = arrayList10;
                                    }
                                    for (AbstractC1222h abstractC1222h : nVar.f19916x.values()) {
                                        ArrayList arrayList11 = abstractC1222h.f19875c;
                                        int size6 = arrayList11.size();
                                        if (size6 == 0) {
                                            cls = cls2;
                                        } else {
                                            Collections.sort(arrayList11, new C0140p(12));
                                            double[] dArr7 = new double[size6];
                                            double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls2, size6, 2);
                                            C0280d0 c0280d0 = new C0280d0();
                                            i iVar = new i(9, false);
                                            iVar.f16422s = new float[0];
                                            iVar.f16423t = new double[0];
                                            c0280d0.f4063b = iVar;
                                            new HashMap();
                                            c0280d0.f4064c = new float[size6];
                                            c0280d0.f4065d = new double[size6];
                                            c0280d0.f4066e = new float[size6];
                                            c0280d0.f4067f = new float[size6];
                                            float[] fArr2 = new float[size6];
                                            abstractC1222h.f19873a = c0280d0;
                                            Iterator it13 = arrayList11.iterator();
                                            if (it13.hasNext()) {
                                                throw p245z2.a.z(it13);
                                            }
                                            C0280d0 c0280d1 = abstractC1222h.f19873a;
                                            float[] fArr3 = (float[]) c0280d1.f4066e;
                                            i iVar2 = (i) c0280d1.f4063b;
                                            double[] dArr9 = (double[]) c0280d1.f4065d;
                                            double[][] dArr10 = (double[][]) Array.newInstance((Class<?>) cls2, dArr9.length, 2);
                                            float[] fArr4 = (float[]) c0280d1.f4064c;
                                            c0280d1.f4068h = new double[fArr4.length + 1];
                                            c0280d1.f4069i = new double[fArr4.length + 1];
                                            if (dArr9[0] > 0.0d) {
                                                iVar2.f(0.0d, fArr3[0]);
                                            }
                                            int length2 = dArr9.length - 1;
                                            if (dArr9[length2] < 1.0d) {
                                                iVar2.f(1.0d, fArr3[length2]);
                                            }
                                            for (int i40 = 0; i40 < dArr10.length; i40++) {
                                                dArr10[i40][0] = ((float[]) c0280d1.f4067f)[i40];
                                                for (int i41 = 0; i41 < fArr4.length; i41++) {
                                                    dArr10[i41][1] = fArr4[i41];
                                                }
                                                iVar2.f(dArr9[i40], fArr3[i40]);
                                            }
                                            double d5 = 0.0d;
                                            int i42 = 0;
                                            while (true) {
                                                float[] fArr5 = (float[]) iVar2.f16422s;
                                                if (i42 < fArr5.length) {
                                                    d5 += (double) fArr5[i42];
                                                    i42++;
                                                } else {
                                                    double d9 = 0.0d;
                                                    int i43 = 1;
                                                    while (true) {
                                                        float[] fArr6 = (float[]) iVar2.f16422s;
                                                        if (i43 < fArr6.length) {
                                                            int i44 = i43 - 1;
                                                            float f7 = (fArr6[i44] + fArr6[i43]) / 2.0f;
                                                            Class cls3 = cls2;
                                                            double[] dArr11 = (double[]) iVar2.f16423t;
                                                            d9 = ((dArr11[i43] - dArr11[i44]) * ((double) f7)) + d9;
                                                            i43++;
                                                            cls2 = cls3;
                                                        } else {
                                                            cls = cls2;
                                                            int i45 = 0;
                                                            while (true) {
                                                                float[] fArr7 = (float[]) iVar2.f16422s;
                                                                if (i45 < fArr7.length) {
                                                                    fArr7[i45] = (float) (((double) fArr7[i45]) * (d5 / d9));
                                                                    i45++;
                                                                } else {
                                                                    ((double[]) iVar2.f16424u)[0] = 0.0d;
                                                                    int i46 = 1;
                                                                    while (true) {
                                                                        float[] fArr8 = (float[]) iVar2.f16422s;
                                                                        if (i46 < fArr8.length) {
                                                                            int i47 = i46 - 1;
                                                                            float f10 = (fArr8[i47] + fArr8[i46]) / 2.0f;
                                                                            double[] dArr12 = (double[]) iVar2.f16423t;
                                                                            double d10 = dArr12[i46] - dArr12[i47];
                                                                            double[] dArr13 = (double[]) iVar2.f16424u;
                                                                            dArr13[i46] = (d10 * ((double) f10)) + dArr13[i47];
                                                                            i46++;
                                                                        } else {
                                                                            if (dArr9.length > 1) {
                                                                                i10 = 0;
                                                                                c0280d1.g = a.x(0, dArr9, dArr10);
                                                                            } else {
                                                                                i10 = 0;
                                                                                c0280d1.g = null;
                                                                            }
                                                                            a.x(i10, dArr7, dArr8);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        cls2 = cls;
                                    }
                                    return;
                                }
                                return;
                            }
                            String str33 = strArr3[i37];
                            String str34 = str12;
                            int i48 = i37;
                            double[][] dArr14 = null;
                            double[] dArr15 = null;
                            int i49 = 0;
                            int i50 = 0;
                            while (i49 < i18) {
                                int i51 = i49;
                                if (wVarArr[i51].f19949B.containsKey(str33)) {
                                    if (dArr14 == null) {
                                        dArr15 = new double[i18];
                                        dArr14 = (double[][]) Array.newInstance((Class<?>) cls2, i18, ((s1.a) wVarArr[i51].f19949B.get(str33)).d());
                                    }
                                    w wVar9 = wVarArr[i51];
                                    double[][] dArr16 = dArr14;
                                    double[] dArr17 = dArr15;
                                    dArr17[i50] = wVar9.f19954t;
                                    double[] dArr18 = dArr16[i50];
                                    s1.a aVar = (s1.a) wVar9.f19949B.get(str33);
                                    if (aVar.d() == 1) {
                                        dArr18[0] = aVar.b();
                                    } else {
                                        int iD = aVar.d();
                                        float[] fArr9 = new float[iD];
                                        aVar.c(fArr9);
                                        int i52 = 0;
                                        int i53 = 0;
                                        while (i52 < iD) {
                                            double[] dArr19 = dArr18;
                                            dArr19[i53] = fArr9[i52];
                                            i52++;
                                            i53++;
                                            dArr18 = dArr19;
                                            iD = iD;
                                        }
                                    }
                                    i50++;
                                    dArr14 = dArr16;
                                    dArr15 = dArr17;
                                }
                                i49 = i51 + 1;
                                str10 = str10;
                            }
                            int i54 = i48 + 1;
                            nVar.f19901h[i54] = a.x(nVar.f19897c, Arrays.copyOf(dArr15, i50), (double[][]) Arrays.copyOf(dArr14, i50));
                            i37 = i54;
                            str12 = str34;
                            str10 = str10;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        w wVar = this.f19898d;
        sb.append(wVar.f19956v);
        sb.append(" y: ");
        sb.append(wVar.f19957w);
        sb.append(" end: x: ");
        w wVar2 = this.f19899e;
        sb.append(wVar2.f19956v);
        sb.append(" y: ");
        sb.append(wVar2.f19957w);
        return sb.toString();
    }
}
