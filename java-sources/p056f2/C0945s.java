package p056f2;

import android.view.View;

/* JADX INFO: renamed from: f2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0945s extends AbstractC0951y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0947u f16116r;

    public C0945s(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        this.f16116r = abstractComponentCallbacksC0947u;
    }

    @Override // p056f2.AbstractC0951y
    public final View d(int i10) {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16116r;
        View view = abstractComponentCallbacksC0947u.f16145X;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0947u + " does not have a view");
    }

    @Override // p056f2.AbstractC0951y
    public final boolean e() {
        return this.f16116r.f16145X != null;
    }
}
