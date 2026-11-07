package R7;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class B extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7284b;

    public /* synthetic */ B(int i10, Object obj) {
        this.f7283a = i10;
        this.f7284b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f7283a) {
            case 0:
                C c10 = (C) this.f7284b;
                if (c10.f7280c != null && !c10.f7281d.isEmpty()) {
                    RectF rectF = c10.f7281d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c10.g);
                    break;
                }
                break;
            default:
                p240y7.d dVar = ((Chip) this.f7284b).f14805v;
                if (dVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    dVar.getOutline(outline);
                }
                break;
        }
    }
}
