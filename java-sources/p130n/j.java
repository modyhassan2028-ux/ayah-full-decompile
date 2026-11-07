package p130n;

import I1.InterfaceC0242a0;
import I1.Z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f19784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0242a0 f19785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19786e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19783b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f19787f = new i(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19782a = new ArrayList();

    public final void a() {
        if (this.f19786e) {
            ArrayList arrayList = this.f19782a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Z) obj).b();
            }
            this.f19786e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f19786e) {
            return;
        }
        ArrayList arrayList = this.f19782a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Z z10 = (Z) obj;
            long j = this.f19783b;
            if (j >= 0) {
                z10.c(j);
            }
            Interpolator interpolator = this.f19784c;
            if (interpolator != null && (view = (View) z10.f3707a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f19785d != null) {
                z10.d(this.f19787f);
            }
            View view2 = (View) z10.f3707a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f19786e = true;
    }
}
