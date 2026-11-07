package p151p;

import androidx.appcompat.widget.AppCompatSpinner;
import p140o.A;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractViewOnTouchListenerC1266s0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ I f20537A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f20538B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, I i10) {
        super(appCompatSpinner2);
        this.f20538B = appCompatSpinner;
        this.f20537A = i10;
    }

    @Override // p151p.AbstractViewOnTouchListenerC1266s0
    public final A b() {
        return this.f20537A;
    }

    @Override // p151p.AbstractViewOnTouchListenerC1266s0
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f20538B;
        if (appCompatSpinner.getInternalPopup().a()) {
            return true;
        }
        appCompatSpinner.f11540w.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
