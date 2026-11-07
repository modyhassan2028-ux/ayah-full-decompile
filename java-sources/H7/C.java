package H7;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class C extends B0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3440e;

    public /* synthetic */ C(int i10, Object obj) {
        this.f3439d = i10;
        this.f3440e = obj;
    }

    @Override // B0.c
    public final void W(int i10) {
        switch (this.f3439d) {
            case 0:
                E e10 = (E) this.f3440e;
                e10.f3445e = true;
                D d5 = (D) e10.f3446f.get();
                if (d5 != null) {
                    d5.a();
                }
                break;
        }
    }

    @Override // B0.c
    public final void X(Typeface typeface, boolean z10) {
        switch (this.f3439d) {
            case 0:
                if (!z10) {
                    E e10 = (E) this.f3440e;
                    e10.f3445e = true;
                    D d5 = (D) e10.f3446f.get();
                    if (d5 != null) {
                        d5.a();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) this.f3440e;
                p240y7.d dVar = chip.f14805v;
                chip.setText(dVar.f24680U0 ? dVar.f24683W : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    private final void A0(int i10) {
    }
}
