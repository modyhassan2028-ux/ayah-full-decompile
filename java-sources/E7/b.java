package E7;

import I1.InterfaceC0242a0;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0242a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1976c;

    @Override // I1.InterfaceC0242a0
    public void a() {
        if (this.f1975b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f1976c;
        actionBarContextView.f11445w = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f1974a);
    }

    @Override // I1.InterfaceC0242a0
    public void b() {
        this.f1975b = true;
    }

    @Override // I1.InterfaceC0242a0
    public void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f1975b = false;
    }
}
