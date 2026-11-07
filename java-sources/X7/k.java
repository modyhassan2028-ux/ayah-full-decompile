package X7;

import H7.G;
import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class k extends G {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f10022r;

    public k(m mVar) {
        this.f10022r = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f10022r.b().a();
    }

    @Override // H7.G, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f10022r.b().b();
    }
}
