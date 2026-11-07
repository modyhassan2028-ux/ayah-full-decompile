package p140o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public class C extends k implements SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final m f20074A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k f20075z;

    public C(Context context, k kVar, m mVar) {
        super(context);
        this.f20075z = kVar;
        this.f20074A = mVar;
    }

    @Override // p140o.k
    public final boolean d(m mVar) {
        return this.f20075z.d(mVar);
    }

    @Override // p140o.k
    public final boolean e(k kVar, MenuItem menuItem) {
        return super.e(kVar, menuItem) || this.f20075z.e(kVar, menuItem);
    }

    @Override // p140o.k
    public final boolean f(m mVar) {
        return this.f20075z.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f20074A;
    }

    @Override // p140o.k
    public final String j() {
        m mVar = this.f20074A;
        int i10 = mVar != null ? mVar.f20162a : 0;
        if (i10 == 0) {
            return null;
        }
        return c.r(i10, "android:menu:actionviewstates:");
    }

    @Override // p140o.k
    public final k k() {
        return this.f20075z.k();
    }

    @Override // p140o.k
    public final boolean m() {
        return this.f20075z.m();
    }

    @Override // p140o.k
    public final boolean n() {
        return this.f20075z.n();
    }

    @Override // p140o.k
    public final boolean o() {
        return this.f20075z.o();
    }

    @Override // p140o.k, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f20075z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f20074A.setIcon(drawable);
        return this;
    }

    @Override // p140o.k, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f20075z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        w(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        w(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f20074A.setIcon(i10);
        return this;
    }
}
