package E2;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1513a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f1514b;

    public I0(Y y10) {
        this.f1514b = y10;
    }

    @Override // E2.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.f1513a) {
            this.f1513a = false;
            this.f1514b.h();
        }
    }

    @Override // E2.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f1513a = true;
    }
}
