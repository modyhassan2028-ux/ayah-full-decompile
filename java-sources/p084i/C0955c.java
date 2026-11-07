package p084i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0955c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f16554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0958f f16555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0956d f16556t;

    public C0955c(C0956d c0956d, AlertController$RecycleListView alertController$RecycleListView, C0958f c0958f) {
        this.f16556t = c0956d;
        this.f16554r = alertController$RecycleListView;
        this.f16555s = c0958f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        C0956d c0956d = this.f16556t;
        boolean[] zArr = c0956d.f16571q;
        AlertController$RecycleListView alertController$RecycleListView = this.f16554r;
        if (zArr != null) {
            zArr[i10] = alertController$RecycleListView.isItemChecked(i10);
        }
        c0956d.f16575u.onClick(this.f16555s.f16584b, i10, alertController$RecycleListView.isItemChecked(i10));
    }
}
