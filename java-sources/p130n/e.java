package p130n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p140o.z;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19739b;

    public e(Context context, a aVar) {
        this.f19738a = context;
        this.f19739b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f19739b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f19739b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new z(this.f19738a, this.f19739b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f19739b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f19739b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f19739b.f19725s;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f19739b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f19739b.f19724r;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f19739b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f19739b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f19739b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f19739b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f19739b.f19725s = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f19739b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f19739b.o(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f19739b.k(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f19739b.m(i10);
    }
}
