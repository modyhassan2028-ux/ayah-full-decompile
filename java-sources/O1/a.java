package O1;

import android.database.DataSetObserver;
import p151p.A0;
import p151p.W0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6438b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f6437a = i10;
        this.f6438b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f6437a) {
            case 0:
                W0 w9 = (W0) this.f6438b;
                w9.f6439r = true;
                w9.notifyDataSetChanged();
                break;
            default:
                A0 a9 = (A0) this.f6438b;
                if (a9.Q.isShowing()) {
                    a9.d();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f6437a) {
            case 0:
                W0 w9 = (W0) this.f6438b;
                w9.f6439r = false;
                w9.notifyDataSetInvalidated();
                break;
            default:
                ((A0) this.f6438b).dismiss();
                break;
        }
    }
}
