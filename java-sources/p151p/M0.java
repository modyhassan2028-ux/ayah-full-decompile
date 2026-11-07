package p151p;

import O1.b;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchView f20575s;

    public /* synthetic */ M0(SearchView searchView, int i10) {
        this.f20574r = i10;
        this.f20575s = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20574r) {
            case 0:
                this.f20575s.s();
                break;
            default:
                b bVar = this.f20575s.f11613j0;
                if (bVar instanceof W0) {
                    bVar.b(null);
                }
                break;
        }
    }
}
