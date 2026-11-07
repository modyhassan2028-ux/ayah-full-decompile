package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.i;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import p056f2.AbstractComponentCallbacksC0947u;
import p211v6.b;
import p226x2.m;
import p226x2.p;
import p226x2.r;
import p226x2.s;
import p226x2.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends AbstractComponentCallbacksC0947u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public r f12778p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f12779q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f12780r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f12781s0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final m f12777o0 = new m(this);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f12782t0 = R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final i f12783u0 = new i(this, Looper.getMainLooper(), 4);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final b f12784v0 = new b(3, this);

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = M().obtainStyledAttributes(null, u.f24352h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f12782t0 = typedArrayObtainStyledAttributes.getResourceId(0, this.f12782t0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(M());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f12782t0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!M().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            M();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new s(recyclerView));
        }
        this.f12779q0 = recyclerView;
        m mVar = this.f12777o0;
        recyclerView.i(mVar);
        if (drawable != null) {
            mVar.getClass();
            mVar.f24311b = drawable.getIntrinsicHeight();
        } else {
            mVar.f24311b = 0;
        }
        mVar.f24310a = drawable;
        PreferenceFragmentCompat preferenceFragmentCompat = mVar.f24313d;
        preferenceFragmentCompat.f12779q0.S();
        if (dimensionPixelSize != -1) {
            mVar.f24311b = dimensionPixelSize;
            preferenceFragmentCompat.f12779q0.S();
        }
        mVar.f24312c = z10;
        if (this.f12779q0.getParent() == null) {
            viewGroup2.addView(this.f12779q0);
        }
        this.f12783u0.post(this.f12784v0);
        return viewInflate;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void C() {
        b bVar = this.f12784v0;
        i iVar = this.f12783u0;
        iVar.removeCallbacks(bVar);
        iVar.removeMessages(1);
        if (this.f12780r0) {
            this.f12779q0.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f12778p0.f24336h;
            if (preferenceScreen != null) {
                preferenceScreen.q();
            }
        }
        this.f12779q0 = null;
        this.f16143V = true;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public void F(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f12778p0.f24336h;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void G() {
        this.f16143V = true;
        r rVar = this.f12778p0;
        rVar.f24337i = this;
        rVar.j = this;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void H() {
        this.f16143V = true;
        r rVar = this.f12778p0;
        rVar.f24337i = null;
        rVar.j = null;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void I(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f12778p0.f24336h) != null) {
            preferenceScreen2.a(bundle2);
        }
        if (this.f12780r0 && (preferenceScreen = this.f12778p0.f24336h) != null) {
            this.f12779q0.setAdapter(new p(preferenceScreen));
            preferenceScreen.m();
        }
        this.f12781s0 = true;
    }

    public final Preference S(String str) {
        PreferenceScreen preferenceScreen;
        r rVar = this.f12778p0;
        if (rVar == null || (preferenceScreen = rVar.f24336h) == null) {
            return null;
        }
        return preferenceScreen.B(str);
    }

    public abstract void T(Bundle bundle);

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void z(Bundle bundle) {
        super.z(bundle);
        TypedValue typedValue = new TypedValue();
        M().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = R.style.PreferenceThemeOverlay;
        }
        M().getTheme().applyStyle(i10, false);
        r rVar = new r(M());
        this.f12778p0 = rVar;
        rVar.f24338k = this;
        Bundle bundle2 = this.f16166w;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        T(bundle);
    }
}
