package X7;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(m mVar, int i10) {
        super(mVar);
        this.f10006e = i10;
    }

    @Override // X7.n
    public void q() {
        switch (this.f10006e) {
            case 0:
                m mVar = this.f10047b;
                mVar.f10029F = null;
                CheckableImageButton checkableImageButton = mVar.f10043x;
                checkableImageButton.setOnLongClickListener(null);
                Y2.a.i0(checkableImageButton, null);
                break;
        }
    }
}
