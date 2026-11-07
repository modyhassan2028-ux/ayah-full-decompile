package p084i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0954b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0958f f16552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0956d f16553s;

    public C0954b(C0956d c0956d, C0958f c0958f) {
        this.f16553s = c0956d;
        this.f16552r = c0958f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        C0956d c0956d = this.f16553s;
        DialogInterface.OnClickListener onClickListener = c0956d.f16569o;
        C0958f c0958f = this.f16552r;
        onClickListener.onClick(c0958f.f16584b, i10);
        if (c0956d.f16573s) {
            return;
        }
        c0958f.f16584b.dismiss();
    }
}
