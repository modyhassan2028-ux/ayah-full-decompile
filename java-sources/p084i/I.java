package p084i;

import L5.c;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p130n.a;
import p130n.h;
import p140o.i;
import p140o.k;
import p151p.C1250k;

/* JADX INFO: loaded from: classes.dex */
public final class I extends a implements i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f16521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k f16522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f16523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f16524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f16525x;

    public I(J j, Context context, c cVar) {
        this.f16525x = j;
        this.f16521t = context;
        this.f16523v = cVar;
        k kVar = new k(context);
        kVar.f20143l = 1;
        this.f16522u = kVar;
        kVar.f20138e = this;
    }

    @Override // p130n.a
    public final void a() {
        J j = this.f16525x;
        if (j.f16536m != this) {
            return;
        }
        if (j.f16543t) {
            j.f16537n = this;
            j.f16538o = this.f16523v;
        } else {
            this.f16523v.F(this);
        }
        this.f16523v = null;
        j.f0(false);
        ActionBarContextView actionBarContextView = j.j;
        if (actionBarContextView.f11430B == null) {
            actionBarContextView.e();
        }
        j.g.setHideOnContentScrollEnabled(j.f16548y);
        j.f16536m = null;
    }

    @Override // p130n.a
    public final View b() {
        WeakReference weakReference = this.f16524w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p130n.a
    public final k c() {
        return this.f16522u;
    }

    @Override // p130n.a
    public final MenuInflater d() {
        return new h(this.f16521t);
    }

    @Override // p130n.a
    public final CharSequence e() {
        return this.f16525x.j.getSubtitle();
    }

    @Override // p130n.a
    public final CharSequence f() {
        return this.f16525x.j.getTitle();
    }

    @Override // p130n.a
    public final void g() {
        if (this.f16525x.f16536m != this) {
            return;
        }
        k kVar = this.f16522u;
        kVar.y();
        try {
            this.f16523v.G(this, kVar);
        } finally {
            kVar.x();
        }
    }

    @Override // p130n.a
    public final boolean h() {
        return this.f16525x.j.f11438J;
    }

    @Override // p130n.a
    public final void i(View view) {
        this.f16525x.j.setCustomView(view);
        this.f16524w = new WeakReference(view);
    }

    @Override // p130n.a
    public final void k(int i10) {
        l(this.f16525x.f16530e.getResources().getString(i10));
    }

    @Override // p130n.a
    public final void l(CharSequence charSequence) {
        this.f16525x.j.setSubtitle(charSequence);
    }

    @Override // p130n.a
    public final void m(int i10) {
        n(this.f16525x.f16530e.getResources().getString(i10));
    }

    @Override // p130n.a
    public final void n(CharSequence charSequence) {
        this.f16525x.j.setTitle(charSequence);
    }

    @Override // p130n.a
    public final void o(boolean z10) {
        this.f19724r = z10;
        this.f16525x.j.setTitleOptional(z10);
    }

    @Override // p140o.i
    public final boolean q(k kVar, MenuItem menuItem) {
        c cVar = this.f16523v;
        if (cVar != null) {
            return ((Aa.a) cVar.f5532s).D(this, menuItem);
        }
        return false;
    }

    @Override // p140o.i
    public final void z(k kVar) {
        if (this.f16523v == null) {
            return;
        }
        g();
        C1250k c1250k = this.f16525x.j.f11443u;
        if (c1250k != null) {
            c1250k.n();
        }
    }
}
