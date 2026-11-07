package p141o0;

import D0.C0088f;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import J0.B0;
import Z0.B;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import l0.q;
import p085i0.f;
import p251z9.r;
import u.C1346a;
import u.C1351f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnDragListener, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f20207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1351f f20208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f20209c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        d dVar = new d();
        dVar.f20213H = 0L;
        this.f20207a = dVar;
        this.f20208b = new C1351f(0);
        this.f20209c = new AbstractC0274a0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f11929a.f20207a.hashCode();
            }

            @Override // J0.AbstractC0274a0
            public final q k() {
                return this.f11929a.f20207a;
            }

            @Override // J0.AbstractC0274a0
            public final /* bridge */ /* synthetic */ void l(q qVar) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        B b5 = new B(24, dragEvent);
        int action = dragEvent.getAction();
        B0 b10 = B0.f3878r;
        C1351f c1351f = this.f20208b;
        d dVar = this.f20207a;
        switch (action) {
            case 1:
                r rVar = new r();
                C0088f c0088f = new C0088f(b5, dVar, rVar);
                if (c0088f.e(dVar) == b10) {
                    AbstractC0283f.B(dVar, c0088f);
                }
                boolean z10 = rVar.f24882r;
                c1351f.getClass();
                C1346a c1346a = new C1346a(c1351f);
                while (c1346a.hasNext()) {
                    ((d) c1346a.next()).z0(b5);
                }
                return z10;
            case 2:
                dVar.y0(b5);
                return false;
            case 3:
                return dVar.v0(b5);
            case 4:
                f fVar = new f(3, b5);
                if (fVar.e(dVar) == b10) {
                    AbstractC0283f.B(dVar, fVar);
                }
                c1351f.clear();
                return false;
            case 5:
                dVar.w0(b5);
                return false;
            case 6:
                dVar.x0(b5);
                return false;
            default:
                return false;
        }
    }
}
