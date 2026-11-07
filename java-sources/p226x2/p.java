package p226x2;

import E2.AbstractC0115c0;
import E2.F0;
import I1.S;
import Y2.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p085i0.n;
import p211v6.b;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0115c0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final PreferenceGroup f24318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f24319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f24320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f24321x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f24323z = new b(5, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f24322y = new Handler(Looper.getMainLooper());

    public p(PreferenceGroup preferenceGroup) {
        this.f24318u = preferenceGroup;
        preferenceGroup.f12754W = this;
        this.f24319v = new ArrayList();
        this.f24320w = new ArrayList();
        this.f24321x = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            i(((PreferenceScreen) preferenceGroup).f12793l0);
        } else {
            i(true);
        }
        m();
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f24320w.size();
    }

    @Override // E2.AbstractC0115c0
    public final long b(int i10) {
        if (this.f1652s) {
            return l(i10).c();
        }
        return -1L;
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        o oVar = new o(l(i10));
        ArrayList arrayList = this.f24321x;
        int iIndexOf = arrayList.indexOf(oVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(oVar);
        return size;
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        t tVar = (t) f3;
        Preference preferenceL = l(i10);
        ColorStateList colorStateList = tVar.f24342v;
        View view = tVar.f1486a;
        Drawable background = view.getBackground();
        Drawable drawable = tVar.f24341u;
        if (background != drawable) {
            WeakHashMap weakHashMap = S.f3689a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) tVar.r(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceL.o(tVar);
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        o oVar = (o) this.f24321x.get(i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, u.f24346a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = a.E(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(oVar.f24315a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = S.f3689a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i11 = oVar.f24316b;
            if (i11 != 0) {
                layoutInflaterFrom.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new t(viewInflate);
    }

    public final ArrayList j(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.f12787f0.size();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Preference preferenceC = preferenceGroup.C(i11);
            if (preferenceC.f12749M) {
                int i12 = preferenceGroup.f12791j0;
                if (i12 == Integer.MAX_VALUE || i10 < i12) {
                    arrayList.add(preferenceC);
                } else {
                    arrayList2.add(preferenceC);
                }
                if (preferenceC instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceC;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.f12791j0 != Integer.MAX_VALUE && preferenceGroup2.f12791j0 != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        ArrayList arrayListJ = j(preferenceGroup2);
                        int size2 = arrayListJ.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj = arrayListJ.get(i13);
                            i13++;
                            Preference preference = (Preference) obj;
                            int i14 = preferenceGroup.f12791j0;
                            if (i14 == Integer.MAX_VALUE || i10 < i14) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i10++;
                        }
                    }
                } else {
                    i10++;
                }
            }
        }
        int i15 = preferenceGroup.f12791j0;
        if (i15 == Integer.MAX_VALUE || i10 <= i15) {
            return arrayList;
        }
        Context context = preferenceGroup.f12761r;
        long j = preferenceGroup.f12763t;
        CharSequence string = null;
        c cVar = new c(context, null);
        cVar.U = com.ayah.R.layout.expand_button;
        Context context2 = cVar.f12761r;
        Drawable drawableE = a.E(context2, com.ayah.R.drawable.ic_arrow_down_24dp);
        if (cVar.f12737A != drawableE) {
            cVar.f12737A = drawableE;
            cVar.f12769z = 0;
            cVar.k();
        }
        cVar.f12769z = com.ayah.R.drawable.ic_arrow_down_24dp;
        String string2 = context2.getString(com.ayah.R.string.expand_button_title);
        if (!TextUtils.equals(string2, cVar.f12767x)) {
            cVar.f12767x = string2;
            cVar.k();
        }
        if (999 != cVar.f12766w) {
            cVar.f12766w = 999;
            p pVar = cVar.f12754W;
            if (pVar != null) {
                Handler handler = pVar.f24322y;
                b bVar = pVar.f24323z;
                handler.removeCallbacks(bVar);
                handler.post(bVar);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i16 = 0;
        while (i16 < size3) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            Preference preference2 = (Preference) obj2;
            CharSequence charSequence = preference2.f12767x;
            boolean z11 = preference2 instanceof PreferenceGroup;
            if (z11 && !TextUtils.isEmpty(charSequence)) {
                arrayList3.add((PreferenceGroup) preference2);
            }
            if (arrayList3.contains(preference2.f12756Y)) {
                if (z11) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                if (string == null) {
                    string = charSequence;
                } else {
                    Object[] objArr = new Object[2];
                    objArr[z10] = string;
                    objArr[1] = charSequence;
                    string = context2.getString(com.ayah.R.string.summary_collapsed_preference_list, objArr);
                }
            }
            z10 = z10;
        }
        boolean z12 = z10;
        if (cVar.f12759b0 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(cVar.f12768y, string)) {
            cVar.f12768y = string;
            cVar.k();
        }
        cVar.f24304d0 = j + 1000000;
        cVar.f12765v = new n(18, this, preferenceGroup, z12);
        arrayList.add(cVar);
        return arrayList;
    }

    public final void k(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f12787f0);
        }
        int size = preferenceGroup.f12787f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceC = preferenceGroup.C(i10);
            arrayList.add(preferenceC);
            o oVar = new o(preferenceC);
            if (!this.f24321x.contains(oVar)) {
                this.f24321x.add(oVar);
            }
            if (preferenceC instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceC;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    k(arrayList, preferenceGroup2);
                }
            }
            preferenceC.f12754W = this;
        }
    }

    public final Preference l(int i10) {
        if (i10 < 0 || i10 >= this.f24320w.size()) {
            return null;
        }
        return (Preference) this.f24320w.get(i10);
    }

    public final void m() {
        ArrayList arrayList = this.f24319v;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((Preference) obj).f12754W = null;
        }
        ArrayList arrayList2 = new ArrayList(this.f24319v.size());
        this.f24319v = arrayList2;
        PreferenceGroup preferenceGroup = this.f24318u;
        k(arrayList2, preferenceGroup);
        this.f24320w = j(preferenceGroup);
        d();
        ArrayList arrayList3 = this.f24319v;
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            ((Preference) obj2).getClass();
        }
    }
}
