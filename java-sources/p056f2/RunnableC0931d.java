package p056f2;

import android.support.v4.media.session.p;
import android.view.View;
import java.util.ArrayList;
import p251z9.j;

/* JADX INFO: renamed from: f2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0931d implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0941n f16085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f16086t;

    public /* synthetic */ RunnableC0931d(C0941n c0941n, X x9, int i10) {
        this.f16084r = i10;
        this.f16085s = c0941n;
        this.f16086t = x9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16084r) {
            case 0:
                C0941n c0941n = this.f16085s;
                j.e(c0941n, "this$0");
                X x9 = this.f16086t;
                j.e(x9, "$operation");
                c0941n.a(x9);
                break;
            case 1:
                C0941n c0941n2 = this.f16085s;
                ArrayList arrayList = c0941n2.f16106b;
                X x10 = this.f16086t;
                if (arrayList.contains(x10)) {
                    int i10 = x10.f16039a;
                    View view = x10.f16041c.f16145X;
                    j.d(view, "operation.fragment.mView");
                    p.j(i10, view, c0941n2.f16105a);
                }
                break;
            default:
                C0941n c0941n3 = this.f16085s;
                ArrayList arrayList2 = c0941n3.f16106b;
                X x11 = this.f16086t;
                arrayList2.remove(x11);
                c0941n3.f16107c.remove(x11);
                break;
        }
    }
}
