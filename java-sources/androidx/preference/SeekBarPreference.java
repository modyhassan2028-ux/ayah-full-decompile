package androidx.preference;

import B9.a;
import M.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.ayah.R;
import p226x2.t;
import p226x2.u;
import p226x2.v;
import p226x2.w;
import p226x2.x;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f12794d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f12795e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f12796f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f12797g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f12798h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SeekBar f12799i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextView f12800j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f12801k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f12802l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f12803m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final v f12804n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final w f12805o0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.f12804n0 = new v(this);
        this.f12805o0 = new w(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24354k, R.attr.seekBarPreferenceStyle, 0);
        this.f12795e0 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i11 = this.f12795e0;
        i10 = i10 < i11 ? i11 : i10;
        if (i10 != this.f12796f0) {
            this.f12796f0 = i10;
            k();
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i12 != this.f12797g0) {
            this.f12797g0 = Math.min(this.f12796f0 - this.f12795e0, Math.abs(i12));
            k();
        }
        this.f12801k0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f12802l0 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f12803m0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void B(int i10, boolean z10) {
        int i11 = this.f12795e0;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f12796f0;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f12794d0) {
            this.f12794d0 = i10;
            TextView textView = this.f12800j0;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
            }
            if (z() && i10 != e(~i10)) {
                k kVarH = h();
                String str = this.f12738B;
                if (kVarH != null) {
                    j.e(str, "key");
                    kVarH.F(a.J(str), Integer.valueOf(i10));
                } else {
                    SharedPreferences.Editor editorA = this.f12762s.a();
                    editorA.putInt(str, i10);
                    if (!this.f12762s.f24335f) {
                        editorA.apply();
                    }
                }
            }
            if (z10) {
                k();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void o(t tVar) {
        super.o(tVar);
        tVar.f1486a.setOnKeyListener(this.f12805o0);
        this.f12799i0 = (SeekBar) tVar.r(R.id.seekbar);
        TextView textView = (TextView) tVar.r(R.id.seekbar_value);
        this.f12800j0 = textView;
        if (this.f12802l0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f12800j0 = null;
        }
        SeekBar seekBar = this.f12799i0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f12804n0);
        this.f12799i0.setMax(this.f12796f0 - this.f12795e0);
        int i10 = this.f12797g0;
        if (i10 != 0) {
            this.f12799i0.setKeyProgressIncrement(i10);
        } else {
            this.f12797g0 = this.f12799i0.getKeyProgressIncrement();
        }
        this.f12799i0.setProgress(this.f12794d0 - this.f12795e0);
        int i11 = this.f12794d0;
        TextView textView2 = this.f12800j0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i11));
        }
        this.f12799i0.setEnabled(j());
    }

    @Override // androidx.preference.Preference
    public final Object r(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    @Override // androidx.preference.Preference
    public final void s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(x.class)) {
            super.s(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.s(xVar.getSuperState());
        this.f12794d0 = xVar.f24359r;
        this.f12795e0 = xVar.f24360s;
        this.f12796f0 = xVar.f24361t;
        k();
    }

    @Override // androidx.preference.Preference
    public final Parcelable t() {
        super.t();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f12744H) {
            return absSavedState;
        }
        x xVar = new x();
        xVar.f24359r = this.f12794d0;
        xVar.f24360s = this.f12795e0;
        xVar.f24361t = this.f12796f0;
        return xVar;
    }

    @Override // androidx.preference.Preference
    public final void u(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        B(e(((Integer) obj).intValue()), true);
    }
}
