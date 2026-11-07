package p140o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p084i.DialogInterfaceC0959g;

/* JADX INFO: loaded from: classes.dex */
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C f20156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DialogInterfaceC0959g f20157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f20158t;

    @Override // p140o.v
    public final void b(k kVar, boolean z10) {
        DialogInterfaceC0959g dialogInterfaceC0959g;
        if ((z10 || kVar == this.f20156r) && (dialogInterfaceC0959g = this.f20157s) != null) {
            dialogInterfaceC0959g.dismiss();
        }
    }

    @Override // p140o.v
    public final boolean h(k kVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C c10 = this.f20156r;
        g gVar = this.f20158t;
        if (gVar.f20126w == null) {
            gVar.f20126w = new f(gVar);
        }
        c10.q(gVar.f20126w.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f20158t.b(this.f20156r, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C c10 = this.f20156r;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f20157s.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f20157s.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c10.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c10.performShortcut(i10, keyEvent, 0);
    }
}
