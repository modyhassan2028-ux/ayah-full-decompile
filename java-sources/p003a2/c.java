package p003a2;

import M7.j;
import android.view.View;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(17);
        this.f11131c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // va.g
    public final float A(j jVar) {
        switch (this.f11131c) {
            case 0:
                return ((View) jVar).getAlpha();
            case 1:
                return ((View) jVar).getScaleX();
            case 2:
                return ((View) jVar).getScaleY();
            case 3:
                return ((View) jVar).getRotation();
            case 4:
                return ((View) jVar).getRotationX();
            default:
                return ((View) jVar).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // va.g
    public final void P(j jVar, float f3) {
        switch (this.f11131c) {
            case 0:
                ((View) jVar).setAlpha(f3);
                break;
            case 1:
                ((View) jVar).setScaleX(f3);
                break;
            case 2:
                ((View) jVar).setScaleY(f3);
                break;
            case 3:
                ((View) jVar).setRotation(f3);
                break;
            case 4:
                ((View) jVar).setRotationX(f3);
                break;
            default:
                ((View) jVar).setRotationY(f3);
                break;
        }
    }
}
