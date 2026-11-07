package androidx.preference;

import B9.a;
import H3.d;
import H7.ViewOnClickListenerC0238l;
import I1.S;
import K9.AbstractC0405x;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0928a;
import p056f2.D;
import p056f2.K;
import p150o9.c;
import p226x2.i;
import p226x2.j;
import p226x2.k;
import p226x2.p;
import p226x2.r;
import p226x2.t;
import p226x2.u;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f12737A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f12738B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Intent f12739C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f12740D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Bundle f12741E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f12742F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f12743G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f12744H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f12745I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Object f12746J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f12747K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f12748L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f12749M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f12750N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f12751O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f12752P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public int U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f12753V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public p f12754W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ArrayList f12755X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PreferenceGroup f12756Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f12757Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public j f12758a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public k f12759b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ViewOnClickListenerC0238l f12760c0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f12761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f12762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f12763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f12765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f12767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f12768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12769z;

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f12766w = Integer.MAX_VALUE;
        this.f12742F = true;
        this.f12743G = true;
        this.f12744H = true;
        this.f12747K = true;
        this.f12748L = true;
        this.f12749M = true;
        this.f12750N = true;
        this.f12751O = true;
        this.Q = true;
        this.T = true;
        this.U = R.layout.preference;
        this.f12760c0 = new ViewOnClickListenerC0238l(7, this);
        this.f12761r = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.g, i10, i11);
        this.f12769z = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f12738B = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f12767x = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f12768y = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f12766w = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f12740D = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.U = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f12753V = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f12742F = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f12743G = z10;
        this.f12744H = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f12745I = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f12750N = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z10));
        this.f12751O = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z10));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f12746J = r(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f12746J = r(typedArrayObtainStyledAttributes, 11);
        }
        this.T = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f12752P = zHasValue;
        if (zHasValue) {
            this.Q = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.R = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f12749M = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.S = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void x(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                x(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    public final void A() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f12745I;
        if (str != null) {
            r rVar = this.f12762s;
            Preference preferenceB = null;
            if (rVar != null && (preferenceScreen = rVar.f24336h) != null) {
                preferenceB = preferenceScreen.B(str);
            }
            if (preferenceB == null || (arrayList = preferenceB.f12755X) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        String str = this.f12738B;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.f12757Z = false;
        s(parcelable);
        if (!this.f12757Z) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void b(Bundle bundle) {
        String str = this.f12738B;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12757Z = false;
        Parcelable parcelableT = t();
        if (!this.f12757Z) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableT != null) {
            bundle.putParcelable(str, parcelableT);
        }
    }

    public long c() {
        return this.f12763t;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i10 = this.f12766w;
        int i11 = preference2.f12766w;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f12767x;
        CharSequence charSequence2 = preference2.f12767x;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f12767x.toString());
    }

    public final boolean d(boolean z10) {
        if (!z()) {
            return z10;
        }
        M.k kVarH = h();
        String str = this.f12738B;
        if (kVarH == null) {
            return this.f12762s.c().getBoolean(str, z10);
        }
        p251z9.j.e(str, "key");
        Boolean bool = (Boolean) AbstractC0405x.C(p150o9.i.f20380r, new d(kVarH, a.g(str), Boolean.valueOf(z10), (c) null));
        return bool != null ? bool.booleanValue() : z10;
    }

    public final int e(int i10) {
        if (!z()) {
            return i10;
        }
        M.k kVarH = h();
        String str = this.f12738B;
        if (kVarH == null) {
            return this.f12762s.c().getInt(str, i10);
        }
        p251z9.j.e(str, "key");
        Integer num = (Integer) AbstractC0405x.C(p150o9.i.f20380r, new d(kVarH, a.J(str), Integer.valueOf(i10), (c) null));
        return num != null ? num.intValue() : i10;
    }

    public final String f(String str) {
        if (!z()) {
            return str;
        }
        M.k kVarH = h();
        String str2 = this.f12738B;
        if (kVarH == null) {
            return this.f12762s.c().getString(str2, str);
        }
        p251z9.j.e(str2, "key");
        return (String) AbstractC0405x.C(p150o9.i.f20380r, new d(kVarH, a.Z(str2), str, (c) null));
    }

    public final Set g(Set set) {
        if (!z()) {
            return set;
        }
        M.k kVarH = h();
        String str = this.f12738B;
        if (kVarH == null) {
            return this.f12762s.c().getStringSet(str, set);
        }
        p251z9.j.e(str, "key");
        return (Set) AbstractC0405x.C(p150o9.i.f20380r, new d(kVarH, a.a0(str), set, (c) null));
    }

    public final M.k h() {
        r rVar = this.f12762s;
        if (rVar != null) {
            return rVar.f24333d;
        }
        return null;
    }

    public CharSequence i() {
        k kVar = this.f12759b0;
        return kVar != null ? kVar.j(this) : this.f12768y;
    }

    public boolean j() {
        return this.f12742F && this.f12747K && this.f12748L;
    }

    public void k() {
        int iIndexOf;
        p pVar = this.f12754W;
        if (pVar == null || (iIndexOf = pVar.f24320w.indexOf(this)) == -1) {
            return;
        }
        pVar.f1651r.d(iIndexOf, 1, this);
    }

    public void l(boolean z10) {
        ArrayList arrayList = this.f12755X;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preference = (Preference) arrayList.get(i10);
            if (preference.f12747K == z10) {
                preference.f12747K = !z10;
                preference.l(preference.y());
                preference.k();
            }
        }
    }

    public void m() {
        PreferenceScreen preferenceScreen;
        String str = this.f12745I;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        r rVar = this.f12762s;
        Preference preferenceB = null;
        if (rVar != null && (preferenceScreen = rVar.f24336h) != null) {
            preferenceB = preferenceScreen.B(str);
        }
        if (preferenceB == null) {
            StringBuilder sbD = android.support.v4.media.session.p.D("Dependency \"", str, "\" not found for preference \"");
            sbD.append(this.f12738B);
            sbD.append("\" (title: \"");
            sbD.append((Object) this.f12767x);
            sbD.append("\"");
            throw new IllegalStateException(sbD.toString());
        }
        if (preferenceB.f12755X == null) {
            preferenceB.f12755X = new ArrayList();
        }
        preferenceB.f12755X.add(this);
        boolean zY = preferenceB.y();
        if (this.f12747K == zY) {
            this.f12747K = !zY;
            l(y());
            k();
        }
    }

    public final void n(r rVar) {
        this.f12762s = rVar;
        if (!this.f12764u) {
            this.f12763t = rVar.b();
        }
        M.k kVarH = h();
        Object obj = this.f12746J;
        if (kVarH != null) {
            u(obj);
            return;
        }
        if (z()) {
            if (((this.f12762s == null || h() != null) ? null : this.f12762s.c()).contains(this.f12738B)) {
                u(null);
                return;
            }
        }
        if (obj != null) {
            u(obj);
        }
    }

    public void o(t tVar) {
        Integer numValueOf;
        View view = tVar.f1486a;
        view.setOnClickListener(this.f12760c0);
        view.setId(0);
        TextView textView = (TextView) tVar.r(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceI = i();
            if (TextUtils.isEmpty(charSequenceI)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceI);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) tVar.r(android.R.id.title);
        boolean z10 = this.f12743G;
        if (textView2 != null) {
            CharSequence charSequence = this.f12767x;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f12752P) {
                    textView2.setSingleLine(this.Q);
                }
                if (!z10 && j() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) tVar.r(android.R.id.icon);
        boolean z11 = this.R;
        if (imageView != null) {
            int i10 = this.f12769z;
            if (i10 != 0 || this.f12737A != null) {
                if (this.f12737A == null) {
                    this.f12737A = Y2.a.E(this.f12761r, i10);
                }
                Drawable drawable = this.f12737A;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f12737A != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z11 ? 4 : 8);
            }
        }
        View viewR = tVar.r(R.id.icon_frame);
        if (viewR == null) {
            viewR = tVar.r(android.R.id.icon_frame);
        }
        if (viewR != null) {
            if (this.f12737A != null) {
                viewR.setVisibility(0);
            } else {
                viewR.setVisibility(z11 ? 4 : 8);
            }
        }
        if (this.T) {
            x(view, j());
        } else {
            x(view, true);
        }
        view.setFocusable(z10);
        view.setClickable(z10);
        tVar.f24344x = this.f12750N;
        tVar.f24345y = this.f12751O;
        boolean z12 = this.S;
        if (z12 && this.f12758a0 == null) {
            this.f12758a0 = new j(this);
        }
        view.setOnCreateContextMenuListener(z12 ? this.f12758a0 : null);
        view.setLongClickable(z12);
        if (!z12 || z10) {
            return;
        }
        WeakHashMap weakHashMap = S.f3689a;
        view.setBackground(null);
    }

    public void p() {
    }

    public void q() {
        A();
    }

    public Object r(TypedArray typedArray, int i10) {
        return null;
    }

    public void s(Parcelable parcelable) {
        this.f12757Z = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable t() {
        this.f12757Z = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f12767x;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceI = i();
        if (!TextUtils.isEmpty(charSequenceI)) {
            sb.append(charSequenceI);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(Object obj) {
    }

    public void v(View view) {
        PreferenceFragmentCompat preferenceFragmentCompat;
        String str;
        if (j() && this.f12743G) {
            p();
            i iVar = this.f12765v;
            if (iVar == null || !iVar.b(this)) {
                r rVar = this.f12762s;
                if (rVar == null || (preferenceFragmentCompat = rVar.f24337i) == null || (str = this.f12740D) == null) {
                    Intent intent = this.f12739C;
                    if (intent != null) {
                        this.f12761r.startActivity(intent);
                        return;
                    }
                    return;
                }
                for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = preferenceFragmentCompat; abstractComponentCallbacksC0947u != null; abstractComponentCallbacksC0947u = abstractComponentCallbacksC0947u.f16140N) {
                }
                preferenceFragmentCompat.l();
                Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                K kO = preferenceFragmentCompat.o();
                if (this.f12741E == null) {
                    this.f12741E = new Bundle();
                }
                Bundle bundle = this.f12741E;
                D dH = kO.H();
                preferenceFragmentCompat.L().getClassLoader();
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uA = dH.a(str);
                abstractComponentCallbacksC0947uA.P(bundle);
                abstractComponentCallbacksC0947uA.Q(preferenceFragmentCompat);
                C0928a c0928a = new C0928a(kO);
                int id = ((View) preferenceFragmentCompat.N().getParent()).getId();
                if (id == 0) {
                    throw new IllegalArgumentException("Must use non-zero containerViewId");
                }
                c0928a.f(id, abstractComponentCallbacksC0947uA, null, 2);
                if (!c0928a.f16056h) {
                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                }
                c0928a.g = true;
                c0928a.f16057i = null;
                c0928a.e(false, true);
            }
        }
    }

    public final void w(String str) {
        if (z() && !TextUtils.equals(str, f(null))) {
            M.k kVarH = h();
            String str2 = this.f12738B;
            if (kVarH != null) {
                p251z9.j.e(str2, "key");
                kVarH.F(a.Z(str2), str);
                return;
            }
            SharedPreferences.Editor editorA = this.f12762s.a();
            editorA.putString(str2, str);
            if (this.f12762s.f24335f) {
                return;
            }
            editorA.apply();
        }
    }

    public boolean y() {
        return !j();
    }

    public final boolean z() {
        return (this.f12762s == null || !this.f12744H || TextUtils.isEmpty(this.f12738B)) ? false : true;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p244z1.a.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle), 0);
    }
}
