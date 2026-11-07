package androidx.preference;

import B9.a;
import M.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import p226x2.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f12812d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CharSequence f12813e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CharSequence f12814f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f12815g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f12816h0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public final void B(boolean z10) {
        boolean z11 = this.f12812d0 != z10;
        if (z11 || !this.f12815g0) {
            this.f12812d0 = z10;
            this.f12815g0 = true;
            if (z() && z10 != d(!z10)) {
                k kVarH = h();
                String str = this.f12738B;
                if (kVarH != null) {
                    j.e(str, "key");
                    kVarH.F(a.g(str), Boolean.valueOf(z10));
                } else {
                    SharedPreferences.Editor editorA = this.f12762s.a();
                    editorA.putBoolean(str, z10);
                    if (!this.f12762s.f24335f) {
                        editorA.apply();
                    }
                }
            }
            if (z11) {
                l(y());
                k();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void C(View view) {
        boolean z10;
        int i10;
        CharSequence charSequenceI;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f12812d0 || TextUtils.isEmpty(this.f12813e0)) {
                if (this.f12812d0 || TextUtils.isEmpty(this.f12814f0)) {
                    z10 = true;
                } else {
                    textView.setText(this.f12814f0);
                }
                if (z10) {
                    charSequenceI = i();
                    if (!TextUtils.isEmpty(charSequenceI)) {
                        textView.setText(charSequenceI);
                        z10 = false;
                    }
                }
                i10 = z10 ? 8 : 0;
                if (i10 != textView.getVisibility()) {
                    textView.setVisibility(i10);
                }
            }
            textView.setText(this.f12813e0);
            z10 = false;
            if (z10) {
                charSequenceI = i();
                if (!TextUtils.isEmpty(charSequenceI)) {
                    textView.setText(charSequenceI);
                    z10 = false;
                }
            }
            if (z10) {
            }
            if (i10 != textView.getVisibility()) {
                textView.setVisibility(i10);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void p() {
        B(!this.f12812d0);
    }

    @Override // androidx.preference.Preference
    public final Object r(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public final void s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(y.class)) {
            super.s(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.s(yVar.getSuperState());
        B(yVar.f24362r);
    }

    @Override // androidx.preference.Preference
    public final Parcelable t() {
        super.t();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f12744H) {
            return absSavedState;
        }
        y yVar = new y();
        yVar.f24362r = this.f12812d0;
        return yVar;
    }

    @Override // androidx.preference.Preference
    public final void u(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        B(d(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        boolean z10;
        if (this.f12816h0) {
            z10 = this.f12812d0;
        } else {
            z10 = !this.f12812d0;
        }
        return z10 || super.y();
    }
}
