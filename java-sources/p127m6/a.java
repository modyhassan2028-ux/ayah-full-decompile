package p127m6;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.ayah.share.ShareActivity;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ShareActivity f19621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f19622s;

    public a(ShareActivity shareActivity, int i10) {
        this.f19621r = shareActivity;
        this.f19622s = i10;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
        j.e(adapterView, "parent");
        j.e(view, "view");
        int i11 = (int) j;
        ShareActivity shareActivity = this.f19621r;
        Spinner spinner = shareActivity.f13924Z;
        if (spinner == null) {
            j.k("toSpinner");
            throw null;
        }
        int i12 = this.f19622s;
        ShareActivity.s(shareActivity, spinner, Math.min(i11, i12), Math.min(i11 + 30, i12), Math.min(i11, i12));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
