package p226x2;

import E2.G0;
import E2.H0;
import H7.C0228b;
import I1.C0243b;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class s extends H0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f24339f;
    public final G0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0228b f24340h;

    public s(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = this.f1510e;
        this.f24340h = new C0228b(7, this);
        this.f24339f = recyclerView;
    }

    @Override // E2.H0
    public final C0243b j() {
        return this.f24340h;
    }
}
