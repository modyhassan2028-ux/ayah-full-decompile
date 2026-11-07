package M;

import android.view.View;
import com.ayah.MainActivity;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5598t;

    public /* synthetic */ d(int i10, int i11, Object obj) {
        this.f5596r = i11;
        this.f5598t = obj;
        this.f5597s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5596r) {
            case 0:
                ((IntConsumer) this.f5598t).accept(this.f5597s);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5598t;
                View view = (View) sideSheetBehavior.f15163G.get();
                if (view != null) {
                    sideSheetBehavior.z(view, this.f5597s, false);
                    return;
                }
                return;
            case 2:
                p176r6.a aVar = ((MainActivity) this.f5598t).f13635Z;
                if (aVar == null) {
                    p251z9.j.k("mainAdapter");
                    throw null;
                }
                aVar.f1651r.d(this.f5597s - 1, 1, null);
                return;
            default:
                ((p244z1.a) this.f5598t).j(this.f5597s);
                return;
        }
    }
}
