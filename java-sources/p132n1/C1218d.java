package p132n1;

import android.view.View;

/* JADX INFO: renamed from: n1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1218d extends AbstractC1222h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19870d;

    @Override // p132n1.AbstractC1222h
    public final void c(View view, float f3) {
        switch (this.f19870d) {
            case 0:
                view.setAlpha(a(f3));
                break;
            case 1:
                view.setElevation(a(f3));
                break;
            case 2:
                view.setRotation(a(f3));
                break;
            case 3:
                view.setRotationX(a(f3));
                break;
            case 4:
                view.setRotationY(a(f3));
                break;
            case 5:
                view.setScaleX(a(f3));
                break;
            case 6:
                view.setScaleY(a(f3));
                break;
            case 7:
                view.setTranslationX(a(f3));
                break;
            case 8:
                view.setTranslationY(a(f3));
                break;
            default:
                view.setTranslationZ(a(f3));
                break;
        }
    }
}
