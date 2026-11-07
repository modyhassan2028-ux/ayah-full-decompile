package androidx.appcompat.widget;

import I1.AbstractC0245c;
import I1.S;
import K7.l;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import p074h0.i;
import p140o.C1228b;
import p151p.A0;
import p151p.AbstractC1260p;
import p151p.C1262q;
import p151p.C1265s;
import p151p.ViewOnClickListenerC1267t;
import p151p.r;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PopupWindow.OnDismissListener f11485A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f11486B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1265s f11487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ViewOnClickListenerC1267t f11488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f11489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final FrameLayout f11490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f11491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FrameLayout f11492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC0245c f11493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f11494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public A0 f11495z;

    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int[] f11496r = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            i iVarA = i.A(context, attributeSet, f11496r);
            setBackgroundDrawable(iVarA.r(0));
            iVarA.C();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f11494y);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().Q.isShowing();
    }

    public AbstractC1260p getDataModel() {
        this.f11487r.getClass();
        return null;
    }

    public A0 getListPopupWindow() {
        if (this.f11495z == null) {
            A0 a9 = new A0(getContext());
            this.f11495z = a9;
            a9.p(this.f11487r);
            A0 a10 = this.f11495z;
            a10.f20513F = this;
            a10.f20523P = true;
            a10.Q.setFocusable(true);
            A0 a11 = this.f11495z;
            ViewOnClickListenerC1267t viewOnClickListenerC1267t = this.f11488s;
            a11.f20514G = viewOnClickListenerC1267t;
            a11.Q.setOnDismissListener(viewOnClickListenerC1267t);
        }
        return this.f11495z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11487r.getClass();
        this.f11486B = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11487r.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f11494y);
        }
        if (b()) {
            a();
        }
        this.f11486B = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f11489t.layout(0, 0, i12 - i10, i13 - i11);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f11492w.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        View view = this.f11489t;
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(AbstractC1260p abstractC1260p) {
        C1265s c1265s = this.f11487r;
        c1265s.f20771r.f11487r.getClass();
        c1265s.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.f11486B) {
                return;
            }
            c1265s.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f11491v.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f11491v.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f11485A = onDismissListener;
    }

    public void setProvider(AbstractC0245c abstractC0245c) {
        this.f11493x = abstractC0245c;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        new C1262q(this, 0);
        this.f11494y = new l(3, this);
        int[] iArr = p073h.a.f16384e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        S.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(com.ayah.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        ViewOnClickListenerC1267t viewOnClickListenerC1267t = new ViewOnClickListenerC1267t(this);
        this.f11488s = viewOnClickListenerC1267t;
        View viewFindViewById = findViewById(com.ayah.R.id.activity_chooser_view_content);
        this.f11489t = viewFindViewById;
        viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(com.ayah.R.id.default_activity_button);
        this.f11492w = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC1267t);
        frameLayout.setOnLongClickListener(viewOnClickListenerC1267t);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(com.ayah.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(viewOnClickListenerC1267t);
        frameLayout2.setAccessibilityDelegate(new r());
        frameLayout2.setOnTouchListener(new C1228b(this, frameLayout2, 2));
        this.f11490u = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(com.ayah.R.id.image);
        this.f11491v = imageView;
        imageView.setImageDrawable(drawable);
        C1265s c1265s = new C1265s(this);
        this.f11487r = c1265s;
        c1265s.registerDataSetObserver(new C1262q(this, 1));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.ayah.R.dimen.abc_config_prefDialogWidth));
    }
}
