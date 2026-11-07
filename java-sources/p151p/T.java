package p151p;

import I1.AbstractC0272z;
import I1.S;
import N1.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ka.h;
import p017b7.g;
import p073h.a;
import p074h0.i;
import p123m2.c;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f20586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f20587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f20588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f20589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f20590f;
    public h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f20591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1235c0 f20592i;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20593k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f20594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20595m;

    public T(TextView textView) {
        this.f20585a = textView;
        this.f20592i = new C1235c0(textView);
    }

    public static h c(Context context, C1273w c1273w, int i10) {
        ColorStateList colorStateListI;
        synchronized (c1273w) {
            colorStateListI = c1273w.f20798a.i(context, i10);
        }
        if (colorStateListI == null) {
            return null;
        }
        h hVar = new h();
        hVar.f19151b = true;
        hVar.f19152c = colorStateListI;
        return hVar;
    }

    public final void a(Drawable drawable, h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C1273w.e(drawable, hVar, this.f20585a.getDrawableState());
    }

    public final void b() {
        h hVar = this.f20586b;
        TextView textView = this.f20585a;
        if (hVar != null || this.f20587c != null || this.f20588d != null || this.f20589e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f20586b);
            a(compoundDrawables[1], this.f20587c);
            a(compoundDrawables[2], this.f20588d);
            a(compoundDrawables[3], this.f20589e);
        }
        if (this.f20590f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f20590f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        h hVar = this.f20591h;
        if (hVar != null) {
            return (ColorStateList) hVar.f19152c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        h hVar = this.f20591h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f19153d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:241:0x03da  */
    /* JADX WARN: Code duplicated, block: B:243:0x03df  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:251:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:253:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String string;
        String string2;
        int i11;
        float dimensionPixelSize;
        int i12;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        TextView textView = this.f20585a;
        Context context = textView.getContext();
        C1273w c1273wA = C1273w.a();
        int[] iArr = a.f16387i;
        i iVarB = i.B(context, attributeSet, iArr, i10);
        S.n(textView, textView.getContext(), iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f20586b = c(context, c1273wA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f20587c = c(context, c1273wA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f20588d = c(context, c1273wA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f20589e = c(context, c1273wA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f20590f = c(context, c1273wA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, c1273wA, typedArray.getResourceId(6, 0));
        }
        iVarB.C();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = a.f16403z;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            i iVar = new i(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            m(context, iVar);
            int i14 = Build.VERSION.SDK_INT;
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i14 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            iVar.C();
        } else {
            z10 = false;
            z11 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        i iVar2 = new i(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        int i15 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i15 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i15 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, iVar2);
        iVar2.C();
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.f20594l;
        if (typeface != null) {
            if (this.f20593k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            Q.d(textView, string);
        }
        if (str != null) {
            if (i15 >= 24) {
                P.b(textView, P.a(str));
            } else {
                textView.setTextLocale(O.a(str.split(",")[0]));
            }
        }
        C1235c0 c1235c0 = this.f20592i;
        Context context2 = c1235c0.j;
        int[] iArr3 = a.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = c1235c0.f20650i;
        S.n(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c1235c0.f20643a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr4[i16] = typedArrayObtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                c1235c0.f20648f = C1235c0.b(iArr4);
                c1235c0.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c1235c0.j()) {
            c1235c0.f20643a = 0;
        } else if (c1235c0.f20643a == 1) {
            if (!c1235c0.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                float f3 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1235c0.k(dimension2, f3, dimension);
            }
            c1235c0.h();
        }
        if (q1.f20768c && c1235c0.f20643a != 0) {
            int[] iArr5 = c1235c0.f20648f;
            if (iArr5.length > 0) {
                if (Q.a(textView) != -1.0f) {
                    Q.b(textView, Math.round(c1235c0.f20646d), Math.round(c1235c0.f20647e), Math.round(c1235c0.f20645c), 0);
                } else {
                    Q.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c1273wA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c1273wA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c1273wA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c1273wA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c1273wA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c1273wA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = s.e(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof m) {
                ((m) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeC = AbstractC1249j0.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(modeC);
            } else if (textView instanceof m) {
                ((m) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i11 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i17 = typedValuePeekValue.data;
                int i18 = i17 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i17);
                i12 = i18;
                i11 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i11) {
                g.o0(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i11) {
                g.p0(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i12 == i11) {
                    g.q0(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC0272z.p(textView, i12, dimensionPixelSize);
                } else {
                    g.q0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i11 = -1;
        dimensionPixelSize = -1.0f;
        i12 = i11;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i11) {
            g.o0(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i11) {
            g.p0(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i12 == i11) {
                g.q0(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0272z.p(textView, i12, dimensionPixelSize);
            } else {
                g.q0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, a.f16403z);
        i iVar = new i(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f20585a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, iVar);
        if (i11 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            Q.d(textView, string);
        }
        iVar.C();
        Typeface typeface = this.f20594l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        C1235c0 c1235c0 = this.f20592i;
        if (c1235c0.j()) {
            DisplayMetrics displayMetrics = c1235c0.j.getResources().getDisplayMetrics();
            c1235c0.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (c1235c0.h()) {
                c1235c0.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) {
        C1235c0 c1235c0 = this.f20592i;
        if (c1235c0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1235c0.j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                c1235c0.f20648f = C1235c0.b(iArrCopyOf);
                if (!c1235c0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1235c0.g = false;
            }
            if (c1235c0.h()) {
                c1235c0.a();
            }
        }
    }

    public final void j(int i10) {
        C1235c0 c1235c0 = this.f20592i;
        if (c1235c0.j()) {
            if (i10 == 0) {
                c1235c0.f20643a = 0;
                c1235c0.f20646d = -1.0f;
                c1235c0.f20647e = -1.0f;
                c1235c0.f20645c = -1.0f;
                c1235c0.f20648f = new int[0];
                c1235c0.f20644b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(c.r(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1235c0.j.getResources().getDisplayMetrics();
            c1235c0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1235c0.h()) {
                c1235c0.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f20591h == null) {
            this.f20591h = new h();
        }
        h hVar = this.f20591h;
        hVar.f19152c = colorStateList;
        hVar.f19151b = colorStateList != null;
        this.f20586b = hVar;
        this.f20587c = hVar;
        this.f20588d = hVar;
        this.f20589e = hVar;
        this.f20590f = hVar;
        this.g = hVar;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f20591h == null) {
            this.f20591h = new h();
        }
        h hVar = this.f20591h;
        hVar.f19153d = mode;
        hVar.f19150a = mode != null;
        this.f20586b = hVar;
        this.f20587c = hVar;
        this.f20588d = hVar;
        this.f20589e = hVar;
        this.f20590f = hVar;
        this.g = hVar;
    }

    public final void m(Context context, i iVar) {
        String string;
        int i10 = this.j;
        TypedArray typedArray = (TypedArray) iVar.f16423t;
        this.j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f20593k = i12;
            if (i12 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f20595m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f20594l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f20594l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f20594l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f20594l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f20593k;
        int i16 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceT = iVar.t(i14, this.j, new M(this, i15, i16, new WeakReference(this.f20585a)));
                if (typefaceT != null) {
                    if (i11 < 28 || this.f20593k == -1) {
                        this.f20594l = typefaceT;
                    } else {
                        this.f20594l = S.a(Typeface.create(typefaceT, 0), this.f20593k, (this.j & 2) != 0);
                    }
                }
                this.f20595m = this.f20594l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f20594l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f20593k == -1) {
            this.f20594l = Typeface.create(string, this.j);
        } else {
            this.f20594l = S.a(Typeface.create(string, 0), this.f20593k, (this.j & 2) != 0);
        }
    }
}
