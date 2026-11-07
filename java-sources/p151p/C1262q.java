package p151p;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: renamed from: p.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1262q extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f20765b;

    public /* synthetic */ C1262q(ActivityChooserView activityChooserView, int i10) {
        this.f20764a = i10;
        this.f20765b = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f20764a) {
            case 0:
                super.onChanged();
                this.f20765b.f11487r.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                this.f20765b.f11487r.getClass();
                throw null;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.f20764a) {
            case 0:
                super.onInvalidated();
                this.f20765b.f11487r.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
