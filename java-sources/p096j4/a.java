package p096j4;

import E2.AbstractC0115c0;
import E2.AbstractC0131k0;
import E2.B0;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0131k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18777a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18778b;

    public /* synthetic */ a() {
    }

    @Override // E2.AbstractC0131k0
    public final void f(Rect rect, View view, RecyclerView recyclerView, B0 b5) {
        switch (this.f18777a) {
            case 0:
                j.e(rect, "outRect");
                j.e(view, "view");
                j.e(b5, "state");
                if (RecyclerView.N(view) != b5.b() - 1) {
                    rect.set(0, 0, 0, 0);
                } else {
                    rect.set(0, 0, 0, this.f18778b);
                }
                break;
            default:
                j.e(rect, "outRect");
                j.e(view, "view");
                j.e(b5, "state");
                AbstractC0115c0 adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    if (RecyclerView.N(view) != adapter.a() - 1) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.bottom = this.f18778b;
                    }
                    break;
                }
                break;
        }
    }

    public a(int i10) {
        this.f18778b = i10;
    }
}
