package U0;

import android.text.Layout;
import java.io.Serializable;
import p151p.V;
import p180s0.C1297f;
import p180s0.C1303l;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8101r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f8102s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8103t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Serializable f8104u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8105v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j, float[] fArr, p251z9.t tVar, p251z9.s sVar) {
        super(1);
        this.f8102s = j;
        this.f8103t = fArr;
        this.f8104u = tVar;
        this.f8105v = sVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        float[] fArr;
        int i10;
        boolean z10;
        float fA;
        float fA2;
        switch (this.f8101r) {
            case 0:
                r rVar = (r) obj;
                float[] fArr2 = (float[]) this.f8103t;
                p251z9.t tVar = (p251z9.t) this.f8104u;
                p251z9.s sVar = (p251z9.s) this.f8105v;
                int i11 = rVar.f8116b;
                C0509a c0509a = rVar.f8115a;
                int iD = rVar.f8117c;
                long j = this.f8102s;
                int iE = i11 > K.e(j) ? rVar.f8116b : K.e(j);
                if (iD >= K.d(j)) {
                    iD = K.d(j);
                }
                long jE = va.g.e(rVar.d(iE), rVar.d(iD));
                int i12 = tVar.f24884r;
                V0.r rVar2 = c0509a.f8045d;
                int iE2 = K.e(jE);
                int iD2 = K.d(jE);
                Layout layout = rVar2.f8389f;
                int length = layout.getText().length();
                if (iE2 < 0) {
                    p002a1.a.a("startOffset must be > 0");
                }
                if (iE2 >= length) {
                    p002a1.a.a("startOffset must be less than text length");
                }
                if (iD2 <= iE2) {
                    p002a1.a.a("endOffset must be greater than startOffset");
                }
                if (iD2 > length) {
                    p002a1.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i12 < (iD2 - iE2) * 4) {
                    p002a1.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iE2);
                int lineForOffset2 = layout.getLineForOffset(iD2 - 1);
                Q0.g gVar = new Q0.g(rVar2);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int i13 = i12;
                        int iF = rVar2.f(lineForOffset);
                        int iMax = Math.max(iE2, lineStart);
                        int iMin = Math.min(iD2, iF);
                        float fG = rVar2.g(lineForOffset);
                        float fE = rVar2.e(lineForOffset);
                        fArr = fArr2;
                        V0.r rVar3 = rVar2;
                        boolean z11 = false;
                        boolean z12 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i14 = iMax;
                        int i15 = i13;
                        while (i14 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i14);
                            if (!z12 || zIsRtlCharAt) {
                                i10 = iMin;
                                if (z12 && zIsRtlCharAt) {
                                    z11 = false;
                                    float fA3 = gVar.a(i14, false, false, false);
                                    z10 = z12;
                                    fA = gVar.a(i14 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z10 = z12;
                                    z11 = false;
                                    if (z10 || !zIsRtlCharAt) {
                                        fA = gVar.a(i14, false, false, false);
                                        fA2 = gVar.a(i14 + 1, true, true, false);
                                    } else {
                                        fA2 = gVar.a(i14, false, false, true);
                                        fA = gVar.a(i14 + 1, true, true, true);
                                    }
                                }
                                fArr[i15] = fA;
                                fArr[i15 + 1] = fG;
                                fArr[i15 + 2] = fA2;
                                fArr[i15 + 3] = fE;
                                i15 += 4;
                                i14++;
                                z12 = z10;
                                iMin = i10;
                            } else {
                                i10 = iMin;
                                fA = gVar.a(i14, z11, z11, true);
                                z10 = z12;
                                fA2 = gVar.a(i14 + 1, true, true, true);
                            }
                            z11 = false;
                            fArr[i15] = fA;
                            fArr[i15 + 1] = fG;
                            fArr[i15 + 2] = fA2;
                            fArr[i15 + 3] = fE;
                            i15 += 4;
                            i14++;
                            z12 = z10;
                            iMin = i10;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i12 = i15;
                            fArr2 = fArr;
                            rVar2 = rVar3;
                        }
                    }
                } else {
                    fArr = fArr2;
                }
                int iC = (K.c(jE) * 4) + tVar.f24884r;
                for (int i16 = tVar.f24884r; i16 < iC; i16 += 4) {
                    int i17 = i16 + 1;
                    float f3 = fArr[i17];
                    float f7 = sVar.f24883r;
                    fArr[i17] = f3 + f7;
                    int i18 = i16 + 3;
                    fArr[i18] = fArr[i18] + f7;
                }
                tVar.f24884r = iC;
                sVar.f24883r = c0509a.b() + sVar.f24883r;
                return p110k9.y.f19095a;
            default:
                J0.K k7 = (J0.K) obj;
                k7.a();
                p171r0.e eVar = (p171r0.e) this.f8103t;
                float f10 = eVar.f21389a;
                float f11 = eVar.f21390b;
                p251z9.v vVar = (p251z9.v) this.f8104u;
                long j10 = this.f8102s;
                C1303l c1303l = (C1303l) this.f8105v;
                p196u0.b bVar = k7.f3942r;
                ((V) bVar.f22795s.f16422s).x(f10, f11);
                try {
                    p123m2.c.f(k7, (C1297f) vVar.f24886r, j10, 0L, 0.0f, c1303l, 0, 890);
                    return p110k9.y.f19095a;
                } finally {
                    ((V) bVar.f22795s.f16422s).x(-f10, -f11);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p171r0.e eVar, p251z9.v vVar, long j, C1303l c1303l) {
        super(1);
        this.f8103t = eVar;
        this.f8104u = vVar;
        this.f8102s = j;
        this.f8105v = c1303l;
    }
}
