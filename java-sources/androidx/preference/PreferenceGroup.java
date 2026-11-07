package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import java.util.ArrayList;
import p211v6.b;
import p226x2.n;
import p226x2.u;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final O f12785d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Handler f12786e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ArrayList f12787f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f12788g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f12789h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f12790i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f12791j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b f12792k0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f12785d0 = new O(0);
        this.f12786e0 = new Handler(Looper.getMainLooper());
        this.f12788g0 = true;
        this.f12789h0 = 0;
        this.f12790i0 = false;
        this.f12791j0 = Integer.MAX_VALUE;
        this.f12792k0 = new b(4, this);
        this.f12787f0 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24353i, i10, i11);
        this.f12788g0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i12 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i12 != Integer.MAX_VALUE && TextUtils.isEmpty(this.f12738B)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.f12791j0 = i12;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Preference B(CharSequence charSequence) {
        Preference preferenceB;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f12738B, charSequence)) {
            return this;
        }
        int size = this.f12787f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceC = C(i10);
            if (TextUtils.equals(preferenceC.f12738B, charSequence)) {
                return preferenceC;
            }
            if ((preferenceC instanceof PreferenceGroup) && (preferenceB = ((PreferenceGroup) preferenceC).B(charSequence)) != null) {
                return preferenceB;
            }
        }
        return null;
    }

    public final Preference C(int i10) {
        return (Preference) this.f12787f0.get(i10);
    }

    @Override // androidx.preference.Preference
    public final void a(Bundle bundle) {
        super.a(bundle);
        int size = this.f12787f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C(i10).a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.f12787f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C(i10).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(boolean z10) {
        super.l(z10);
        int size = this.f12787f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceC = C(i10);
            if (preferenceC.f12748L == z10) {
                preferenceC.f12748L = !z10;
                preferenceC.l(preferenceC.y());
                preferenceC.k();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void m() {
        super.m();
        this.f12790i0 = true;
        int size = this.f12787f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C(i10).m();
        }
    }

    @Override // androidx.preference.Preference
    public final void q() {
        A();
        this.f12790i0 = false;
        int size = this.f12787f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C(i10).q();
        }
    }

    @Override // androidx.preference.Preference
    public final void s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(n.class)) {
            super.s(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        this.f12791j0 = nVar.f24314r;
        super.s(nVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable t() {
        super.t();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new n(this.f12791j0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
