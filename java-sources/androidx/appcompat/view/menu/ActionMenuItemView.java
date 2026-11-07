package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import p017b7.g;
import p073h.a;
import p140o.AbstractC1229c;
import p140o.C1228b;
import p140o.j;
import p140o.k;
import p140o.m;
import p140o.x;
import p151p.InterfaceC1252l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements x, View.OnClickListener, InterfaceC1252l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f11389A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public j f11390B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1228b f11391C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AbstractC1229c f11392D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f11393E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f11394F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f11395G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f11396H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f11397I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f11398y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f11399z;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // p140o.x
    public final void a(m mVar) {
        this.f11398y = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.f20162a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.f11391C == null) {
            this.f11391C = new C1228b(this);
        }
    }

    @Override // p151p.InterfaceC1252l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p151p.InterfaceC1252l
    public final boolean d() {
        return !TextUtils.isEmpty(getText()) && this.f11398y.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p140o.x
    public m getItemData() {
        return this.f11398y;
    }

    public final void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f11399z);
        if (this.f11389A != null && ((this.f11398y.f20184y & 4) != 4 || (!this.f11393E && !this.f11394F))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f11399z : null);
        CharSequence charSequence = this.f11398y.f20176q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f11398y.f20166e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f11398y.f20177r;
        if (TextUtils.isEmpty(charSequence2)) {
            g.r0(this, z12 ? null : this.f11398y.f20166e);
        } else {
            g.r0(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f11390B;
        if (jVar != null) {
            jVar.c(this.f11398y);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11393E = g();
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.f11396H) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f11395G;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.f11389A == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f11389A.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1228b c1228b;
        if (this.f11398y.hasSubMenu() && (c1228b = this.f11391C) != null && c1228b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f11394F != z10) {
            this.f11394F = z10;
            m mVar = this.f11398y;
            if (mVar != null) {
                k kVar = mVar.f20173n;
                kVar.f20142k = true;
                kVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f11389A = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f11397I;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(j jVar) {
        this.f11390B = jVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f11396H = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC1229c abstractC1229c) {
        this.f11392D = abstractC1229c;
    }

    public void setShortcut(boolean z10, char c10) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f11399z = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f11393E = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16382c, i10, 0);
        this.f11395G = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f11397I = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f11396H = -1;
        setSaveEnabled(false);
    }
}
