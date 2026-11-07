package p132n1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class B extends F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19833f;

    @Override // p132n1.F
    public final void c(View view, float f3) {
        switch (this.f19833f) {
            case 0:
                view.setAlpha(a(f3));
                break;
            case 1:
                view.setElevation(a(f3));
                break;
            case 2:
                view.setPivotX(a(f3));
                break;
            case 3:
                view.setPivotY(a(f3));
                break;
            case 4:
                view.setRotation(a(f3));
                break;
            case 5:
                view.setRotationX(a(f3));
                break;
            case 6:
                view.setRotationY(a(f3));
                break;
            case 7:
                view.setScaleX(a(f3));
                break;
            case 8:
                view.setScaleY(a(f3));
                break;
            case 9:
                view.setTranslationX(a(f3));
                break;
            case 10:
                view.setTranslationY(a(f3));
                break;
            default:
                view.setTranslationZ(a(f3));
                break;
        }
    }
}
