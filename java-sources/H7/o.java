package H7;

import E2.AbstractC0115c0;
import E2.F0;
import I1.S;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ayah.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0115c0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f3550u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p140o.m f3551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f3553x;

    public o(w wVar) {
        this.f3553x = wVar;
        j();
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f3550u.size();
    }

    @Override // E2.AbstractC0115c0
    public final long b(int i10) {
        return i10;
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        q qVar = (q) this.f3550u.get(i10);
        if (qVar instanceof r) {
            return 2;
        }
        if (qVar instanceof p) {
            return 3;
        }
        if (qVar instanceof s) {
            return ((s) qVar).f3556a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        View view = ((v) f3).f1486a;
        int iC = c(i10);
        ArrayList arrayList = this.f3550u;
        w wVar = this.f3553x;
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    return;
                }
                r rVar = (r) arrayList.get(i10);
                view.setPadding(wVar.f3568J, rVar.f3554a, wVar.f3569K, rVar.f3555b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((s) arrayList.get(i10)).f3556a.f20166e);
            textView.setTextAppearance(wVar.f3581x);
            textView.setPadding(wVar.f3570L, textView.getPaddingTop(), wVar.f3571M, textView.getPaddingBottom());
            ColorStateList colorStateList = wVar.f3582y;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            S.o(textView, new C0240n(this, i10, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(wVar.f3561C);
        navigationMenuItemView.setTextAppearance(wVar.f3583z);
        ColorStateList colorStateList2 = wVar.f3560B;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = wVar.f3562D;
        Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = S.f3689a;
        navigationMenuItemView.setBackground(drawableNewDrawable);
        RippleDrawable rippleDrawable = wVar.f3563E;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        s sVar = (s) arrayList.get(i10);
        navigationMenuItemView.setNeedsEmptyIcon(sVar.f3557b);
        int i11 = wVar.f3564F;
        int i12 = wVar.f3565G;
        navigationMenuItemView.setPadding(i11, i12, i11, i12);
        navigationMenuItemView.setIconPadding(wVar.f3566H);
        if (wVar.f3572N) {
            navigationMenuItemView.setIconSize(wVar.f3567I);
        }
        navigationMenuItemView.setMaxLines(wVar.f3574P);
        p140o.m mVar = sVar.f3556a;
        navigationMenuItemView.f14985P = wVar.f3559A;
        navigationMenuItemView.a(mVar);
        S.o(navigationMenuItemView, new C0240n(this, i10, false));
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        w wVar = this.f3553x;
        if (i10 == 0) {
            LayoutInflater layoutInflater = wVar.f3580w;
            ViewOnClickListenerC0238l viewOnClickListenerC0238l = wVar.T;
            View viewInflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            u uVar = new u(viewInflate);
            viewInflate.setOnClickListener(viewOnClickListenerC0238l);
            return uVar;
        }
        if (i10 == 1) {
            return new C0239m(wVar.f3580w.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i10 == 2) {
            return new C0239m(wVar.f3580w.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i10 != 3) {
            return null;
        }
        return new C0239m(wVar.f3576s);
    }

    @Override // E2.AbstractC0115c0
    public final void h(F0 f3) {
        v vVar = (v) f3;
        if (vVar instanceof u) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) vVar.f1486a;
            FrameLayout frameLayout = navigationMenuItemView.R;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.Q.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        boolean z10;
        if (this.f3552w) {
            return;
        }
        this.f3552w = true;
        ArrayList arrayList = this.f3550u;
        arrayList.clear();
        arrayList.add(new p());
        w wVar = this.f3553x;
        int size = wVar.f3577t.l().size();
        boolean z11 = false;
        int i10 = -1;
        int i11 = 0;
        boolean z12 = false;
        int size2 = 0;
        while (i11 < size) {
            p140o.m mVar = (p140o.m) wVar.f3577t.l().get(i11);
            if (mVar.isChecked()) {
                k(mVar);
            }
            if (mVar.isCheckable()) {
                mVar.f(z11);
            }
            if (mVar.hasSubMenu()) {
                p140o.C c10 = mVar.f20174o;
                if (c10.hasVisibleItems()) {
                    if (i11 != 0) {
                        arrayList.add(new r(wVar.R, z11 ? 1 : 0));
                    }
                    arrayList.add(new s(mVar));
                    int size3 = c10.f20139f.size();
                    int i12 = z11 ? 1 : 0;
                    int i13 = i12;
                    while (i12 < size3) {
                        p140o.m mVar2 = (p140o.m) c10.getItem(i12);
                        if (mVar2.isVisible()) {
                            if (i13 == 0 && mVar2.getIcon() != null) {
                                i13 = 1;
                            }
                            if (mVar2.isCheckable()) {
                                mVar2.f(z11);
                            }
                            if (mVar.isChecked()) {
                                k(mVar);
                            }
                            arrayList.add(new s(mVar2));
                        }
                        i12++;
                        z11 = false;
                    }
                    if (i13 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((s) arrayList.get(size5)).f3557b = true;
                        }
                    }
                }
                z10 = true;
            } else {
                int i14 = mVar.f20163b;
                if (i14 != i10) {
                    size2 = arrayList.size();
                    z12 = mVar.getIcon() != null;
                    if (i11 != 0) {
                        size2++;
                        int i15 = wVar.R;
                        arrayList.add(new r(i15, i15));
                    }
                } else {
                    if (!z12 && mVar.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i16 = size2; i16 < size6; i16++) {
                            ((s) arrayList.get(i16)).f3557b = true;
                        }
                        z10 = true;
                        z12 = true;
                    }
                    s sVar = new s(mVar);
                    sVar.f3557b = z12;
                    arrayList.add(sVar);
                    i10 = i14;
                }
                z10 = true;
                s sVar2 = new s(mVar);
                sVar2.f3557b = z12;
                arrayList.add(sVar2);
                i10 = i14;
            }
            i11++;
            z11 = false;
        }
        this.f3552w = z11 ? 1 : 0;
    }

    public final void k(p140o.m mVar) {
        if (this.f3551v == mVar || !mVar.isCheckable()) {
            return;
        }
        p140o.m mVar2 = this.f3551v;
        if (mVar2 != null) {
            mVar2.setChecked(false);
        }
        this.f3551v = mVar;
        mVar.setChecked(true);
    }
}
