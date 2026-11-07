package p084i;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0953a extends ArrayAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f16550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0956d f16551s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0953a(C0956d c0956d, ContextThemeWrapper contextThemeWrapper, int i10, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i10, R.id.text1, charSequenceArr);
        this.f16551s = c0956d;
        this.f16550r = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        boolean[] zArr = this.f16551s.f16571q;
        if (zArr != null && zArr[i10]) {
            this.f16550r.setItemChecked(i10, true);
        }
        return view2;
    }
}
