package X7;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f9994s;

    public /* synthetic */ a(n nVar, int i10) {
        this.f9993r = i10;
        this.f9994s = nVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f9993r) {
            case 0:
                d dVar = (d) this.f9994s;
                dVar.s(dVar.t());
                break;
            default:
                j jVar = (j) this.f9994s;
                jVar.f10015l = z10;
                jVar.p();
                if (!z10) {
                    jVar.s(false);
                    jVar.f10016m = false;
                }
                break;
        }
    }
}
