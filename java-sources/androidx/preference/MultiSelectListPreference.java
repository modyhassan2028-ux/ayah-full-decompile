package androidx.preference;

import M.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.ayah.R;
import java.util.HashSet;
import java.util.Set;
import p226x2.f;
import p226x2.u;
import p244z1.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final CharSequence[] f12730j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final CharSequence[] f12731k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final HashSet f12732l0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iB = a.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iB, 0);
        this.f12732l0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24351f, iB, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f12730j0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f12731k0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void B(Set set) {
        HashSet hashSet = this.f12732l0;
        hashSet.clear();
        hashSet.addAll(set);
        if (z() && !set.equals(g(null))) {
            k kVarH = h();
            String str = this.f12738B;
            if (kVarH != null) {
                j.e(str, "key");
                kVarH.F(B9.a.a0(str), set);
            } else {
                SharedPreferences.Editor editorA = this.f12762s.a();
                editorA.putStringSet(str, set);
                if (!this.f12762s.f24335f) {
                    editorA.apply();
                }
            }
        }
        k();
    }

    @Override // androidx.preference.Preference
    public final Object r(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(f.class)) {
            super.s(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.s(fVar.getSuperState());
        B(fVar.f24307r);
    }

    @Override // androidx.preference.Preference
    public final Parcelable t() {
        super.t();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f12744H) {
            return absSavedState;
        }
        f fVar = new f();
        fVar.f24307r = this.f12732l0;
        return fVar;
    }

    @Override // androidx.preference.Preference
    public final void u(Object obj) {
        B(g((Set) obj));
    }
}
