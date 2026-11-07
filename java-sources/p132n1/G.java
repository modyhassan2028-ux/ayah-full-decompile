package p132n1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class G extends K {
    public final /* synthetic */ int g;

    @Override // p132n1.K
    public final boolean b(float f3, long j, View view, s sVar) {
        switch (this.g) {
            case 0:
                view.setAlpha(a(f3, j, view, sVar));
                break;
            case 1:
                view.setElevation(a(f3, j, view, sVar));
                break;
            case 2:
                view.setRotation(a(f3, j, view, sVar));
                break;
            case 3:
                view.setRotationX(a(f3, j, view, sVar));
                break;
            case 4:
                view.setRotationY(a(f3, j, view, sVar));
                break;
            case 5:
                view.setScaleX(a(f3, j, view, sVar));
                break;
            case 6:
                view.setScaleY(a(f3, j, view, sVar));
                break;
            case 7:
                view.setTranslationX(a(f3, j, view, sVar));
                break;
            case 8:
                view.setTranslationY(a(f3, j, view, sVar));
                break;
            default:
                view.setTranslationZ(a(f3, j, view, sVar));
                break;
        }
        return this.f19846d;
    }
}
