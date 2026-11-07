package N7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p244z1.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f6057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6062f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f6064i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6067m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f6068n;

    public e(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p128m7.a.f19663e0);
        this.f6065k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = g.w(context, typedArrayObtainStyledAttributes, 3);
        g.w(context, typedArrayObtainStyledAttributes, 4);
        g.w(context, typedArrayObtainStyledAttributes, 5);
        this.f6059c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f6060d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f6066l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f6058b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f6057a = g.w(context, typedArrayObtainStyledAttributes, 6);
        this.f6061e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f6062f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, p128m7.a.f19642J);
        this.f6063h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f6064i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f6068n;
        int i10 = this.f6059c;
        if (typeface == null && (str = this.f6058b) != null) {
            this.f6068n = Typeface.create(str, i10);
        }
        if (this.f6068n == null) {
            int i11 = this.f6060d;
            if (i11 == 1) {
                this.f6068n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f6068n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f6068n = Typeface.DEFAULT;
            } else {
                this.f6068n = Typeface.MONOSPACE;
            }
            this.f6068n = Typeface.create(this.f6068n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f6067m) {
            return this.f6068n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = j.b(context, this.f6066l);
                this.f6068n = typefaceB;
                if (typefaceB != null) {
                    this.f6068n = Typeface.create(typefaceB, this.f6059c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f6058b, e10);
            }
        }
        a();
        this.f6067m = true;
        return this.f6068n;
    }

    public final void c(Context context, B0.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f6066l;
        if (i10 == 0) {
            this.f6067m = true;
        }
        if (this.f6067m) {
            cVar.X(this.f6068n, true);
            return;
        }
        try {
            c cVar2 = new c(this, cVar);
            ThreadLocal threadLocal = j.f24770a;
            if (context.isRestricted()) {
                cVar2.a(-4);
            } else {
                j.c(context, i10, new TypedValue(), 0, cVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f6067m = true;
            cVar.W(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f6058b, e10);
            this.f6067m = true;
            cVar.W(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceC = null;
        int i10 = this.f6066l;
        if (i10 != 0) {
            ThreadLocal threadLocal = j.f24770a;
            if (!context.isRestricted()) {
                typefaceC = j.c(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceC != null;
    }

    public final void e(Context context, TextPaint textPaint, B0.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f6057a;
        textPaint.setShadowLayer(this.g, this.f6061e, this.f6062f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, B0.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f6068n);
        c(context, new d(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceE = f.e(context.getResources().getConfiguration(), typeface);
        if (typefaceE != null) {
            typeface = typefaceE;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f6059c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f6065k);
        if (this.f6063h) {
            textPaint.setLetterSpacing(this.f6064i);
        }
    }
}
