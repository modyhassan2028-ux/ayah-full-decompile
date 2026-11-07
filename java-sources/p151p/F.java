package p151p;

import Da.r;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;
import p084i.C0956d;
import p084i.DialogInterfaceC0959g;

/* JADX INFO: loaded from: classes.dex */
public final class F implements K, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DialogInterfaceC0959g f20540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public G f20541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f20542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f20543u;

    public F(AppCompatSpinner appCompatSpinner) {
        this.f20543u = appCompatSpinner;
    }

    @Override // p151p.K
    public final boolean a() {
        DialogInterfaceC0959g dialogInterfaceC0959g = this.f20540r;
        if (dialogInterfaceC0959g != null) {
            return dialogInterfaceC0959g.isShowing();
        }
        return false;
    }

    @Override // p151p.K
    public final int b() {
        return 0;
    }

    @Override // p151p.K
    public final void dismiss() {
        DialogInterfaceC0959g dialogInterfaceC0959g = this.f20540r;
        if (dialogInterfaceC0959g != null) {
            dialogInterfaceC0959g.dismiss();
            this.f20540r = null;
        }
    }

    @Override // p151p.K
    public final Drawable f() {
        return null;
    }

    @Override // p151p.K
    public final void h(CharSequence charSequence) {
        this.f20542t = charSequence;
    }

    @Override // p151p.K
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p151p.K
    public final void j(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p151p.K
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p151p.K
    public final void l(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p151p.K
    public final void m(int i10, int i11) {
        if (this.f20541s == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f20543u;
        r rVar = new r(appCompatSpinner.getPopupContext());
        C0956d c0956d = (C0956d) rVar.f1388t;
        CharSequence charSequence = this.f20542t;
        if (charSequence != null) {
            c0956d.f16560d = charSequence;
        }
        G g = this.f20541s;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        c0956d.f16568n = g;
        c0956d.f16569o = this;
        c0956d.f16574t = selectedItemPosition;
        c0956d.f16573s = true;
        DialogInterfaceC0959g dialogInterfaceC0959gE = rVar.e();
        this.f20540r = dialogInterfaceC0959gE;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0959gE.f16607w.f16588f;
        alertController$RecycleListView.setTextDirection(i10);
        alertController$RecycleListView.setTextAlignment(i11);
        this.f20540r.show();
    }

    @Override // p151p.K
    public final int n() {
        return 0;
    }

    @Override // p151p.K
    public final CharSequence o() {
        return this.f20542t;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        AppCompatSpinner appCompatSpinner = this.f20543u;
        appCompatSpinner.setSelection(i10);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i10, this.f20541s.getItemId(i10));
        }
        dismiss();
    }

    @Override // p151p.K
    public final void p(ListAdapter listAdapter) {
        this.f20541s = (G) listAdapter;
    }
}
