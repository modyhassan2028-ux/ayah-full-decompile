package androidx.appcompat.widget;

import F7.f;
import I1.D;
import I1.S;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;
import p013b2.j;
import p017b7.g;
import p074h0.i;
import p151p.AbstractC1249j0;
import p151p.C1277y;
import p151p.T;
import p151p.X0;
import p151p.Y0;
import p151p.q1;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final f f11633l0 = new f(Float.class, "thumbPos", 16);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int[] f11634m0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11635A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11636B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11637C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11638D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f11639E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f11640F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f11641G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f11642H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f11643I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f11644J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f11645K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f11646L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f11647M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f11648N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final VelocityTracker f11649O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f11650P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public int U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f11651V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f11652W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f11653a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f11654b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final TextPaint f11655c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ColorStateList f11656d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public StaticLayout f11657e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public StaticLayout f11658f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public p121m.a f11659g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ObjectAnimator f11660h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public C1277y f11661i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public X0 f11662j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Rect f11663k0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f11664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f11665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f11666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f11669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f11670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f11671y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11672z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private C1277y getEmojiTextViewHelper() {
        if (this.f11661i0 == null) {
            this.f11661i0 = new C1277y(this);
        }
        return this.f11661i0;
    }

    private boolean getTargetCheckedState() {
        return this.Q > 0.5f;
    }

    private int getThumbOffset() {
        boolean z10 = q1.f20766a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.Q : this.Q) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f11669w;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f11663k0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f11664r;
        Rect rectB = drawable2 != null ? AbstractC1249j0.b(drawable2) : AbstractC1249j0.f20690c;
        return ((((this.R - this.T) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f11642H = charSequence;
        C1277y emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodL0 = ((B0.c) emojiTextViewHelper.f20803b.f9953r).l0(this.f11659g0);
        if (transformationMethodL0 != null) {
            charSequence = transformationMethodL0.getTransformation(charSequence, this);
        }
        this.f11643I = charSequence;
        this.f11658f0 = null;
        if (this.f11644J) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f11640F = charSequence;
        C1277y emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodL0 = ((B0.c) emojiTextViewHelper.f20803b.f9953r).l0(this.f11659g0);
        if (transformationMethodL0 != null) {
            charSequence = transformationMethodL0.getTransformation(charSequence, this);
        }
        this.f11641G = charSequence;
        this.f11657e0 = null;
        if (this.f11644J) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f11664r;
        if (drawable != null) {
            if (this.f11667u || this.f11668v) {
                Drawable drawableMutate = drawable.mutate();
                this.f11664r = drawableMutate;
                if (this.f11667u) {
                    drawableMutate.setTintList(this.f11665s);
                }
                if (this.f11668v) {
                    this.f11664r.setTintMode(this.f11666t);
                }
                if (this.f11664r.isStateful()) {
                    this.f11664r.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f11669w;
        if (drawable != null) {
            if (this.f11672z || this.f11635A) {
                Drawable drawableMutate = drawable.mutate();
                this.f11669w = drawableMutate;
                if (this.f11672z) {
                    drawableMutate.setTintList(this.f11670x);
                }
                if (this.f11635A) {
                    this.f11669w.setTintMode(this.f11671y);
                }
                if (this.f11669w.isStateful()) {
                    this.f11669w.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f11640F);
        setTextOffInternal(this.f11642H);
        requestLayout();
    }

    public final void d() {
        if (this.f11662j0 == null && ((B0.c) this.f11661i0.f20803b.f9953r).R() && j.d()) {
            j jVarA = j.a();
            int iC = jVarA.c();
            if (iC == 3 || iC == 0) {
                X0 x9 = new X0(this);
                this.f11662j0 = x9;
                jVarA.h(x9);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.U;
        int i13 = this.f11651V;
        int i14 = this.f11652W;
        int i15 = this.f11653a0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f11664r;
        Rect rectB = drawable != null ? AbstractC1249j0.b(drawable) : AbstractC1249j0.f20690c;
        Drawable drawable2 = this.f11669w;
        Rect rect = this.f11663k0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectB != null) {
                int i17 = rectB.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectB.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectB.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectB.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f11669w.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f11669w.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f11664r;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.T + rect.right;
            this.f11664r.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f3, float f7) {
        super.drawableHotspotChanged(f3, f7);
        Drawable drawable = this.f11664r;
        if (drawable != null) {
            drawable.setHotspot(f3, f7);
        }
        Drawable drawable2 = this.f11669w;
        if (drawable2 != null) {
            drawable2.setHotspot(f3, f7);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11664r;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f11669w;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z10 = q1.f20766a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f11638D : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z10 = q1.f20766a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f11638D : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.u0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f11644J;
    }

    public boolean getSplitTrack() {
        return this.f11639E;
    }

    public int getSwitchMinWidth() {
        return this.f11637C;
    }

    public int getSwitchPadding() {
        return this.f11638D;
    }

    public CharSequence getTextOff() {
        return this.f11642H;
    }

    public CharSequence getTextOn() {
        return this.f11640F;
    }

    public Drawable getThumbDrawable() {
        return this.f11664r;
    }

    public final float getThumbPosition() {
        return this.Q;
    }

    public int getThumbTextPadding() {
        return this.f11636B;
    }

    public ColorStateList getThumbTintList() {
        return this.f11665s;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f11666t;
    }

    public Drawable getTrackDrawable() {
        return this.f11669w;
    }

    public ColorStateList getTrackTintList() {
        return this.f11670x;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f11671y;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11664r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f11669w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f11660h0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f11660h0.end();
        this.f11660h0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11634m0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f11669w;
        Rect rect = this.f11663k0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f11651V;
        int i11 = this.f11653a0;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f11664r;
        if (drawable != null) {
            if (!this.f11639E || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = AbstractC1249j0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f11657e0 : this.f11658f0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f11656d0;
            TextPaint textPaint = this.f11655c0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f11640F : this.f11642H;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f11664r != null) {
            Drawable drawable = this.f11669w;
            Rect rect = this.f11663k0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC1249j0.b(this.f11664r);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z11 = q1.f20766a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.R + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.R) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.S;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.S + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.S;
        }
        this.U = paddingLeft;
        this.f11651V = paddingTop;
        this.f11653a0 = height;
        this.f11652W = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f11644J) {
            StaticLayout staticLayout = this.f11657e0;
            TextPaint textPaint = this.f11655c0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f11641G;
                this.f11657e0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f11658f0 == null) {
                CharSequence charSequence2 = this.f11643I;
                this.f11658f0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f11664r;
        Rect rect = this.f11663k0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f11664r.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f11664r.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f11644J) {
            iMax = (this.f11636B * 2) + Math.max(this.f11657e0.getWidth(), this.f11658f0.getWidth());
        } else {
            iMax = 0;
        }
        this.T = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f11669w;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f11669w.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f11664r;
        if (drawable3 != null) {
            Rect rectB = AbstractC1249j0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.f11654b0 ? Math.max(this.f11637C, (this.T * 2) + iMax2 + iMax3) : this.f11637C;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.R = iMax4;
        this.S = iMax5;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f11640F : this.f11642H;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f3;
        VelocityTracker velocityTracker = this.f11649O;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f11646L;
        if (actionMasked != 0) {
            float f7 = 0.0f;
            if (actionMasked == 1) {
                if (this.f11645K == 2) {
                    this.f11645K = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f11650P) {
                            boolean z11 = q1.f20766a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f11645K = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i11 = this.f11645K;
                if (i11 == 1) {
                    float x9 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f10 = i10;
                    if (Math.abs(x9 - this.f11647M) > f10 || Math.abs(y10 - this.f11648N) > f10) {
                        this.f11645K = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f11647M = x9;
                        this.f11648N = y10;
                        return true;
                    }
                } else if (i11 == 2) {
                    float x10 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f11 = x10 - this.f11647M;
                    if (thumbScrollRange != 0) {
                        f3 = f11 / thumbScrollRange;
                    } else {
                        f3 = f11 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z12 = q1.f20766a;
                    if (getLayoutDirection() == 1) {
                        f3 = -f3;
                    }
                    float f12 = this.Q;
                    float f13 = f3 + f12;
                    if (f13 >= 0.0f) {
                        f7 = f13 > 1.0f ? 1.0f : f13;
                    }
                    if (f7 != f12) {
                        this.f11647M = x10;
                        setThumbPosition(f7);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f11645K == 2) {
                    this.f11645K = 0;
                    if (motionEvent.getAction() == 1) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f11650P) {
                            boolean z13 = q1.f20766a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f11645K = 0;
                velocityTracker.clear();
            }
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled() && this.f11664r != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f11664r;
                Rect rect = this.f11663k0;
                drawable.getPadding(rect);
                int i12 = this.f11651V - i10;
                int i13 = (this.U + thumbOffset) - i10;
                int i14 = this.T + i13 + rect.left + rect.right + i10;
                int i15 = this.f11653a0 + i10;
                if (x11 > i13 && x11 < i14 && y11 > i12 && y11 < i15) {
                    this.f11645K = 1;
                    this.f11647M = x11;
                    this.f11648N = y11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f11640F;
                if (string == null) {
                    string = getResources().getString(com.ayah.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = S.f3689a;
                new D(com.ayah.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f11642H;
            if (string2 == null) {
                string2 = getResources().getString(com.ayah.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = S.f3689a;
            new D(com.ayah.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f11660h0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f11633l0, zIsChecked ? 1.0f : 0.0f);
        this.f11660h0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f11660h0.setAutoCancel(true);
        this.f11660h0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f11640F);
        setTextOffInternal(this.f11642H);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f11654b0 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f11644J != z10) {
            this.f11644J = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f11639E = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f11637C = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f11638D = i10;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i10) {
        ColorStateList colorStateList;
        Typeface typeface;
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p073h.a.f16403z);
        if (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = s.e(context, resourceId)) == null) {
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
        }
        if (colorStateList != null) {
            this.f11656d0 = colorStateList;
        } else {
            this.f11656d0 = getTextColors();
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            float f3 = dimensionPixelSize;
            TextPaint textPaint = this.f11655c0;
            if (f3 != textPaint.getTextSize()) {
                textPaint.setTextSize(f3);
                requestLayout();
            }
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(1, -1);
        int i12 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i11 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i11 != 2) {
            typeface = i11 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i12);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            Context context2 = getContext();
            p121m.a aVar = new p121m.a();
            aVar.f19453r = context2.getResources().getConfiguration().locale;
            this.f11659g0 = aVar;
        } else {
            this.f11659g0 = null;
        }
        setTextOnInternal(this.f11640F);
        setTextOffInternal(this.f11642H);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i10) {
        TextPaint textPaint = this.f11655c0;
        if (i10 <= 0) {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            textPaint.setFakeBoldText((i11 & 1) != 0);
            textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f11642H;
        if (string == null) {
            string = getResources().getString(com.ayah.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = S.f3689a;
        new D(com.ayah.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f11640F;
        if (string == null) {
            string = getResources().getString(com.ayah.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = S.f3689a;
        new D(com.ayah.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f11664r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11664r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.Q = f3;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(Y2.a.E(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f11636B = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f11665s = colorStateList;
        this.f11667u = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f11666t = mode;
        this.f11668v = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f11669w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11669w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(Y2.a.E(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f11670x = colorStateList;
        this.f11672z = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f11671y = mode;
        this.f11635A = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11664r || drawable == this.f11669w;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11665s = null;
        this.f11666t = null;
        this.f11667u = false;
        this.f11668v = false;
        this.f11670x = null;
        this.f11671y = null;
        this.f11672z = false;
        this.f11635A = false;
        this.f11649O = VelocityTracker.obtain();
        this.f11654b0 = true;
        this.f11663k0 = new Rect();
        Y0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f11655c0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = p073h.a.f16402y;
        i iVarB = i.B(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        S.n(this, context, iArr, attributeSet, typedArray, i10);
        Drawable drawableR = iVarB.r(2);
        this.f11664r = drawableR;
        if (drawableR != null) {
            drawableR.setCallback(this);
        }
        Drawable drawableR2 = iVarB.r(11);
        this.f11669w = drawableR2;
        if (drawableR2 != null) {
            drawableR2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f11644J = typedArray.getBoolean(3, true);
        this.f11636B = typedArray.getDimensionPixelSize(8, 0);
        this.f11637C = typedArray.getDimensionPixelSize(5, 0);
        this.f11638D = typedArray.getDimensionPixelSize(6, 0);
        this.f11639E = typedArray.getBoolean(4, false);
        ColorStateList colorStateListQ = iVarB.q(9);
        if (colorStateListQ != null) {
            this.f11665s = colorStateListQ;
            this.f11667u = true;
        }
        PorterDuff.Mode modeC = AbstractC1249j0.c(typedArray.getInt(10, -1), null);
        if (this.f11666t != modeC) {
            this.f11666t = modeC;
            this.f11668v = true;
        }
        if (this.f11667u || this.f11668v) {
            a();
        }
        ColorStateList colorStateListQ2 = iVarB.q(12);
        if (colorStateListQ2 != null) {
            this.f11670x = colorStateListQ2;
            this.f11672z = true;
        }
        PorterDuff.Mode modeC2 = AbstractC1249j0.c(typedArray.getInt(13, -1), null);
        if (this.f11671y != modeC2) {
            this.f11671y = modeC2;
            this.f11635A = true;
        }
        if (this.f11672z || this.f11635A) {
            b();
        }
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        new T(this).f(attributeSet, i10);
        iVarB.C();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11646L = viewConfiguration.getScaledTouchSlop();
        this.f11650P = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f11655c0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
