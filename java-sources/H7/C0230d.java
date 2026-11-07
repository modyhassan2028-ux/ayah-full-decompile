package H7;

import I1.S;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: H7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Typeface f3471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f3472B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Typeface f3473C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public N7.b f3474D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public N7.b f3475E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f3477G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f3478H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f3479I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Bitmap f3481K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f3482L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f3483M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f3484N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f3485O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f3486P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TimeInterpolator f3487V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TimeInterpolator f3488W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f3489X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f3490Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f3491Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f3492a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ColorStateList f3493a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3494b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f3495b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3496c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f3497c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3498d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f3499d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3500e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ColorStateList f3501e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3502f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f3503f0;
    public final Rect g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f3504g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f3505h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f3506h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f3507i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public StaticLayout f3508i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f3509j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f3511k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f3513l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public CharSequence f3515m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f3516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f3518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f3525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f3526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f3527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f3528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f3529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f3530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f3531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Typeface f3532z;
    public int j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3510k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3512l = 15.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3514m = 15.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextUtils.TruncateAt f3476F = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f3480J = true;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f3517n0 = 1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f3519o0 = 0.0f;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f3521p0 = 1.0f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f3523q0 = 1;

    public C0230d(ViewGroup viewGroup) {
        this.f3492a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f3505h = new Rect();
        this.g = new Rect();
        this.f3507i = new RectF();
        float f3 = this.f3498d;
        this.f3500e = android.support.v4.media.session.p.n(1.0f, f3, 0.5f, f3);
        h(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, float f3, int i11) {
        float f7 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i11) * f3) + (Color.alpha(i10) * f7)), Math.round((Color.red(i11) * f3) + (Color.red(i10) * f7)), Math.round((Color.green(i11) * f3) + (Color.green(i10) * f7)), Math.round((Color.blue(i11) * f3) + (Color.blue(i10) * f7)));
    }

    public static float g(float f3, float f7, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return p137n7.a.a(f3, f7, f10);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f3689a;
        boolean z10 = this.f3492a.getLayoutDirection() == 1;
        if (this.f3480J) {
            return (z10 ? G1.g.f2785d : G1.g.f2784c).d(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void c(float f3, boolean z10) {
        float f7;
        float f10;
        Typeface typeface;
        boolean z11;
        Layout.Alignment alignment;
        if (this.f3477G == null) {
            return;
        }
        float fWidth = this.f3505h.width();
        float fWidth2 = this.g.width();
        if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
            f7 = this.f3514m;
            f10 = this.f3503f0;
            this.f3482L = 1.0f;
            typeface = this.f3529w;
        } else {
            float f11 = this.f3512l;
            float f12 = this.f3504g0;
            Typeface typeface2 = this.f3532z;
            if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                this.f3482L = 1.0f;
            } else {
                this.f3482L = g(this.f3512l, this.f3514m, f3, this.f3488W) / this.f3512l;
            }
            float f13 = this.f3514m / this.f3512l;
            fWidth = (z10 || this.f3496c || fWidth2 * f13 <= fWidth) ? fWidth2 : Math.min(fWidth / f13, fWidth2);
            f7 = f11;
            f10 = f12;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (fWidth > 0.0f) {
            boolean z12 = this.f3483M != f7;
            boolean z13 = this.f3506h0 != f10;
            boolean z14 = this.f3473C != typeface;
            StaticLayout staticLayout = this.f3508i0;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.S;
            this.f3483M = f7;
            this.f3506h0 = f10;
            this.f3473C = typeface;
            this.S = false;
            textPaint.setLinearText(this.f3482L != 1.0f);
            z11 = z15;
        } else {
            z11 = false;
        }
        if (this.f3478H == null || z11) {
            textPaint.setTextSize(this.f3483M);
            textPaint.setTypeface(this.f3473C);
            textPaint.setLetterSpacing(this.f3506h0);
            boolean zB = b(this.f3477G);
            this.f3479I = zB;
            int i10 = this.f3517n0;
            if (i10 <= 1 || (zB && !this.f3496c)) {
                i10 = 1;
            }
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.j, zB ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f3479I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f3479I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            B b5 = new B(this.f3477G, textPaint, (int) fWidth);
            b5.f3438l = this.f3476F;
            b5.f3437k = zB;
            b5.f3433e = alignment;
            b5.j = false;
            b5.f3434f = i10;
            float f14 = this.f3519o0;
            float f15 = this.f3521p0;
            b5.g = f14;
            b5.f3435h = f15;
            b5.f3436i = this.f3523q0;
            StaticLayout staticLayoutA = b5.a();
            staticLayoutA.getClass();
            this.f3508i0 = staticLayoutA;
            this.f3478H = staticLayoutA.getText();
        }
    }

    public final void d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f3478H != null) {
            RectF rectF = this.f3507i;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f3 = this.f3483M;
            TextPaint textPaint = this.T;
            textPaint.setTextSize(f3);
            float f7 = this.f3527u;
            float f10 = this.f3528v;
            float f11 = this.f3482L;
            if (f11 != 1.0f && !this.f3496c) {
                canvas.scale(f11, f11, f7, f10);
            }
            if (this.f3517n0 <= 1 || ((this.f3479I && !this.f3496c) || (this.f3496c && this.f3494b <= this.f3500e))) {
                canvas.translate(f7, f10);
                this.f3508i0.draw(canvas);
            } else {
                float lineStart = this.f3527u - this.f3508i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f10);
                if (!this.f3496c) {
                    textPaint.setAlpha((int) (this.f3513l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.f3484N, this.f3485O, this.f3486P, Y2.a.t(this.Q, textPaint.getAlpha()));
                    }
                    this.f3508i0.draw(canvas);
                }
                if (!this.f3496c) {
                    textPaint.setAlpha((int) (this.f3511k0 * alpha));
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.f3484N, this.f3485O, this.f3486P, Y2.a.t(this.Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f3508i0.getLineBaseline(0);
                CharSequence charSequence = this.f3515m0;
                float f12 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.f3484N, this.f3485O, this.f3486P, this.Q);
                }
                if (!this.f3496c) {
                    String strTrim = this.f3515m0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f3508i0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                }
                canvas = canvas;
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final float e() {
        float f3 = this.f3514m;
        TextPaint textPaint = this.U;
        textPaint.setTextSize(f3);
        textPaint.setTypeface(this.f3529w);
        textPaint.setLetterSpacing(this.f3503f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3531y;
            if (typeface != null) {
                this.f3530x = N7.f.e(configuration, typeface);
            }
            Typeface typeface2 = this.f3472B;
            if (typeface2 != null) {
                this.f3471A = N7.f.e(configuration, typeface2);
            }
            Typeface typeface3 = this.f3530x;
            if (typeface3 == null) {
                typeface3 = this.f3531y;
            }
            this.f3529w = typeface3;
            Typeface typeface4 = this.f3471A;
            if (typeface4 == null) {
                typeface4 = this.f3472B;
            }
            this.f3532z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z10) {
        float fMeasureText;
        float f3;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.f3492a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z10) {
            return;
        }
        c(1.0f, z10);
        CharSequence charSequence = this.f3478H;
        TextPaint textPaint = this.T;
        if (charSequence != null && (staticLayout = this.f3508i0) != null) {
            this.f3515m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f3476F);
        }
        CharSequence charSequence2 = this.f3515m0;
        if (charSequence2 != null) {
            this.f3509j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f3509j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f3510k, this.f3479I ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f3505h;
        if (i10 == 48) {
            this.f3524r = rect.top;
        } else if (i10 != 80) {
            this.f3524r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f3524r = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f3526t = rect.centerX() - (this.f3509j0 / 2.0f);
        } else if (i11 != 5) {
            this.f3526t = rect.left;
        } else {
            this.f3526t = rect.right - this.f3509j0;
        }
        c(0.0f, z10);
        StaticLayout staticLayout2 = this.f3508i0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f3508i0;
        if (staticLayout3 == null || this.f3517n0 <= 1) {
            CharSequence charSequence3 = this.f3478H;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f3508i0;
        this.f3520p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.j, this.f3479I ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.g;
        if (i12 == 48) {
            this.f3522q = rect2.top;
        } else if (i12 != 80) {
            this.f3522q = rect2.centerY() - (height / 2.0f);
        } else {
            this.f3522q = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f3525s = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f3525s = rect2.left;
        } else {
            this.f3525s = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f3481K;
        if (bitmap != null) {
            bitmap.recycle();
            this.f3481K = null;
        }
        q(this.f3494b);
        float f7 = this.f3494b;
        boolean z11 = this.f3496c;
        RectF rectF = this.f3507i;
        if (z11) {
            if (f7 < this.f3500e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f7, this.f3487V);
            rectF.top = g(this.f3522q, this.f3524r, f7, this.f3487V);
            rectF.right = g(rect2.right, rect.right, f7, this.f3487V);
            rectF.bottom = g(rect2.bottom, rect.bottom, f7, this.f3487V);
        }
        if (!this.f3496c) {
            this.f3527u = g(this.f3525s, this.f3526t, f7, this.f3487V);
            this.f3528v = g(this.f3522q, this.f3524r, f7, this.f3487V);
            q(f7);
            f3 = f7;
        } else if (f7 < this.f3500e) {
            this.f3527u = this.f3525s;
            this.f3528v = this.f3522q;
            q(0.0f);
            f3 = 0.0f;
        } else {
            this.f3527u = this.f3526t;
            this.f3528v = this.f3524r - Math.max(0, this.f3502f);
            q(1.0f);
            f3 = 1.0f;
        }
        p076h2.a aVar = p137n7.a.f20016b;
        this.f3511k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f7, aVar);
        WeakHashMap weakHashMap = S.f3689a;
        viewGroup.postInvalidateOnAnimation();
        this.f3513l0 = g(1.0f, 0.0f, f7, aVar);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f3518o;
        ColorStateList colorStateList2 = this.f3516n;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f(colorStateList2), f3, f(this.f3518o)));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        int i14 = Build.VERSION.SDK_INT;
        float f10 = this.f3503f0;
        float f11 = this.f3504g0;
        if (f10 != f11) {
            textPaint.setLetterSpacing(g(f11, f10, f7, aVar));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.f3484N = p137n7.a.a(this.f3495b0, this.f3489X, f7);
        this.f3485O = p137n7.a.a(this.f3497c0, this.f3490Y, f7);
        this.f3486P = p137n7.a.a(this.f3499d0, this.f3491Z, f7);
        int iA = a(f(this.f3501e0), f7, f(this.f3493a0));
        this.Q = iA;
        textPaint.setShadowLayer(this.f3484N, this.f3485O, this.f3486P, iA);
        if (this.f3496c) {
            int alpha = textPaint.getAlpha();
            float f12 = this.f3500e;
            textPaint.setAlpha((int) ((f7 <= f12 ? p137n7.a.b(1.0f, 0.0f, this.f3498d, f12, f7) : p137n7.a.b(0.0f, 1.0f, f12, 1.0f, f7)) * alpha));
            if (i14 >= 31) {
                textPaint.setShadowLayer(this.f3484N, this.f3485O, this.f3486P, Y2.a.t(this.Q, textPaint.getAlpha()));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f3518o == colorStateList && this.f3516n == colorStateList) {
            return;
        }
        this.f3518o = colorStateList;
        this.f3516n = colorStateList;
        i(false);
    }

    public final void k(int i10) {
        ViewGroup viewGroup = this.f3492a;
        N7.e eVar = new N7.e(viewGroup.getContext(), i10);
        ColorStateList colorStateList = eVar.j;
        if (colorStateList != null) {
            this.f3518o = colorStateList;
        }
        float f3 = eVar.f6065k;
        if (f3 != 0.0f) {
            this.f3514m = f3;
        }
        ColorStateList colorStateList2 = eVar.f6057a;
        if (colorStateList2 != null) {
            this.f3493a0 = colorStateList2;
        }
        this.f3490Y = eVar.f6061e;
        this.f3491Z = eVar.f6062f;
        this.f3489X = eVar.g;
        this.f3503f0 = eVar.f6064i;
        N7.b bVar = this.f3475E;
        if (bVar != null) {
            bVar.f6051f = true;
        }
        p248z6.c cVar = new p248z6.c(12, this);
        eVar.a();
        this.f3475E = new N7.b(cVar, eVar.f6068n);
        eVar.c(viewGroup.getContext(), this.f3475E);
        i(false);
    }

    public final void l(int i10) {
        if (this.f3510k != i10) {
            this.f3510k = i10;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        N7.b bVar = this.f3475E;
        if (bVar != null) {
            bVar.f6051f = true;
        }
        if (this.f3531y == typeface) {
            return false;
        }
        this.f3531y = typeface;
        Typeface typefaceE = N7.f.e(this.f3492a.getContext().getResources().getConfiguration(), typeface);
        this.f3530x = typefaceE;
        if (typefaceE == null) {
            typefaceE = this.f3531y;
        }
        this.f3529w = typefaceE;
        return true;
    }

    public final void n(int i10) {
        ViewGroup viewGroup = this.f3492a;
        N7.e eVar = new N7.e(viewGroup.getContext(), i10);
        ColorStateList colorStateList = eVar.j;
        if (colorStateList != null) {
            this.f3516n = colorStateList;
        }
        float f3 = eVar.f6065k;
        if (f3 != 0.0f) {
            this.f3512l = f3;
        }
        ColorStateList colorStateList2 = eVar.f6057a;
        if (colorStateList2 != null) {
            this.f3501e0 = colorStateList2;
        }
        this.f3497c0 = eVar.f6061e;
        this.f3499d0 = eVar.f6062f;
        this.f3495b0 = eVar.g;
        this.f3504g0 = eVar.f6064i;
        N7.b bVar = this.f3474D;
        if (bVar != null) {
            bVar.f6051f = true;
        }
        O8.c cVar = new O8.c(this);
        eVar.a();
        this.f3474D = new N7.b(cVar, eVar.f6068n);
        eVar.c(viewGroup.getContext(), this.f3474D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        N7.b bVar = this.f3474D;
        if (bVar != null) {
            bVar.f6051f = true;
        }
        if (this.f3472B == typeface) {
            return false;
        }
        this.f3472B = typeface;
        Typeface typefaceE = N7.f.e(this.f3492a.getContext().getResources().getConfiguration(), typeface);
        this.f3471A = typefaceE;
        if (typefaceE == null) {
            typefaceE = this.f3472B;
        }
        this.f3532z = typefaceE;
        return true;
    }

    public final void p(float f3) {
        float f7;
        float fH = B9.a.h(f3, 0.0f, 1.0f);
        if (fH != this.f3494b) {
            this.f3494b = fH;
            boolean z10 = this.f3496c;
            Rect rect = this.f3505h;
            Rect rect2 = this.g;
            RectF rectF = this.f3507i;
            if (z10) {
                if (fH < this.f3500e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, fH, this.f3487V);
                rectF.top = g(this.f3522q, this.f3524r, fH, this.f3487V);
                rectF.right = g(rect2.right, rect.right, fH, this.f3487V);
                rectF.bottom = g(rect2.bottom, rect.bottom, fH, this.f3487V);
            }
            if (!this.f3496c) {
                this.f3527u = g(this.f3525s, this.f3526t, fH, this.f3487V);
                this.f3528v = g(this.f3522q, this.f3524r, fH, this.f3487V);
                q(fH);
                f7 = fH;
            } else if (fH < this.f3500e) {
                this.f3527u = this.f3525s;
                this.f3528v = this.f3522q;
                q(0.0f);
                f7 = 0.0f;
            } else {
                this.f3527u = this.f3526t;
                this.f3528v = this.f3524r - Math.max(0, this.f3502f);
                q(1.0f);
                f7 = 1.0f;
            }
            p076h2.a aVar = p137n7.a.f20016b;
            this.f3511k0 = 1.0f - g(0.0f, 1.0f, 1.0f - fH, aVar);
            WeakHashMap weakHashMap = S.f3689a;
            ViewGroup viewGroup = this.f3492a;
            viewGroup.postInvalidateOnAnimation();
            this.f3513l0 = g(1.0f, 0.0f, fH, aVar);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f3518o;
            ColorStateList colorStateList2 = this.f3516n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f7, f(this.f3518o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i10 = Build.VERSION.SDK_INT;
            float f10 = this.f3503f0;
            float f11 = this.f3504g0;
            if (f10 != f11) {
                textPaint.setLetterSpacing(g(f11, f10, fH, aVar));
            } else {
                textPaint.setLetterSpacing(f10);
            }
            this.f3484N = p137n7.a.a(this.f3495b0, this.f3489X, fH);
            this.f3485O = p137n7.a.a(this.f3497c0, this.f3490Y, fH);
            this.f3486P = p137n7.a.a(this.f3499d0, this.f3491Z, fH);
            int iA = a(f(this.f3501e0), fH, f(this.f3493a0));
            this.Q = iA;
            textPaint.setShadowLayer(this.f3484N, this.f3485O, this.f3486P, iA);
            if (this.f3496c) {
                int alpha = textPaint.getAlpha();
                float f12 = this.f3500e;
                textPaint.setAlpha((int) ((fH <= f12 ? p137n7.a.b(1.0f, 0.0f, this.f3498d, f12, fH) : p137n7.a.b(0.0f, 1.0f, f12, 1.0f, fH)) * alpha));
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.f3484N, this.f3485O, this.f3486P, Y2.a.t(this.Q, textPaint.getAlpha()));
                }
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void q(float f3) {
        c(f3, false);
        WeakHashMap weakHashMap = S.f3689a;
        this.f3492a.postInvalidateOnAnimation();
    }
}
