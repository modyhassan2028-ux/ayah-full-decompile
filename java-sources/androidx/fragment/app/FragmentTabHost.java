package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
import p056f2.K;
import p056f2.S;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f12600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FrameLayout f12601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TabHost.OnTabChangeListener f12603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12604v;

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f12600r = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.inflatedId}, 0, 0);
        this.f12602t = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public final void a() {
        if (this.f12601s == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f12602t);
            this.f12601s = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f12602t);
        }
    }

    public final void b(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f12601s = frameLayout2;
            frameLayout2.setId(this.f12602t);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        ArrayList arrayList = this.f12600r;
        if (arrayList.size() > 0) {
            throw p.u(0, arrayList);
        }
        this.f12604v = true;
        if (arrayList.size() > 0) {
            throw p.u(0, arrayList);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12604v = false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof S)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        S s10 = (S) parcelable;
        super.onRestoreInstanceState(s10.getSuperState());
        setCurrentTabByTag(s10.f16020r);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        S s10 = new S(super.onSaveInstanceState());
        s10.f16020r = getCurrentTabTag();
        return s10;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        if (this.f12604v) {
            ArrayList arrayList = this.f12600r;
            if (arrayList.size() > 0) {
                throw p.u(0, arrayList);
            }
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f12603u;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f12603u = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, K k7) {
        b(context);
        super.setup();
        a();
    }

    @Deprecated
    public void setup(Context context, K k7, int i10) {
        b(context);
        super.setup();
        this.f12602t = i10;
        a();
        this.f12601s.setId(i10);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12600r = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f12602t = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }
}
