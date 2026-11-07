package androidx.constraintlayout.widget;

import G.c0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p153p1.e;
import p153p1.f;
import p153p1.h;
import p153p1.i;
import p163q1.g;
import p163q1.j;
import p163q1.m;
import s1.c;
import s1.d;
import s1.l;
import s1.n;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f12267G = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public l f12268A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c0 f12269B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f12270C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public HashMap f12271D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final SparseArray f12272E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final d f12273F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SparseArray f12274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f12275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f12276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12281y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12282z;

    public ConstraintLayout(Context context) {
        super(context);
        this.f12274r = new SparseArray();
        this.f12275s = new ArrayList(4);
        this.f12276t = new f();
        this.f12277u = 0;
        this.f12278v = 0;
        this.f12279w = Integer.MAX_VALUE;
        this.f12280x = Integer.MAX_VALUE;
        this.f12281y = true;
        this.f12282z = 263;
        this.f12268A = null;
        this.f12269B = null;
        this.f12270C = -1;
        this.f12271D = new HashMap();
        this.f12272E = new SparseArray();
        this.f12273F = new d(this);
        h(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x02e3 -> B:161:0x02e5). Please report as a decompilation issue!!! */
    public final void c(boolean z10, View view, e eVar, c cVar, SparseArray sparseArray) {
        int i10;
        e eVar2;
        int i11;
        int i12;
        int i13;
        e eVar3;
        int i14;
        int i15;
        int i16;
        int i17;
        e eVar4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        e eVar5;
        e eVar6;
        int i23;
        float f3;
        float f7;
        View view2;
        e eVar7;
        e eVar8;
        e eVar9;
        e eVar10;
        int i24;
        float fAbs;
        int i25;
        float f10;
        e eVar11 = eVar;
        cVar.a();
        eVar11.f20869X = view.getVisibility();
        if (cVar.f21882a0) {
            eVar11.f20899x = true;
            eVar11.f20869X = 8;
        }
        eVar11.f20868W = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).i(eVar11, this.f12276t.f20906k0);
        }
        int i26 = -1;
        if (cVar.f21879Y) {
            i iVar = (i) eVar11;
            int i27 = cVar.f21897i0;
            int i28 = cVar.f21898j0;
            float f11 = cVar.f21900k0;
            if (f11 != -1.0f) {
                if (f11 > -1.0f) {
                    iVar.f20968g0 = f11;
                    iVar.f20969h0 = -1;
                    iVar.f20970i0 = -1;
                    return;
                }
                return;
            }
            if (i27 != -1) {
                if (i27 > -1) {
                    iVar.f20968g0 = -1.0f;
                    iVar.f20969h0 = i27;
                    iVar.f20970i0 = -1;
                    return;
                }
                return;
            }
            if (i28 == -1 || i28 <= -1) {
                return;
            }
            iVar.f20968g0 = -1.0f;
            iVar.f20969h0 = -1;
            iVar.f20970i0 = i28;
            return;
        }
        int i29 = cVar.f21884b0;
        int i30 = cVar.f21886c0;
        int i31 = cVar.f21888d0;
        int i32 = cVar.f21890e0;
        int i33 = cVar.f21892f0;
        int i34 = cVar.f21893g0;
        float f12 = cVar.f21895h0;
        int i35 = cVar.f21903m;
        if (i35 != -1) {
            e eVar12 = (e) sparseArray.get(i35);
            if (eVar12 != null) {
                float f13 = cVar.f21905o;
                f10 = 0.0f;
                eVar.p(7, eVar12, 7, cVar.f21904n, 0);
                eVar11 = eVar;
                eVar11.f20897v = f13;
            } else {
                f10 = 0.0f;
            }
            eVar6 = eVar11;
            f3 = f10;
            i13 = 2;
            i19 = 5;
            i21 = 3;
            i14 = 4;
        } else {
            if (i29 != -1) {
                e eVar13 = (e) sparseArray.get(i29);
                if (eVar13 != null) {
                    i10 = 2;
                    eVar11.p(2, eVar13, 2, ((ViewGroup.MarginLayoutParams) cVar).leftMargin, i33);
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 2;
                if (i30 != -1 && (eVar2 = (e) sparseArray.get(i30)) != null) {
                    eVar.p(2, eVar2, 4, ((ViewGroup.MarginLayoutParams) cVar).leftMargin, i33);
                    i11 = 2;
                    i12 = 4;
                }
                if (i31 != -1) {
                    eVar10 = (e) sparseArray.get(i31);
                    if (eVar10 != null) {
                        eVar.p(i12, eVar10, i11, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i34);
                    }
                    i13 = i11;
                } else {
                    i13 = i11;
                    if (i32 != -1 && (eVar3 = (e) sparseArray.get(i32)) != null) {
                        eVar.p(i12, eVar3, i12, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i34);
                    }
                }
                i14 = i12;
                i15 = cVar.f21894h;
                if (i15 != -1) {
                    eVar9 = (e) sparseArray.get(i15);
                    if (eVar9 != null) {
                        i16 = 3;
                        eVar.p(3, eVar9, 3, ((ViewGroup.MarginLayoutParams) cVar).topMargin, cVar.f21911u);
                    } else {
                        i16 = 3;
                    }
                } else {
                    i16 = 3;
                    i17 = cVar.f21896i;
                    if (i17 == -1 && (eVar4 = (e) sparseArray.get(i17)) != null) {
                        eVar.p(3, eVar4, 5, ((ViewGroup.MarginLayoutParams) cVar).topMargin, cVar.f21911u);
                        i18 = 3;
                        i19 = 5;
                    }
                    i20 = cVar.j;
                    if (i20 != -1) {
                        eVar8 = (e) sparseArray.get(i20);
                        if (eVar8 != null) {
                            eVar.p(i19, eVar8, i18, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f21913w);
                        }
                        i21 = i18;
                    } else {
                        i21 = i18;
                        i22 = cVar.f21899k;
                        if (i22 == -1 && (eVar5 = (e) sparseArray.get(i22)) != null) {
                            eVar6 = eVar;
                            eVar6.p(i19, eVar5, i19, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f21913w);
                        }
                        i23 = cVar.f21901l;
                        if (i23 != -1) {
                            view2 = (View) this.f12274r.get(i23);
                            eVar7 = (e) sparseArray.get(cVar.f21901l);
                            if (eVar7 != null && view2 != null && (view2.getLayoutParams() instanceof c)) {
                                c cVar2 = (c) view2.getLayoutParams();
                                cVar.f21878X = true;
                                cVar2.f21878X = true;
                                eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                                eVar6.f20898w = true;
                                cVar2.f21902l0.f20898w = true;
                                eVar6.h(i21).h();
                                eVar6.h(i19).h();
                            }
                        }
                        f3 = 0.0f;
                        if (f12 >= 0.0f) {
                            eVar6.U = f12;
                        }
                        f7 = cVar.f21860A;
                        if (f7 >= 0.0f) {
                            eVar6.f20867V = f7;
                        }
                    }
                    eVar6 = eVar;
                    i23 = cVar.f21901l;
                    if (i23 != -1) {
                        view2 = (View) this.f12274r.get(i23);
                        eVar7 = (e) sparseArray.get(cVar.f21901l);
                        if (eVar7 != null) {
                            c cVar3 = (c) view2.getLayoutParams();
                            cVar.f21878X = true;
                            cVar3.f21878X = true;
                            eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                            eVar6.f20898w = true;
                            cVar3.f21902l0.f20898w = true;
                            eVar6.h(i21).h();
                            eVar6.h(i19).h();
                        }
                    }
                    f3 = 0.0f;
                    if (f12 >= 0.0f) {
                        eVar6.U = f12;
                    }
                    f7 = cVar.f21860A;
                    if (f7 >= 0.0f) {
                        eVar6.f20867V = f7;
                    }
                }
                i18 = i16;
                i19 = 5;
                i20 = cVar.j;
                if (i20 != -1) {
                    eVar8 = (e) sparseArray.get(i20);
                    if (eVar8 != null) {
                        eVar.p(i19, eVar8, i18, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f21913w);
                    }
                    i21 = i18;
                } else {
                    i21 = i18;
                    i22 = cVar.f21899k;
                    if (i22 == -1) {
                    }
                    i23 = cVar.f21901l;
                    if (i23 != -1) {
                        view2 = (View) this.f12274r.get(i23);
                        eVar7 = (e) sparseArray.get(cVar.f21901l);
                        if (eVar7 != null) {
                            c cVar4 = (c) view2.getLayoutParams();
                            cVar.f21878X = true;
                            cVar4.f21878X = true;
                            eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                            eVar6.f20898w = true;
                            cVar4.f21902l0.f20898w = true;
                            eVar6.h(i21).h();
                            eVar6.h(i19).h();
                        }
                    }
                    f3 = 0.0f;
                    if (f12 >= 0.0f) {
                        eVar6.U = f12;
                    }
                    f7 = cVar.f21860A;
                    if (f7 >= 0.0f) {
                        eVar6.f20867V = f7;
                    }
                }
                eVar6 = eVar;
                i23 = cVar.f21901l;
                if (i23 != -1) {
                    view2 = (View) this.f12274r.get(i23);
                    eVar7 = (e) sparseArray.get(cVar.f21901l);
                    if (eVar7 != null) {
                        c cVar5 = (c) view2.getLayoutParams();
                        cVar.f21878X = true;
                        cVar5.f21878X = true;
                        eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                        eVar6.f20898w = true;
                        cVar5.f21902l0.f20898w = true;
                        eVar6.h(i21).h();
                        eVar6.h(i19).h();
                    }
                }
                f3 = 0.0f;
                if (f12 >= 0.0f) {
                    eVar6.U = f12;
                }
                f7 = cVar.f21860A;
                if (f7 >= 0.0f) {
                    eVar6.f20867V = f7;
                }
            }
            i11 = i10;
            i12 = 4;
            if (i31 != -1) {
                eVar10 = (e) sparseArray.get(i31);
                if (eVar10 != null) {
                    eVar.p(i12, eVar10, i11, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i34);
                }
                i13 = i11;
            } else {
                i13 = i11;
                if (i32 != -1) {
                    eVar.p(i12, eVar3, i12, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i34);
                }
            }
            i14 = i12;
            i15 = cVar.f21894h;
            if (i15 != -1) {
                eVar9 = (e) sparseArray.get(i15);
                if (eVar9 != null) {
                    i16 = 3;
                    eVar.p(3, eVar9, 3, ((ViewGroup.MarginLayoutParams) cVar).topMargin, cVar.f21911u);
                } else {
                    i16 = 3;
                }
            } else {
                i16 = 3;
                i17 = cVar.f21896i;
                if (i17 == -1) {
                }
                i20 = cVar.j;
                if (i20 != -1) {
                    eVar8 = (e) sparseArray.get(i20);
                    if (eVar8 != null) {
                        eVar.p(i19, eVar8, i18, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f21913w);
                    }
                    i21 = i18;
                } else {
                    i21 = i18;
                    i22 = cVar.f21899k;
                    if (i22 == -1) {
                    }
                    i23 = cVar.f21901l;
                    if (i23 != -1) {
                        view2 = (View) this.f12274r.get(i23);
                        eVar7 = (e) sparseArray.get(cVar.f21901l);
                        if (eVar7 != null) {
                            c cVar6 = (c) view2.getLayoutParams();
                            cVar.f21878X = true;
                            cVar6.f21878X = true;
                            eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                            eVar6.f20898w = true;
                            cVar6.f21902l0.f20898w = true;
                            eVar6.h(i21).h();
                            eVar6.h(i19).h();
                        }
                    }
                    f3 = 0.0f;
                    if (f12 >= 0.0f) {
                        eVar6.U = f12;
                    }
                    f7 = cVar.f21860A;
                    if (f7 >= 0.0f) {
                        eVar6.f20867V = f7;
                    }
                }
                eVar6 = eVar;
                i23 = cVar.f21901l;
                if (i23 != -1) {
                    view2 = (View) this.f12274r.get(i23);
                    eVar7 = (e) sparseArray.get(cVar.f21901l);
                    if (eVar7 != null) {
                        c cVar7 = (c) view2.getLayoutParams();
                        cVar.f21878X = true;
                        cVar7.f21878X = true;
                        eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                        eVar6.f20898w = true;
                        cVar7.f21902l0.f20898w = true;
                        eVar6.h(i21).h();
                        eVar6.h(i19).h();
                    }
                }
                f3 = 0.0f;
                if (f12 >= 0.0f) {
                    eVar6.U = f12;
                }
                f7 = cVar.f21860A;
                if (f7 >= 0.0f) {
                    eVar6.f20867V = f7;
                }
            }
            i18 = i16;
            i19 = 5;
            i20 = cVar.j;
            if (i20 != -1) {
                eVar8 = (e) sparseArray.get(i20);
                if (eVar8 != null) {
                    eVar.p(i19, eVar8, i18, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f21913w);
                }
                i21 = i18;
            } else {
                i21 = i18;
                i22 = cVar.f21899k;
                if (i22 == -1) {
                }
                i23 = cVar.f21901l;
                if (i23 != -1) {
                    view2 = (View) this.f12274r.get(i23);
                    eVar7 = (e) sparseArray.get(cVar.f21901l);
                    if (eVar7 != null) {
                        c cVar8 = (c) view2.getLayoutParams();
                        cVar.f21878X = true;
                        cVar8.f21878X = true;
                        eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                        eVar6.f20898w = true;
                        cVar8.f21902l0.f20898w = true;
                        eVar6.h(i21).h();
                        eVar6.h(i19).h();
                    }
                }
                f3 = 0.0f;
                if (f12 >= 0.0f) {
                    eVar6.U = f12;
                }
                f7 = cVar.f21860A;
                if (f7 >= 0.0f) {
                    eVar6.f20867V = f7;
                }
            }
            eVar6 = eVar;
            i23 = cVar.f21901l;
            if (i23 != -1) {
                view2 = (View) this.f12274r.get(i23);
                eVar7 = (e) sparseArray.get(cVar.f21901l);
                if (eVar7 != null) {
                    c cVar9 = (c) view2.getLayoutParams();
                    cVar.f21878X = true;
                    cVar9.f21878X = true;
                    eVar6.h(6).b(eVar7.h(6), 0, -1, true);
                    eVar6.f20898w = true;
                    cVar9.f21902l0.f20898w = true;
                    eVar6.h(i21).h();
                    eVar6.h(i19).h();
                }
            }
            f3 = 0.0f;
            if (f12 >= 0.0f) {
                eVar6.U = f12;
            }
            f7 = cVar.f21860A;
            if (f7 >= 0.0f) {
                eVar6.f20867V = f7;
            }
        }
        if (z10 && ((i25 = cVar.f21875P) != -1 || cVar.Q != -1)) {
            int i36 = cVar.Q;
            eVar6.f20866P = i25;
            eVar6.Q = i36;
        }
        boolean z11 = cVar.f21876V;
        p153p1.d dVar = p153p1.d.f20847s;
        p153p1.d dVar2 = p153p1.d.f20846r;
        p153p1.d dVar3 = p153p1.d.f20849u;
        float f14 = f3;
        p153p1.d dVar4 = p153p1.d.f20848t;
        if (z11) {
            eVar6.x(dVar2);
            eVar6.z(((ViewGroup.MarginLayoutParams) cVar).width);
            if (((ViewGroup.MarginLayoutParams) cVar).width == -2) {
                eVar6.x(dVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) cVar).width == -1) {
            if (cVar.S) {
                eVar6.x(dVar4);
            } else {
                eVar6.x(dVar3);
            }
            eVar6.h(i13).f20844e = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
            eVar6.h(i14).f20844e = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        } else {
            eVar6.x(dVar4);
            eVar6.z(0);
        }
        if (cVar.f21877W) {
            eVar6.y(dVar2);
            eVar6.w(((ViewGroup.MarginLayoutParams) cVar).height);
            if (((ViewGroup.MarginLayoutParams) cVar).height == -2) {
                eVar6.y(dVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) cVar).height == -1) {
            if (cVar.T) {
                eVar6.y(dVar4);
            } else {
                eVar6.y(dVar3);
            }
            eVar6.h(i21).f20844e = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
            eVar6.h(i19).f20844e = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        } else {
            eVar6.y(dVar4);
            eVar6.w(0);
        }
        String str = cVar.f21861B;
        if (str == null || str.length() == 0) {
            eVar6.f20864N = f14;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i24 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i26 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i26 = 1;
                }
                i24 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i24);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f14;
                    }
                } else {
                    String strSubstring3 = str.substring(i24, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f14;
                    } else {
                        float f15 = Float.parseFloat(strSubstring3);
                        float f16 = Float.parseFloat(strSubstring4);
                        if (f15 <= f14 || f16 <= f14) {
                            fAbs = f14;
                        } else {
                            fAbs = i26 == 1 ? Math.abs(f16 / f15) : Math.abs(f15 / f16);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f14) {
                eVar6.f20864N = fAbs;
                eVar6.f20865O = i26;
            }
        }
        float f17 = cVar.f21863D;
        float[] fArr = eVar6.f20875b0;
        fArr[0] = f17;
        fArr[1] = cVar.f21864E;
        eVar6.f20871Z = cVar.f21865F;
        eVar6.f20873a0 = cVar.f21866G;
        int i37 = cVar.f21867H;
        int i38 = cVar.f21869J;
        int i39 = cVar.f21871L;
        float f18 = cVar.f21873N;
        eVar6.j = i37;
        eVar6.f20888m = i38;
        if (i39 == Integer.MAX_VALUE) {
            i39 = 0;
        }
        eVar6.f20889n = i39;
        eVar6.f20890o = f18;
        if (f18 > 0.0f && f18 < 1.0f && i37 == 0) {
            eVar6.j = 2;
        }
        int i40 = cVar.f21868I;
        int i41 = cVar.f21870K;
        int i42 = cVar.f21872M;
        float f19 = cVar.f21874O;
        eVar6.f20886k = i40;
        eVar6.f20891p = i41;
        eVar6.f20892q = i42 != Integer.MAX_VALUE ? i42 : 0;
        eVar6.f20893r = f19;
        if (f19 <= 0.0f || f19 >= 1.0f || i40 != 0) {
            return;
        }
        eVar6.f20886k = 2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final View d(int i10) {
        return (View) this.f12274r.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f12275s;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((ConstraintHelper) arrayList.get(i10)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i15;
                        float f7 = i16;
                        float f10 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f3, f7, f10, f7, paint);
                        float f11 = i16 + i17;
                        canvas.drawLine(f10, f7, f10, f11, paint);
                        canvas.drawLine(f10, f11, f3, f11, paint);
                        canvas.drawLine(f3, f11, f3, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f7, f10, f11, paint);
                        canvas.drawLine(f3, f11, f10, f7, paint);
                    }
                }
            }
        }
    }

    public final e e(View view) {
        if (view == this) {
            return this.f12276t;
        }
        if (view == null) {
            return null;
        }
        return ((c) view.getLayoutParams()).f21902l0;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f12281y = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f12280x;
    }

    public int getMaxWidth() {
        return this.f12279w;
    }

    public int getMinHeight() {
        return this.f12278v;
    }

    public int getMinWidth() {
        return this.f12277u;
    }

    public int getOptimizationLevel() {
        return this.f12276t.f20914s0;
    }

    public final void h(AttributeSet attributeSet, int i10) {
        f fVar = this.f12276t;
        fVar.f20868W = this;
        d dVar = this.f12273F;
        fVar.f20905j0 = dVar;
        fVar.f20904i0.f21253f = dVar;
        this.f12274r.put(getId(), this);
        this.f12268A = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22038b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 9) {
                    this.f12277u = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f12277u);
                } else if (index == 10) {
                    this.f12278v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f12278v);
                } else if (index == 7) {
                    this.f12279w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f12279w);
                } else if (index == 8) {
                    this.f12280x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f12280x);
                } else if (index == 89) {
                    this.f12282z = typedArrayObtainStyledAttributes.getInt(index, this.f12282z);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            l(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f12269B = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        l lVar = new l();
                        this.f12268A = lVar;
                        lVar.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f12268A = null;
                    }
                    this.f12270C = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i12 = this.f12282z;
        fVar.f20914s0 = i12;
        p142o1.e.f20228p = (i12 & 256) == 256;
    }

    public final boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f A[Catch: IOException -> 0x0056, XmlPullParserException -> 0x0058, TryCatch #2 {IOException -> 0x0056, XmlPullParserException -> 0x0058, blocks: (B:3:0x0026, B:36:0x00a9, B:10:0x0035, B:11:0x003d, B:34:0x008f, B:13:0x0041, B:15:0x0049, B:17:0x0050, B:22:0x005a, B:25:0x0063, B:28:0x006c, B:30:0x0074, B:31:0x0083, B:33:0x008b, B:35:0x00a6), top: B:42:0x0026 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x008f, please report this as an issue */
    public void l(int i10) {
        Context context = getContext();
        c0 c0Var = new c0();
        c0Var.f2671a = -1;
        c0Var.f2672b = -1;
        c0Var.f2674d = new SparseArray();
        c0Var.f2675e = new SparseArray();
        c0Var.f2673c = this;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            s1.e eVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c0Var.b(context, xml);
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                eVar = new s1.e(context, xml);
                                ((SparseArray) c0Var.f2674d).put(eVar.f21923a, eVar);
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                s1.f fVar = new s1.f(context, xml);
                                if (eVar != null) {
                                    eVar.f21924b.add(fVar);
                                }
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        default:
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.f12269B = c0Var;
    }

    public final void m(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        d dVar = this.f12273F;
        int i14 = dVar.f21921e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + dVar.f21920d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f12279w, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f12280x, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:113:0x0204  */
    /* JADX WARN: Code duplicated, block: B:116:0x0212  */
    /* JADX WARN: Code duplicated, block: B:118:0x0216  */
    /* JADX WARN: Code duplicated, block: B:122:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:200:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:202:0x03d5 A[LOOP:11: B:201:0x03d3->B:202:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0414  */
    /* JADX WARN: Code duplicated, block: B:207:0x0430  */
    /* JADX WARN: Code duplicated, block: B:208:0x0437  */
    /* JADX WARN: Code duplicated, block: B:210:0x043b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0444  */
    /* JADX WARN: Code duplicated, block: B:213:0x0447 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0449  */
    /* JADX WARN: Code duplicated, block: B:215:0x044b  */
    /* JADX WARN: Code duplicated, block: B:217:0x044e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0450  */
    /* JADX WARN: Code duplicated, block: B:220:0x0455  */
    /* JADX WARN: Code duplicated, block: B:222:0x046b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0474  */
    /* JADX WARN: Code duplicated, block: B:230:0x047f  */
    /* JADX WARN: Code duplicated, block: B:232:0x048b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0490  */
    /* JADX WARN: Code duplicated, block: B:240:0x04af  */
    /* JADX WARN: Code duplicated, block: B:246:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:250:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:252:0x04de  */
    /* JADX WARN: Code duplicated, block: B:255:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:257:0x0500  */
    /* JADX WARN: Code duplicated, block: B:260:0x0511  */
    /* JADX WARN: Code duplicated, block: B:265:0x0527  */
    /* JADX WARN: Code duplicated, block: B:267:0x052a A[LOOP:5: B:266:0x0528->B:267:0x052a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x0536  */
    /* JADX WARN: Code duplicated, block: B:271:0x0544  */
    /* JADX WARN: Code duplicated, block: B:273:0x0549  */
    /* JADX WARN: Code duplicated, block: B:275:0x0551  */
    /* JADX WARN: Code duplicated, block: B:277:0x0555  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:280:0x055c  */
    /* JADX WARN: Code duplicated, block: B:281:0x055e  */
    /* JADX WARN: Code duplicated, block: B:284:0x057d  */
    /* JADX WARN: Code duplicated, block: B:286:0x058b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0593  */
    /* JADX WARN: Code duplicated, block: B:289:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:291:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:296:0x05db  */
    /* JADX WARN: Code duplicated, block: B:298:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:307:0x0622  */
    /* JADX WARN: Code duplicated, block: B:309:0x0626  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:311:0x0630  */
    /* JADX WARN: Code duplicated, block: B:315:0x0638  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:321:0x0644  */
    /* JADX WARN: Code duplicated, block: B:328:0x0659  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:331:0x0684  */
    /* JADX WARN: Code duplicated, block: B:333:0x0689  */
    /* JADX WARN: Code duplicated, block: B:336:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:338:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:340:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:342:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:345:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:347:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:350:0x06da  */
    /* JADX WARN: Code duplicated, block: B:356:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:359:0x0703  */
    /* JADX WARN: Code duplicated, block: B:361:0x070c  */
    /* JADX WARN: Code duplicated, block: B:362:0x0711  */
    /* JADX WARN: Code duplicated, block: B:365:0x0719  */
    /* JADX WARN: Code duplicated, block: B:367:0x071f  */
    /* JADX WARN: Code duplicated, block: B:368:0x0723  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:371:0x072d  */
    /* JADX WARN: Code duplicated, block: B:372:0x072f  */
    /* JADX WARN: Code duplicated, block: B:375:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:406:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x06df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x013e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01af  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    public final void n(f fVar, int i10, int i11, int i12) {
        int iMax;
        int i13;
        int iMax2;
        p153p1.d dVar;
        int iM;
        p163q1.e eVar;
        int i14;
        int i15;
        p074h0.i iVar;
        f fVar2;
        ArrayList arrayList;
        d dVar2;
        int size;
        int iM2;
        int iJ;
        boolean z10;
        boolean z11;
        p153p1.d dVar3;
        int i16;
        boolean z12;
        p074h0.i iVar2;
        f fVar3;
        ArrayList arrayList2;
        int i17;
        int i18;
        p153p1.d dVar4;
        p153p1.d dVar5;
        p153p1.d dVar6;
        boolean zE;
        int i19;
        p074h0.i iVar3;
        int i20;
        int size2;
        int i21;
        int i22;
        boolean z13;
        boolean z14;
        p153p1.d[] dVarArr;
        boolean z15;
        boolean z16;
        int iMax3;
        int iMax4;
        int i23;
        boolean zY;
        boolean z17;
        d dVar7;
        ArrayList arrayList3;
        boolean z18;
        int i24;
        boolean z19;
        int i25;
        e eVar2;
        int iM3;
        int iJ2;
        int i26;
        int i27;
        int iM4;
        d dVar8;
        int iJ3;
        e eVar3;
        int iM5;
        int iJ4;
        boolean z20;
        d dVar9;
        boolean z21;
        int iM6;
        boolean z22;
        int iJ5;
        int size3;
        d dVar10;
        int i28;
        ConstraintLayout constraintLayout;
        int childCount;
        ArrayList arrayList4;
        int i29;
        int size4;
        int i30;
        View childAt;
        Placeholder placeholder;
        c cVar;
        e eVar4;
        e eVar5;
        e eVar6;
        e eVar7;
        p153p1.d dVarI;
        p153p1.d dVar11;
        p074h0.i iVar4;
        int iMin;
        boolean z23;
        f fVar4;
        int i31;
        int i32;
        boolean zE2;
        ArrayList arrayList5;
        int size5;
        int i33;
        boolean z24;
        boolean z25;
        int i34;
        int i35;
        boolean z26;
        int i36;
        e eVar8;
        int i37;
        p153p1.d[] dVarArr2;
        boolean z27;
        boolean z28;
        boolean z29;
        int mode = View.MeasureSpec.getMode(i11);
        int size6 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size7 = View.MeasureSpec.getSize(i12);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i38 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        d dVar12 = this.f12273F;
        dVar12.f21918b = iMax5;
        dVar12.f21919c = iMax6;
        dVar12.f21920d = paddingWidth;
        dVar12.f21921e = i38;
        dVar12.f21922f = i11;
        dVar12.g = i12;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (k()) {
            iMax7 = iMax8;
        }
        int i39 = size6 - paddingWidth;
        int i40 = size7 - i38;
        int i41 = dVar12.f21921e;
        int i42 = dVar12.f21920d;
        int childCount2 = getChildCount();
        p153p1.d dVar13 = p153p1.d.f20847s;
        p153p1.d dVar14 = p153p1.d.f20846r;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                iMax = mode != 1073741824 ? 0 : Math.min(this.f12279w - i42, i39);
                i13 = Integer.MIN_VALUE;
                dVar13 = dVar14;
            } else {
                if (childCount2 == 0) {
                    iMax = Math.max(0, this.f12277u);
                } else {
                    iMax = 0;
                }
                i13 = Integer.MIN_VALUE;
            }
            if (mode2 != i13) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        dVar = dVar14;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.f12280x - i41, i40);
                        dVar = dVar14;
                    }
                } else if (childCount2 == 0) {
                    dVar = dVar13;
                    iMax2 = Math.max(0, this.f12278v);
                } else {
                    iMax2 = 0;
                }
                iM = fVar.m();
                eVar = fVar.f20904i0;
                if (iMax == iM || iMax2 != fVar.j()) {
                    eVar.f21250c = true;
                }
                fVar.f20866P = 0;
                fVar.Q = 0;
                int i43 = this.f12279w - i42;
                int[] iArr = fVar.f20896u;
                iArr[0] = i43;
                iArr[1] = this.f12280x - i41;
                fVar.S = 0;
                fVar.T = 0;
                fVar.x(dVar13);
                fVar.z(iMax);
                fVar.y(dVar);
                fVar.w(iMax2);
                i14 = this.f12277u - i42;
                if (i14 < 0) {
                    fVar.S = 0;
                } else {
                    fVar.S = i14;
                }
                i15 = this.f12278v - i41;
                if (i15 < 0) {
                    fVar.T = 0;
                } else {
                    fVar.T = i15;
                }
                fVar.f20908m0 = iMax7;
                fVar.f20909n0 = iMax5;
                iVar = fVar.f20903h0;
                fVar2 = (f) iVar.f16424u;
                arrayList = (ArrayList) iVar.f16422s;
                dVar2 = fVar.f20905j0;
                size = fVar.f20902g0.size();
                iM2 = fVar.m();
                iJ = fVar.j();
                if ((i10 & 128) == 128) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || (i10 & 64) == 64) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar3 = p153p1.d.f20848t;
                boolean z30 = z11;
                if (z11) {
                    i36 = 0;
                    while (true) {
                        i16 = size;
                        if (i36 < size) {
                            eVar8 = (e) fVar.f20902g0.get(i36);
                            i37 = i36;
                            dVarArr2 = eVar8.f20860J;
                            if (dVarArr2[0] == dVar3) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if (dVarArr2[1] == dVar3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            if (z27 || !z28 || eVar8.f20864N <= 0.0f) {
                                z29 = false;
                            } else {
                                z29 = true;
                            }
                            if ((eVar8.r() || !z29) && !((eVar8.s() && z29) || (eVar8 instanceof h) || eVar8.r() || eVar8.s())) {
                                i36 = i37 + 1;
                                size = i16;
                            } else {
                                z12 = false;
                            }
                        }
                        if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
                            int iMin2 = Math.min(fVar.f20896u[0], i39);
                            iMin = Math.min(fVar.f20896u[1], i40);
                            if (mode == 1073741824 || fVar.m() == iMin2) {
                                z23 = true;
                            } else {
                                fVar.z(iMin2);
                                z23 = true;
                                eVar.f21249b = true;
                            }
                            if (mode2 == 1073741824 && fVar.j() != iMin) {
                                fVar.w(iMin);
                                eVar.f21249b = z23;
                            }
                            if (mode == 1073741824 || mode2 != 1073741824) {
                                iVar2 = iVar;
                                fVar3 = fVar2;
                                arrayList2 = arrayList;
                                dVar2 = dVar2;
                                i17 = iM2;
                                i18 = iJ;
                                dVar4 = dVar3;
                                dVar5 = dVar14;
                                dVar6 = dVar13;
                                fVar4 = eVar.f21248a;
                                if (eVar.f21249b) {
                                    arrayList5 = fVar4.f20902g0;
                                    size5 = arrayList5.size();
                                    i33 = 0;
                                    while (i33 < size5) {
                                        Object obj = arrayList5.get(i33);
                                        i33++;
                                        e eVar9 = (e) obj;
                                        eVar9.f20872a = false;
                                        j jVar = eVar9.f20878d;
                                        jVar.f21275e.j = false;
                                        jVar.g = false;
                                        jVar.n();
                                        p163q1.l lVar = eVar9.f20880e;
                                        lVar.f21275e.j = false;
                                        lVar.g = false;
                                        lVar.m();
                                    }
                                    i31 = 0;
                                    fVar4.f20872a = false;
                                    j jVar2 = fVar4.f20878d;
                                    jVar2.f21275e.j = false;
                                    jVar2.g = false;
                                    jVar2.n();
                                    p163q1.l lVar2 = fVar4.f20880e;
                                    lVar2.f21275e.j = false;
                                    lVar2.g = false;
                                    lVar2.m();
                                    eVar.c();
                                } else {
                                    i31 = 0;
                                }
                                eVar.b(eVar.f21251d);
                                fVar4.f20866P = i31;
                                fVar4.Q = i31;
                                fVar4.f20878d.f21277h.d(i31);
                                fVar4.f20880e.f21277h.d(i31);
                                i32 = 1073741824;
                                if (mode == 1073741824) {
                                    zE2 = fVar.E(i31, z10);
                                    i19 = 1;
                                } else {
                                    i19 = 0;
                                    zE2 = true;
                                }
                                if (mode2 == 1073741824) {
                                    zE = fVar.E(1, z10) & zE2;
                                    i19++;
                                } else {
                                    zE = zE2;
                                }
                            } else {
                                ArrayList arrayList6 = eVar.f21252e;
                                f fVar5 = eVar.f21248a;
                                if (eVar.f21249b || eVar.f21250c) {
                                    ArrayList arrayList7 = fVar5.f20902g0;
                                    int size8 = arrayList7.size();
                                    int i44 = 0;
                                    while (i44 < size8) {
                                        ArrayList arrayList8 = arrayList7;
                                        e eVar10 = (e) arrayList7.get(i44);
                                        eVar10.f20872a = false;
                                        eVar10.f20878d.n();
                                        eVar10.f20880e.m();
                                        i44++;
                                        arrayList7 = arrayList8;
                                    }
                                    i34 = 0;
                                    fVar5.f20872a = false;
                                    fVar5.f20878d.n();
                                    fVar5.f20880e.m();
                                    eVar.f21250c = false;
                                } else {
                                    i34 = 0;
                                }
                                eVar.b(eVar.f21251d);
                                fVar5.f20866P = i34;
                                p163q1.l lVar3 = fVar5.f20880e;
                                j jVar3 = fVar5.f20878d;
                                fVar5.Q = i34;
                                arrayList2 = arrayList;
                                p153p1.d dVarI2 = fVar5.i(i34);
                                fVar3 = fVar2;
                                p153p1.d dVarI3 = fVar5.i(1);
                                if (eVar.f21249b) {
                                    eVar.c();
                                }
                                int iN = fVar5.n();
                                i17 = iM2;
                                int iO = fVar5.o();
                                i18 = iJ;
                                p163q1.f fVar6 = jVar3.f21277h;
                                iVar2 = iVar;
                                g gVar = jVar3.f21275e;
                                fVar6.d(iN);
                                p163q1.f fVar7 = lVar3.f21277h;
                                g gVar2 = lVar3.f21275e;
                                fVar7.d(iO);
                                eVar.g();
                                dVar6 = dVar13;
                                if (dVarI2 == dVar6 || dVarI3 == dVar6) {
                                    i35 = iO;
                                    if (z10) {
                                        int size9 = arrayList6.size();
                                        dVar4 = dVar3;
                                        int i45 = 0;
                                        while (i45 < size9) {
                                            Object obj2 = arrayList6.get(i45);
                                            i45++;
                                            if (!((m) obj2).k()) {
                                                z10 = false;
                                                break;
                                            }
                                        }
                                    } else {
                                        dVar4 = dVar3;
                                    }
                                    if (z10 && dVarI2 == dVar6) {
                                        dVar5 = dVar14;
                                        fVar5.x(dVar5);
                                        fVar5.z(eVar.d(fVar5, 0));
                                        gVar.d(fVar5.m());
                                    } else {
                                        dVar5 = dVar14;
                                    }
                                    if (z10 && dVarI3 == dVar6) {
                                        fVar5.y(dVar5);
                                        fVar5.w(eVar.d(fVar5, 1));
                                        gVar2.d(fVar5.j());
                                    }
                                } else {
                                    i35 = iO;
                                    dVar4 = dVar3;
                                    dVar5 = dVar14;
                                }
                                p153p1.d dVar15 = fVar5.f20860J[0];
                                p153p1.d dVar16 = p153p1.d.f20849u;
                                if (dVar15 == dVar5 || dVar15 == dVar16) {
                                    int iM7 = fVar5.m() + iN;
                                    jVar3.f21278i.d(iM7);
                                    gVar.d(iM7 - iN);
                                    eVar.g();
                                    p153p1.d dVar17 = fVar5.f20860J[1];
                                    if (dVar17 == dVar5 || dVar17 == dVar16) {
                                        int iJ6 = fVar5.j() + i35;
                                        lVar3.f21278i.d(iJ6);
                                        gVar2.d(iJ6 - i35);
                                    }
                                    eVar.g();
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                int size10 = arrayList6.size();
                                int i46 = 0;
                                while (i46 < size10) {
                                    Object obj3 = arrayList6.get(i46);
                                    i46++;
                                    m mVar = (m) obj3;
                                    if (mVar.f21272b != fVar5 || mVar.g) {
                                        mVar.e();
                                    }
                                }
                                int size11 = arrayList6.size();
                                int i47 = 0;
                                while (true) {
                                    if (i47 >= size11) {
                                        zE = true;
                                        break;
                                    }
                                    Object obj4 = arrayList6.get(i47);
                                    i47++;
                                    m mVar2 = (m) obj4;
                                    if (z26 || mVar2.f21272b != fVar5) {
                                        if (!mVar2.f21277h.j || ((!mVar2.f21278i.j && !(mVar2 instanceof p163q1.h)) || (!mVar2.f21275e.j && !(mVar2 instanceof p163q1.c) && !(mVar2 instanceof p163q1.h)))) {
                                            zE = false;
                                            break;
                                        }
                                    }
                                }
                                fVar5.x(dVarI2);
                                fVar5.y(dVarI3);
                                i19 = 2;
                                i32 = 1073741824;
                            }
                            if (zE) {
                                if (mode == i32) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (mode2 == i32) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                fVar.A(z24, z25);
                            }
                        } else {
                            iVar2 = iVar;
                            fVar3 = fVar2;
                            arrayList2 = arrayList;
                            dVar2 = dVar2;
                            i17 = iM2;
                            i18 = iJ;
                            dVar4 = dVar3;
                            dVar5 = dVar14;
                            dVar6 = dVar13;
                            zE = false;
                            i19 = 0;
                        }
                        if (zE || i19 != 2) {
                            if (i16 > 0) {
                                size3 = fVar.f20902g0.size();
                                dVar10 = fVar.f20905j0;
                                i28 = 0;
                                while (i28 < size3) {
                                    eVar7 = (e) fVar.f20902g0.get(i28);
                                    if ((eVar7 instanceof i) && !(eVar7.f20878d.f21275e.j && eVar7.f20880e.f21275e.j)) {
                                        dVarI = eVar7.i(0);
                                        p153p1.d dVarI4 = eVar7.i(1);
                                        dVar11 = dVar4;
                                        if (dVarI == dVar11 || eVar7.j == 1 || dVarI4 != dVar11 || eVar7.f20886k == 1) {
                                            iVar4 = iVar2;
                                            iVar4.y(dVar10, eVar7, false);
                                        } else {
                                            iVar4 = iVar2;
                                        }
                                    } else {
                                        iVar4 = iVar2;
                                        dVar11 = dVar4;
                                    }
                                    i28++;
                                    iVar2 = iVar4;
                                    dVar4 = dVar11;
                                }
                                iVar3 = iVar2;
                                constraintLayout = dVar10.f21917a;
                                childCount = constraintLayout.getChildCount();
                                arrayList4 = constraintLayout.f12275s;
                                for (i29 = 0; i29 < childCount; i29++) {
                                    childAt = constraintLayout.getChildAt(i29);
                                    if (childAt instanceof Placeholder) {
                                        placeholder = (Placeholder) childAt;
                                        if (placeholder.f12285s == null) {
                                            c cVar2 = (c) placeholder.getLayoutParams();
                                            cVar = (c) placeholder.f12285s.getLayoutParams();
                                            eVar4 = cVar.f21902l0;
                                            eVar4.f20869X = 0;
                                            eVar5 = cVar2.f21902l0;
                                            if (eVar5.f20860J[0] != dVar5) {
                                                eVar5.z(eVar4.m());
                                            }
                                            eVar6 = cVar2.f21902l0;
                                            if (eVar6.f20860J[1] != dVar5) {
                                                eVar6.w(cVar.f21902l0.j());
                                            }
                                            cVar.f21902l0.f20869X = 8;
                                        }
                                    }
                                }
                                size4 = arrayList4.size();
                                if (size4 > 0) {
                                    for (i30 = 0; i30 < size4; i30++) {
                                        ((ConstraintHelper) arrayList4.get(i30)).getClass();
                                    }
                                }
                            } else {
                                iVar3 = iVar2;
                            }
                            i20 = fVar.f20914s0;
                            size2 = arrayList2.size();
                            i21 = i17;
                            i22 = i18;
                            if (i16 > 0) {
                                iVar3.L(fVar, i21, i22);
                            }
                            if (size2 > 0) {
                                dVarArr = fVar.f20860J;
                                z13 = false;
                                if (dVarArr[0] == dVar6) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (dVarArr[1] == dVar6) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                f fVar8 = fVar3;
                                iMax3 = Math.max(fVar.m(), fVar8.S);
                                iMax4 = Math.max(fVar.j(), fVar8.T);
                                i23 = 0;
                                zY = false;
                                while (i23 < size2) {
                                    ArrayList arrayList9 = arrayList2;
                                    eVar3 = (e) arrayList9.get(i23);
                                    if (eVar3 instanceof h) {
                                        iM5 = eVar3.m();
                                        iJ4 = eVar3.j();
                                        z20 = z16;
                                        dVar9 = dVar2;
                                        z21 = z15;
                                        boolean zY2 = zY | iVar3.y(dVar9, eVar3, true);
                                        iM6 = eVar3.m();
                                        z22 = zY2;
                                        iJ5 = eVar3.j();
                                        if (iM6 != iM5) {
                                            eVar3.z(iM6);
                                            if (z21 && eVar3.n() + eVar3.f20862L > iMax3) {
                                                iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                                            }
                                            z22 = true;
                                        }
                                        if (iJ5 != iJ4) {
                                            eVar3.w(iJ5);
                                            if (z20 && eVar3.o() + eVar3.f20863M > iMax4) {
                                                iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                                            }
                                            z22 = true;
                                        }
                                        zY = z22 | ((h) eVar3).f20956o0;
                                    } else {
                                        z20 = z16;
                                        dVar9 = dVar2;
                                        z21 = z15;
                                    }
                                    i23++;
                                    arrayList2 = arrayList9;
                                    z15 = z21;
                                    dVar2 = dVar9;
                                    z16 = z20;
                                }
                                z17 = z16;
                                dVar7 = dVar2;
                                arrayList3 = arrayList2;
                                z18 = z15;
                                i24 = 0;
                                while (i24 < 2) {
                                    i25 = 0;
                                    while (i25 < size2) {
                                        eVar2 = (e) arrayList3.get(i25);
                                        if (((eVar2 instanceof p153p1.j) || (eVar2 instanceof h)) && !(eVar2 instanceof i)) {
                                            if (eVar2.f20869X == 8 && ((!eVar2.f20878d.f21275e.j || !eVar2.f20880e.f21275e.j) && !(eVar2 instanceof h))) {
                                                iM3 = eVar2.m();
                                                iJ2 = eVar2.j();
                                                i26 = size2;
                                                int i48 = eVar2.R;
                                                i27 = i24;
                                                zY |= iVar3.y(dVar7, eVar2, true);
                                                iM4 = eVar2.m();
                                                dVar8 = dVar7;
                                                iJ3 = eVar2.j();
                                                if (iM4 != iM3) {
                                                    eVar2.z(iM4);
                                                    if (!z18 && eVar2.n() + eVar2.f20862L > iMax3) {
                                                        iMax3 = Math.max(iMax3, eVar2.h(4).c() + eVar2.n() + eVar2.f20862L);
                                                    }
                                                    zY = true;
                                                }
                                                if (iJ3 != iJ2) {
                                                    eVar2.w(iJ3);
                                                    if (!z17 && eVar2.o() + eVar2.f20863M > iMax4) {
                                                        iMax4 = Math.max(iMax4, eVar2.h(5).c() + eVar2.o() + eVar2.f20863M);
                                                    }
                                                    zY = true;
                                                }
                                                if (!eVar2.f20898w && i48 != eVar2.R) {
                                                    zY = true;
                                                }
                                            }
                                            i25++;
                                            size2 = i26;
                                            i24 = i27;
                                            dVar7 = dVar8;
                                        }
                                        i26 = size2;
                                        dVar8 = dVar7;
                                        i27 = i24;
                                        i25++;
                                        size2 = i26;
                                        i24 = i27;
                                        dVar7 = dVar8;
                                    }
                                    int i49 = size2;
                                    d dVar18 = dVar7;
                                    int i50 = i24;
                                    if (zY) {
                                        iVar3.L(fVar, i21, i22);
                                        zY = false;
                                    }
                                    i24 = i50 + 1;
                                    size2 = i49;
                                    dVar7 = dVar18;
                                }
                                if (zY) {
                                    iVar3.L(fVar, i21, i22);
                                    if (fVar.m() < iMax3) {
                                        fVar.z(iMax3);
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (fVar.j() < iMax4) {
                                        fVar.w(iMax4);
                                        z19 = true;
                                    }
                                    if (z19) {
                                        iVar3.L(fVar, i21, i22);
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            fVar.f20914s0 = i20;
                            if ((i20 & 256) == 256) {
                                z14 = true;
                            } else {
                                z14 = z13;
                            }
                            p142o1.e.f20228p = z14;
                        }
                        return;
                    }
                }
                i16 = size;
                z12 = z30;
                if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
                    int iMin3 = Math.min(fVar.f20896u[0], i39);
                    iMin = Math.min(fVar.f20896u[1], i40);
                    if (mode == 1073741824) {
                        z23 = true;
                    } else {
                        z23 = true;
                    }
                    if (mode2 == 1073741824) {
                        fVar.w(iMin);
                        eVar.f21249b = z23;
                    }
                    if (mode == 1073741824) {
                        iVar2 = iVar;
                        fVar3 = fVar2;
                        arrayList2 = arrayList;
                        dVar2 = dVar2;
                        i17 = iM2;
                        i18 = iJ;
                        dVar4 = dVar3;
                        dVar5 = dVar14;
                        dVar6 = dVar13;
                        fVar4 = eVar.f21248a;
                        if (eVar.f21249b) {
                            arrayList5 = fVar4.f20902g0;
                            size5 = arrayList5.size();
                            i33 = 0;
                            while (i33 < size5) {
                                Object obj5 = arrayList5.get(i33);
                                i33++;
                                e eVar11 = (e) obj5;
                                eVar11.f20872a = false;
                                j jVar4 = eVar11.f20878d;
                                jVar4.f21275e.j = false;
                                jVar4.g = false;
                                jVar4.n();
                                p163q1.l lVar4 = eVar11.f20880e;
                                lVar4.f21275e.j = false;
                                lVar4.g = false;
                                lVar4.m();
                            }
                            i31 = 0;
                            fVar4.f20872a = false;
                            j jVar5 = fVar4.f20878d;
                            jVar5.f21275e.j = false;
                            jVar5.g = false;
                            jVar5.n();
                            p163q1.l lVar5 = fVar4.f20880e;
                            lVar5.f21275e.j = false;
                            lVar5.g = false;
                            lVar5.m();
                            eVar.c();
                        } else {
                            i31 = 0;
                        }
                        eVar.b(eVar.f21251d);
                        fVar4.f20866P = i31;
                        fVar4.Q = i31;
                        fVar4.f20878d.f21277h.d(i31);
                        fVar4.f20880e.f21277h.d(i31);
                        i32 = 1073741824;
                        if (mode == 1073741824) {
                            zE2 = fVar.E(i31, z10);
                            i19 = 1;
                        } else {
                            i19 = 0;
                            zE2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zE = fVar.E(1, z10) & zE2;
                            i19++;
                        } else {
                            zE = zE2;
                        }
                    } else {
                        iVar2 = iVar;
                        fVar3 = fVar2;
                        arrayList2 = arrayList;
                        dVar2 = dVar2;
                        i17 = iM2;
                        i18 = iJ;
                        dVar4 = dVar3;
                        dVar5 = dVar14;
                        dVar6 = dVar13;
                        fVar4 = eVar.f21248a;
                        if (eVar.f21249b) {
                            arrayList5 = fVar4.f20902g0;
                            size5 = arrayList5.size();
                            i33 = 0;
                            while (i33 < size5) {
                                Object obj6 = arrayList5.get(i33);
                                i33++;
                                e eVar12 = (e) obj6;
                                eVar12.f20872a = false;
                                j jVar6 = eVar12.f20878d;
                                jVar6.f21275e.j = false;
                                jVar6.g = false;
                                jVar6.n();
                                p163q1.l lVar6 = eVar12.f20880e;
                                lVar6.f21275e.j = false;
                                lVar6.g = false;
                                lVar6.m();
                            }
                            i31 = 0;
                            fVar4.f20872a = false;
                            j jVar7 = fVar4.f20878d;
                            jVar7.f21275e.j = false;
                            jVar7.g = false;
                            jVar7.n();
                            p163q1.l lVar7 = fVar4.f20880e;
                            lVar7.f21275e.j = false;
                            lVar7.g = false;
                            lVar7.m();
                            eVar.c();
                        } else {
                            i31 = 0;
                        }
                        eVar.b(eVar.f21251d);
                        fVar4.f20866P = i31;
                        fVar4.Q = i31;
                        fVar4.f20878d.f21277h.d(i31);
                        fVar4.f20880e.f21277h.d(i31);
                        i32 = 1073741824;
                        if (mode == 1073741824) {
                            zE2 = fVar.E(i31, z10);
                            i19 = 1;
                        } else {
                            i19 = 0;
                            zE2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zE = fVar.E(1, z10) & zE2;
                            i19++;
                        } else {
                            zE = zE2;
                        }
                    }
                    if (zE) {
                        if (mode == i32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if (mode2 == i32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        fVar.A(z24, z25);
                    }
                } else {
                    iVar2 = iVar;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    dVar2 = dVar2;
                    i17 = iM2;
                    i18 = iJ;
                    dVar4 = dVar3;
                    dVar5 = dVar14;
                    dVar6 = dVar13;
                    zE = false;
                    i19 = 0;
                }
                if (zE) {
                }
                if (i16 > 0) {
                    size3 = fVar.f20902g0.size();
                    dVar10 = fVar.f20905j0;
                    i28 = 0;
                    while (i28 < size3) {
                        eVar7 = (e) fVar.f20902g0.get(i28);
                        if (eVar7 instanceof i) {
                            iVar4 = iVar2;
                            dVar11 = dVar4;
                        } else {
                            dVarI = eVar7.i(0);
                            p153p1.d dVarI5 = eVar7.i(1);
                            dVar11 = dVar4;
                            if (dVarI == dVar11) {
                                iVar4 = iVar2;
                                iVar4.y(dVar10, eVar7, false);
                            } else {
                                iVar4 = iVar2;
                                iVar4.y(dVar10, eVar7, false);
                            }
                        }
                        i28++;
                        iVar2 = iVar4;
                        dVar4 = dVar11;
                    }
                    iVar3 = iVar2;
                    constraintLayout = dVar10.f21917a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.f12275s;
                    while (i29 < childCount) {
                        childAt = constraintLayout.getChildAt(i29);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.f12285s == null) {
                                c cVar3 = (c) placeholder.getLayoutParams();
                                cVar = (c) placeholder.f12285s.getLayoutParams();
                                eVar4 = cVar.f21902l0;
                                eVar4.f20869X = 0;
                                eVar5 = cVar3.f21902l0;
                                if (eVar5.f20860J[0] != dVar5) {
                                    eVar5.z(eVar4.m());
                                }
                                eVar6 = cVar3.f21902l0;
                                if (eVar6.f20860J[1] != dVar5) {
                                    eVar6.w(cVar.f21902l0.j());
                                }
                                cVar.f21902l0.f20869X = 8;
                            }
                        }
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i30 < size4) {
                            ((ConstraintHelper) arrayList4.get(i30)).getClass();
                        }
                    }
                } else {
                    iVar3 = iVar2;
                }
                i20 = fVar.f20914s0;
                size2 = arrayList2.size();
                i21 = i17;
                i22 = i18;
                if (i16 > 0) {
                    iVar3.L(fVar, i21, i22);
                }
                if (size2 > 0) {
                    dVarArr = fVar.f20860J;
                    z13 = false;
                    if (dVarArr[0] == dVar6) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (dVarArr[1] == dVar6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    f fVar9 = fVar3;
                    iMax3 = Math.max(fVar.m(), fVar9.S);
                    iMax4 = Math.max(fVar.j(), fVar9.T);
                    i23 = 0;
                    zY = false;
                    while (i23 < size2) {
                        ArrayList arrayList10 = arrayList2;
                        eVar3 = (e) arrayList10.get(i23);
                        if (eVar3 instanceof h) {
                            z20 = z16;
                            dVar9 = dVar2;
                            z21 = z15;
                        } else {
                            iM5 = eVar3.m();
                            iJ4 = eVar3.j();
                            z20 = z16;
                            dVar9 = dVar2;
                            z21 = z15;
                            boolean zY3 = zY | iVar3.y(dVar9, eVar3, true);
                            iM6 = eVar3.m();
                            z22 = zY3;
                            iJ5 = eVar3.j();
                            if (iM6 != iM5) {
                                eVar3.z(iM6);
                                if (z21) {
                                    iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                                }
                                z22 = true;
                            }
                            if (iJ5 != iJ4) {
                                eVar3.w(iJ5);
                                if (z20) {
                                    iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                                }
                                z22 = true;
                            }
                            zY = z22 | ((h) eVar3).f20956o0;
                        }
                        i23++;
                        arrayList2 = arrayList10;
                        z15 = z21;
                        dVar2 = dVar9;
                        z16 = z20;
                    }
                    z17 = z16;
                    dVar7 = dVar2;
                    arrayList3 = arrayList2;
                    z18 = z15;
                    i24 = 0;
                    while (i24 < 2) {
                        i25 = 0;
                        while (i25 < size2) {
                            eVar2 = (e) arrayList3.get(i25);
                            if (eVar2 instanceof p153p1.j) {
                                if (eVar2.f20869X == 8) {
                                    i26 = size2;
                                    dVar8 = dVar7;
                                    i27 = i24;
                                } else {
                                    iM3 = eVar2.m();
                                    iJ2 = eVar2.j();
                                    i26 = size2;
                                    int i410 = eVar2.R;
                                    i27 = i24;
                                    zY |= iVar3.y(dVar7, eVar2, true);
                                    iM4 = eVar2.m();
                                    dVar8 = dVar7;
                                    iJ3 = eVar2.j();
                                    if (iM4 != iM3) {
                                        eVar2.z(iM4);
                                        if (!z18) {
                                        }
                                        zY = true;
                                    }
                                    if (iJ3 != iJ2) {
                                        eVar2.w(iJ3);
                                        if (!z17) {
                                        }
                                        zY = true;
                                    }
                                    if (!eVar2.f20898w) {
                                    }
                                }
                            } else if (eVar2.f20869X == 8) {
                                i26 = size2;
                                dVar8 = dVar7;
                                i27 = i24;
                            } else {
                                iM3 = eVar2.m();
                                iJ2 = eVar2.j();
                                i26 = size2;
                                int i411 = eVar2.R;
                                i27 = i24;
                                zY |= iVar3.y(dVar7, eVar2, true);
                                iM4 = eVar2.m();
                                dVar8 = dVar7;
                                iJ3 = eVar2.j();
                                if (iM4 != iM3) {
                                    eVar2.z(iM4);
                                    if (!z18) {
                                    }
                                    zY = true;
                                }
                                if (iJ3 != iJ2) {
                                    eVar2.w(iJ3);
                                    if (!z17) {
                                    }
                                    zY = true;
                                }
                                if (!eVar2.f20898w) {
                                }
                            }
                            i25++;
                            size2 = i26;
                            i24 = i27;
                            dVar7 = dVar8;
                        }
                        int i412 = size2;
                        d dVar19 = dVar7;
                        int i51 = i24;
                        if (zY) {
                            iVar3.L(fVar, i21, i22);
                            zY = false;
                        }
                        i24 = i51 + 1;
                        size2 = i412;
                        dVar7 = dVar19;
                    }
                    if (zY) {
                        iVar3.L(fVar, i21, i22);
                        if (fVar.m() < iMax3) {
                            fVar.z(iMax3);
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (fVar.j() < iMax4) {
                            fVar.w(iMax4);
                            z19 = true;
                        }
                        if (z19) {
                            iVar3.L(fVar, i21, i22);
                        }
                    }
                } else {
                    z13 = false;
                }
                fVar.f20914s0 = i20;
                if ((i20 & 256) == 256) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                p142o1.e.f20228p = z14;
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.f12278v);
            } else {
                iMax2 = i40;
            }
            dVar = dVar13;
            iM = fVar.m();
            eVar = fVar.f20904i0;
            if (iMax == iM) {
                eVar.f21250c = true;
            } else {
                eVar.f21250c = true;
            }
            fVar.f20866P = 0;
            fVar.Q = 0;
            int i413 = this.f12279w - i42;
            int[] iArr2 = fVar.f20896u;
            iArr2[0] = i413;
            iArr2[1] = this.f12280x - i41;
            fVar.S = 0;
            fVar.T = 0;
            fVar.x(dVar13);
            fVar.z(iMax);
            fVar.y(dVar);
            fVar.w(iMax2);
            i14 = this.f12277u - i42;
            if (i14 < 0) {
                fVar.S = 0;
            } else {
                fVar.S = i14;
            }
            i15 = this.f12278v - i41;
            if (i15 < 0) {
                fVar.T = 0;
            } else {
                fVar.T = i15;
            }
            fVar.f20908m0 = iMax7;
            fVar.f20909n0 = iMax5;
            iVar = fVar.f20903h0;
            fVar2 = (f) iVar.f16424u;
            arrayList = (ArrayList) iVar.f16422s;
            dVar2 = fVar.f20905j0;
            size = fVar.f20902g0.size();
            iM2 = fVar.m();
            iJ = fVar.j();
            if ((i10 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
            }
            dVar3 = p153p1.d.f20848t;
            boolean z31 = z11;
            if (z11) {
                i36 = 0;
                while (true) {
                    i16 = size;
                    if (i36 < size) {
                        eVar8 = (e) fVar.f20902g0.get(i36);
                        i37 = i36;
                        dVarArr2 = eVar8.f20860J;
                        if (dVarArr2[0] == dVar3) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if (dVarArr2[1] == dVar3) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if (z27) {
                            z29 = false;
                        } else {
                            z29 = false;
                        }
                        if (eVar8.r()) {
                            i36 = i37 + 1;
                            size = i16;
                        } else {
                            i36 = i37 + 1;
                            size = i16;
                        }
                        z12 = false;
                    }
                    if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
                        int iMin4 = Math.min(fVar.f20896u[0], i39);
                        iMin = Math.min(fVar.f20896u[1], i40);
                        if (mode == 1073741824) {
                            z23 = true;
                        } else {
                            z23 = true;
                        }
                        if (mode2 == 1073741824) {
                            fVar.w(iMin);
                            eVar.f21249b = z23;
                        }
                        if (mode == 1073741824) {
                            iVar2 = iVar;
                            fVar3 = fVar2;
                            arrayList2 = arrayList;
                            dVar2 = dVar2;
                            i17 = iM2;
                            i18 = iJ;
                            dVar4 = dVar3;
                            dVar5 = dVar14;
                            dVar6 = dVar13;
                            fVar4 = eVar.f21248a;
                            if (eVar.f21249b) {
                                arrayList5 = fVar4.f20902g0;
                                size5 = arrayList5.size();
                                i33 = 0;
                                while (i33 < size5) {
                                    Object obj7 = arrayList5.get(i33);
                                    i33++;
                                    e eVar13 = (e) obj7;
                                    eVar13.f20872a = false;
                                    j jVar8 = eVar13.f20878d;
                                    jVar8.f21275e.j = false;
                                    jVar8.g = false;
                                    jVar8.n();
                                    p163q1.l lVar8 = eVar13.f20880e;
                                    lVar8.f21275e.j = false;
                                    lVar8.g = false;
                                    lVar8.m();
                                }
                                i31 = 0;
                                fVar4.f20872a = false;
                                j jVar9 = fVar4.f20878d;
                                jVar9.f21275e.j = false;
                                jVar9.g = false;
                                jVar9.n();
                                p163q1.l lVar9 = fVar4.f20880e;
                                lVar9.f21275e.j = false;
                                lVar9.g = false;
                                lVar9.m();
                                eVar.c();
                            } else {
                                i31 = 0;
                            }
                            eVar.b(eVar.f21251d);
                            fVar4.f20866P = i31;
                            fVar4.Q = i31;
                            fVar4.f20878d.f21277h.d(i31);
                            fVar4.f20880e.f21277h.d(i31);
                            i32 = 1073741824;
                            if (mode == 1073741824) {
                                zE2 = fVar.E(i31, z10);
                                i19 = 1;
                            } else {
                                i19 = 0;
                                zE2 = true;
                            }
                            if (mode2 == 1073741824) {
                                zE = fVar.E(1, z10) & zE2;
                                i19++;
                            } else {
                                zE = zE2;
                            }
                        } else {
                            iVar2 = iVar;
                            fVar3 = fVar2;
                            arrayList2 = arrayList;
                            dVar2 = dVar2;
                            i17 = iM2;
                            i18 = iJ;
                            dVar4 = dVar3;
                            dVar5 = dVar14;
                            dVar6 = dVar13;
                            fVar4 = eVar.f21248a;
                            if (eVar.f21249b) {
                                arrayList5 = fVar4.f20902g0;
                                size5 = arrayList5.size();
                                i33 = 0;
                                while (i33 < size5) {
                                    Object obj8 = arrayList5.get(i33);
                                    i33++;
                                    e eVar14 = (e) obj8;
                                    eVar14.f20872a = false;
                                    j jVar10 = eVar14.f20878d;
                                    jVar10.f21275e.j = false;
                                    jVar10.g = false;
                                    jVar10.n();
                                    p163q1.l lVar10 = eVar14.f20880e;
                                    lVar10.f21275e.j = false;
                                    lVar10.g = false;
                                    lVar10.m();
                                }
                                i31 = 0;
                                fVar4.f20872a = false;
                                j jVar11 = fVar4.f20878d;
                                jVar11.f21275e.j = false;
                                jVar11.g = false;
                                jVar11.n();
                                p163q1.l lVar11 = fVar4.f20880e;
                                lVar11.f21275e.j = false;
                                lVar11.g = false;
                                lVar11.m();
                                eVar.c();
                            } else {
                                i31 = 0;
                            }
                            eVar.b(eVar.f21251d);
                            fVar4.f20866P = i31;
                            fVar4.Q = i31;
                            fVar4.f20878d.f21277h.d(i31);
                            fVar4.f20880e.f21277h.d(i31);
                            i32 = 1073741824;
                            if (mode == 1073741824) {
                                zE2 = fVar.E(i31, z10);
                                i19 = 1;
                            } else {
                                i19 = 0;
                                zE2 = true;
                            }
                            if (mode2 == 1073741824) {
                                zE = fVar.E(1, z10) & zE2;
                                i19++;
                            } else {
                                zE = zE2;
                            }
                        }
                        if (zE) {
                            if (mode == i32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if (mode2 == i32) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            fVar.A(z24, z25);
                        }
                    } else {
                        iVar2 = iVar;
                        fVar3 = fVar2;
                        arrayList2 = arrayList;
                        dVar2 = dVar2;
                        i17 = iM2;
                        i18 = iJ;
                        dVar4 = dVar3;
                        dVar5 = dVar14;
                        dVar6 = dVar13;
                        zE = false;
                        i19 = 0;
                    }
                    if (zE) {
                    }
                    if (i16 > 0) {
                        size3 = fVar.f20902g0.size();
                        dVar10 = fVar.f20905j0;
                        i28 = 0;
                        while (i28 < size3) {
                            eVar7 = (e) fVar.f20902g0.get(i28);
                            if (eVar7 instanceof i) {
                                iVar4 = iVar2;
                                dVar11 = dVar4;
                            } else {
                                dVarI = eVar7.i(0);
                                p153p1.d dVarI6 = eVar7.i(1);
                                dVar11 = dVar4;
                                if (dVarI == dVar11) {
                                    iVar4 = iVar2;
                                    iVar4.y(dVar10, eVar7, false);
                                } else {
                                    iVar4 = iVar2;
                                    iVar4.y(dVar10, eVar7, false);
                                }
                            }
                            i28++;
                            iVar2 = iVar4;
                            dVar4 = dVar11;
                        }
                        iVar3 = iVar2;
                        constraintLayout = dVar10.f21917a;
                        childCount = constraintLayout.getChildCount();
                        arrayList4 = constraintLayout.f12275s;
                        while (i29 < childCount) {
                            childAt = constraintLayout.getChildAt(i29);
                            if (childAt instanceof Placeholder) {
                                placeholder = (Placeholder) childAt;
                                if (placeholder.f12285s == null) {
                                    c cVar4 = (c) placeholder.getLayoutParams();
                                    cVar = (c) placeholder.f12285s.getLayoutParams();
                                    eVar4 = cVar.f21902l0;
                                    eVar4.f20869X = 0;
                                    eVar5 = cVar4.f21902l0;
                                    if (eVar5.f20860J[0] != dVar5) {
                                        eVar5.z(eVar4.m());
                                    }
                                    eVar6 = cVar4.f21902l0;
                                    if (eVar6.f20860J[1] != dVar5) {
                                        eVar6.w(cVar.f21902l0.j());
                                    }
                                    cVar.f21902l0.f20869X = 8;
                                }
                            }
                        }
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            while (i30 < size4) {
                                ((ConstraintHelper) arrayList4.get(i30)).getClass();
                            }
                        }
                    } else {
                        iVar3 = iVar2;
                    }
                    i20 = fVar.f20914s0;
                    size2 = arrayList2.size();
                    i21 = i17;
                    i22 = i18;
                    if (i16 > 0) {
                        iVar3.L(fVar, i21, i22);
                    }
                    if (size2 > 0) {
                        dVarArr = fVar.f20860J;
                        z13 = false;
                        if (dVarArr[0] == dVar6) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (dVarArr[1] == dVar6) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        f fVar10 = fVar3;
                        iMax3 = Math.max(fVar.m(), fVar10.S);
                        iMax4 = Math.max(fVar.j(), fVar10.T);
                        i23 = 0;
                        zY = false;
                        while (i23 < size2) {
                            ArrayList arrayList11 = arrayList2;
                            eVar3 = (e) arrayList11.get(i23);
                            if (eVar3 instanceof h) {
                                z20 = z16;
                                dVar9 = dVar2;
                                z21 = z15;
                            } else {
                                iM5 = eVar3.m();
                                iJ4 = eVar3.j();
                                z20 = z16;
                                dVar9 = dVar2;
                                z21 = z15;
                                boolean zY4 = zY | iVar3.y(dVar9, eVar3, true);
                                iM6 = eVar3.m();
                                z22 = zY4;
                                iJ5 = eVar3.j();
                                if (iM6 != iM5) {
                                    eVar3.z(iM6);
                                    if (z21) {
                                        iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                                    }
                                    z22 = true;
                                }
                                if (iJ5 != iJ4) {
                                    eVar3.w(iJ5);
                                    if (z20) {
                                        iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                                    }
                                    z22 = true;
                                }
                                zY = z22 | ((h) eVar3).f20956o0;
                            }
                            i23++;
                            arrayList2 = arrayList11;
                            z15 = z21;
                            dVar2 = dVar9;
                            z16 = z20;
                        }
                        z17 = z16;
                        dVar7 = dVar2;
                        arrayList3 = arrayList2;
                        z18 = z15;
                        i24 = 0;
                        while (i24 < 2) {
                            i25 = 0;
                            while (i25 < size2) {
                                eVar2 = (e) arrayList3.get(i25);
                                if (eVar2 instanceof p153p1.j) {
                                    if (eVar2.f20869X == 8) {
                                        i26 = size2;
                                        dVar8 = dVar7;
                                        i27 = i24;
                                    } else {
                                        iM3 = eVar2.m();
                                        iJ2 = eVar2.j();
                                        i26 = size2;
                                        int i414 = eVar2.R;
                                        i27 = i24;
                                        zY |= iVar3.y(dVar7, eVar2, true);
                                        iM4 = eVar2.m();
                                        dVar8 = dVar7;
                                        iJ3 = eVar2.j();
                                        if (iM4 != iM3) {
                                            eVar2.z(iM4);
                                            if (!z18) {
                                            }
                                            zY = true;
                                        }
                                        if (iJ3 != iJ2) {
                                            eVar2.w(iJ3);
                                            if (!z17) {
                                            }
                                            zY = true;
                                        }
                                        if (!eVar2.f20898w) {
                                        }
                                    }
                                } else if (eVar2.f20869X == 8) {
                                    i26 = size2;
                                    dVar8 = dVar7;
                                    i27 = i24;
                                } else {
                                    iM3 = eVar2.m();
                                    iJ2 = eVar2.j();
                                    i26 = size2;
                                    int i415 = eVar2.R;
                                    i27 = i24;
                                    zY |= iVar3.y(dVar7, eVar2, true);
                                    iM4 = eVar2.m();
                                    dVar8 = dVar7;
                                    iJ3 = eVar2.j();
                                    if (iM4 != iM3) {
                                        eVar2.z(iM4);
                                        if (!z18) {
                                        }
                                        zY = true;
                                    }
                                    if (iJ3 != iJ2) {
                                        eVar2.w(iJ3);
                                        if (!z17) {
                                        }
                                        zY = true;
                                    }
                                    if (!eVar2.f20898w) {
                                    }
                                }
                                i25++;
                                size2 = i26;
                                i24 = i27;
                                dVar7 = dVar8;
                            }
                            int i416 = size2;
                            d dVar110 = dVar7;
                            int i52 = i24;
                            if (zY) {
                                iVar3.L(fVar, i21, i22);
                                zY = false;
                            }
                            i24 = i52 + 1;
                            size2 = i416;
                            dVar7 = dVar110;
                        }
                        if (zY) {
                            iVar3.L(fVar, i21, i22);
                            if (fVar.m() < iMax3) {
                                fVar.z(iMax3);
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (fVar.j() < iMax4) {
                                fVar.w(iMax4);
                                z19 = true;
                            }
                            if (z19) {
                                iVar3.L(fVar, i21, i22);
                            }
                        }
                    } else {
                        z13 = false;
                    }
                    fVar.f20914s0 = i20;
                    if ((i20 & 256) == 256) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    p142o1.e.f20228p = z14;
                }
            }
            i16 = size;
            z12 = z31;
            if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
                int iMin5 = Math.min(fVar.f20896u[0], i39);
                iMin = Math.min(fVar.f20896u[1], i40);
                if (mode == 1073741824) {
                    z23 = true;
                } else {
                    z23 = true;
                }
                if (mode2 == 1073741824) {
                    fVar.w(iMin);
                    eVar.f21249b = z23;
                }
                if (mode == 1073741824) {
                    iVar2 = iVar;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    dVar2 = dVar2;
                    i17 = iM2;
                    i18 = iJ;
                    dVar4 = dVar3;
                    dVar5 = dVar14;
                    dVar6 = dVar13;
                    fVar4 = eVar.f21248a;
                    if (eVar.f21249b) {
                        arrayList5 = fVar4.f20902g0;
                        size5 = arrayList5.size();
                        i33 = 0;
                        while (i33 < size5) {
                            Object obj9 = arrayList5.get(i33);
                            i33++;
                            e eVar15 = (e) obj9;
                            eVar15.f20872a = false;
                            j jVar12 = eVar15.f20878d;
                            jVar12.f21275e.j = false;
                            jVar12.g = false;
                            jVar12.n();
                            p163q1.l lVar12 = eVar15.f20880e;
                            lVar12.f21275e.j = false;
                            lVar12.g = false;
                            lVar12.m();
                        }
                        i31 = 0;
                        fVar4.f20872a = false;
                        j jVar13 = fVar4.f20878d;
                        jVar13.f21275e.j = false;
                        jVar13.g = false;
                        jVar13.n();
                        p163q1.l lVar13 = fVar4.f20880e;
                        lVar13.f21275e.j = false;
                        lVar13.g = false;
                        lVar13.m();
                        eVar.c();
                    } else {
                        i31 = 0;
                    }
                    eVar.b(eVar.f21251d);
                    fVar4.f20866P = i31;
                    fVar4.Q = i31;
                    fVar4.f20878d.f21277h.d(i31);
                    fVar4.f20880e.f21277h.d(i31);
                    i32 = 1073741824;
                    if (mode == 1073741824) {
                        zE2 = fVar.E(i31, z10);
                        i19 = 1;
                    } else {
                        i19 = 0;
                        zE2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zE = fVar.E(1, z10) & zE2;
                        i19++;
                    } else {
                        zE = zE2;
                    }
                } else {
                    iVar2 = iVar;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    dVar2 = dVar2;
                    i17 = iM2;
                    i18 = iJ;
                    dVar4 = dVar3;
                    dVar5 = dVar14;
                    dVar6 = dVar13;
                    fVar4 = eVar.f21248a;
                    if (eVar.f21249b) {
                        arrayList5 = fVar4.f20902g0;
                        size5 = arrayList5.size();
                        i33 = 0;
                        while (i33 < size5) {
                            Object obj10 = arrayList5.get(i33);
                            i33++;
                            e eVar16 = (e) obj10;
                            eVar16.f20872a = false;
                            j jVar14 = eVar16.f20878d;
                            jVar14.f21275e.j = false;
                            jVar14.g = false;
                            jVar14.n();
                            p163q1.l lVar14 = eVar16.f20880e;
                            lVar14.f21275e.j = false;
                            lVar14.g = false;
                            lVar14.m();
                        }
                        i31 = 0;
                        fVar4.f20872a = false;
                        j jVar15 = fVar4.f20878d;
                        jVar15.f21275e.j = false;
                        jVar15.g = false;
                        jVar15.n();
                        p163q1.l lVar15 = fVar4.f20880e;
                        lVar15.f21275e.j = false;
                        lVar15.g = false;
                        lVar15.m();
                        eVar.c();
                    } else {
                        i31 = 0;
                    }
                    eVar.b(eVar.f21251d);
                    fVar4.f20866P = i31;
                    fVar4.Q = i31;
                    fVar4.f20878d.f21277h.d(i31);
                    fVar4.f20880e.f21277h.d(i31);
                    i32 = 1073741824;
                    if (mode == 1073741824) {
                        zE2 = fVar.E(i31, z10);
                        i19 = 1;
                    } else {
                        i19 = 0;
                        zE2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zE = fVar.E(1, z10) & zE2;
                        i19++;
                    } else {
                        zE = zE2;
                    }
                }
                if (zE) {
                    if (mode == i32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (mode2 == i32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    fVar.A(z24, z25);
                }
            } else {
                iVar2 = iVar;
                fVar3 = fVar2;
                arrayList2 = arrayList;
                dVar2 = dVar2;
                i17 = iM2;
                i18 = iJ;
                dVar4 = dVar3;
                dVar5 = dVar14;
                dVar6 = dVar13;
                zE = false;
                i19 = 0;
            }
            if (zE) {
            }
            if (i16 > 0) {
                size3 = fVar.f20902g0.size();
                dVar10 = fVar.f20905j0;
                i28 = 0;
                while (i28 < size3) {
                    eVar7 = (e) fVar.f20902g0.get(i28);
                    if (eVar7 instanceof i) {
                        iVar4 = iVar2;
                        dVar11 = dVar4;
                    } else {
                        dVarI = eVar7.i(0);
                        p153p1.d dVarI7 = eVar7.i(1);
                        dVar11 = dVar4;
                        if (dVarI == dVar11) {
                            iVar4 = iVar2;
                            iVar4.y(dVar10, eVar7, false);
                        } else {
                            iVar4 = iVar2;
                            iVar4.y(dVar10, eVar7, false);
                        }
                    }
                    i28++;
                    iVar2 = iVar4;
                    dVar4 = dVar11;
                }
                iVar3 = iVar2;
                constraintLayout = dVar10.f21917a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.f12275s;
                while (i29 < childCount) {
                    childAt = constraintLayout.getChildAt(i29);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.f12285s == null) {
                            c cVar5 = (c) placeholder.getLayoutParams();
                            cVar = (c) placeholder.f12285s.getLayoutParams();
                            eVar4 = cVar.f21902l0;
                            eVar4.f20869X = 0;
                            eVar5 = cVar5.f21902l0;
                            if (eVar5.f20860J[0] != dVar5) {
                                eVar5.z(eVar4.m());
                            }
                            eVar6 = cVar5.f21902l0;
                            if (eVar6.f20860J[1] != dVar5) {
                                eVar6.w(cVar.f21902l0.j());
                            }
                            cVar.f21902l0.f20869X = 8;
                        }
                    }
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i30 < size4) {
                        ((ConstraintHelper) arrayList4.get(i30)).getClass();
                    }
                }
            } else {
                iVar3 = iVar2;
            }
            i20 = fVar.f20914s0;
            size2 = arrayList2.size();
            i21 = i17;
            i22 = i18;
            if (i16 > 0) {
                iVar3.L(fVar, i21, i22);
            }
            if (size2 > 0) {
                dVarArr = fVar.f20860J;
                z13 = false;
                if (dVarArr[0] == dVar6) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (dVarArr[1] == dVar6) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                f fVar11 = fVar3;
                iMax3 = Math.max(fVar.m(), fVar11.S);
                iMax4 = Math.max(fVar.j(), fVar11.T);
                i23 = 0;
                zY = false;
                while (i23 < size2) {
                    ArrayList arrayList12 = arrayList2;
                    eVar3 = (e) arrayList12.get(i23);
                    if (eVar3 instanceof h) {
                        z20 = z16;
                        dVar9 = dVar2;
                        z21 = z15;
                    } else {
                        iM5 = eVar3.m();
                        iJ4 = eVar3.j();
                        z20 = z16;
                        dVar9 = dVar2;
                        z21 = z15;
                        boolean zY5 = zY | iVar3.y(dVar9, eVar3, true);
                        iM6 = eVar3.m();
                        z22 = zY5;
                        iJ5 = eVar3.j();
                        if (iM6 != iM5) {
                            eVar3.z(iM6);
                            if (z21) {
                                iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                            }
                            z22 = true;
                        }
                        if (iJ5 != iJ4) {
                            eVar3.w(iJ5);
                            if (z20) {
                                iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                            }
                            z22 = true;
                        }
                        zY = z22 | ((h) eVar3).f20956o0;
                    }
                    i23++;
                    arrayList2 = arrayList12;
                    z15 = z21;
                    dVar2 = dVar9;
                    z16 = z20;
                }
                z17 = z16;
                dVar7 = dVar2;
                arrayList3 = arrayList2;
                z18 = z15;
                i24 = 0;
                while (i24 < 2) {
                    i25 = 0;
                    while (i25 < size2) {
                        eVar2 = (e) arrayList3.get(i25);
                        if (eVar2 instanceof p153p1.j) {
                            if (eVar2.f20869X == 8) {
                                i26 = size2;
                                dVar8 = dVar7;
                                i27 = i24;
                            } else {
                                iM3 = eVar2.m();
                                iJ2 = eVar2.j();
                                i26 = size2;
                                int i417 = eVar2.R;
                                i27 = i24;
                                zY |= iVar3.y(dVar7, eVar2, true);
                                iM4 = eVar2.m();
                                dVar8 = dVar7;
                                iJ3 = eVar2.j();
                                if (iM4 != iM3) {
                                    eVar2.z(iM4);
                                    if (!z18) {
                                    }
                                    zY = true;
                                }
                                if (iJ3 != iJ2) {
                                    eVar2.w(iJ3);
                                    if (!z17) {
                                    }
                                    zY = true;
                                }
                                if (!eVar2.f20898w) {
                                }
                            }
                        } else if (eVar2.f20869X == 8) {
                            i26 = size2;
                            dVar8 = dVar7;
                            i27 = i24;
                        } else {
                            iM3 = eVar2.m();
                            iJ2 = eVar2.j();
                            i26 = size2;
                            int i418 = eVar2.R;
                            i27 = i24;
                            zY |= iVar3.y(dVar7, eVar2, true);
                            iM4 = eVar2.m();
                            dVar8 = dVar7;
                            iJ3 = eVar2.j();
                            if (iM4 != iM3) {
                                eVar2.z(iM4);
                                if (!z18) {
                                }
                                zY = true;
                            }
                            if (iJ3 != iJ2) {
                                eVar2.w(iJ3);
                                if (!z17) {
                                }
                                zY = true;
                            }
                            if (!eVar2.f20898w) {
                            }
                        }
                        i25++;
                        size2 = i26;
                        i24 = i27;
                        dVar7 = dVar8;
                    }
                    int i419 = size2;
                    d dVar111 = dVar7;
                    int i53 = i24;
                    if (zY) {
                        iVar3.L(fVar, i21, i22);
                        zY = false;
                    }
                    i24 = i53 + 1;
                    size2 = i419;
                    dVar7 = dVar111;
                }
                if (zY) {
                    iVar3.L(fVar, i21, i22);
                    if (fVar.m() < iMax3) {
                        fVar.z(iMax3);
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (fVar.j() < iMax4) {
                        fVar.w(iMax4);
                        z19 = true;
                    }
                    if (z19) {
                        iVar3.L(fVar, i21, i22);
                    }
                }
            } else {
                z13 = false;
            }
            fVar.f20914s0 = i20;
            if ((i20 & 256) == 256) {
                z14 = true;
            } else {
                z14 = z13;
            }
            p142o1.e.f20228p = z14;
        }
        iMax = childCount2 == 0 ? Math.max(0, this.f12277u) : i39;
        i13 = Integer.MIN_VALUE;
        if (mode2 != i13) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    dVar = dVar14;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.f12280x - i41, i40);
                    dVar = dVar14;
                }
            } else if (childCount2 == 0) {
                dVar = dVar13;
                iMax2 = Math.max(0, this.f12278v);
            } else {
                iMax2 = 0;
            }
            iM = fVar.m();
            eVar = fVar.f20904i0;
            if (iMax == iM) {
                eVar.f21250c = true;
            } else {
                eVar.f21250c = true;
            }
            fVar.f20866P = 0;
            fVar.Q = 0;
            int i4110 = this.f12279w - i42;
            int[] iArr3 = fVar.f20896u;
            iArr3[0] = i4110;
            iArr3[1] = this.f12280x - i41;
            fVar.S = 0;
            fVar.T = 0;
            fVar.x(dVar13);
            fVar.z(iMax);
            fVar.y(dVar);
            fVar.w(iMax2);
            i14 = this.f12277u - i42;
            if (i14 < 0) {
                fVar.S = 0;
            } else {
                fVar.S = i14;
            }
            i15 = this.f12278v - i41;
            if (i15 < 0) {
                fVar.T = 0;
            } else {
                fVar.T = i15;
            }
            fVar.f20908m0 = iMax7;
            fVar.f20909n0 = iMax5;
            iVar = fVar.f20903h0;
            fVar2 = (f) iVar.f16424u;
            arrayList = (ArrayList) iVar.f16422s;
            dVar2 = fVar.f20905j0;
            size = fVar.f20902g0.size();
            iM2 = fVar.m();
            iJ = fVar.j();
            if ((i10 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
            }
            dVar3 = p153p1.d.f20848t;
            boolean z32 = z11;
            if (z11) {
                i36 = 0;
                while (true) {
                    i16 = size;
                    if (i36 < size) {
                        eVar8 = (e) fVar.f20902g0.get(i36);
                        i37 = i36;
                        dVarArr2 = eVar8.f20860J;
                        if (dVarArr2[0] == dVar3) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if (dVarArr2[1] == dVar3) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if (z27) {
                            z29 = false;
                        } else {
                            z29 = false;
                        }
                        if (eVar8.r()) {
                            i36 = i37 + 1;
                            size = i16;
                        } else {
                            i36 = i37 + 1;
                            size = i16;
                        }
                        z12 = false;
                    }
                    if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
                        int iMin6 = Math.min(fVar.f20896u[0], i39);
                        iMin = Math.min(fVar.f20896u[1], i40);
                        if (mode == 1073741824) {
                            z23 = true;
                        } else {
                            z23 = true;
                        }
                        if (mode2 == 1073741824) {
                            fVar.w(iMin);
                            eVar.f21249b = z23;
                        }
                        if (mode == 1073741824) {
                            iVar2 = iVar;
                            fVar3 = fVar2;
                            arrayList2 = arrayList;
                            dVar2 = dVar2;
                            i17 = iM2;
                            i18 = iJ;
                            dVar4 = dVar3;
                            dVar5 = dVar14;
                            dVar6 = dVar13;
                            fVar4 = eVar.f21248a;
                            if (eVar.f21249b) {
                                arrayList5 = fVar4.f20902g0;
                                size5 = arrayList5.size();
                                i33 = 0;
                                while (i33 < size5) {
                                    Object obj11 = arrayList5.get(i33);
                                    i33++;
                                    e eVar17 = (e) obj11;
                                    eVar17.f20872a = false;
                                    j jVar16 = eVar17.f20878d;
                                    jVar16.f21275e.j = false;
                                    jVar16.g = false;
                                    jVar16.n();
                                    p163q1.l lVar16 = eVar17.f20880e;
                                    lVar16.f21275e.j = false;
                                    lVar16.g = false;
                                    lVar16.m();
                                }
                                i31 = 0;
                                fVar4.f20872a = false;
                                j jVar17 = fVar4.f20878d;
                                jVar17.f21275e.j = false;
                                jVar17.g = false;
                                jVar17.n();
                                p163q1.l lVar17 = fVar4.f20880e;
                                lVar17.f21275e.j = false;
                                lVar17.g = false;
                                lVar17.m();
                                eVar.c();
                            } else {
                                i31 = 0;
                            }
                            eVar.b(eVar.f21251d);
                            fVar4.f20866P = i31;
                            fVar4.Q = i31;
                            fVar4.f20878d.f21277h.d(i31);
                            fVar4.f20880e.f21277h.d(i31);
                            i32 = 1073741824;
                            if (mode == 1073741824) {
                                zE2 = fVar.E(i31, z10);
                                i19 = 1;
                            } else {
                                i19 = 0;
                                zE2 = true;
                            }
                            if (mode2 == 1073741824) {
                                zE = fVar.E(1, z10) & zE2;
                                i19++;
                            } else {
                                zE = zE2;
                            }
                        } else {
                            iVar2 = iVar;
                            fVar3 = fVar2;
                            arrayList2 = arrayList;
                            dVar2 = dVar2;
                            i17 = iM2;
                            i18 = iJ;
                            dVar4 = dVar3;
                            dVar5 = dVar14;
                            dVar6 = dVar13;
                            fVar4 = eVar.f21248a;
                            if (eVar.f21249b) {
                                arrayList5 = fVar4.f20902g0;
                                size5 = arrayList5.size();
                                i33 = 0;
                                while (i33 < size5) {
                                    Object obj12 = arrayList5.get(i33);
                                    i33++;
                                    e eVar18 = (e) obj12;
                                    eVar18.f20872a = false;
                                    j jVar18 = eVar18.f20878d;
                                    jVar18.f21275e.j = false;
                                    jVar18.g = false;
                                    jVar18.n();
                                    p163q1.l lVar18 = eVar18.f20880e;
                                    lVar18.f21275e.j = false;
                                    lVar18.g = false;
                                    lVar18.m();
                                }
                                i31 = 0;
                                fVar4.f20872a = false;
                                j jVar19 = fVar4.f20878d;
                                jVar19.f21275e.j = false;
                                jVar19.g = false;
                                jVar19.n();
                                p163q1.l lVar19 = fVar4.f20880e;
                                lVar19.f21275e.j = false;
                                lVar19.g = false;
                                lVar19.m();
                                eVar.c();
                            } else {
                                i31 = 0;
                            }
                            eVar.b(eVar.f21251d);
                            fVar4.f20866P = i31;
                            fVar4.Q = i31;
                            fVar4.f20878d.f21277h.d(i31);
                            fVar4.f20880e.f21277h.d(i31);
                            i32 = 1073741824;
                            if (mode == 1073741824) {
                                zE2 = fVar.E(i31, z10);
                                i19 = 1;
                            } else {
                                i19 = 0;
                                zE2 = true;
                            }
                            if (mode2 == 1073741824) {
                                zE = fVar.E(1, z10) & zE2;
                                i19++;
                            } else {
                                zE = zE2;
                            }
                        }
                        if (zE) {
                            if (mode == i32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if (mode2 == i32) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            fVar.A(z24, z25);
                        }
                    } else {
                        iVar2 = iVar;
                        fVar3 = fVar2;
                        arrayList2 = arrayList;
                        dVar2 = dVar2;
                        i17 = iM2;
                        i18 = iJ;
                        dVar4 = dVar3;
                        dVar5 = dVar14;
                        dVar6 = dVar13;
                        zE = false;
                        i19 = 0;
                    }
                    if (zE) {
                    }
                    if (i16 > 0) {
                        size3 = fVar.f20902g0.size();
                        dVar10 = fVar.f20905j0;
                        i28 = 0;
                        while (i28 < size3) {
                            eVar7 = (e) fVar.f20902g0.get(i28);
                            if (eVar7 instanceof i) {
                                iVar4 = iVar2;
                                dVar11 = dVar4;
                            } else {
                                dVarI = eVar7.i(0);
                                p153p1.d dVarI8 = eVar7.i(1);
                                dVar11 = dVar4;
                                if (dVarI == dVar11) {
                                    iVar4 = iVar2;
                                    iVar4.y(dVar10, eVar7, false);
                                } else {
                                    iVar4 = iVar2;
                                    iVar4.y(dVar10, eVar7, false);
                                }
                            }
                            i28++;
                            iVar2 = iVar4;
                            dVar4 = dVar11;
                        }
                        iVar3 = iVar2;
                        constraintLayout = dVar10.f21917a;
                        childCount = constraintLayout.getChildCount();
                        arrayList4 = constraintLayout.f12275s;
                        while (i29 < childCount) {
                            childAt = constraintLayout.getChildAt(i29);
                            if (childAt instanceof Placeholder) {
                                placeholder = (Placeholder) childAt;
                                if (placeholder.f12285s == null) {
                                    c cVar6 = (c) placeholder.getLayoutParams();
                                    cVar = (c) placeholder.f12285s.getLayoutParams();
                                    eVar4 = cVar.f21902l0;
                                    eVar4.f20869X = 0;
                                    eVar5 = cVar6.f21902l0;
                                    if (eVar5.f20860J[0] != dVar5) {
                                        eVar5.z(eVar4.m());
                                    }
                                    eVar6 = cVar6.f21902l0;
                                    if (eVar6.f20860J[1] != dVar5) {
                                        eVar6.w(cVar.f21902l0.j());
                                    }
                                    cVar.f21902l0.f20869X = 8;
                                }
                            }
                        }
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            while (i30 < size4) {
                                ((ConstraintHelper) arrayList4.get(i30)).getClass();
                            }
                        }
                    } else {
                        iVar3 = iVar2;
                    }
                    i20 = fVar.f20914s0;
                    size2 = arrayList2.size();
                    i21 = i17;
                    i22 = i18;
                    if (i16 > 0) {
                        iVar3.L(fVar, i21, i22);
                    }
                    if (size2 > 0) {
                        dVarArr = fVar.f20860J;
                        z13 = false;
                        if (dVarArr[0] == dVar6) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (dVarArr[1] == dVar6) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        f fVar12 = fVar3;
                        iMax3 = Math.max(fVar.m(), fVar12.S);
                        iMax4 = Math.max(fVar.j(), fVar12.T);
                        i23 = 0;
                        zY = false;
                        while (i23 < size2) {
                            ArrayList arrayList13 = arrayList2;
                            eVar3 = (e) arrayList13.get(i23);
                            if (eVar3 instanceof h) {
                                z20 = z16;
                                dVar9 = dVar2;
                                z21 = z15;
                            } else {
                                iM5 = eVar3.m();
                                iJ4 = eVar3.j();
                                z20 = z16;
                                dVar9 = dVar2;
                                z21 = z15;
                                boolean zY6 = zY | iVar3.y(dVar9, eVar3, true);
                                iM6 = eVar3.m();
                                z22 = zY6;
                                iJ5 = eVar3.j();
                                if (iM6 != iM5) {
                                    eVar3.z(iM6);
                                    if (z21) {
                                        iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                                    }
                                    z22 = true;
                                }
                                if (iJ5 != iJ4) {
                                    eVar3.w(iJ5);
                                    if (z20) {
                                        iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                                    }
                                    z22 = true;
                                }
                                zY = z22 | ((h) eVar3).f20956o0;
                            }
                            i23++;
                            arrayList2 = arrayList13;
                            z15 = z21;
                            dVar2 = dVar9;
                            z16 = z20;
                        }
                        z17 = z16;
                        dVar7 = dVar2;
                        arrayList3 = arrayList2;
                        z18 = z15;
                        i24 = 0;
                        while (i24 < 2) {
                            i25 = 0;
                            while (i25 < size2) {
                                eVar2 = (e) arrayList3.get(i25);
                                if (eVar2 instanceof p153p1.j) {
                                    if (eVar2.f20869X == 8) {
                                        i26 = size2;
                                        dVar8 = dVar7;
                                        i27 = i24;
                                    } else {
                                        iM3 = eVar2.m();
                                        iJ2 = eVar2.j();
                                        i26 = size2;
                                        int i4111 = eVar2.R;
                                        i27 = i24;
                                        zY |= iVar3.y(dVar7, eVar2, true);
                                        iM4 = eVar2.m();
                                        dVar8 = dVar7;
                                        iJ3 = eVar2.j();
                                        if (iM4 != iM3) {
                                            eVar2.z(iM4);
                                            if (!z18) {
                                            }
                                            zY = true;
                                        }
                                        if (iJ3 != iJ2) {
                                            eVar2.w(iJ3);
                                            if (!z17) {
                                            }
                                            zY = true;
                                        }
                                        if (!eVar2.f20898w) {
                                        }
                                    }
                                } else if (eVar2.f20869X == 8) {
                                    i26 = size2;
                                    dVar8 = dVar7;
                                    i27 = i24;
                                } else {
                                    iM3 = eVar2.m();
                                    iJ2 = eVar2.j();
                                    i26 = size2;
                                    int i4112 = eVar2.R;
                                    i27 = i24;
                                    zY |= iVar3.y(dVar7, eVar2, true);
                                    iM4 = eVar2.m();
                                    dVar8 = dVar7;
                                    iJ3 = eVar2.j();
                                    if (iM4 != iM3) {
                                        eVar2.z(iM4);
                                        if (!z18) {
                                        }
                                        zY = true;
                                    }
                                    if (iJ3 != iJ2) {
                                        eVar2.w(iJ3);
                                        if (!z17) {
                                        }
                                        zY = true;
                                    }
                                    if (!eVar2.f20898w) {
                                    }
                                }
                                i25++;
                                size2 = i26;
                                i24 = i27;
                                dVar7 = dVar8;
                            }
                            int i4113 = size2;
                            d dVar112 = dVar7;
                            int i54 = i24;
                            if (zY) {
                                iVar3.L(fVar, i21, i22);
                                zY = false;
                            }
                            i24 = i54 + 1;
                            size2 = i4113;
                            dVar7 = dVar112;
                        }
                        if (zY) {
                            iVar3.L(fVar, i21, i22);
                            if (fVar.m() < iMax3) {
                                fVar.z(iMax3);
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (fVar.j() < iMax4) {
                                fVar.w(iMax4);
                                z19 = true;
                            }
                            if (z19) {
                                iVar3.L(fVar, i21, i22);
                            }
                        }
                    } else {
                        z13 = false;
                    }
                    fVar.f20914s0 = i20;
                    if ((i20 & 256) == 256) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    p142o1.e.f20228p = z14;
                }
            }
            i16 = size;
            z12 = z32;
            if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
                int iMin7 = Math.min(fVar.f20896u[0], i39);
                iMin = Math.min(fVar.f20896u[1], i40);
                if (mode == 1073741824) {
                    z23 = true;
                } else {
                    z23 = true;
                }
                if (mode2 == 1073741824) {
                    fVar.w(iMin);
                    eVar.f21249b = z23;
                }
                if (mode == 1073741824) {
                    iVar2 = iVar;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    dVar2 = dVar2;
                    i17 = iM2;
                    i18 = iJ;
                    dVar4 = dVar3;
                    dVar5 = dVar14;
                    dVar6 = dVar13;
                    fVar4 = eVar.f21248a;
                    if (eVar.f21249b) {
                        arrayList5 = fVar4.f20902g0;
                        size5 = arrayList5.size();
                        i33 = 0;
                        while (i33 < size5) {
                            Object obj13 = arrayList5.get(i33);
                            i33++;
                            e eVar19 = (e) obj13;
                            eVar19.f20872a = false;
                            j jVar110 = eVar19.f20878d;
                            jVar110.f21275e.j = false;
                            jVar110.g = false;
                            jVar110.n();
                            p163q1.l lVar110 = eVar19.f20880e;
                            lVar110.f21275e.j = false;
                            lVar110.g = false;
                            lVar110.m();
                        }
                        i31 = 0;
                        fVar4.f20872a = false;
                        j jVar111 = fVar4.f20878d;
                        jVar111.f21275e.j = false;
                        jVar111.g = false;
                        jVar111.n();
                        p163q1.l lVar111 = fVar4.f20880e;
                        lVar111.f21275e.j = false;
                        lVar111.g = false;
                        lVar111.m();
                        eVar.c();
                    } else {
                        i31 = 0;
                    }
                    eVar.b(eVar.f21251d);
                    fVar4.f20866P = i31;
                    fVar4.Q = i31;
                    fVar4.f20878d.f21277h.d(i31);
                    fVar4.f20880e.f21277h.d(i31);
                    i32 = 1073741824;
                    if (mode == 1073741824) {
                        zE2 = fVar.E(i31, z10);
                        i19 = 1;
                    } else {
                        i19 = 0;
                        zE2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zE = fVar.E(1, z10) & zE2;
                        i19++;
                    } else {
                        zE = zE2;
                    }
                } else {
                    iVar2 = iVar;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    dVar2 = dVar2;
                    i17 = iM2;
                    i18 = iJ;
                    dVar4 = dVar3;
                    dVar5 = dVar14;
                    dVar6 = dVar13;
                    fVar4 = eVar.f21248a;
                    if (eVar.f21249b) {
                        arrayList5 = fVar4.f20902g0;
                        size5 = arrayList5.size();
                        i33 = 0;
                        while (i33 < size5) {
                            Object obj14 = arrayList5.get(i33);
                            i33++;
                            e eVar110 = (e) obj14;
                            eVar110.f20872a = false;
                            j jVar112 = eVar110.f20878d;
                            jVar112.f21275e.j = false;
                            jVar112.g = false;
                            jVar112.n();
                            p163q1.l lVar112 = eVar110.f20880e;
                            lVar112.f21275e.j = false;
                            lVar112.g = false;
                            lVar112.m();
                        }
                        i31 = 0;
                        fVar4.f20872a = false;
                        j jVar113 = fVar4.f20878d;
                        jVar113.f21275e.j = false;
                        jVar113.g = false;
                        jVar113.n();
                        p163q1.l lVar113 = fVar4.f20880e;
                        lVar113.f21275e.j = false;
                        lVar113.g = false;
                        lVar113.m();
                        eVar.c();
                    } else {
                        i31 = 0;
                    }
                    eVar.b(eVar.f21251d);
                    fVar4.f20866P = i31;
                    fVar4.Q = i31;
                    fVar4.f20878d.f21277h.d(i31);
                    fVar4.f20880e.f21277h.d(i31);
                    i32 = 1073741824;
                    if (mode == 1073741824) {
                        zE2 = fVar.E(i31, z10);
                        i19 = 1;
                    } else {
                        i19 = 0;
                        zE2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zE = fVar.E(1, z10) & zE2;
                        i19++;
                    } else {
                        zE = zE2;
                    }
                }
                if (zE) {
                    if (mode == i32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (mode2 == i32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    fVar.A(z24, z25);
                }
            } else {
                iVar2 = iVar;
                fVar3 = fVar2;
                arrayList2 = arrayList;
                dVar2 = dVar2;
                i17 = iM2;
                i18 = iJ;
                dVar4 = dVar3;
                dVar5 = dVar14;
                dVar6 = dVar13;
                zE = false;
                i19 = 0;
            }
            if (zE) {
            }
            if (i16 > 0) {
                size3 = fVar.f20902g0.size();
                dVar10 = fVar.f20905j0;
                i28 = 0;
                while (i28 < size3) {
                    eVar7 = (e) fVar.f20902g0.get(i28);
                    if (eVar7 instanceof i) {
                        iVar4 = iVar2;
                        dVar11 = dVar4;
                    } else {
                        dVarI = eVar7.i(0);
                        p153p1.d dVarI9 = eVar7.i(1);
                        dVar11 = dVar4;
                        if (dVarI == dVar11) {
                            iVar4 = iVar2;
                            iVar4.y(dVar10, eVar7, false);
                        } else {
                            iVar4 = iVar2;
                            iVar4.y(dVar10, eVar7, false);
                        }
                    }
                    i28++;
                    iVar2 = iVar4;
                    dVar4 = dVar11;
                }
                iVar3 = iVar2;
                constraintLayout = dVar10.f21917a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.f12275s;
                while (i29 < childCount) {
                    childAt = constraintLayout.getChildAt(i29);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.f12285s == null) {
                            c cVar7 = (c) placeholder.getLayoutParams();
                            cVar = (c) placeholder.f12285s.getLayoutParams();
                            eVar4 = cVar.f21902l0;
                            eVar4.f20869X = 0;
                            eVar5 = cVar7.f21902l0;
                            if (eVar5.f20860J[0] != dVar5) {
                                eVar5.z(eVar4.m());
                            }
                            eVar6 = cVar7.f21902l0;
                            if (eVar6.f20860J[1] != dVar5) {
                                eVar6.w(cVar.f21902l0.j());
                            }
                            cVar.f21902l0.f20869X = 8;
                        }
                    }
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i30 < size4) {
                        ((ConstraintHelper) arrayList4.get(i30)).getClass();
                    }
                }
            } else {
                iVar3 = iVar2;
            }
            i20 = fVar.f20914s0;
            size2 = arrayList2.size();
            i21 = i17;
            i22 = i18;
            if (i16 > 0) {
                iVar3.L(fVar, i21, i22);
            }
            if (size2 > 0) {
                dVarArr = fVar.f20860J;
                z13 = false;
                if (dVarArr[0] == dVar6) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (dVarArr[1] == dVar6) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                f fVar13 = fVar3;
                iMax3 = Math.max(fVar.m(), fVar13.S);
                iMax4 = Math.max(fVar.j(), fVar13.T);
                i23 = 0;
                zY = false;
                while (i23 < size2) {
                    ArrayList arrayList14 = arrayList2;
                    eVar3 = (e) arrayList14.get(i23);
                    if (eVar3 instanceof h) {
                        z20 = z16;
                        dVar9 = dVar2;
                        z21 = z15;
                    } else {
                        iM5 = eVar3.m();
                        iJ4 = eVar3.j();
                        z20 = z16;
                        dVar9 = dVar2;
                        z21 = z15;
                        boolean zY7 = zY | iVar3.y(dVar9, eVar3, true);
                        iM6 = eVar3.m();
                        z22 = zY7;
                        iJ5 = eVar3.j();
                        if (iM6 != iM5) {
                            eVar3.z(iM6);
                            if (z21) {
                                iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                            }
                            z22 = true;
                        }
                        if (iJ5 != iJ4) {
                            eVar3.w(iJ5);
                            if (z20) {
                                iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                            }
                            z22 = true;
                        }
                        zY = z22 | ((h) eVar3).f20956o0;
                    }
                    i23++;
                    arrayList2 = arrayList14;
                    z15 = z21;
                    dVar2 = dVar9;
                    z16 = z20;
                }
                z17 = z16;
                dVar7 = dVar2;
                arrayList3 = arrayList2;
                z18 = z15;
                i24 = 0;
                while (i24 < 2) {
                    i25 = 0;
                    while (i25 < size2) {
                        eVar2 = (e) arrayList3.get(i25);
                        if (eVar2 instanceof p153p1.j) {
                            if (eVar2.f20869X == 8) {
                                i26 = size2;
                                dVar8 = dVar7;
                                i27 = i24;
                            } else {
                                iM3 = eVar2.m();
                                iJ2 = eVar2.j();
                                i26 = size2;
                                int i4114 = eVar2.R;
                                i27 = i24;
                                zY |= iVar3.y(dVar7, eVar2, true);
                                iM4 = eVar2.m();
                                dVar8 = dVar7;
                                iJ3 = eVar2.j();
                                if (iM4 != iM3) {
                                    eVar2.z(iM4);
                                    if (!z18) {
                                    }
                                    zY = true;
                                }
                                if (iJ3 != iJ2) {
                                    eVar2.w(iJ3);
                                    if (!z17) {
                                    }
                                    zY = true;
                                }
                                if (!eVar2.f20898w) {
                                }
                            }
                        } else if (eVar2.f20869X == 8) {
                            i26 = size2;
                            dVar8 = dVar7;
                            i27 = i24;
                        } else {
                            iM3 = eVar2.m();
                            iJ2 = eVar2.j();
                            i26 = size2;
                            int i4115 = eVar2.R;
                            i27 = i24;
                            zY |= iVar3.y(dVar7, eVar2, true);
                            iM4 = eVar2.m();
                            dVar8 = dVar7;
                            iJ3 = eVar2.j();
                            if (iM4 != iM3) {
                                eVar2.z(iM4);
                                if (!z18) {
                                }
                                zY = true;
                            }
                            if (iJ3 != iJ2) {
                                eVar2.w(iJ3);
                                if (!z17) {
                                }
                                zY = true;
                            }
                            if (!eVar2.f20898w) {
                            }
                        }
                        i25++;
                        size2 = i26;
                        i24 = i27;
                        dVar7 = dVar8;
                    }
                    int i4116 = size2;
                    d dVar113 = dVar7;
                    int i55 = i24;
                    if (zY) {
                        iVar3.L(fVar, i21, i22);
                        zY = false;
                    }
                    i24 = i55 + 1;
                    size2 = i4116;
                    dVar7 = dVar113;
                }
                if (zY) {
                    iVar3.L(fVar, i21, i22);
                    if (fVar.m() < iMax3) {
                        fVar.z(iMax3);
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (fVar.j() < iMax4) {
                        fVar.w(iMax4);
                        z19 = true;
                    }
                    if (z19) {
                        iVar3.L(fVar, i21, i22);
                    }
                }
            } else {
                z13 = false;
            }
            fVar.f20914s0 = i20;
            if ((i20 & 256) == 256) {
                z14 = true;
            } else {
                z14 = z13;
            }
            p142o1.e.f20228p = z14;
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.f12278v);
        } else {
            iMax2 = i40;
        }
        dVar = dVar13;
        iM = fVar.m();
        eVar = fVar.f20904i0;
        if (iMax == iM) {
            eVar.f21250c = true;
        } else {
            eVar.f21250c = true;
        }
        fVar.f20866P = 0;
        fVar.Q = 0;
        int i4117 = this.f12279w - i42;
        int[] iArr4 = fVar.f20896u;
        iArr4[0] = i4117;
        iArr4[1] = this.f12280x - i41;
        fVar.S = 0;
        fVar.T = 0;
        fVar.x(dVar13);
        fVar.z(iMax);
        fVar.y(dVar);
        fVar.w(iMax2);
        i14 = this.f12277u - i42;
        if (i14 < 0) {
            fVar.S = 0;
        } else {
            fVar.S = i14;
        }
        i15 = this.f12278v - i41;
        if (i15 < 0) {
            fVar.T = 0;
        } else {
            fVar.T = i15;
        }
        fVar.f20908m0 = iMax7;
        fVar.f20909n0 = iMax5;
        iVar = fVar.f20903h0;
        fVar2 = (f) iVar.f16424u;
        arrayList = (ArrayList) iVar.f16422s;
        dVar2 = fVar.f20905j0;
        size = fVar.f20902g0.size();
        iM2 = fVar.m();
        iJ = fVar.j();
        if ((i10 & 128) == 128) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = true;
        }
        dVar3 = p153p1.d.f20848t;
        boolean z33 = z11;
        if (z11) {
            i36 = 0;
            while (true) {
                i16 = size;
                if (i36 < size) {
                    eVar8 = (e) fVar.f20902g0.get(i36);
                    i37 = i36;
                    dVarArr2 = eVar8.f20860J;
                    if (dVarArr2[0] == dVar3) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if (dVarArr2[1] == dVar3) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    if (z27) {
                        z29 = false;
                    } else {
                        z29 = false;
                    }
                    if (eVar8.r()) {
                        i36 = i37 + 1;
                        size = i16;
                    } else {
                        i36 = i37 + 1;
                        size = i16;
                    }
                    z12 = false;
                }
                if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
                    int iMin8 = Math.min(fVar.f20896u[0], i39);
                    iMin = Math.min(fVar.f20896u[1], i40);
                    if (mode == 1073741824) {
                        z23 = true;
                    } else {
                        z23 = true;
                    }
                    if (mode2 == 1073741824) {
                        fVar.w(iMin);
                        eVar.f21249b = z23;
                    }
                    if (mode == 1073741824) {
                        iVar2 = iVar;
                        fVar3 = fVar2;
                        arrayList2 = arrayList;
                        dVar2 = dVar2;
                        i17 = iM2;
                        i18 = iJ;
                        dVar4 = dVar3;
                        dVar5 = dVar14;
                        dVar6 = dVar13;
                        fVar4 = eVar.f21248a;
                        if (eVar.f21249b) {
                            arrayList5 = fVar4.f20902g0;
                            size5 = arrayList5.size();
                            i33 = 0;
                            while (i33 < size5) {
                                Object obj15 = arrayList5.get(i33);
                                i33++;
                                e eVar111 = (e) obj15;
                                eVar111.f20872a = false;
                                j jVar114 = eVar111.f20878d;
                                jVar114.f21275e.j = false;
                                jVar114.g = false;
                                jVar114.n();
                                p163q1.l lVar114 = eVar111.f20880e;
                                lVar114.f21275e.j = false;
                                lVar114.g = false;
                                lVar114.m();
                            }
                            i31 = 0;
                            fVar4.f20872a = false;
                            j jVar115 = fVar4.f20878d;
                            jVar115.f21275e.j = false;
                            jVar115.g = false;
                            jVar115.n();
                            p163q1.l lVar115 = fVar4.f20880e;
                            lVar115.f21275e.j = false;
                            lVar115.g = false;
                            lVar115.m();
                            eVar.c();
                        } else {
                            i31 = 0;
                        }
                        eVar.b(eVar.f21251d);
                        fVar4.f20866P = i31;
                        fVar4.Q = i31;
                        fVar4.f20878d.f21277h.d(i31);
                        fVar4.f20880e.f21277h.d(i31);
                        i32 = 1073741824;
                        if (mode == 1073741824) {
                            zE2 = fVar.E(i31, z10);
                            i19 = 1;
                        } else {
                            i19 = 0;
                            zE2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zE = fVar.E(1, z10) & zE2;
                            i19++;
                        } else {
                            zE = zE2;
                        }
                    } else {
                        iVar2 = iVar;
                        fVar3 = fVar2;
                        arrayList2 = arrayList;
                        dVar2 = dVar2;
                        i17 = iM2;
                        i18 = iJ;
                        dVar4 = dVar3;
                        dVar5 = dVar14;
                        dVar6 = dVar13;
                        fVar4 = eVar.f21248a;
                        if (eVar.f21249b) {
                            arrayList5 = fVar4.f20902g0;
                            size5 = arrayList5.size();
                            i33 = 0;
                            while (i33 < size5) {
                                Object obj16 = arrayList5.get(i33);
                                i33++;
                                e eVar112 = (e) obj16;
                                eVar112.f20872a = false;
                                j jVar116 = eVar112.f20878d;
                                jVar116.f21275e.j = false;
                                jVar116.g = false;
                                jVar116.n();
                                p163q1.l lVar116 = eVar112.f20880e;
                                lVar116.f21275e.j = false;
                                lVar116.g = false;
                                lVar116.m();
                            }
                            i31 = 0;
                            fVar4.f20872a = false;
                            j jVar117 = fVar4.f20878d;
                            jVar117.f21275e.j = false;
                            jVar117.g = false;
                            jVar117.n();
                            p163q1.l lVar117 = fVar4.f20880e;
                            lVar117.f21275e.j = false;
                            lVar117.g = false;
                            lVar117.m();
                            eVar.c();
                        } else {
                            i31 = 0;
                        }
                        eVar.b(eVar.f21251d);
                        fVar4.f20866P = i31;
                        fVar4.Q = i31;
                        fVar4.f20878d.f21277h.d(i31);
                        fVar4.f20880e.f21277h.d(i31);
                        i32 = 1073741824;
                        if (mode == 1073741824) {
                            zE2 = fVar.E(i31, z10);
                            i19 = 1;
                        } else {
                            i19 = 0;
                            zE2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zE = fVar.E(1, z10) & zE2;
                            i19++;
                        } else {
                            zE = zE2;
                        }
                    }
                    if (zE) {
                        if (mode == i32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if (mode2 == i32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        fVar.A(z24, z25);
                    }
                } else {
                    iVar2 = iVar;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    dVar2 = dVar2;
                    i17 = iM2;
                    i18 = iJ;
                    dVar4 = dVar3;
                    dVar5 = dVar14;
                    dVar6 = dVar13;
                    zE = false;
                    i19 = 0;
                }
                if (zE) {
                }
                if (i16 > 0) {
                    size3 = fVar.f20902g0.size();
                    dVar10 = fVar.f20905j0;
                    i28 = 0;
                    while (i28 < size3) {
                        eVar7 = (e) fVar.f20902g0.get(i28);
                        if (eVar7 instanceof i) {
                            iVar4 = iVar2;
                            dVar11 = dVar4;
                        } else {
                            dVarI = eVar7.i(0);
                            p153p1.d dVarI10 = eVar7.i(1);
                            dVar11 = dVar4;
                            if (dVarI == dVar11) {
                                iVar4 = iVar2;
                                iVar4.y(dVar10, eVar7, false);
                            } else {
                                iVar4 = iVar2;
                                iVar4.y(dVar10, eVar7, false);
                            }
                        }
                        i28++;
                        iVar2 = iVar4;
                        dVar4 = dVar11;
                    }
                    iVar3 = iVar2;
                    constraintLayout = dVar10.f21917a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.f12275s;
                    while (i29 < childCount) {
                        childAt = constraintLayout.getChildAt(i29);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.f12285s == null) {
                                c cVar8 = (c) placeholder.getLayoutParams();
                                cVar = (c) placeholder.f12285s.getLayoutParams();
                                eVar4 = cVar.f21902l0;
                                eVar4.f20869X = 0;
                                eVar5 = cVar8.f21902l0;
                                if (eVar5.f20860J[0] != dVar5) {
                                    eVar5.z(eVar4.m());
                                }
                                eVar6 = cVar8.f21902l0;
                                if (eVar6.f20860J[1] != dVar5) {
                                    eVar6.w(cVar.f21902l0.j());
                                }
                                cVar.f21902l0.f20869X = 8;
                            }
                        }
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i30 < size4) {
                            ((ConstraintHelper) arrayList4.get(i30)).getClass();
                        }
                    }
                } else {
                    iVar3 = iVar2;
                }
                i20 = fVar.f20914s0;
                size2 = arrayList2.size();
                i21 = i17;
                i22 = i18;
                if (i16 > 0) {
                    iVar3.L(fVar, i21, i22);
                }
                if (size2 > 0) {
                    dVarArr = fVar.f20860J;
                    z13 = false;
                    if (dVarArr[0] == dVar6) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (dVarArr[1] == dVar6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    f fVar14 = fVar3;
                    iMax3 = Math.max(fVar.m(), fVar14.S);
                    iMax4 = Math.max(fVar.j(), fVar14.T);
                    i23 = 0;
                    zY = false;
                    while (i23 < size2) {
                        ArrayList arrayList15 = arrayList2;
                        eVar3 = (e) arrayList15.get(i23);
                        if (eVar3 instanceof h) {
                            z20 = z16;
                            dVar9 = dVar2;
                            z21 = z15;
                        } else {
                            iM5 = eVar3.m();
                            iJ4 = eVar3.j();
                            z20 = z16;
                            dVar9 = dVar2;
                            z21 = z15;
                            boolean zY8 = zY | iVar3.y(dVar9, eVar3, true);
                            iM6 = eVar3.m();
                            z22 = zY8;
                            iJ5 = eVar3.j();
                            if (iM6 != iM5) {
                                eVar3.z(iM6);
                                if (z21) {
                                    iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                                }
                                z22 = true;
                            }
                            if (iJ5 != iJ4) {
                                eVar3.w(iJ5);
                                if (z20) {
                                    iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                                }
                                z22 = true;
                            }
                            zY = z22 | ((h) eVar3).f20956o0;
                        }
                        i23++;
                        arrayList2 = arrayList15;
                        z15 = z21;
                        dVar2 = dVar9;
                        z16 = z20;
                    }
                    z17 = z16;
                    dVar7 = dVar2;
                    arrayList3 = arrayList2;
                    z18 = z15;
                    i24 = 0;
                    while (i24 < 2) {
                        i25 = 0;
                        while (i25 < size2) {
                            eVar2 = (e) arrayList3.get(i25);
                            if (eVar2 instanceof p153p1.j) {
                                if (eVar2.f20869X == 8) {
                                    i26 = size2;
                                    dVar8 = dVar7;
                                    i27 = i24;
                                } else {
                                    iM3 = eVar2.m();
                                    iJ2 = eVar2.j();
                                    i26 = size2;
                                    int i4118 = eVar2.R;
                                    i27 = i24;
                                    zY |= iVar3.y(dVar7, eVar2, true);
                                    iM4 = eVar2.m();
                                    dVar8 = dVar7;
                                    iJ3 = eVar2.j();
                                    if (iM4 != iM3) {
                                        eVar2.z(iM4);
                                        if (!z18) {
                                        }
                                        zY = true;
                                    }
                                    if (iJ3 != iJ2) {
                                        eVar2.w(iJ3);
                                        if (!z17) {
                                        }
                                        zY = true;
                                    }
                                    if (!eVar2.f20898w) {
                                    }
                                }
                            } else if (eVar2.f20869X == 8) {
                                i26 = size2;
                                dVar8 = dVar7;
                                i27 = i24;
                            } else {
                                iM3 = eVar2.m();
                                iJ2 = eVar2.j();
                                i26 = size2;
                                int i4119 = eVar2.R;
                                i27 = i24;
                                zY |= iVar3.y(dVar7, eVar2, true);
                                iM4 = eVar2.m();
                                dVar8 = dVar7;
                                iJ3 = eVar2.j();
                                if (iM4 != iM3) {
                                    eVar2.z(iM4);
                                    if (!z18) {
                                    }
                                    zY = true;
                                }
                                if (iJ3 != iJ2) {
                                    eVar2.w(iJ3);
                                    if (!z17) {
                                    }
                                    zY = true;
                                }
                                if (!eVar2.f20898w) {
                                }
                            }
                            i25++;
                            size2 = i26;
                            i24 = i27;
                            dVar7 = dVar8;
                        }
                        int i41110 = size2;
                        d dVar114 = dVar7;
                        int i56 = i24;
                        if (zY) {
                            iVar3.L(fVar, i21, i22);
                            zY = false;
                        }
                        i24 = i56 + 1;
                        size2 = i41110;
                        dVar7 = dVar114;
                    }
                    if (zY) {
                        iVar3.L(fVar, i21, i22);
                        if (fVar.m() < iMax3) {
                            fVar.z(iMax3);
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (fVar.j() < iMax4) {
                            fVar.w(iMax4);
                            z19 = true;
                        }
                        if (z19) {
                            iVar3.L(fVar, i21, i22);
                        }
                    }
                } else {
                    z13 = false;
                }
                fVar.f20914s0 = i20;
                if ((i20 & 256) == 256) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                p142o1.e.f20228p = z14;
            }
        }
        i16 = size;
        z12 = z33;
        if (z12 && ((mode != 1073741824 && mode2 == 1073741824) || z10)) {
            int iMin9 = Math.min(fVar.f20896u[0], i39);
            iMin = Math.min(fVar.f20896u[1], i40);
            if (mode == 1073741824) {
                z23 = true;
            } else {
                z23 = true;
            }
            if (mode2 == 1073741824) {
                fVar.w(iMin);
                eVar.f21249b = z23;
            }
            if (mode == 1073741824) {
                iVar2 = iVar;
                fVar3 = fVar2;
                arrayList2 = arrayList;
                dVar2 = dVar2;
                i17 = iM2;
                i18 = iJ;
                dVar4 = dVar3;
                dVar5 = dVar14;
                dVar6 = dVar13;
                fVar4 = eVar.f21248a;
                if (eVar.f21249b) {
                    arrayList5 = fVar4.f20902g0;
                    size5 = arrayList5.size();
                    i33 = 0;
                    while (i33 < size5) {
                        Object obj17 = arrayList5.get(i33);
                        i33++;
                        e eVar113 = (e) obj17;
                        eVar113.f20872a = false;
                        j jVar118 = eVar113.f20878d;
                        jVar118.f21275e.j = false;
                        jVar118.g = false;
                        jVar118.n();
                        p163q1.l lVar118 = eVar113.f20880e;
                        lVar118.f21275e.j = false;
                        lVar118.g = false;
                        lVar118.m();
                    }
                    i31 = 0;
                    fVar4.f20872a = false;
                    j jVar119 = fVar4.f20878d;
                    jVar119.f21275e.j = false;
                    jVar119.g = false;
                    jVar119.n();
                    p163q1.l lVar119 = fVar4.f20880e;
                    lVar119.f21275e.j = false;
                    lVar119.g = false;
                    lVar119.m();
                    eVar.c();
                } else {
                    i31 = 0;
                }
                eVar.b(eVar.f21251d);
                fVar4.f20866P = i31;
                fVar4.Q = i31;
                fVar4.f20878d.f21277h.d(i31);
                fVar4.f20880e.f21277h.d(i31);
                i32 = 1073741824;
                if (mode == 1073741824) {
                    zE2 = fVar.E(i31, z10);
                    i19 = 1;
                } else {
                    i19 = 0;
                    zE2 = true;
                }
                if (mode2 == 1073741824) {
                    zE = fVar.E(1, z10) & zE2;
                    i19++;
                } else {
                    zE = zE2;
                }
            } else {
                iVar2 = iVar;
                fVar3 = fVar2;
                arrayList2 = arrayList;
                dVar2 = dVar2;
                i17 = iM2;
                i18 = iJ;
                dVar4 = dVar3;
                dVar5 = dVar14;
                dVar6 = dVar13;
                fVar4 = eVar.f21248a;
                if (eVar.f21249b) {
                    arrayList5 = fVar4.f20902g0;
                    size5 = arrayList5.size();
                    i33 = 0;
                    while (i33 < size5) {
                        Object obj18 = arrayList5.get(i33);
                        i33++;
                        e eVar114 = (e) obj18;
                        eVar114.f20872a = false;
                        j jVar1110 = eVar114.f20878d;
                        jVar1110.f21275e.j = false;
                        jVar1110.g = false;
                        jVar1110.n();
                        p163q1.l lVar1110 = eVar114.f20880e;
                        lVar1110.f21275e.j = false;
                        lVar1110.g = false;
                        lVar1110.m();
                    }
                    i31 = 0;
                    fVar4.f20872a = false;
                    j jVar1111 = fVar4.f20878d;
                    jVar1111.f21275e.j = false;
                    jVar1111.g = false;
                    jVar1111.n();
                    p163q1.l lVar1111 = fVar4.f20880e;
                    lVar1111.f21275e.j = false;
                    lVar1111.g = false;
                    lVar1111.m();
                    eVar.c();
                } else {
                    i31 = 0;
                }
                eVar.b(eVar.f21251d);
                fVar4.f20866P = i31;
                fVar4.Q = i31;
                fVar4.f20878d.f21277h.d(i31);
                fVar4.f20880e.f21277h.d(i31);
                i32 = 1073741824;
                if (mode == 1073741824) {
                    zE2 = fVar.E(i31, z10);
                    i19 = 1;
                } else {
                    i19 = 0;
                    zE2 = true;
                }
                if (mode2 == 1073741824) {
                    zE = fVar.E(1, z10) & zE2;
                    i19++;
                } else {
                    zE = zE2;
                }
            }
            if (zE) {
                if (mode == i32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (mode2 == i32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                fVar.A(z24, z25);
            }
        } else {
            iVar2 = iVar;
            fVar3 = fVar2;
            arrayList2 = arrayList;
            dVar2 = dVar2;
            i17 = iM2;
            i18 = iJ;
            dVar4 = dVar3;
            dVar5 = dVar14;
            dVar6 = dVar13;
            zE = false;
            i19 = 0;
        }
        if (zE) {
        }
        if (i16 > 0) {
            size3 = fVar.f20902g0.size();
            dVar10 = fVar.f20905j0;
            i28 = 0;
            while (i28 < size3) {
                eVar7 = (e) fVar.f20902g0.get(i28);
                if (eVar7 instanceof i) {
                    iVar4 = iVar2;
                    dVar11 = dVar4;
                } else {
                    dVarI = eVar7.i(0);
                    p153p1.d dVarI11 = eVar7.i(1);
                    dVar11 = dVar4;
                    if (dVarI == dVar11) {
                        iVar4 = iVar2;
                        iVar4.y(dVar10, eVar7, false);
                    } else {
                        iVar4 = iVar2;
                        iVar4.y(dVar10, eVar7, false);
                    }
                }
                i28++;
                iVar2 = iVar4;
                dVar4 = dVar11;
            }
            iVar3 = iVar2;
            constraintLayout = dVar10.f21917a;
            childCount = constraintLayout.getChildCount();
            arrayList4 = constraintLayout.f12275s;
            while (i29 < childCount) {
                childAt = constraintLayout.getChildAt(i29);
                if (childAt instanceof Placeholder) {
                    placeholder = (Placeholder) childAt;
                    if (placeholder.f12285s == null) {
                        c cVar9 = (c) placeholder.getLayoutParams();
                        cVar = (c) placeholder.f12285s.getLayoutParams();
                        eVar4 = cVar.f21902l0;
                        eVar4.f20869X = 0;
                        eVar5 = cVar9.f21902l0;
                        if (eVar5.f20860J[0] != dVar5) {
                            eVar5.z(eVar4.m());
                        }
                        eVar6 = cVar9.f21902l0;
                        if (eVar6.f20860J[1] != dVar5) {
                            eVar6.w(cVar.f21902l0.j());
                        }
                        cVar.f21902l0.f20869X = 8;
                    }
                }
            }
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i30 < size4) {
                    ((ConstraintHelper) arrayList4.get(i30)).getClass();
                }
            }
        } else {
            iVar3 = iVar2;
        }
        i20 = fVar.f20914s0;
        size2 = arrayList2.size();
        i21 = i17;
        i22 = i18;
        if (i16 > 0) {
            iVar3.L(fVar, i21, i22);
        }
        if (size2 > 0) {
            dVarArr = fVar.f20860J;
            z13 = false;
            if (dVarArr[0] == dVar6) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (dVarArr[1] == dVar6) {
                z16 = true;
            } else {
                z16 = false;
            }
            f fVar15 = fVar3;
            iMax3 = Math.max(fVar.m(), fVar15.S);
            iMax4 = Math.max(fVar.j(), fVar15.T);
            i23 = 0;
            zY = false;
            while (i23 < size2) {
                ArrayList arrayList16 = arrayList2;
                eVar3 = (e) arrayList16.get(i23);
                if (eVar3 instanceof h) {
                    z20 = z16;
                    dVar9 = dVar2;
                    z21 = z15;
                } else {
                    iM5 = eVar3.m();
                    iJ4 = eVar3.j();
                    z20 = z16;
                    dVar9 = dVar2;
                    z21 = z15;
                    boolean zY9 = zY | iVar3.y(dVar9, eVar3, true);
                    iM6 = eVar3.m();
                    z22 = zY9;
                    iJ5 = eVar3.j();
                    if (iM6 != iM5) {
                        eVar3.z(iM6);
                        if (z21) {
                            iMax3 = Math.max(iMax3, eVar3.h(4).c() + eVar3.n() + eVar3.f20862L);
                        }
                        z22 = true;
                    }
                    if (iJ5 != iJ4) {
                        eVar3.w(iJ5);
                        if (z20) {
                            iMax4 = Math.max(iMax4, eVar3.h(5).c() + eVar3.o() + eVar3.f20863M);
                        }
                        z22 = true;
                    }
                    zY = z22 | ((h) eVar3).f20956o0;
                }
                i23++;
                arrayList2 = arrayList16;
                z15 = z21;
                dVar2 = dVar9;
                z16 = z20;
            }
            z17 = z16;
            dVar7 = dVar2;
            arrayList3 = arrayList2;
            z18 = z15;
            i24 = 0;
            while (i24 < 2) {
                i25 = 0;
                while (i25 < size2) {
                    eVar2 = (e) arrayList3.get(i25);
                    if (eVar2 instanceof p153p1.j) {
                        if (eVar2.f20869X == 8) {
                            i26 = size2;
                            dVar8 = dVar7;
                            i27 = i24;
                        } else {
                            iM3 = eVar2.m();
                            iJ2 = eVar2.j();
                            i26 = size2;
                            int i41111 = eVar2.R;
                            i27 = i24;
                            zY |= iVar3.y(dVar7, eVar2, true);
                            iM4 = eVar2.m();
                            dVar8 = dVar7;
                            iJ3 = eVar2.j();
                            if (iM4 != iM3) {
                                eVar2.z(iM4);
                                if (!z18) {
                                }
                                zY = true;
                            }
                            if (iJ3 != iJ2) {
                                eVar2.w(iJ3);
                                if (!z17) {
                                }
                                zY = true;
                            }
                            if (!eVar2.f20898w) {
                            }
                        }
                    } else if (eVar2.f20869X == 8) {
                        i26 = size2;
                        dVar8 = dVar7;
                        i27 = i24;
                    } else {
                        iM3 = eVar2.m();
                        iJ2 = eVar2.j();
                        i26 = size2;
                        int i41112 = eVar2.R;
                        i27 = i24;
                        zY |= iVar3.y(dVar7, eVar2, true);
                        iM4 = eVar2.m();
                        dVar8 = dVar7;
                        iJ3 = eVar2.j();
                        if (iM4 != iM3) {
                            eVar2.z(iM4);
                            if (!z18) {
                            }
                            zY = true;
                        }
                        if (iJ3 != iJ2) {
                            eVar2.w(iJ3);
                            if (!z17) {
                            }
                            zY = true;
                        }
                        if (!eVar2.f20898w) {
                        }
                    }
                    i25++;
                    size2 = i26;
                    i24 = i27;
                    dVar7 = dVar8;
                }
                int i41113 = size2;
                d dVar115 = dVar7;
                int i57 = i24;
                if (zY) {
                    iVar3.L(fVar, i21, i22);
                    zY = false;
                }
                i24 = i57 + 1;
                size2 = i41113;
                dVar7 = dVar115;
            }
            if (zY) {
                iVar3.L(fVar, i21, i22);
                if (fVar.m() < iMax3) {
                    fVar.z(iMax3);
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (fVar.j() < iMax4) {
                    fVar.w(iMax4);
                    z19 = true;
                }
                if (z19) {
                    iVar3.L(fVar, i21, i22);
                }
            }
        } else {
            z13 = false;
        }
        fVar.f20914s0 = i20;
        if ((i20 & 256) == 256) {
            z14 = true;
        } else {
            z14 = z13;
        }
        p142o1.e.f20228p = z14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            c cVar = (c) childAt.getLayoutParams();
            e eVar = cVar.f21902l0;
            if ((childAt.getVisibility() != 8 || cVar.f21879Y || cVar.f21880Z || zIsInEditMode) && !cVar.f21882a0) {
                int iN = eVar.n();
                int iO = eVar.o();
                int iM = eVar.m() + iN;
                int iJ = eVar.j() + iO;
                childAt.layout(iN, iO, iM, iJ);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iN, iO, iM, iJ);
                }
            }
        }
        ArrayList arrayList = this.f12275s;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((ConstraintHelper) arrayList.get(i15)).j();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        String str;
        int iD;
        e eVar;
        boolean zK = k();
        f fVar = this.f12276t;
        fVar.f20906k0 = zK;
        if (this.f12281y) {
            int i12 = 0;
            this.f12281y = false;
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    z10 = false;
                    break;
                } else {
                    if (getChildAt(i13).isLayoutRequested()) {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z10) {
                boolean zIsInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    e eVarE = e(getChildAt(i14));
                    if (eVarE != null) {
                        eVarE.t();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = getChildAt(i15);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) this.f12274r.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                eVar = viewFindViewById == this ? fVar : viewFindViewById == null ? null : ((c) viewFindViewById.getLayoutParams()).f21902l0;
                            }
                            eVar.f20870Y = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f12270C != -1) {
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt2 = getChildAt(i16);
                        if (childAt2.getId() == this.f12270C && (childAt2 instanceof Constraints)) {
                            this.f12268A = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                l lVar = this.f12268A;
                if (lVar != null) {
                    lVar.c(this);
                }
                fVar.f20902g0.clear();
                ArrayList arrayList = this.f12275s;
                int size = arrayList.size();
                if (size > 0) {
                    int i17 = 0;
                    while (i17 < size) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList.get(i17);
                        HashMap map = constraintHelper.f12266x;
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f12264v);
                        }
                        p153p1.j jVar = constraintHelper.f12263u;
                        if (jVar != null) {
                            jVar.f20974h0 = i12;
                            Arrays.fill(jVar.f20973g0, obj);
                            for (int i18 = i12; i18 < constraintHelper.f12261s; i18++) {
                                int i19 = constraintHelper.f12260r[i18];
                                View viewD = d(i19);
                                if (viewD == null && (iD = constraintHelper.d(this, (str = (String) map.get(Integer.valueOf(i19))))) != 0) {
                                    constraintHelper.f12260r[i18] = iD;
                                    map.put(Integer.valueOf(iD), str);
                                    viewD = d(iD);
                                }
                                View view = viewD;
                                if (view != null) {
                                    constraintHelper.f12263u.C(e(view));
                                }
                            }
                            constraintHelper.f12263u.D();
                        }
                        i17++;
                        i12 = 0;
                        obj = null;
                    }
                }
                for (int i20 = 0; i20 < childCount2; i20++) {
                    View childAt3 = getChildAt(i20);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f12284r == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f12286t);
                        }
                        View viewFindViewById2 = findViewById(placeholder.f12284r);
                        placeholder.f12285s = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((c) viewFindViewById2.getLayoutParams()).f21882a0 = true;
                            placeholder.f12285s.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                int i21 = 0;
                SparseArray sparseArray = this.f12272E;
                sparseArray.clear();
                sparseArray.put(0, fVar);
                sparseArray.put(getId(), fVar);
                for (int i22 = 0; i22 < childCount2; i22++) {
                    View childAt4 = getChildAt(i22);
                    sparseArray.put(childAt4.getId(), e(childAt4));
                }
                while (i21 < childCount2) {
                    boolean z11 = zIsInEditMode;
                    View childAt5 = getChildAt(i21);
                    e eVarE2 = e(childAt5);
                    if (eVarE2 != null) {
                        c cVar = (c) childAt5.getLayoutParams();
                        fVar.f20902g0.add(eVarE2);
                        e eVar2 = eVarE2.f20861K;
                        if (eVar2 != null) {
                            ((f) eVar2).f20902g0.remove(eVarE2);
                            eVarE2.f20861K = null;
                        }
                        eVarE2.f20861K = fVar;
                        c(z11, childAt5, eVarE2, cVar, sparseArray);
                    }
                    i21++;
                    zIsInEditMode = z11;
                }
            }
            if (z10) {
                fVar.G();
            }
        }
        n(fVar, this.f12282z, i10, i11);
        m(i10, i11, fVar.m(), fVar.j(), fVar.f20915t0, fVar.f20916u0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e eVarE = e(view);
        if ((view instanceof Guideline) && !(eVarE instanceof i)) {
            c cVar = (c) view.getLayoutParams();
            i iVar = new i();
            cVar.f21902l0 = iVar;
            cVar.f21879Y = true;
            iVar.C(cVar.R);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.l();
            ((c) view.getLayoutParams()).f21880Z = true;
            ArrayList arrayList = this.f12275s;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f12274r.put(view.getId(), view);
        this.f12281y = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f12274r.remove(view.getId());
        e eVarE = e(view);
        this.f12276t.f20902g0.remove(eVarE);
        eVarE.f20861K = null;
        this.f12275s.remove(view);
        this.f12281y = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f12281y = true;
        super.requestLayout();
    }

    public void setConstraintSet(l lVar) {
        this.f12268A = lVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f12271D == null) {
                this.f12271D = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f12271D.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id = getId();
        SparseArray sparseArray = this.f12274r;
        sparseArray.remove(id);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f12280x) {
            return;
        }
        this.f12280x = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f12279w) {
            return;
        }
        this.f12279w = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f12278v) {
            return;
        }
        this.f12278v = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f12277u) {
            return;
        }
        this.f12277u = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(n nVar) {
        c0 c0Var = this.f12269B;
        if (c0Var != null) {
            c0Var.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f12282z = i10;
        this.f12276t.f20914s0 = i10;
        p142o1.e.f20228p = (i10 & 256) == 256;
    }

    public void setState(int i10, int i11, int i12) {
        c0 c0Var = this.f12269B;
        if (c0Var != null) {
            c0Var.d(i11, i12, i10);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12274r = new SparseArray();
        this.f12275s = new ArrayList(4);
        this.f12276t = new f();
        this.f12277u = 0;
        this.f12278v = 0;
        this.f12279w = Integer.MAX_VALUE;
        this.f12280x = Integer.MAX_VALUE;
        this.f12281y = true;
        this.f12282z = 263;
        this.f12268A = null;
        this.f12269B = null;
        this.f12270C = -1;
        this.f12271D = new HashMap();
        this.f12272E = new SparseArray();
        this.f12273F = new d(this);
        h(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12274r = new SparseArray();
        this.f12275s = new ArrayList(4);
        this.f12276t = new f();
        this.f12277u = 0;
        this.f12278v = 0;
        this.f12279w = Integer.MAX_VALUE;
        this.f12280x = Integer.MAX_VALUE;
        this.f12281y = true;
        this.f12282z = 263;
        this.f12268A = null;
        this.f12269B = null;
        this.f12270C = -1;
        this.f12271D = new HashMap();
        this.f12272E = new SparseArray();
        this.f12273F = new d(this);
        h(attributeSet, i10);
    }
}
