package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;

/* JADX INFO: loaded from: classes.dex */
public class c extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f21860A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f21861B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f21862C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f21863D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f21864E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f21865F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f21866G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f21867H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f21868I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f21869J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f21870K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f21871L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f21872M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f21873N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f21874O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f21875P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public String U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f21876V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f21877W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f21878X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f21879Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f21880Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21881a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f21882a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21883b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f21884b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21885c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f21886c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21887d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f21888d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21889e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f21890e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21891f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f21892f0;
    public int g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f21893g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21894h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f21895h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21896i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f21897i0;
    public int j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f21898j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21899k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f21900k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21901l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public p153p1.e f21902l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f21905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f21910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f21912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f21916z;

    public c(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f21881a = -1;
        this.f21883b = -1;
        this.f21885c = -1.0f;
        this.f21887d = -1;
        this.f21889e = -1;
        this.f21891f = -1;
        this.g = -1;
        this.f21894h = -1;
        this.f21896i = -1;
        this.j = -1;
        this.f21899k = -1;
        this.f21901l = -1;
        this.f21903m = -1;
        this.f21904n = 0;
        this.f21905o = 0.0f;
        this.f21906p = -1;
        this.f21907q = -1;
        this.f21908r = -1;
        this.f21909s = -1;
        this.f21910t = -1;
        this.f21911u = -1;
        this.f21912v = -1;
        this.f21913w = -1;
        this.f21914x = -1;
        this.f21915y = -1;
        this.f21916z = 0.5f;
        this.f21860A = 0.5f;
        this.f21861B = null;
        this.f21862C = 1;
        this.f21863D = -1.0f;
        this.f21864E = -1.0f;
        this.f21865F = 0;
        this.f21866G = 0;
        this.f21867H = 0;
        this.f21868I = 0;
        this.f21869J = 0;
        this.f21870K = 0;
        this.f21871L = 0;
        this.f21872M = 0;
        this.f21873N = 1.0f;
        this.f21874O = 1.0f;
        this.f21875P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.f21876V = true;
        this.f21877W = true;
        this.f21878X = false;
        this.f21879Y = false;
        this.f21880Z = false;
        this.f21882a0 = false;
        this.f21884b0 = -1;
        this.f21886c0 = -1;
        this.f21888d0 = -1;
        this.f21890e0 = -1;
        this.f21892f0 = -1;
        this.f21893g0 = -1;
        this.f21895h0 = 0.5f;
        this.f21902l0 = new p153p1.e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22038b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            int i12 = b.f21859a.get(index);
            switch (i12) {
                case 1:
                    this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f21903m);
                    this.f21903m = resourceId;
                    if (resourceId == -1) {
                        this.f21903m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.f21904n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21904n);
                    break;
                case 4:
                    float f3 = typedArrayObtainStyledAttributes.getFloat(index, this.f21905o) % 360.0f;
                    this.f21905o = f3;
                    if (f3 < 0.0f) {
                        this.f21905o = (360.0f - f3) % 360.0f;
                    }
                    break;
                case 5:
                    this.f21881a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f21881a);
                    break;
                case 6:
                    this.f21883b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f21883b);
                    break;
                case 7:
                    this.f21885c = typedArrayObtainStyledAttributes.getFloat(index, this.f21885c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21887d);
                    this.f21887d = resourceId2;
                    if (resourceId2 == -1) {
                        this.f21887d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21889e);
                    this.f21889e = resourceId3;
                    if (resourceId3 == -1) {
                        this.f21889e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21891f);
                    this.f21891f = resourceId4;
                    if (resourceId4 == -1) {
                        this.f21891f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    this.g = resourceId5;
                    if (resourceId5 == -1) {
                        this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21894h);
                    this.f21894h = resourceId6;
                    if (resourceId6 == -1) {
                        this.f21894h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21896i);
                    this.f21896i = resourceId7;
                    if (resourceId7 == -1) {
                        this.f21896i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId8;
                    if (resourceId8 == -1) {
                        this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21899k);
                    this.f21899k = resourceId9;
                    if (resourceId9 == -1) {
                        this.f21899k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21901l);
                    this.f21901l = resourceId10;
                    if (resourceId10 == -1) {
                        this.f21901l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21906p);
                    this.f21906p = resourceId11;
                    if (resourceId11 == -1) {
                        this.f21906p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21907q);
                    this.f21907q = resourceId12;
                    if (resourceId12 == -1) {
                        this.f21907q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21908r);
                    this.f21908r = resourceId13;
                    if (resourceId13 == -1) {
                        this.f21908r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f21909s);
                    this.f21909s = resourceId14;
                    if (resourceId14 == -1) {
                        this.f21909s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.f21910t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21910t);
                    break;
                case 22:
                    this.f21911u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21911u);
                    break;
                case 23:
                    this.f21912v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21912v);
                    break;
                case 24:
                    this.f21913w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21913w);
                    break;
                case 25:
                    this.f21914x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21914x);
                    break;
                case 26:
                    this.f21915y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21915y);
                    break;
                case 27:
                    this.S = typedArrayObtainStyledAttributes.getBoolean(index, this.S);
                    break;
                case 28:
                    this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                    break;
                case 29:
                    this.f21916z = typedArrayObtainStyledAttributes.getFloat(index, this.f21916z);
                    break;
                case 30:
                    this.f21860A = typedArrayObtainStyledAttributes.getFloat(index, this.f21860A);
                    break;
                case 31:
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    this.f21867H = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    this.f21868I = i14;
                    if (i14 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        this.f21869J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21869J);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f21869J) == -2) {
                            this.f21869J = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        this.f21871L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21871L);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f21871L) == -2) {
                            this.f21871L = -2;
                        }
                    }
                    break;
                case 35:
                    this.f21873N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f21873N));
                    this.f21867H = 2;
                    break;
                case 36:
                    try {
                        this.f21870K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21870K);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f21870K) == -2) {
                            this.f21870K = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.f21872M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f21872M);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f21872M) == -2) {
                            this.f21872M = -2;
                        }
                    }
                    break;
                case 38:
                    this.f21874O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f21874O));
                    this.f21868I = 2;
                    break;
                default:
                    switch (i12) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f21861B = string;
                            this.f21862C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = this.f21861B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i10 = 0;
                                } else {
                                    String strSubstring = this.f21861B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        this.f21862C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        this.f21862C = 1;
                                    }
                                    i10 = iIndexOf + 1;
                                }
                                int iIndexOf2 = this.f21861B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = this.f21861B.substring(i10);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = this.f21861B.substring(i10, iIndexOf2);
                                    String strSubstring4 = this.f21861B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f10 = Float.parseFloat(strSubstring4);
                                            if (f7 > 0.0f && f10 > 0.0f) {
                                                if (this.f21862C == 1) {
                                                    Math.abs(f10 / f7);
                                                } else {
                                                    Math.abs(f7 / f10);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                }
                            }
                            break;
                        case 45:
                            this.f21863D = typedArrayObtainStyledAttributes.getFloat(index, this.f21863D);
                            break;
                        case 46:
                            this.f21864E = typedArrayObtainStyledAttributes.getFloat(index, this.f21864E);
                            break;
                        case 47:
                            this.f21865F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f21866G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.f21875P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f21875P);
                            break;
                        case 50:
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                            break;
                        case 51:
                            this.U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.f21879Y = false;
        this.f21876V = true;
        this.f21877W = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.S) {
            this.f21876V = false;
            if (this.f21867H == 0) {
                this.f21867H = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.T) {
            this.f21877W = false;
            if (this.f21868I == 0) {
                this.f21868I = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f21876V = false;
            if (i10 == 0 && this.f21867H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.S = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f21877W = false;
            if (i11 == 0 && this.f21868I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.T = true;
            }
        }
        if (this.f21885c == -1.0f && this.f21881a == -1 && this.f21883b == -1) {
            return;
        }
        this.f21879Y = true;
        this.f21876V = true;
        this.f21877W = true;
        if (!(this.f21902l0 instanceof p153p1.i)) {
            this.f21902l0 = new p153p1.i();
        }
        ((p153p1.i) this.f21902l0).C(this.R);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i10);
        boolean z10 = false;
        boolean z11 = 1 == getLayoutDirection();
        this.f21888d0 = -1;
        this.f21890e0 = -1;
        this.f21884b0 = -1;
        this.f21886c0 = -1;
        this.f21892f0 = this.f21910t;
        this.f21893g0 = this.f21912v;
        float f3 = this.f21916z;
        this.f21895h0 = f3;
        int i17 = this.f21881a;
        this.f21897i0 = i17;
        int i18 = this.f21883b;
        this.f21898j0 = i18;
        float f7 = this.f21885c;
        this.f21900k0 = f7;
        if (z11) {
            int i19 = this.f21906p;
            if (i19 != -1) {
                this.f21888d0 = i19;
            } else {
                int i20 = this.f21907q;
                if (i20 != -1) {
                    this.f21890e0 = i20;
                } else {
                    i11 = this.f21908r;
                    if (i11 != -1) {
                        this.f21886c0 = i11;
                        z10 = true;
                    }
                    i12 = this.f21909s;
                    if (i12 != -1) {
                        this.f21884b0 = i12;
                        z10 = true;
                    }
                    i13 = this.f21914x;
                    if (i13 != -1) {
                        this.f21893g0 = i13;
                    }
                    i14 = this.f21915y;
                    if (i14 != -1) {
                        this.f21892f0 = i14;
                    }
                    if (z10) {
                        this.f21895h0 = 1.0f - f3;
                    }
                    if (this.f21879Y && this.R == 1) {
                        if (f7 != -1.0f) {
                            this.f21900k0 = 1.0f - f7;
                            this.f21897i0 = -1;
                            this.f21898j0 = -1;
                        } else if (i17 != -1) {
                            this.f21898j0 = i17;
                            this.f21897i0 = -1;
                            this.f21900k0 = -1.0f;
                        } else if (i18 != -1) {
                            this.f21897i0 = i18;
                            this.f21898j0 = -1;
                            this.f21900k0 = -1.0f;
                        }
                    }
                }
            }
            z10 = true;
            i11 = this.f21908r;
            if (i11 != -1) {
                this.f21886c0 = i11;
                z10 = true;
            }
            i12 = this.f21909s;
            if (i12 != -1) {
                this.f21884b0 = i12;
                z10 = true;
            }
            i13 = this.f21914x;
            if (i13 != -1) {
                this.f21893g0 = i13;
            }
            i14 = this.f21915y;
            if (i14 != -1) {
                this.f21892f0 = i14;
            }
            if (z10) {
                this.f21895h0 = 1.0f - f3;
            }
            if (this.f21879Y) {
                if (f7 != -1.0f) {
                    this.f21900k0 = 1.0f - f7;
                    this.f21897i0 = -1;
                    this.f21898j0 = -1;
                } else if (i17 != -1) {
                    this.f21898j0 = i17;
                    this.f21897i0 = -1;
                    this.f21900k0 = -1.0f;
                } else if (i18 != -1) {
                    this.f21897i0 = i18;
                    this.f21898j0 = -1;
                    this.f21900k0 = -1.0f;
                }
            }
        } else {
            int i21 = this.f21906p;
            if (i21 != -1) {
                this.f21886c0 = i21;
            }
            int i22 = this.f21907q;
            if (i22 != -1) {
                this.f21884b0 = i22;
            }
            int i23 = this.f21908r;
            if (i23 != -1) {
                this.f21888d0 = i23;
            }
            int i24 = this.f21909s;
            if (i24 != -1) {
                this.f21890e0 = i24;
            }
            int i25 = this.f21914x;
            if (i25 != -1) {
                this.f21892f0 = i25;
            }
            int i26 = this.f21915y;
            if (i26 != -1) {
                this.f21893g0 = i26;
            }
        }
        if (this.f21908r == -1 && this.f21909s == -1 && this.f21907q == -1 && this.f21906p == -1) {
            int i27 = this.f21891f;
            if (i27 != -1) {
                this.f21888d0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                }
            } else {
                int i28 = this.g;
                if (i28 != -1) {
                    this.f21890e0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                }
            }
            int i29 = this.f21887d;
            if (i29 != -1) {
                this.f21884b0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                return;
            }
            int i30 = this.f21889e;
            if (i30 != -1) {
                this.f21886c0 = i30;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
            }
        }
    }

    public c() {
        super(-2, -2);
        this.f21881a = -1;
        this.f21883b = -1;
        this.f21885c = -1.0f;
        this.f21887d = -1;
        this.f21889e = -1;
        this.f21891f = -1;
        this.g = -1;
        this.f21894h = -1;
        this.f21896i = -1;
        this.j = -1;
        this.f21899k = -1;
        this.f21901l = -1;
        this.f21903m = -1;
        this.f21904n = 0;
        this.f21905o = 0.0f;
        this.f21906p = -1;
        this.f21907q = -1;
        this.f21908r = -1;
        this.f21909s = -1;
        this.f21910t = -1;
        this.f21911u = -1;
        this.f21912v = -1;
        this.f21913w = -1;
        this.f21914x = -1;
        this.f21915y = -1;
        this.f21916z = 0.5f;
        this.f21860A = 0.5f;
        this.f21861B = null;
        this.f21862C = 1;
        this.f21863D = -1.0f;
        this.f21864E = -1.0f;
        this.f21865F = 0;
        this.f21866G = 0;
        this.f21867H = 0;
        this.f21868I = 0;
        this.f21869J = 0;
        this.f21870K = 0;
        this.f21871L = 0;
        this.f21872M = 0;
        this.f21873N = 1.0f;
        this.f21874O = 1.0f;
        this.f21875P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.f21876V = true;
        this.f21877W = true;
        this.f21878X = false;
        this.f21879Y = false;
        this.f21880Z = false;
        this.f21882a0 = false;
        this.f21884b0 = -1;
        this.f21886c0 = -1;
        this.f21888d0 = -1;
        this.f21890e0 = -1;
        this.f21892f0 = -1;
        this.f21893g0 = -1;
        this.f21895h0 = 0.5f;
        this.f21902l0 = new p153p1.e();
    }

    public c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f21881a = -1;
        this.f21883b = -1;
        this.f21885c = -1.0f;
        this.f21887d = -1;
        this.f21889e = -1;
        this.f21891f = -1;
        this.g = -1;
        this.f21894h = -1;
        this.f21896i = -1;
        this.j = -1;
        this.f21899k = -1;
        this.f21901l = -1;
        this.f21903m = -1;
        this.f21904n = 0;
        this.f21905o = 0.0f;
        this.f21906p = -1;
        this.f21907q = -1;
        this.f21908r = -1;
        this.f21909s = -1;
        this.f21910t = -1;
        this.f21911u = -1;
        this.f21912v = -1;
        this.f21913w = -1;
        this.f21914x = -1;
        this.f21915y = -1;
        this.f21916z = 0.5f;
        this.f21860A = 0.5f;
        this.f21861B = null;
        this.f21862C = 1;
        this.f21863D = -1.0f;
        this.f21864E = -1.0f;
        this.f21865F = 0;
        this.f21866G = 0;
        this.f21867H = 0;
        this.f21868I = 0;
        this.f21869J = 0;
        this.f21870K = 0;
        this.f21871L = 0;
        this.f21872M = 0;
        this.f21873N = 1.0f;
        this.f21874O = 1.0f;
        this.f21875P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.f21876V = true;
        this.f21877W = true;
        this.f21878X = false;
        this.f21879Y = false;
        this.f21880Z = false;
        this.f21882a0 = false;
        this.f21884b0 = -1;
        this.f21886c0 = -1;
        this.f21888d0 = -1;
        this.f21890e0 = -1;
        this.f21892f0 = -1;
        this.f21893g0 = -1;
        this.f21895h0 = 0.5f;
        this.f21902l0 = new p153p1.e();
    }
}
