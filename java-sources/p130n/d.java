package p130n;

import Aa.a;
import L5.c;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p140o.i;
import p140o.k;
import p151p.C1250k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f19732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ActionBarContextView f19733u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f19734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f19735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k f19737y;

    @Override // p130n.a
    public final void a() {
        if (this.f19736x) {
            return;
        }
        this.f19736x = true;
        this.f19734v.F(this);
    }

    @Override // p130n.a
    public final View b() {
        WeakReference weakReference = this.f19735w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p130n.a
    public final k c() {
        return this.f19737y;
    }

    @Override // p130n.a
    public final MenuInflater d() {
        return new h(this.f19733u.getContext());
    }

    @Override // p130n.a
    public final CharSequence e() {
        return this.f19733u.getSubtitle();
    }

    @Override // p130n.a
    public final CharSequence f() {
        return this.f19733u.getTitle();
    }

    @Override // p130n.a
    public final void g() {
        this.f19734v.G(this, this.f19737y);
    }

    @Override // p130n.a
    public final boolean h() {
        return this.f19733u.f11438J;
    }

    @Override // p130n.a
    public final void i(View view) {
        this.f19733u.setCustomView(view);
        this.f19735w = view != null ? new WeakReference(view) : null;
    }

    @Override // p130n.a
    public final void k(int i10) {
        l(this.f19732t.getString(i10));
    }

    @Override // p130n.a
    public final void l(CharSequence charSequence) {
        this.f19733u.setSubtitle(charSequence);
    }

    @Override // p130n.a
    public final void m(int i10) {
        n(this.f19732t.getString(i10));
    }

    @Override // p130n.a
    public final void n(CharSequence charSequence) {
        this.f19733u.setTitle(charSequence);
    }

    @Override // p130n.a
    public final void o(boolean z10) {
        this.f19724r = z10;
        this.f19733u.setTitleOptional(z10);
    }

    @Override // p140o.i
    public final boolean q(k kVar, MenuItem menuItem) {
        return ((a) this.f19734v.f5532s).D(this, menuItem);
    }

    @Override // p140o.i
    public final void z(k kVar) {
        g();
        C1250k c1250k = this.f19733u.f11443u;
        if (c1250k != null) {
            c1250k.n();
        }
    }
}
