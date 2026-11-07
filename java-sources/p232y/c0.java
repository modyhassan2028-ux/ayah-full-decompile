package p232y;

import android.view.View;
import android.widget.Magnifier;
import p063g1.c;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f24480b = new c0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f24481c = new c0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24482a;

    public /* synthetic */ c0(int i10) {
        this.f24482a = i10;
    }

    @Override // p232y.a0
    public final boolean a() {
        switch (this.f24482a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // p232y.a0
    public final Z b(View view, c cVar) {
        switch (this.f24482a) {
            case 0:
                return new b0(new Magnifier(view));
            default:
                return new d0(new Magnifier(view));
        }
    }
}
