package com.google.android.material.imageview;

import R7.i;
import R7.o;
import R7.p;
import R7.q;
import R7.z;
import Y7.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.ayah.R;
import p181s2.s;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f14946A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public i f14947B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public o f14948C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f14949D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Path f14950E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14951F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14952G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f14953H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f14954I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f14955J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f14956K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f14957L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q f14958u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f14959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f14960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f14961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f14962y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Path f14963z;

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean a() {
        return getLayoutDirection() == 1;
    }

    public final void e(int i10, int i11) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i10 - getPaddingRight();
        float paddingBottom = i11 - getPaddingBottom();
        RectF rectF = this.f14959v;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        o oVar = this.f14948C;
        q qVar = this.f14958u;
        Path path = this.f14963z;
        qVar.a(oVar, 1.0f, rectF, null, path);
        Path path2 = this.f14950E;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f14960w;
        rectF2.set(0.0f, 0.0f, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f14954I;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f14956K;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return a() ? this.f14951F : this.f14953H;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (this.f14955J != Integer.MIN_VALUE || this.f14956K != Integer.MIN_VALUE) {
            if (a() && (i11 = this.f14956K) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!a() && (i10 = this.f14955J) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f14951F;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (this.f14955J != Integer.MIN_VALUE || this.f14956K != Integer.MIN_VALUE) {
            if (a() && (i11 = this.f14955J) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!a() && (i10 = this.f14956K) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f14953H;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f14955J;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return a() ? this.f14953H : this.f14951F;
    }

    public int getContentPaddingTop() {
        return this.f14952G;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public o getShapeAppearanceModel() {
        return this.f14948C;
    }

    public ColorStateList getStrokeColor() {
        return this.f14946A;
    }

    public float getStrokeWidth() {
        return this.f14949D;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f14950E, this.f14962y);
        if (this.f14946A == null) {
            return;
        }
        float f3 = this.f14949D;
        Paint paint = this.f14961x;
        paint.setStrokeWidth(f3);
        int colorForState = this.f14946A.getColorForState(getDrawableState(), this.f14946A.getDefaultColor());
        if (this.f14949D <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f14963z, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f14957L && isLayoutDirectionResolved()) {
            this.f14957L = true;
            if (!isPaddingRelative() && this.f14955J == Integer.MIN_VALUE && this.f14956K == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        e(i10, i11);
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f14955J = Integer.MIN_VALUE;
        this.f14956K = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f14951F) + i10, (super.getPaddingTop() - this.f14952G) + i11, (super.getPaddingRight() - this.f14953H) + i12, (super.getPaddingBottom() - this.f14954I) + i13);
        this.f14951F = i10;
        this.f14952G = i11;
        this.f14953H = i12;
        this.f14954I = i13;
    }

    public void setContentPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i10, (super.getPaddingTop() - this.f14952G) + i11, (super.getPaddingEnd() - getContentPaddingEnd()) + i12, (super.getPaddingBottom() - this.f14954I) + i13);
        this.f14951F = a() ? i12 : i10;
        this.f14952G = i11;
        if (!a()) {
            i10 = i12;
        }
        this.f14953H = i10;
        this.f14954I = i13;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // R7.z
    public void setShapeAppearanceModel(o oVar) {
        this.f14948C = oVar;
        i iVar = this.f14947B;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(oVar);
        }
        e(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f14946A = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(s.e(getContext(), i10));
    }

    public void setStrokeWidth(float f3) {
        if (this.f14949D != f3) {
            this.f14949D = f3;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i10);
        this.f14958u = p.f7358a;
        this.f14963z = new Path();
        this.f14957L = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f14962y = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f14959v = new RectF();
        this.f14960w = new RectF();
        this.f14950E = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p128m7.a.f19651X, i10, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f14946A = g.w(context2, typedArrayObtainStyledAttributes, 9);
        this.f14949D = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14951F = dimensionPixelSize;
        this.f14952G = dimensionPixelSize;
        this.f14953H = dimensionPixelSize;
        this.f14954I = dimensionPixelSize;
        this.f14951F = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f14952G = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f14953H = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f14954I = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f14955J = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f14956K = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f14961x = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f14948C = o.d(context2, attributeSet, i10, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new G7.a(this));
    }
}
