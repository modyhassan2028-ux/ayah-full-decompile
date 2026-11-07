package p140o;

import C1.a;
import I1.AbstractC0245c;
import X4.c;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m implements a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC0245c f20159A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f20160B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f20166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f20167f;
    public Intent g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f20168h;
    public char j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f20171l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f20173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C f20174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f20175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f20176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f20177r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20184y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f20185z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20169i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20170k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20172m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f20178s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f20179t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20180u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20181v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20182w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20183x = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f20161C = false;

    public m(k kVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f20173n = kVar;
        this.f20162a = i11;
        this.f20163b = i10;
        this.f20164c = i12;
        this.f20165d = i13;
        this.f20166e = charSequence;
        this.f20184y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // C1.a
    public final AbstractC0245c a() {
        return this.f20159A;
    }

    @Override // C1.a
    public final a b(AbstractC0245c abstractC0245c) {
        AbstractC0245c abstractC0245c2 = this.f20159A;
        if (abstractC0245c2 != null) {
            abstractC0245c2.f3714a = null;
        }
        this.f20185z = null;
        this.f20159A = abstractC0245c;
        this.f20173n.p(true);
        AbstractC0245c abstractC0245c3 = this.f20159A;
        if (abstractC0245c3 != null) {
            n nVar = (n) abstractC0245c3;
            nVar.f20186b = new c(this);
            nVar.f20187c.setVisibilityListener(nVar);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f20184y & 8) == 0) {
            return false;
        }
        if (this.f20185z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20160B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f20173n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f20182w && (this.f20180u || this.f20181v)) {
            drawable = drawable.mutate();
            if (this.f20180u) {
                drawable.setTintList(this.f20178s);
            }
            if (this.f20181v) {
                drawable.setTintMode(this.f20179t);
            }
            this.f20182w = false;
        }
        return drawable;
    }

    public final boolean e() {
        AbstractC0245c abstractC0245c;
        if ((this.f20184y & 8) != 0) {
            if (this.f20185z == null && (abstractC0245c = this.f20159A) != null) {
                this.f20185z = ((n) abstractC0245c).f20187c.onCreateActionView(this);
            }
            if (this.f20185z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20160B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f20173n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f20183x = (z10 ? 4 : 0) | (this.f20183x & (-5));
    }

    public final void g(boolean z10) {
        if (z10) {
            this.f20183x |= 32;
        } else {
            this.f20183x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f20185z;
        if (view != null) {
            return view;
        }
        AbstractC0245c abstractC0245c = this.f20159A;
        if (abstractC0245c == null) {
            return null;
        }
        View viewOnCreateActionView = ((n) abstractC0245c).f20187c.onCreateActionView(this);
        this.f20185z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // C1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f20170k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // C1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f20176q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f20163b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f20171l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f20172m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableE = Y2.a.E(this.f20173n.f20134a, i10);
        this.f20172m = 0;
        this.f20171l = drawableE;
        return d(drawableE);
    }

    @Override // C1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20178s;
    }

    @Override // C1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20179t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f20162a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // C1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20169i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20168h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f20164c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f20174o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f20166e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20167f;
        return charSequence != null ? charSequence : this.f20166e;
    }

    @Override // C1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20177r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f20174o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f20161C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f20183x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f20183x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f20183x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0245c abstractC0245c = this.f20159A;
        if (abstractC0245c == null || !((n) abstractC0245c).f20187c.overridesItemVisibility()) {
            return (this.f20183x & 8) == 0;
        }
        return (this.f20183x & 8) == 0 && ((n) this.f20159A).f20187c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f20185z = view;
        this.f20159A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f20162a) > 0) {
            view.setId(i10);
        }
        k kVar = this.f20173n;
        kVar.f20142k = true;
        kVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.j == c10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f20183x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f20183x = i11;
        if (i10 != i11) {
            this.f20173n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f20183x;
        int i11 = i10 & 4;
        k kVar = this.f20173n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f20183x = i12;
            if (i10 != i12) {
                kVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = kVar.f20139f;
        int size = arrayList.size();
        kVar.y();
        for (int i13 = 0; i13 < size; i13++) {
            m mVar = (m) arrayList.get(i13);
            if (mVar.f20163b == this.f20163b && (mVar.f20183x & 4) != 0 && mVar.isCheckable()) {
                boolean z11 = mVar == this;
                int i14 = mVar.f20183x;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                mVar.f20183x = i15;
                if (i14 != i15) {
                    mVar.f20173n.p(false);
                }
            }
        }
        kVar.x();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f20183x |= 16;
        } else {
            this.f20183x &= -17;
        }
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20172m = 0;
        this.f20171l = drawable;
        this.f20182w = true;
        this.f20173n.p(false);
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20178s = colorStateList;
        this.f20180u = true;
        this.f20182w = true;
        this.f20173n.p(false);
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20179t = mode;
        this.f20181v = true;
        this.f20182w = true;
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f20168h == c10) {
            return this;
        }
        this.f20168h = c10;
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f20160B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20175p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f20168h = c10;
        this.j = Character.toLowerCase(c11);
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f20184y = i10;
        k kVar = this.f20173n;
        kVar.f20142k = true;
        kVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f20166e = charSequence;
        this.f20173n.p(false);
        C c10 = this.f20174o;
        if (c10 != null) {
            c10.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20167f = charSequence;
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f20183x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f20183x = i11;
        if (i10 != i11) {
            k kVar = this.f20173n;
            kVar.f20140h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f20166e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // C1.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.f20176q = charSequence;
        this.f20173n.p(false);
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.f20177r = charSequence;
        this.f20173n.p(false);
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.j == c10 && this.f20170k == i10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f20170k = KeyEvent.normalizeMetaState(i10);
        this.f20173n.p(false);
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f20168h == c10 && this.f20169i == i10) {
            return this;
        }
        this.f20168h = c10;
        this.f20169i = KeyEvent.normalizeMetaState(i10);
        this.f20173n.p(false);
        return this;
    }

    @Override // C1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f20168h = c10;
        this.f20169i = KeyEvent.normalizeMetaState(i10);
        this.j = Character.toLowerCase(c11);
        this.f20170k = KeyEvent.normalizeMetaState(i11);
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f20171l = null;
        this.f20172m = i10;
        this.f20182w = true;
        this.f20173n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f20173n.f20134a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        k kVar = this.f20173n;
        Context context = kVar.f20134a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f20185z = viewInflate;
        this.f20159A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f20162a) > 0) {
            viewInflate.setId(i11);
        }
        kVar.f20142k = true;
        kVar.p(true);
        return this;
    }
}
