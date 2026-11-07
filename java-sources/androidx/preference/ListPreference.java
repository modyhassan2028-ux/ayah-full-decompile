package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.ayah.R;
import i7.D;
import p226x2.d;
import p226x2.k;
import p226x2.u;
import p244z1.a;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final CharSequence[] f12722j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final CharSequence[] f12723k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f12724l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final String f12725m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f12726n0;

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24350e, i10, i11);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f12722j0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f12723k0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (D.f16849A == null) {
                D.f16849A = new D(16);
            }
            this.f12759b0 = D.f16849A;
            k();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, u.g, i10, i11);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f12725m0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int B(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f12723k0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void C(String str) {
        boolean zEquals = TextUtils.equals(this.f12724l0, str);
        if (zEquals && this.f12726n0) {
            return;
        }
        this.f12724l0 = str;
        this.f12726n0 = true;
        w(str);
        if (zEquals) {
            return;
        }
        k();
    }

    @Override // androidx.preference.Preference
    public final CharSequence i() {
        CharSequence[] charSequenceArr;
        k kVar = this.f12759b0;
        if (kVar != null) {
            return kVar.j(this);
        }
        int iB = B(this.f12724l0);
        CharSequence charSequence = (iB < 0 || (charSequenceArr = this.f12722j0) == null) ? null : charSequenceArr[iB];
        CharSequence charSequenceI = super.i();
        String str = this.f12725m0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceI)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceI;
    }

    @Override // androidx.preference.Preference
    public final Object r(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public final void s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(d.class)) {
            super.s(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.s(dVar.getSuperState());
        C(dVar.f24305r);
    }

    @Override // androidx.preference.Preference
    public final Parcelable t() {
        super.t();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f12744H) {
            return absSavedState;
        }
        d dVar = new d();
        dVar.f24305r = this.f12724l0;
        return dVar;
    }

    @Override // androidx.preference.Preference
    public final void u(Object obj) {
        C(f((String) obj));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context) {
        this(context, null);
    }
}
