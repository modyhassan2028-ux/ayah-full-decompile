package p240y7;

import H7.D;
import H7.E;
import H7.H;
import O7.a;
import R7.h;
import R7.i;
import R7.m;
import R7.o;
import R7.q;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p137n7.e;
import p248z6.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements Drawable.Callback, D {

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final int[] f24658X0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final ShapeDrawable f24659Y0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final PointF f24660A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final Path f24661B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final E f24662C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f24663D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f24664E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f24665F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f24666G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f24667H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f24668I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f24669J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f24670K0;
    public int L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ColorFilter f24671M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public PorterDuffColorFilter f24672N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public ColorStateList f24673O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ColorStateList f24674P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public PorterDuff.Mode f24675P0;
    public ColorStateList Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int[] f24676Q0;
    public float R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public ColorStateList f24677R0;
    public float S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public WeakReference f24678S0;
    public ColorStateList T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public TextUtils.TruncateAt f24679T0;
    public float U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f24680U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ColorStateList f24681V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f24682V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public CharSequence f24683W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public boolean f24684W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f24685X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Drawable f24686Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ColorStateList f24687Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f24688a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f24689b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f24690c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Drawable f24691d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RippleDrawable f24692e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorStateList f24693f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f24694g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SpannableStringBuilder f24695h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f24696i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f24697j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Drawable f24698k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ColorStateList f24699l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public e f24700m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public e f24701n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f24702o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f24703p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f24704q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f24705r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f24706s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f24707t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f24708u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f24709v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Context f24710w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Paint f24711x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Paint.FontMetrics f24712y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final RectF f24713z0;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, com.ayah.R.style.Widget_MaterialComponents_Chip_Action);
        this.S = -1.0f;
        this.f24711x0 = new Paint(1);
        this.f24712y0 = new Paint.FontMetrics();
        this.f24713z0 = new RectF();
        this.f24660A0 = new PointF();
        this.f24661B0 = new Path();
        this.L0 = 255;
        this.f24675P0 = PorterDuff.Mode.SRC_IN;
        this.f24678S0 = new WeakReference(null);
        k(context);
        this.f24710w0 = context;
        E e10 = new E(this);
        this.f24662C0 = e10;
        this.f24683W = "";
        e10.f3441a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f24658X0;
        setState(iArr);
        if (!Arrays.equals(this.f24676Q0, iArr)) {
            this.f24676Q0 = iArr;
            if (b0()) {
                E(getState(), iArr);
            }
        }
        this.f24680U0 = true;
        int[] iArr2 = a.f6500a;
        f24659Y0.setTint(-1);
    }

    public static boolean B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void c0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        return this.f24684W0 ? i() : this.S;
    }

    public final void D() {
        c cVar = (c) this.f24678S0.get();
        if (cVar != null) {
            Chip chip = (Chip) cVar;
            chip.c(chip.f14798H);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean E(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f24674P;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f24663D0) : 0);
        boolean state = true;
        if (this.f24663D0 != iC) {
            this.f24663D0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.Q;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f24664E0) : 0);
        if (this.f24664E0 != iC2) {
            this.f24664E0 = iC2;
            zOnStateChange = true;
        }
        int iC3 = A1.a.c(iC2, iC);
        if ((this.f24665F0 != iC3) | (this.f7325r.f7296c == null)) {
            this.f24665F0 = iC3;
            m(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.T;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f24666G0) : 0;
        if (this.f24666G0 != colorForState) {
            this.f24666G0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f24677R0 == null || !a.d(iArr)) ? 0 : this.f24677R0.getColorForState(iArr, this.f24667H0);
        if (this.f24667H0 != colorForState2) {
            this.f24667H0 = colorForState2;
        }
        N7.e eVar = this.f24662C0.g;
        int colorForState3 = (eVar == null || (colorStateList = eVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f24668I0);
        if (this.f24668I0 != colorForState3) {
            this.f24668I0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (state2[i10] != 16842912) {
                        i10++;
                    } else if (this.f24696i0) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                break;
            }
        } else {
            z10 = false;
            break;
        }
        if (this.f24669J0 == z10 || this.f24698k0 == null) {
            z11 = false;
        } else {
            float fY = y();
            this.f24669J0 = z10;
            if (fY != y()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f24673O0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f24670K0) : 0;
        if (this.f24670K0 != colorForState4) {
            this.f24670K0 = colorForState4;
            ColorStateList colorStateList6 = this.f24673O0;
            PorterDuff.Mode mode = this.f24675P0;
            this.f24672N0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (C(this.f24686Y)) {
            state |= this.f24686Y.setState(iArr);
        }
        if (C(this.f24698k0)) {
            state |= this.f24698k0.setState(iArr);
        }
        if (C(this.f24691d0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f24691d0.setState(iArr3);
        }
        int[] iArr4 = a.f6500a;
        if (C(this.f24692e0)) {
            state |= this.f24692e0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            D();
        }
        return state;
    }

    public final void F(boolean z10) {
        if (this.f24696i0 != z10) {
            this.f24696i0 = z10;
            float fY = y();
            if (!z10 && this.f24669J0) {
                this.f24669J0 = false;
            }
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void G(Drawable drawable) {
        if (this.f24698k0 != drawable) {
            float fY = y();
            this.f24698k0 = drawable;
            float fY2 = y();
            c0(this.f24698k0);
            w(this.f24698k0);
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f24699l0 != colorStateList) {
            this.f24699l0 = colorStateList;
            if (this.f24697j0 && (drawable = this.f24698k0) != null && this.f24696i0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z10) {
        if (this.f24697j0 != z10) {
            boolean Z3 = Z();
            this.f24697j0 = z10;
            boolean Z10 = Z();
            if (Z3 != Z10) {
                if (Z10) {
                    w(this.f24698k0);
                } else {
                    c0(this.f24698k0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void J(float f3) {
        if (this.S != f3) {
            this.S = f3;
            m mVarG = this.f7325r.f7294a.g();
            mVarG.b(f3);
            setShapeAppearanceModel(mVarG.a());
        }
    }

    public final void K(Drawable drawable) {
        Drawable drawable2 = this.f24686Y;
        Drawable drawableN = drawable2 != null ? B1.N(drawable2) : null;
        if (drawableN != drawable) {
            float fY = y();
            this.f24686Y = drawable != null ? drawable.mutate() : null;
            float fY2 = y();
            c0(drawableN);
            if (a0()) {
                w(this.f24686Y);
            }
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void L(float f3) {
        if (this.f24688a0 != f3) {
            float fY = y();
            this.f24688a0 = f3;
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        this.f24689b0 = true;
        if (this.f24687Z != colorStateList) {
            this.f24687Z = colorStateList;
            if (a0()) {
                this.f24686Y.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.f24685X != z10) {
            boolean zA0 = a0();
            this.f24685X = z10;
            boolean zA1 = a0();
            if (zA0 != zA1) {
                if (zA1) {
                    w(this.f24686Y);
                } else {
                    c0(this.f24686Y);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.f24684W0) {
                r(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(float f3) {
        if (this.U != f3) {
            this.U = f3;
            this.f24711x0.setStrokeWidth(f3);
            if (this.f24684W0) {
                s(f3);
            }
            invalidateSelf();
        }
    }

    public final void Q(Drawable drawable) {
        Drawable drawable2 = this.f24691d0;
        Drawable drawableN = drawable2 != null ? B1.N(drawable2) : null;
        if (drawableN != drawable) {
            float fZ = z();
            this.f24691d0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = a.f6500a;
            this.f24692e0 = new RippleDrawable(a.c(this.f24681V), this.f24691d0, f24659Y0);
            float fZ2 = z();
            c0(drawableN);
            if (b0()) {
                w(this.f24691d0);
            }
            invalidateSelf();
            if (fZ != fZ2) {
                D();
            }
        }
    }

    public final void R(float f3) {
        if (this.f24708u0 != f3) {
            this.f24708u0 = f3;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void S(float f3) {
        if (this.f24694g0 != f3) {
            this.f24694g0 = f3;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void T(float f3) {
        if (this.f24707t0 != f3) {
            this.f24707t0 = f3;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.f24693f0 != colorStateList) {
            this.f24693f0 = colorStateList;
            if (b0()) {
                this.f24691d0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(boolean z10) {
        if (this.f24690c0 != z10) {
            boolean zB0 = b0();
            this.f24690c0 = z10;
            boolean zB1 = b0();
            if (zB0 != zB1) {
                if (zB1) {
                    w(this.f24691d0);
                } else {
                    c0(this.f24691d0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void W(float f3) {
        if (this.f24704q0 != f3) {
            float fY = y();
            this.f24704q0 = f3;
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void X(float f3) {
        if (this.f24703p0 != f3) {
            float fY = y();
            this.f24703p0 = f3;
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void Y(ColorStateList colorStateList) {
        if (this.f24681V != colorStateList) {
            this.f24681V = colorStateList;
            this.f24677R0 = null;
            onStateChange(getState());
        }
    }

    public final boolean Z() {
        return this.f24697j0 && this.f24698k0 != null && this.f24669J0;
    }

    @Override // R7.i, H7.D
    public final void a() {
        D();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.f24685X && this.f24686Y != null;
    }

    public final boolean b0() {
        return this.f24690c0 && this.f24691d0 != null;
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i11;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.L0) == 0) {
            return;
        }
        if (i10 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z10 = this.f24684W0;
        Paint paint = this.f24711x0;
        RectF rectF = this.f24713z0;
        if (!z10) {
            paint.setColor(this.f24663D0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, A(), A(), paint);
        }
        if (!this.f24684W0) {
            paint.setColor(this.f24664E0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f24671M0;
            if (colorFilter == null) {
                colorFilter = this.f24672N0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, A(), A(), paint);
        }
        if (this.f24684W0) {
            super.draw(canvas);
        }
        if (this.U > 0.0f && !this.f24684W0) {
            paint.setColor(this.f24666G0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f24684W0) {
                ColorFilter colorFilter2 = this.f24671M0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f24672N0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f7 = this.U / 2.0f;
            rectF.set(f3 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
            float f10 = this.S - (this.U / 2.0f);
            canvas2.drawRoundRect(rectF, f10, f10, paint);
        }
        paint.setColor(this.f24667H0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f24684W0) {
            RectF rectF2 = new RectF(bounds);
            h hVar = this.f7325r;
            o oVar = hVar.f7294a;
            float f11 = hVar.f7301i;
            c cVar = this.f7318H;
            q qVar = this.f7319I;
            Path path = this.f24661B0;
            qVar.a(oVar, f11, rectF2, cVar, path);
            e(canvas2, paint, path, this.f7325r.f7294a, g());
        } else {
            canvas2.drawRoundRect(rectF, A(), A(), paint);
        }
        if (a0()) {
            x(bounds, rectF);
            float f12 = rectF.left;
            float f13 = rectF.top;
            canvas2.translate(f12, f13);
            this.f24686Y.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24686Y.draw(canvas2);
            canvas2.translate(-f12, -f13);
        }
        if (Z()) {
            x(bounds, rectF);
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f24698k0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24698k0.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f24680U0 && this.f24683W != null) {
            PointF pointF = this.f24660A0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f24683W;
            E e10 = this.f24662C0;
            if (charSequence != null) {
                float fY = y() + this.f24702o0 + this.f24705r0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fY;
                } else {
                    pointF.x = bounds.right - fY;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = e10.f3441a;
                Paint.FontMetrics fontMetrics = this.f24712y0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f24683W != null) {
                float fY2 = y() + this.f24702o0 + this.f24705r0;
                float fZ = z() + this.f24709v0 + this.f24706s0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fY2;
                    rectF.right = bounds.right - fZ;
                } else {
                    rectF.left = bounds.left + fZ;
                    rectF.right = bounds.right - fY2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            N7.e eVar = e10.g;
            TextPaint textPaint2 = e10.f3441a;
            if (eVar != null) {
                textPaint2.drawableState = getState();
                e10.g.e(this.f24710w0, textPaint2, e10.f3442b);
            }
            textPaint2.setTextAlign(align);
            boolean z11 = Math.round(e10.a(this.f24683W.toString())) > Math.round(rectF.width());
            if (z11) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i11 = iSave;
            } else {
                i11 = 0;
            }
            CharSequence charSequenceEllipsize = this.f24683W;
            if (z11 && this.f24679T0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f24679T0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z11) {
                canvas2.restoreToCount(i11);
            }
        }
        if (b0()) {
            rectF.setEmpty();
            if (b0()) {
                float f16 = this.f24709v0 + this.f24708u0;
                if (getLayoutDirection() == 0) {
                    float f17 = bounds.right - f16;
                    rectF.right = f17;
                    rectF.left = f17 - this.f24694g0;
                } else {
                    float f18 = bounds.left + f16;
                    rectF.left = f18;
                    rectF.right = f18 + this.f24694g0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f19 = this.f24694g0;
                float f20 = fExactCenterY - (f19 / 2.0f);
                rectF.top = f20;
                rectF.bottom = f20 + f19;
            }
            float f21 = rectF.left;
            float f22 = rectF.top;
            canvas2.translate(f21, f22);
            this.f24691d0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = a.f6500a;
            this.f24692e0.setBounds(this.f24691d0.getBounds());
            this.f24692e0.jumpToCurrentState();
            this.f24692e0.draw(canvas2);
            canvas2.translate(-f21, -f22);
        }
        if (this.L0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f24671M0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(z() + this.f24662C0.a(this.f24683W.toString()) + y() + this.f24702o0 + this.f24705r0 + this.f24706s0 + this.f24709v0), this.f24682V0);
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f24684W0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.R, this.S);
        } else {
            outline.setRoundRect(bounds, this.S);
            outline2 = outline;
        }
        outline2.setAlpha(this.L0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (B(this.f24674P) || B(this.Q) || B(this.T)) {
            return true;
        }
        N7.e eVar = this.f24662C0.g;
        if (eVar == null || (colorStateList = eVar.j) == null || !colorStateList.isStateful()) {
            return (this.f24697j0 && this.f24698k0 != null && this.f24696i0) || C(this.f24686Y) || C(this.f24698k0) || B(this.f24673O0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (a0()) {
            zOnLayoutDirectionChanged |= this.f24686Y.setLayoutDirection(i10);
        }
        if (Z()) {
            zOnLayoutDirectionChanged |= this.f24698k0.setLayoutDirection(i10);
        }
        if (b0()) {
            zOnLayoutDirectionChanged |= this.f24691d0.setLayoutDirection(i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (a0()) {
            zOnLevelChange |= this.f24686Y.setLevel(i10);
        }
        if (Z()) {
            zOnLevelChange |= this.f24698k0.setLevel(i10);
        }
        if (b0()) {
            zOnLevelChange |= this.f24691d0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f24684W0) {
            super.onStateChange(iArr);
        }
        return E(iArr, this.f24676Q0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.L0 != i10) {
            this.L0 = i10;
            invalidateSelf();
        }
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f24671M0 != colorFilter) {
            this.f24671M0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f24673O0 != colorStateList) {
            this.f24673O0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // R7.i, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f24675P0 != mode) {
            this.f24675P0 = mode;
            ColorStateList colorStateList = this.f24673O0;
            this.f24672N0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (a0()) {
            visible |= this.f24686Y.setVisible(z10, z11);
        }
        if (Z()) {
            visible |= this.f24698k0.setVisible(z10, z11);
        }
        if (b0()) {
            visible |= this.f24691d0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f24691d0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f24676Q0);
            }
            drawable.setTintList(this.f24693f0);
            return;
        }
        Drawable drawable2 = this.f24686Y;
        if (drawable == drawable2 && this.f24689b0) {
            drawable2.setTintList(this.f24687Z);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void x(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (a0() || Z()) {
            float f3 = this.f24702o0 + this.f24703p0;
            Drawable drawable = this.f24669J0 ? this.f24698k0 : this.f24686Y;
            float intrinsicWidth = this.f24688a0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f7 = rect.left + f3;
                rectF.left = f7;
                rectF.right = f7 + intrinsicWidth;
            } else {
                float f10 = rect.right - f3;
                rectF.right = f10;
                rectF.left = f10 - intrinsicWidth;
            }
            Drawable drawable2 = this.f24669J0 ? this.f24698k0 : this.f24686Y;
            float fCeil = this.f24688a0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(H.g(this.f24710w0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float y() {
        if (!a0() && !Z()) {
            return 0.0f;
        }
        float f3 = this.f24703p0;
        Drawable drawable = this.f24669J0 ? this.f24698k0 : this.f24686Y;
        float intrinsicWidth = this.f24688a0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f3 + this.f24704q0;
    }

    public final float z() {
        if (b0()) {
            return this.f24707t0 + this.f24694g0 + this.f24708u0;
        }
        return 0.0f;
    }
}
